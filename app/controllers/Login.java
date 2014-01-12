package controllers;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import views.html.post;

public class Login extends Controller {

	/**
	 * 
	 * @param s service name
	 * @param p passive
	 * @param c continue
	 * @return
	 */
    public static Result page(String s, Boolean p, String c) {
    	String referer = request().getHeader("referer");
    	Logger.info(referer);
        return ok(login.render(s, p, c));
    }

    /**
     * 
     * @param u user name
     * @param p password
     * @return
     */
    public static Result auth() {
    	// validate u and p.
    	DynamicForm form = Form.form().bindFromRequest();
    	String username = form.get("username");
    	String password = form.get("password");
    	
    	// 验证用户名密码
    	if(auth(username, password)) {
    		// 通过
    	} else {
    		// 不通过
    	}
    	
    	String c = form.get("continue");
    	
    	try {
    		// TODO
			java.net.URLEncoder.encode(c, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			Logger.error("", e);
			// do nothing
		}
    	Map<String, String> para = new HashMap<String, String>();
    	para.put("token", "abcdefg");
        return ok(post.render(c, para));
    }
    
    public static boolean auth(String username, String password) {
    	return true;
    	
    }

}
