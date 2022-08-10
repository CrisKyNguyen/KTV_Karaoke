package entity;

import java.sql.Timestamp;
import java.util.Objects;

public class HoaDon {
	private String maHD;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private Timestamp ngayLapHD;
	private double tongThanhTien;
	private double thueVAT;
	private boolean tinhTrang;
	
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public Timestamp getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(Timestamp ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public double getTongThanhTien() {
		return tongThanhTien;
	}
	public void setTongThanhTien(double tongThanhTien) {
		this.tongThanhTien = tongThanhTien;
	}
	public double getThueVAT() {
		return thueVAT;
	}
	public void setThueVAT(double thueVAT) {
		this.thueVAT = thueVAT;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maHD);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHD, other.maHD);
	}
	
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HoaDon(String maHD) {
		super();
		this.maHD = maHD;
	}
	
	public HoaDon(Timestamp ngayLapHD) {
		super();
		this.ngayLapHD = ngayLapHD;
	}
	
	public HoaDon(String maHD, NhanVien nhanVien, KhachHang khachHang, Timestamp ngayLapHD, double tongThanhTien,
			double thueVAT, boolean tinhTrang) {
		super();
		this.maHD = maHD;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.ngayLapHD = ngayLapHD;
		this.tongThanhTien = tongThanhTien;
		this.thueVAT = thueVAT;
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", nhanVien=" + nhanVien + ", khachHang=" + khachHang + ", ngayLapHD="
				+ ngayLapHD + ", tongThanhTien=" + tongThanhTien + ", thueVAT=" + thueVAT + ", tinhTrang=" + tinhTrang
				+ "]";
	}
}
