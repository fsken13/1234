package persistencelayer;

import java.util.List;

import domainlayer.Model.khachhangvn;

public class vietnamDAOimpl implements vietnamDAO{
	private vietnamgateway vngateway;
	
	public vietnamDAOimpl(vietnamgateway vngateway) {
		this.vngateway = vngateway;
	}

	@Override
	public void addkhachhang(khachhangvn vietnam) {
		vngateway.addkhachhang(vietnam);
	}

	@Override
	public void deletekhachhang(int vietnamid) {
		vngateway.deletekhachhang(vietnamid);
	}

	@Override
	public void updatekhachhang(khachhangvn vietnam) {
		vngateway.updatekhachhang(vietnam);
	}

	@Override
	public khachhangvn getbyid(int vietnamid) {
		return vngateway.getbyid(vietnamid);
	}

	@Override
	public List<khachhangvn> getallvn() {
		return vngateway.getallvn();
	}

	@Override
	public List<khachhangvn> getthang(int thang,int nam) {
		return vngateway.getthang(thang,nam);
	}

	@Override
	public double tongsl() {
		return vngateway.tongsl();
	}

}
