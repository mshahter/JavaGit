package intro;

public class Main {

	public static int metod1(int a, int b) throws ArithmeticException {
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("��������� ������ " + e);
			throw e;
		}
		return c;
	}

	public static void metod2(int c) {
		System.out.println("c=" + c);
	}

	public static void main(String[] args)  {
		HomeRadio radio = new HomeRadio();
		radio.on();
		radio.showChannel();
		radio.nextChannel();
		radio.showChannel();
		radio.nextChannel();
		radio.showChannel();
		radio.previousChannel();
		radio.showChannel();
		radio.off();
		///////////////
		// ����� ������������ ������
		Ship.LifeBoat.down();
		// �������� ������� ������������ ������
		Ship.LifeBoat lf = new Ship.LifeBoat();
		// ����� �������� ������
		lf.swim();
		/////////
		int c = 0;
		try {
			c = metod1(5, 0);
			metod2(c);
		} catch (ArithmeticException e) {
			System.out.println("������ ��� ���������� ������ " + e);
		}

	}

}
