package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== �������� �ڵ��� ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== �Ŵ��� �ڵ��� ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
