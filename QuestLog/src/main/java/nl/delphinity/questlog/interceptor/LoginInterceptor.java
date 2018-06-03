package nl.delphinity.questlog.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		
		Object loggedOnUser = session.get("loggedOnUser");
		
		if(loggedOnUser == null) {
			return Action.LOGIN;
		} else {
			return invocation.invoke();
		}
	}

}
