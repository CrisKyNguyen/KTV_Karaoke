package entity;

import java.sql.Date;
import java.util.Objects;

public class NhanVien {
	
	private String maNV;
	private String tenNV;
	private String gioiTinh;
	private String soDT;
	private String soCMND;
	private Date ngaySinh;
	private ChucVu chucVu;
	private Date ngayVaoLam;
	private String matKhau;
	private boolean tinhTrang;
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public ChucVu getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}
	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}
	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maNV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(maNV, other.maNV);
	}
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}
	
	public NhanVien(String maNV, String tenNV, String gioiTinh, String soDT, String soCMND, Date ngaySinh,
			ChucVu chucVu, Date ngayVaoLam, String matKhau) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.soDT = soDT;
		this.soCMND = soCMND;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.ngayVaoLam = ngayVaoLam;
		this.matKhau = matKhau;
	}
	
	public NhanVien(String maNV, String tenNV, String gioiTinh, String soDT, String soCMND, Date ngaySinh,
			ChucVu chucVu, Date ngayVaoLam, String matKhau, boolean tinhTrang) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.soDT = soDT;
		this.soCMND = soCMND;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
		this.ngayVaoLam = ngayVaoLam;
		this.matKhau = matKhau;
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", gioiTinh=" + gioiTinh + ", soDT=" + soDT + ", soCMND="
				+ soCMND + ", ngaySinh=" + ngaySinh + ", chucVu=" + chucVu + ", ngayVaoLam=" + ngayVaoLam + ", matKhau="
				+ matKhau + ", tinhTrang=" + tinhTrang + "]";
	}
}
