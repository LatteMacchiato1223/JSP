package sec04.ex01;

import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

// HttpSessionBindingListener를 구현해 세션에 바인딩 시 이벤트 처리 
public class LoginImpl implements HttpSessionBindingListener {
	String user_id;
	String user_pwd;
	// 세션에 바인딩 시 1씩 증가 
	static int total_user = 0;
	
	public LoginImpl() {
		
	}
	
	public LoginImpl(String user_id, String user_pwd) {
		this.user_id = user_id;
		this.user_pwd = user_pwd;
	}

	@Override
	// 세션에 저장 시 접속자 수를 증가시킴 
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("User access");
		++total_user;
	}

	@Override
	// 세션에서 소멸 시 접속자 수를 감소시킴 
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("Disconnecting User");
		total_user--;
	}
}
