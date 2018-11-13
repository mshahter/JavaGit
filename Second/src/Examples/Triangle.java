package Examples;

	public class Triangle extends TwoDShape {
		private String style;
		// ����������� �� ���������
		public Triangle() {
		super();
		style = "null";
		}
		// ����������� ������ Triangle
		public Triangle(String s, double w, double h) {
		super(w, h, "triangle");
		style = s;
		}
		// ������������ �������������� �������������
		public Triangle(double x) {
		super(x, "triangle"); // ����� ������������ �����������
		style = "isosceles";
		}
		// ������������ ������� �� ������ ������� �������
		public Triangle(Triangle ob) {
		super(ob); // �������� ������� ������������ TwoDShape
		style = ob.style;
		}
		// ��������������� ������ area() ��� ������ Triangle
		public double area() {
		return getWidth() * getHeight() / 2;
		}
		void showStyle() {
		System.out.println("Triangle is " + style);
		}
	}
	

