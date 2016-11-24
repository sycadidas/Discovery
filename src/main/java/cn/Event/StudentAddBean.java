package cn.Event;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentAddBean implements ApplicationContextAware  {
	private static final Logger log = Logger.getLogger(StudentAddBean.class);
	
	private ApplicationContext m_applicationContext = null;  
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.m_applicationContext = context;
	}
	
	public void addStudent(String _sStudentName) {  
	        // 1.构造一个增加学生的事件  
	        StudentAddEvent aStudentEvent = new StudentAddEvent(  
	                m_applicationContext, _sStudentName);  
	        // 2.触发增加学生事件  
	        m_applicationContext.publishEvent(aStudentEvent);  
	    }
	
    public static void main(String[] args) {
    	PropertyConfigurator.configure("log4j.properties");//手动加载log文件 屏蔽警告
        String[] xmlConfig = new String[] {"classpath:/configs/spring-cn.xml"};  
        // 使用ApplicationContext来初始化系统  
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);  
        StudentAddBean studentBean = (StudentAddBean) context.getBean("StudentAddBean");  
        studentBean.addStudent("tom");  
        studentBean.addStudent("jack");  
        log.info("属性设置完成");
  
    }

}
