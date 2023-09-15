package core.chap1;

public class WesternRestaurant implements Restaurant {
	
	private Chef chef = new FrenchChef();
	
	//요리 코스
	private Course course = new FrenchCourse();
	
	//요리를 주문하는 기능
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
