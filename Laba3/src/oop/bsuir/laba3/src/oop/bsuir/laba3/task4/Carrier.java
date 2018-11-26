package oop.bsuir.laba3.task4;

public class Carrier extends WarShip implements Ship {
	private int countOfTechnics;

	public Carrier(int id, String name, int year, int countOfPeople, int countOfWeapon, int countOfTechnics) {
		super(id, name, year, countOfPeople, countOfWeapon);
		this.countOfTechnics = countOfTechnics;
	}

	public int getCountOfTechnics() {
		return countOfTechnics;
	}

	public void setCountOfTechnics(int countOfTechnics) {
		this.countOfTechnics = countOfTechnics;
	}

	@Override
	public void whoAmI() {
		if (getCountOfWeapon() > 1) {
			System.out.println("������� �������");
		} else {
			System.out.println("����������� �������");
		}
	}

	@Override
	public void IsShip() {
		if (super.isSHIP()) {
			System.out.println("��� ������� � �� ������");
		} else {
			System.out.println("�� ������");
		}

	}

	public String getAllInfo() {
		return "Carrier [countOfTechnics=" + countOfTechnics + ", id= "+ super.getId() + ", name= "+  super.getName() + ", year= " + super.getYear() + ", countOfPeople= " + super.getCountOfPeople() + ",countOfWeapon= " + super.getCountOfWeapon() +"]";
	}

}
