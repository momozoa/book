package abstraction;

public class AutoCar extends Car {
	@Override
	void run() {
		System.out.println("���� �޸��ϴ�. ");
	}

	@Override

	void refuel() {
		System.out.println("�ֹ����� �ֿ��մϴ�.");
	}

	void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}
