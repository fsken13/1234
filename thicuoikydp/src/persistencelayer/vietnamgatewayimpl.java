package persistencelayer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import domainlayer.Model.khachhangvn;

public class vietnamgatewayimpl implements vietnamgateway{
	 private Connection connection;
	
	    public vietnamgatewayimpl() throws ClassNotFoundException {
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
	public void addkhachhang(khachhangvn vietnam) {
		String query = "insert into khachhangvn(ma,hoten,ngayrahd,doituongkh,soluong,dongia,dinhmuc,thanhtien) values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(1,vietnam.getMa());
			ps.setString(2,vietnam.getHoten());
			ps.setDate(3,vietnam.getNgayrahd());
			ps.setString(4,vietnam.getDoituongkh());
			ps.setDouble(5,vietnam.getSoluong());
			ps.setDouble(6,vietnam.getDongia());
			ps.setDouble(7,vietnam.getDinhmuc());
			ps.setDouble(8,vietnam.thanhtien());
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void deletekhachhang(int vietnamid) {
		String query = "delete from khachhangvn where ma=?";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(1,vietnamid);
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updatekhachhang(khachhangvn vietnam) {
		String query = "update khachhangvn set hoten=?,ngayrahd=?,doituongkh=?,soluong=?,dongia=?,dinhmuc=?,thanhtien=? where ma=?";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(8,vietnam.getMa());
			ps.setString(1,vietnam.getHoten());
			ps.setDate(2,vietnam.getNgayrahd());
			ps.setString(3,vietnam.getDoituongkh());
			ps.setDouble(4,vietnam.getSoluong());
			ps.setDouble(5,vietnam.getDongia());
			ps.setDouble(6,vietnam.getDinhmuc());
			ps.setDouble(7,vietnam.thanhtien());
			ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public khachhangvn getbyid(int vietnamid) {
		String query = "select * from khachhangvn where ma=?";
		try(PreparedStatement ps = connection.prepareStatement(query)){
			ps.setInt(1,vietnamid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int ma = rs.getInt("ma");
				String ten = rs.getString("hoten");
				Date ngayrahd = rs.getDate("ngayrahd");
				String doituongkh = rs.getString("doituongkh");
				Double soluong = rs.getDouble("soluong");
				Double dongia = rs.getDouble("dongia");
				Double dinhmuc = rs.getDouble("dinhmuc");
				double tt;
				if(soluong <= dinhmuc) {
					  tt = soluong*dongia;
				}
				else {
					double vuotdinhmuc = soluong-dinhmuc;
					  tt = (dinhmuc * dongia) + (vuotdinhmuc * dongia * 2.5);
				}
				return new khachhangvn(ma,ten,soluong,dongia,ngayrahd,dinhmuc,doituongkh,tt);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<khachhangvn> getallvn() {
		List<khachhangvn> vns = new ArrayList<>();
		String query = "select * from khachhangvn";
		try (Statement st = connection.createStatement()) {
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				int ma = rs.getInt("ma");
				String ten = rs.getString("hoten");
				Date ngayrahd = rs.getDate("ngayrahd");
				String doituongkh = rs.getString("doituongkh");
				Double soluong = rs.getDouble("soluong");
				Double dongia = rs.getDouble("dongia");
				Double dinhmuc = rs.getDouble("dinhmuc");
				double tt;
				if(soluong <= dinhmuc) {
					  tt = soluong*dongia;
				}
				else {
					double vuotdinhmuc = soluong-dinhmuc;
					  tt = (dinhmuc * dongia) + (vuotdinhmuc * dongia * 2.5);
				}
				vns.add(new khachhangvn(ma,ten,soluong,dongia,ngayrahd,dinhmuc,doituongkh,tt));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return vns;
	}

	@Override
	public List<khachhangvn> getthang(int thang,int nam) {
		List<khachhangvn> vns = new ArrayList<>();
		String query = "select * from khachhangvn";
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
				String doituongkh = rs.getString("doituongkh");
				Double soluong = rs.getDouble("soluong");
				Double dongia = rs.getDouble("dongia");
				Double dinhmuc = rs.getDouble("dinhmuc");
				double tt;
				if(soluong <= dinhmuc) {
					  tt = soluong*dongia;
				}
				else {
					double vuotdinhmuc = soluong-dinhmuc;
					  tt = (dinhmuc * dongia) + (vuotdinhmuc * dongia * 2.5);
				}
				vns.add(new khachhangvn(ma,ten,soluong,dongia,ngayrahd1,dinhmuc,doituongkh,tt));
	        } else {
	        	System.out.println("khong co!!!");
	        }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return vns;
	}

	@Override
	public double tongsl() {
		List<khachhangvn> vns = getallvn();
		double tongsl = 0;
		for(khachhangvn vietnam:vns) {
			tongsl += vietnam.getSoluong();
		}
		return tongsl;
	}

}
