package abstraction;

public abstract class Car {
	abstract void run();
	abstract void refuel();

	void stop() {
		System.out.println("���� ����ϴ�.");
	};
}
