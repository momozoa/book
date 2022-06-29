package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 자율주행 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 매뉴얼 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
