package cn.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//事件源
public class EventSource {  
    private String name;  
    //监听器容器  
    private Set<MyEventListener> listener;  
   
    public EventSource(){  
        this.listener = new HashSet<MyEventListener>();  
        this.name = "defaultname";  
    }  
    //给事件源注册监听器  
    public void addListener(MyEventListener mev){  
        this.listener.add(mev);  
    }  
    //当事件发生时,通知注册在该事件源上的所有监听器做出相应的反应（调用回调方法）  
    protected void notifies(){  
    	MyEventListener mev = null;  
        Iterator<MyEventListener> iterator = this.listener.iterator();  
        while(iterator.hasNext()){  
        	mev = iterator.next();  
        	mev.whenEventHappen(new Event(this));  
        }  
    }  
    public String getName() {  
        return name;  
    }  
    //模拟事件触发器，当成员变量name的值发生变化时，触发事件。  
    public void setName(String name) {  
        if(!this.name.equals(name)){  
            this.name = name;  
            notifies();  
        }        
    }  
}
    