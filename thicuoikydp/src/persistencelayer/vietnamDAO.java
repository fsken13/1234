	package persistencelayer;

import java.util.List;

import domainlayer.Model.khachhangvn;

public interface vietnamDAO {
	void addkhachhang(khachhangvn vietnam);
	void deletekhachhang(int vietnamid);
	void updatekhachhang(khachhangvn vietnam);
	khachhangvn getbyid(int vietnamid);
	List<khachhangvn> getallvn();
	List<khachhangvn> getthang(int thang,int nam);
	double tongsl();
}
