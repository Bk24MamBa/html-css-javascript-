package listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class Listener2 implements HttpSessionBindingListener,HttpSessionActivationListener{

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("---�֮��---");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("---�ۻ�֮ǰ---");
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("---session��---");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("---session���---");
	}

}
