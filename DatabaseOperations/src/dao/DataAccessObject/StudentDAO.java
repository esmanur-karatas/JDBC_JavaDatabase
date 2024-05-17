package dao.DataAccessObject;
import java.sql.*;

public class StudentDAO {
	private Connection conn = null;
	
	@Override
    protected void finalize() throws Throwable{
		System.out.println("VERİ TABANI BAĞLANTISI KAPATILDI!");
		conn.close();
	}
	
	private void veriTabaninaBaglan() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "esmanur23";
		conn = DriverManager.getConnection(url, username, password);
	
  }
	public Student getStudent(String studentNo) throws SQLException { 
		veriTabaninaBaglan();
		
		Student student = new Student();
		
		String query = "select * from student where studentNo = " + studentNo;
	    Statement st = conn.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    
	    if(rs.next()) {
	    	student.setID(rs.getInt("ID"));
			student.setNo(studentNo);
	    	student.setUserName(rs.getString("userName"));
	    	student.setName(rs.getString("name"));
	    	student.setSurname(rs.getString("surname"));
	    }else {
	    	student = null;
	    }
		return student;
	}


public void studentAdd(Student student) throws SQLException {
	veriTabaninaBaglan();
	
	String query = "INSERT INTO student (studentNo, userName, name, surname ) VALUES(?,?,?,?)";
	PreparedStatement st = conn.prepareStatement(query);
	
	st.setString(1, student.getNo());
	st.setString(2, student.getUserName());
	st.setString(3, student.getName());
	st.setString(4, student.getSurname());
	
	int count = st.executeUpdate();
	System.out.println("Öğrenci Başarıyla Eklendi!");
}

public void studentDelete(Student student) throws SQLException {
	veriTabaninaBaglan();
	String query = "delete from student where studentNo= " + student.getNo();
	Statement st = conn.createStatement();
	int count = st.executeUpdate(query);
	if(count == 1) {
	System.out.println("Öğrenci başarıyla silindi!");
	}
	else {
		System.out.println("Öğrenci Bulunamadı!");
	}
}

public void studentUpdate(Student student, String studentNo) throws SQLException {
	veriTabaninaBaglan();
	String query = "'update student set studentNo=' " + student.getNo() 
	+ ",' userName= '" +student.getUserName() + 
	"', name= '" + student.getName() + "', surname= '" + 
	student.getSurname() + "' where studentNo= '" + student.getNo();
	
    Statement st = conn.createStatement();
    int count = st.executeUpdate(query);
    if(count==1) {
    System.out.println("Öğrenci Bilgileri Başarıyla Güncellendi!");
    }else {
    	System.out.println("Öğrenci Bulunamadı!");
    }
}

}