package oop.bsuir.laba3.taks2;

public class Main {

	public static void main(String[] args) {
		// ---Test---//
		// Area s = new Rectangle();
		// Rectangle s1 = new Rectangle();
		// s1.getLengths();
		// System.out.println("������� ��������������: " + s.area(s));
		// Area s = new Circle();
		// System.out.println("������� �����: " + s.area(s));
		// Area s = new Triangle();
		// System.out.println("������� ������������: " + s.area(s));
		Area area[] = new Area[4];
		area[0] = new Rectangle();
		area[1] = new Triangle();
		area[2] = new Circle();
		area[3] = new Trapeze();
		System.out.println("Triangle " + area[1].area(area));
	}

}
