package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * 用于对SSO客户端的服务
 * 
 * @author Leon Kidd
 * @version 1.00, 2014-1-13
 * @since 1.0
 */
public class ClientService extends Controller {

	/**
	 * Client服务启动的时候向Server注册自己，并获取双方安全通讯Token.
	 * @param service Client服务名，自定一个名字。
	 * @param rm
	 * @return
	 */
    public static Result register(String service, String token, Boolean pissive, Boolean rm) {
    	return null;
    }
}
