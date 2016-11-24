package cn.Event;

import org.springframework.context.ApplicationEvent;
//事件类
public class StudentAddEvent extends ApplicationEvent{
	private String m_sStudentName;  
	
	public StudentAddEvent(Object source,String studentName) {
		super(source);
		this.m_sStudentName = studentName;
	}

	public String getM_sStudentName() {
		return m_sStudentName;
	}

	public void setM_sStudentName(String m_sStudentName) {
		this.m_sStudentName = m_sStudentName;
	}

}
