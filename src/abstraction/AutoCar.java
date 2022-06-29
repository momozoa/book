package abstraction;

public class AutoCar extends Car {
	@Override
	void run() {
		System.out.println("차가 달립니다. ");
	}

	@Override

	void refuel() {
		System.out.println("휘발유를 주요합니다.");
	}

	void load() {
		System.out.println("짐을 싣습니다.");
	}
}
