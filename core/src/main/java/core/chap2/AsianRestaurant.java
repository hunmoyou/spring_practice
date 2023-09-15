package core.chap2;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {
	
	private Chef chef;
	
	//요리 코스
	private Course course;
	
	
	
	//요리를 주문하는 기능
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
