package First;

import java.util.Scanner;

public class Strings implements Aryphmetics {
	private String[] str;

	public Strings() {
		System.out.println("������� ����������� ������� �����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ��������� ���������� ���� � ������� ��������� ���� ���, ��� ���� �����������
								// sc.nextInt()
		this.str = new String[n];
		System.out.println("������ ����� = " + n);
		System.out.println("������� ������  ��������");
		// System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			this.str[i] = sc.next();
		}
		System.out.println("������ ��������!");
		String str = String.join("", this.str);
		System.out.println("�������� ������: " + str);
	}

	protected void finalize() {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}

	public void getMas() {
		System.out.println("��������� ������");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
	}

	public String getValue(int num) {
		System.out.println("������� ������");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("���� ������: " + str);
		return "�������� �� ������ �� ������: " + str.charAt(num);
	}

	@Override
	public int addition() {
		// ������ � �� ���� � ������ � �������
		return 0;
	}

	@Override
	public void comparison() {
		// ��������� �� �������� �����

	}

}
