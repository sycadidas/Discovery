package cn.observer;

import java.util.EventListener;
//事件监听器类（可以有多个）
public class MyEventListener implements EventListener {  
    
    //事件发生后的回调方法  
    public void whenEventHappen(Event e){  
    	EventSource es = (EventSource) e.getSource();
    	System.out.println("属性变成了"+es.getName());
          }  
}  