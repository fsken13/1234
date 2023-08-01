package persistencelayer;

import java.util.List;

import domainlayer.Model.khachhangnn;

public class nuocngoaiDAOimpl implements nuocngoaiDAO{
	private nuocngoaigateway nngateway;

	public nuocngoaiDAOimpl(nuocngoaigateway nngateway) {
		this.nngateway = nngateway;
	}

	@Override
	public void addkhachhang(khachhangnn nuocngoai) {
		nngateway.addkhachhang(nuocngoai);
	}

	@Override
	public void deletekhachhang(int nuocngoaiid) {
		nngateway.deletekhachhang(nuocngoaiid);
	}

	@Override
	public void updatekhachhang(khachhangnn nuocngoai) {
		nngateway.updatekhachhang(nuocngoai);
	}

	@Override
	public khachhangnn getbyid(int nuocngoaiid) {
		return nngateway.getbyid(nuocngoaiid);
	}

	@Override
	public List<khachhangnn> getallnn() {
		return nngateway.getallnn();
	}

	@Override
	public List<khachhangnn> getthang(int thang,int nam) {
		return nngateway.getthang(thang,nam);
	}

	@Override
	public double tongsl() {
		return nngateway.tongsl();
	}

	@Override
	public double tbtt() {
		return nngateway.tbtt();
	}

}
