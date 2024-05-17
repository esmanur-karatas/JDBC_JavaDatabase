import java.sql.*;
import java.util.Scanner;

public class StartUp {

	public static void main(String[] args) throws SQLException {
//		veritabanına bağlanma.
		String url = "jdbc:mysql://localhost:3306/school";

//		kullanıcı adı ve şifre girme 
		String username = "root";
		String password = "esmanur23";

//		SORGU OLUŞTURMA STUDENTS TABLOSU 
		String query = "select * from student";
		
//		Connection Database
		Connection conn = null;
		conn = DriverManager.getConnection(url, username, password);
		
//		DQL Komutu ile sorgulama STATEMENT DOĞRUDAN DORGULUYOR
//		Statement st = conn.prepareStatement(query);
//		DAHA GÜVENLİ VERİ SORGULAMA YANİ DOĞRUDAN DEĞİL DOLAYLI OLARAK SORGULUYOR.
		PreparedStatement st = conn.prepareStatement(query);
		
//		sorguyu çalıştırma
		ResultSet rs = st.executeQuery(query);
		
//		RESULTSET İÇİNDEKİ VERİLERİ ALMAK İÇİN BAŞLATMAK LAZIM
		while(rs.next()) {
//			VERİLERE ERİŞME
//			ID 
			int studentID = rs.getInt("ID");
			
//			studentNo
			String studentNo = rs.getString("studentNo");
			
//			userName
			String userName = rs.getString("userName");
			
//			name
			String name = rs.getString("name");
			
//			surname
			String surname = rs.getString("surname");
			
			System.out.println("ÖĞRENCİ ID: " + studentID + "\tÖĞRENCİ NO: " + studentNo + "\tKULLANICI ADI: " + userName + "\tÖĞRENCİ ADI: " + name + "\tÖĞRENCİ SOYADI: " + surname);
			
		}

//		VERİ TABANINA VERİ EKLEME
//		query = "INSERT INTO student VALUES(4, '12345678', 'feyzasen', 'Feyza', 'Şen')";

//		istediğimiz sütunları belirtip veri ekleme
		query = "INSERT INTO student(studentNo, userName, name, surname) VALUES('87654334', 'ersinkrts', 'Ersin', 'kara')";

//		DOLAYLI YOLDAN DAHA GÜVENLİ BİR ŞEKİLDE VERİ EKLEME
//	    query = "INSERT INTO student(studentNo, userName, name, surname) VALUES(?, ?, ?, ?)";
//		st = conn.prepareStatement(query);
//		st.setString(1, "62387654");
//		st.setString(2, "esrapolatcan");
//		st.setString(3, "EsraNUR");
//		st.setString(4, "Polatcan");
		
//		executeUpdate veritabanını günceller. 
//		int count = st.executeUpdate(query);
//		preparestatementlarda executeUpdate içine query ekleyemeyiz.
//		int count = st.executeUpdate();
//		System.out.println(count + " Yeni öğrenci eklendi!");
		
//		KULLANICIDAN VERİLERİ ALMA
		String studentNo, userName, name, surname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Öğrenci Numaranız: ");
		studentNo = sc.nextLine();
		System.out.println("Kullanıcı Adınız: ");
		userName = sc.nextLine();
		System.out.println("Adınız: ");
		name = sc.nextLine();
		System.out.println("Soyadınız: ");
		surname = sc.nextLine();
		
		st = conn.prepareStatement(query);
		st.setString(1, studentNo);
		st.setString(2, userName);
		st.setString(3, name);
		st.setString(4, surname);
		
        int count = st.executeUpdate();
		System.out.println(count + " Yeni öğrenci eklendi!");
		
		
//      veritabanı ve statement ı kapattık. 
		st.close();
		conn.close();
	}

}
