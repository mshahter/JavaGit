package org.bsuir;
import java.util.Random;

public class Task39 {

	public static void main(String[] args) {
		int n = 3, t = 3, max = 0, row = 0, col =0;
		int a[][] = new int[n][t];
		int b[][] = new int[n][t];
		int c[][] = new int[n][t];
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				a[i][k] = r.nextInt(21)-10;
				c[i][k] = 0;
				if (max <= Math.abs(a[i][k])) {
					max = Math.abs(a[i][k]);
					row = i;
					col = k;
				}
				System.out.print(a[i][k] + "\t");
			}
			System.out.println();
		}
		System.out.println(max);
		System.out.println("rows= " + row + ";" + "cols= " + col);
		System.out.println();
		/*
		for (int i = 0; i < n; i ++) {
			for (int k = 0; k < t; k++) {
				b[i][k] = a[i][k];
				System.out.print(b[i] + "\t");
			}
			System.out.println();
		}*/
		
		for (int i = row; i <= row; i++) {
			for (int k = 0; k < t; k++) { //��������� ������ �� 2 �������
				b[i][k] = a[i][k];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = col; k <= col; k++) {//��������� ������� �� 2 �������
				b[i][k]=a[i][k];
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < t; k++) {
				//System.out.print(b[i][k] + "\t");
			}
			//System.out.println();
		}
		System.out.println();
		if (max != a[1][1]) {
			for (int i = row; i <= row; i++) {
				for (int k = 0; k < t; k++) {
					c[0][k] = a[1][k]; 
					a[1][k] = b[i][k];
					a[row][k] = c[0][k];
					//System.out.print(c[0][k] + "\t");
				}
			//System.out.println();
			}
			System.out.println("������� � � ������������ �������: ");
			for (int i = 0; i < n; i++) {
				for (int k = 0; k < t; k++) {
					System.out.print(a[i][k] + "\t");
				}
				System.out.println();
			}
			System.out.println("��������� �� ��������");
			//for (int i = 0; i < n; i++ ) {//
				for (int k = 0; k < t; k++) {
					c[1][k] = a[k][1]; //���������� � ������ �������� �������
					a[k][1] = a[k][col]; // � 1 ������� �������� �������� ������� � ���� ���������
					a[k][col] = c[1][k];
					System.out.print(c[1][k] + "\t");
				}
				System.out.println();
			//}
		
		}
		System.out.println();
		/*for (int i = 0; i < n; i++) {
			for (int k = 0; k < t; k++) {
				System.out.print(c[i][k] + "\t");
			}
			System.out.println();
		}*/
		System.out.println("�������� ������� �: ");
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < t; k++) {
				System.out.print(a[i][k] + "\t");
			}
			System.out.println();
		}
	}

}
