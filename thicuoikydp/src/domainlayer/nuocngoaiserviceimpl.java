package domainlayer;

import java.util.List;

import domainlayer.Model.khachhangnn;
import persistencelayer.*;

public class nuocngoaiserviceimpl implements nuocngoaiservice {
	private nuocngoaiDAO nuocngoaidao;
	
	public nuocngoaiserviceimpl() throws ClassNotFoundException {
		nuocngoaidao = new nuocngoaiDAOimpl(new nuocngoaigatewayimpl());
	}

	@Override
	public void addkhachhang(khachhangnn nuocngoai) {	
		nuocngoaidao.addkhachhang(nuocngoai);
	}

	@Override
	public void deletekhachhang(int nuocngoaiid) {	
		nuocngoaidao.deletekhachhang(nuocngoaiid);
	}

	@Override
	public void updatekhachhang(khachhangnn nuocngoai) {		
		nuocngoaidao.updatekhachhang(nuocngoai);
	}

	@Override
	public khachhangnn getbyid(int nuocngoaiid) {
		return nuocngoaidao.getbyid(nuocngoaiid);
	}

	@Override
	public List<khachhangnn> getallnn() {
		return nuocngoaidao.getallnn();
	}

	@Override
	public List<khachhangnn> getthang(int thang,int nam) {
		return nuocngoaidao.getthang(thang,nam);
	}

	@Override
	public double tongsl() {
		return nuocngoaidao.tongsl();
	}

	@Override
	public double tbtt() {
		return nuocngoaidao.tbtt();
	}
	

}
