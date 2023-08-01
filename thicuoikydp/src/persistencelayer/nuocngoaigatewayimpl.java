package persistencelayer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;


import domainlayer.Model.khachhangnn;
import domainlayer.Model.khachhangvn;

public class nuocngoaigatewayimpl implements nuocngoaigateway{
    private Connection connection;
    
    public nuocngoaigatewayimpl() throws ClassNotFoundException {
    	String JDBC_URL = "jdbc:mysql://localhost:3306/thicuoiky";
        String USERNAME = "root"; 
        String PASSWORD = "huy22092003";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void addkhachhang(khachhangnn nuocngoai) {
		String query = "insert into khachhangnuocngoai(ma,hoten,ngayrahd,quoctich,soluong,dongia,thanhtien) values(?,?,?,?,?,?,?)";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(1,nuocngoai.getMa());
			ps.setString(2,nuocngoai.getHoten());
			ps.setDate(3,nuocngoai.getNgayrahd());
			ps.setString(4,nuocngoai.getQuoctich());
			ps.setDouble(5,nuocngoai.getSoluong());
			ps.setDouble(6,nuocngoai.getDongia());
			ps.setDouble(8,nuocngoai.thanhtien());
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void deletekhachhang(int nuocngoaiid) {
		String query = "delete from khachhangnuocngoai where ma=?";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(1,nuocngoaiid);
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updatekhachhang(khachhangnn nuocngoai) {
		String query = "update khachhangnuocngoai set hoten=?,ngayrahd=?,quoctich=?,soluong=?,dongia=?,thanhtien=? where ma=?";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(7,nuocngoai.getMa());
			ps.setString(1,nuocngoai.getHoten());
			ps.setDate(2,nuocngoai.getNgayrahd());
			ps.setString(3,nuocngoai.getQuoctich());
			ps.setDouble(4,nuocngoai.getSoluong());
			ps.setDouble(5,nuocngoai.getDongia());
			ps.setDouble(6,nuocngoai.thanhtien());
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public khachhangnn getbyid(int nuocngoaiid) {
		String query = "select * from khachhangnuocngoai where ma=?";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(1,nuocngoaiid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int ma = rs.getInt("ma");
				String ten = rs.getString("hoten");
				Date ngayrahd = rs.getDate("ngayrahd");
				String quoctich = rs.getString("quoctich");
				Double soluong = rs.getDouble("soluong");
				Double dongia = rs.getDouble("dongia");
				double tt =dongia*soluong;
				return new khachhangnn(ma,ten,soluong,dongia,ngayrahd,quoctich,tt);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<khachhangnn> getallnn() {
		List<khachhangnn> nns = new ArrayList<>();
		String query = "select * from khachhangnuocngoai";
		try (Statement st = connection.createStatement()) {
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				int ma = rs.getInt("ma");
				String ten = rs.getString("hoten");
				Date ngayrahd = rs.getDate("ngayrahd");
				String quoctich = rs.getString("quoctich");
				Double soluong = rs.getDouble("soluong");
				Double dongia = rs.getDouble("dongia");
				double tt =dongia*soluong;
				nns.add(new khachhangnn(ma,ten,soluong,dongia,ngayrahd,quoctich,tt));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return nns;
	}

	@Override
	public List<khachhangnn> getthang(int thang,int nam) {
		List<khachhangnn> nns = new ArrayList<>();
		String query = "select * from khachhangnuocngoai";
		try(Statement st = connection.createStatement()){
			ResultSet rs = st.executeQuery(query);
			String ngayrahd = String.valueOf(rs.getDate("ngayrahd"));
			Date dateFromDatabase = Date.valueOf(ngayrahd);
			Calendar calendar = Calendar.getInstance();
	        calendar.setTime(dateFromDatabase);
	        int monthFromDatabase = calendar.get(Calendar.MONTH) + 1;
	        int yearFromDatabase = calendar.get(Calendar.YEAR);
	        if (monthFromDatabase == thang && yearFromDatabase == nam) {
	        	int ma = rs.getInt("ma");
				String ten = rs.getString("hoten");
				Date ngayrahd1 = rs.getDate("ngayrahd");
				String quoctich = rs.getString("quoctich");
				Double soluong = rs.getDouble("soluong");
				Double dongia = rs.getDouble("dongia");
				double tt =dongia*soluong;
				nns.add(new khachhangnn(ma,ten,soluong,dongia,ngayrahd1,quoctich,tt));
	        } else {
	        	System.out.println("khong co!!!");
	        }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return nns;
	}

	@Override
	public double tongsl() {
		List<khachhangnn> nns = getallnn();
		double tongsl = 0;
		for(khachhangnn nuocngoai:nns) {
			tongsl += nuocngoai.getSoluong();
		}
		return tongsl;
	}

	@Override
	public double tbtt() {
		List<khachhangnn> nns = getallnn();
		 double tong = 0;
	     int slkhnn = 0;
	     for(khachhangnn nuocngoai:nns) {
	    	 tong += nuocngoai.thanhtien();
	    	 slkhnn++;
	     }
	     if (slkhnn > 0) {
	            return tong / slkhnn;
	        } else {
	            return 0;
	        }
	}
}
