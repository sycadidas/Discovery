package cn.Event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class StudentAddListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		 if (!(event instanceof StudentAddEvent)) {  
	            return;  
	        } 
		 StudentAddEvent studentAddEvent = (StudentAddEvent) event;  
	     System.out.println("增加了学生:::" + studentAddEvent.getM_sStudentName());
	}
	

}
