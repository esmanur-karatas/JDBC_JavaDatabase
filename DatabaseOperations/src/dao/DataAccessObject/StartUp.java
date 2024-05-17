package dao.DataAccessObject;

import java.sql.SQLException;

public class StartUp {

	public static void main(String[] args) throws SQLException {
		StudentDAO studentDao = new StudentDAO();
		
		Student arananStudent1 = studentDao.getStudent("12345678");
		Student arananStudent2 = studentDao.getStudent("12345643");
		if(arananStudent1 != null) {
			arananStudent1.bilgiVer();
		}else {
			System.out.println("Öğrenci Bulunamadı!");
		}
		
		if(arananStudent2 != null) {
			arananStudent1.bilgiVer();
		}else {
			System.out.println("Öğrenci Bulunamadı!");
		}
		
//		ÖĞRENCİ EKLEME
		Student studentAdd1 = new Student();
		studentAdd1.setNo("78463702");
		studentAdd1.setUserName("çileknurdmrck");
		studentAdd1.setName("Çileknur");
		studentAdd1.setSurname("Domurcuk");
		
		studentDao.studentAdd(studentAdd1);
		
//		ÖĞRENCİ SİL
		studentDao.studentDelete(studentAdd1);
		
//		ÖĞRENCİ EKLEME
		Student studentAdd2 = new Student();
		studentAdd2.setNo("11111111");
		studentAdd2.setUserName("YunusDertsiz");
		studentAdd2.setName("Yunus");
		studentAdd2.setSurname("Dertsiz");
		
		studentDao.studentAdd(studentAdd2);
		
//		ÖĞRENCİ GÜNCELLEME
		studentAdd2.setUserName("yunusemre");
		studentDao.studentUpdate(studentAdd2, studentAdd2.getNo());
		
		studentDao = null;
		System.gc();
		
		
	}
	

}
