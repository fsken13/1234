package domainlayer;

import java.util.List;

import domainlayer.Model.khachhangvn;
import persistencelayer.*;


public class vietnamserviceimpl implements vietnamservice {
	private vietnamDAO vietnamdao;
	
	public vietnamserviceimpl() throws ClassNotFoundException {
		vietnamdao = new vietnamDAOimpl(new vietnamgatewayimpl());
	}
	
	@Override
	public void addkhachhang(khachhangvn vietnam) {		
		vietnamdao.addkhachhang(vietnam);
	}

	@Override
	public void deletekhachhang(int vietnamid) {		
		vietnamdao.deletekhachhang(vietnamid);
	}

	@Override
	public void updatekhachhang(khachhangvn vietnam) {		
		vietnamdao.updatekhachhang(vietnam);
	}

	@Override
	public khachhangvn getbyid(int vietnamid) {
		return vietnamdao.getbyid(vietnamid);
	}

	@Override
	public List<khachhangvn> getallvn() {
		return vietnamdao.getallvn();
	}

	@Override
	public List<khachhangvn> getthang(int thang,int nam) {
		return vietnamdao.getthang(thang,nam);
	}

	@Override
	public double tongsl() {
		return vietnamdao.tongsl();
	}

}
