package entity;

import java.util.Objects;

public class Phong {
	private String maPhong;
	private String tenPhong;
	private LoaiPhong loaiPhong;
	private boolean tinhTrang;
	private String ghiChu;
	
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public LoaiPhong getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(LoaiPhong loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phong other = (Phong) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
	public Phong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Phong(String maPhong) {
		super();
		this.maPhong = maPhong;
	}
	
	public Phong(String maPhong, String tenPhong, LoaiPhong loaiPhong, boolean tinhTrang,
			String ghiChu) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.loaiPhong = loaiPhong;
		this.tinhTrang = tinhTrang;
		this.ghiChu = ghiChu;
	}
	
	@Override
	public String toString() {
		return "Phong [maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", loaiPhong=" + loaiPhong + ", tinhTrang=" + tinhTrang + ", ghiChu=" + ghiChu + "]";
	}
}
