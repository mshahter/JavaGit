package org.bsuir;
import java.util.Random;
public class Task21 {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(28800);
		System.out.println(n);
		int hour = n / 3600;
		System.out.println(hour);
		switch (hour) {
		case 0:
			System.out.println("�������� ����� ����!");
			break;
		case 1:
			System.out.println("������� ���");
			break;
		case 2:
			System.out.println("�������� 2 ����");
			break;
		case 6:
			System.out.println("�������� 6 �����");
			break;
		case 7:
			System.out.println("��������� 7 �����");
			break;
		default:
			System.out.println("�������� " + hour + " �����");
		}
	}

}
