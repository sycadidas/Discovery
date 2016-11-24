package cn.observer;

import java.util.EventObject;
//事件POJO
public class Event extends EventObject {  

	private static final long serialVersionUID = 1L;
	
	private Object source;//事件源  
      
    public Event(Object source){  
        super(source);  
        this.source = source;  
    }  
  
    public Object getSource() {  
        return source;  
    }  
  
    public void setSource(Object source) {  
        this.source = source;  
    }  
}  