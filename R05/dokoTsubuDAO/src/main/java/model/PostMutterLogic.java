package model;

public class PostMutterLogic {
//  public void execute(Mutter mutter, List<Mutter> mutterList) {
//    mutterList.add(0, mutter); // 先頭に追加
//  }
	
	public void insertMutter(Mutter mutter) {
		
		MuttersDAO dao = new MuttersDAO();
		dao.insert(mutter);
		
	}
}