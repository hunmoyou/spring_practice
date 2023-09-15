package core.chap2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class WesternRestaurant implements Restaurant {
	
	private Chef chef;
	
	//요리 코스
	private Course course;
	
	
	
	
	//요리를 주문하는 기능
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
