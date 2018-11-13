package Examples;

	public class Rectangle extends TwoDShape {
		// ����������� �� ���������
		public Rectangle() {
		super();
		}
		// ����������� ������ Rectangle
		public Rectangle(double w, double h) {
		super(w, h, "rectangle"); // ����� ������������ �����������
		}
		// ������������ ��������
		public Rectangle(double x) {
		super(x, "rectangle"); // ����� ������������ �����������
		}
		// ������������ ������� �� ������ ������� �������
		public Rectangle(Rectangle ob) {
		super(ob); // �������� ������� ������������ TwoDShape
		}
		public boolean isSquare() {
		if (getWidth() == getHeight()) {
		return true;
		}
		return false;
		}
		// ��������������� ������ area() ��� ������ Rectangle
		public double area() {
		return getWidth() * getHeight();
		}
	}