package org.bsuir;
import static java.lang.Math.*;
import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {
		boolean metka = true;
		int ran = ((int) (random() * 10) + 1), num;
		System.out.println(ran);
		System.out.println("������� ���� �����");
		Scanner sc = new Scanner(System.in);
			while (metka == true) {
				if (sc.hasNextInt()) {
					num = sc.nextInt();
					if (num == ran) {
						System.out.println("�� �������!!!");
						metka = false;
					}
					else if (num < ran) {
						System.out.println("���� ����� ������, ��� ���");
						metka = true;
					}
					else {
						System.out.println("���� ����� ������, ��� ���");
						metka = true;
					}
				}
			}
			sc.close();
	}

}
