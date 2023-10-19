package model;

import java.sql.SQLException;

import DAO.DAO;

public class LoginLogic {

	public boolean execute(Login login) throws SQLException {
		
		DAO dao = new DAO();
		Account account = dao.findByLogin(login);
		
		return account != null;
	}
}
