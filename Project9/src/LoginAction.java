

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	public LoginAction() {
		System.out.println("LoginAction构造函数");
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm loginForm = (LoginForm) form;
		String account = loginForm.getAccount();
		String password = loginForm.getPassword();
		String url = null;
		if (account.equals(password)) {
			return mapping.findForward("SUCCESS");
		}
		return mapping.findForward("FAIL");
	}
}
