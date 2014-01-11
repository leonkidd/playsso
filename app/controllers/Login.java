package controllers;

import java.io.File;

import play.Application;
import play.Play;
import play.mvc.Controller;
import play.mvc.Http.Context;
import play.mvc.Result;
import views.html.login;

public class Login extends Controller {

	/**
	 * 
	 * @param s service name
	 * @param p passive
	 * @param c continue
	 * @return
	 */
    public static Result page(String s, Boolean p, String c) {
        return ok(login.render(s, p, c));
    }

    /**
     * 
     * @param u user name
     * @param p password
     * @return
     */
    public static Result auth(String u, String p, String c) {
    	// validate u and p.
        return redirect("");
    }

}
