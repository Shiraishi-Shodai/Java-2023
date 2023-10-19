package ex;

public class SiteEVLogic {
	public void excute(SiteEV site,String action) {
		if(action.equals("good")) {
			site.setGood(site.getGood()+1);
		}else if(action.equals("bad")) {
			site.setBad(site.getBad()+1);
		}
	}
	

	
}
