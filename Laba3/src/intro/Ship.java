package intro;

public class Ship {
	private int id;

	// abstract, final, private, protected - ���������
	public static class LifeBoat {
		public static void down() {
			System.out.println("������ �� ����!");
		}

		public void swim() {
			System.out.println("�������� ������");
		}
	}
}
