package dao.DataAccessObject;

public class Student {
	private int ID;
	private String no;
	private String userName;
	private String name;
	private String surname;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void bilgiVer() {
		String bilgi = "Öğrenci Numarası: " + no + "\tKullanıcı Adı: " + userName + "\tAdı: " + name + "\tSoyadı: " + surname;
		System.out.println(bilgi);
	}

}
