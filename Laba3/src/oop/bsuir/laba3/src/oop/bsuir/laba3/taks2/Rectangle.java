package oop.bsuir.laba3.taks2;

import java.util.Scanner;

public class Rectangle implements Area {
	private int a;
	private int b;

	public Rectangle() {
		System.out.println("������� ����� ����� �������");
		Scanner sc = new Scanner(System.in);
		this.a = sc.nextInt();
		System.out.println("������� ����� ������ �������");
		this.b = sc.nextInt();
	}

	public void getLengths() {
		System.out.println("����� ������ �������: " + a);
		System.out.println("����� ������ �������: " + b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public double area(Area area[]) {
		double square = getA() * getB();
		return square;
	}
}
