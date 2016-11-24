package cn.observer;

public class ChangeEvent {

	public static void main(String[] args) {
		EventSource object = new EventSource();  
        //注册监听器  
        object.addListener(new MyEventListener(){  
            @Override  
            public void whenEventHappen(Event e) {  
                super.whenEventHappen(e);  
            }  
        });  
        //触发事件  
        object.setName("eric");  

	}

}
