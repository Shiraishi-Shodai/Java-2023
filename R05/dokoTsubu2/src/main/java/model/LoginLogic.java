package model;

public class LoginLogic {
	public boolean excute(User user) {
		//パスワードが1234ならログイン成功
		if(user.getPssword().equals("1234")) {
			return true;
		}else {
			return false;
		}
	}
}
