package model;

public class HealthCheckLogic {
	
	public void judge(Health health) {
		
		double bmi = health.getWeight() / Math.pow(health.getHeight() / 100, 2.0);
		System.out.println(bmi);
		String figure = "";
		
		if(bmi > 25) {
			figure = "肥満";
		}else if(bmi > 18.5) {
			figure = "普通";
		}else { 
			figure = "痩せ型";
		}
		
		health.setBmit(bmi);
		health.setFigure(figure);
		
	}
}
