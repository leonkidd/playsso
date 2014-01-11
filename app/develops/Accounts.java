package develops;

/**
 * 账户模块的接口
 * @author cq
 *
 */
public interface Accounts {
	
	/**
	 * 用户验证
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	public boolean auth(String username, String password);
}
