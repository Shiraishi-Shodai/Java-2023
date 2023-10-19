package model;

import java.util.List;

public class GetMutterListLogic {

	public List<Mutter> selectMutter(){
		
		MuttersDAO dao = new MuttersDAO();
		List<Mutter> list = dao.findAll();
		
		return list;
		
	}
	
}
