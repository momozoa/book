package abstraction;

public class Bus extends Car {

	@Override
	void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	void refuel() {
		System.out.println("õ�� ������ �����մϴ�.");
	}
	
	void takePassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}
}
