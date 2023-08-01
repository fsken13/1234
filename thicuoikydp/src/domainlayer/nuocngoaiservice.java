package domainlayer;

import java.util.List;

import domainlayer.Model.khachhangnn;

public interface nuocngoaiservice {
	void addkhachhang(khachhangnn nuocngoai);
	void deletekhachhang(int nuocngoaiid);
	void updatekhachhang(khachhangnn nuocngoai);
	khachhangnn getbyid(int nuocngoaiid);
	List<khachhangnn> getallnn();
	List<khachhangnn> getthang(int thang,int nam);
	double tongsl();
	double tbtt();
}
