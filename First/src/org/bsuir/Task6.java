package org.bsuir;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		int n = 0, sum = 0, k = 3;
		System.out.println("������� �����!");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			System.out.println("����� ������� �����!");
			String s = sc.nextInt() + "";
			n = s.length();
			if (n >= 1 && n <= 4) {
				System.out.println("������� ����� �������: " + n);
				if (n == 1) {
					for (int i = 1; i <= 9; i++) {
						if (i % k == 0) {
							sum += i;
						}
					}
				}
				else if (n==2) {
					for (int i = 10; i <= 99; i++) {
						if (i % k == 0) {
							sum += i;
						}
					}
				}
				else if (n==3) {
					for (int i = 100; i <= 999; i++) {
						if (i % k == 0) {
							sum += i;
						}
					}
				}
				else {
					for (int i = 1000; i <= 9999; i++) {
						if (i % k == 0) {
							sum +=i;
						}
					}
				}
			}
			else {
				System.out.println("�� ����� ����� �������� ������!");
			}
		}
		System.out.println("����� ��� ������ ����� " + n + " = " + sum);
		sc.close();
	}

}
