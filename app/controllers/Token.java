package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Token extends Controller {

    public static Result index() {
        return ok(index.render(""));
    }
    
    public static Result verify() {
        return ok(index.render(""));
    }

    /**
     * 用于SSO的Client向Server获取安全token
     * @return
     */
    public static Result create() {
        return ok("Hello World!");
    }

}
