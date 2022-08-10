package entity;

import java.sql.Timestamp;

public class HoaDonDichVu {
	private HoaDon hoaDon;
	private DichVu dichVu;
	private Phong phong;
	private int soLuong;
	private Timestamp gioDatDV;
	
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	public DichVu getDichVu() {
		return dichVu;
	}
	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Timestamp getGioDatDV() {
		return gioDatDV;
	}
	public void setGioDatDV(Timestamp gioDatDV) {
		this.gioDatDV = gioDatDV;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	
	public HoaDonDichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HoaDonDichVu(HoaDon hoaDon, Phong phong) {
		super();
		this.hoaDon = hoaDon;
		this.phong = phong;
	}
	
	public HoaDonDichVu(HoaDon hoaDon, DichVu dichVu, Phong phong) {
		super();
		this.hoaDon = hoaDon;
		this.dichVu = dichVu;
		this.phong = phong;
	}
	public HoaDonDichVu(HoaDon hoaDon, DichVu dichVu, Phong phong, int soLuong, Timestamp gioDatDV) {
		super();
		this.hoaDon = hoaDon;
		this.dichVu = dichVu;
		this.phong = phong;
		this.soLuong = soLuong;
		this.gioDatDV = gioDatDV;
	}
	
	@Override
	public String toString() {
		return "HoaDonDichVu [hoaDon=" + hoaDon + ", dichVu=" + dichVu + ", soLuong=" + soLuong + ", gioDatDV="
				+ gioDatDV + ", getHoaDon()=" + getHoaDon() + ", getDichVu()=" + getDichVu() + ", getSoLuong()="
				+ getSoLuong() + ", getGioDatDV()=" + getGioDatDV() + ", tienDV()=]";
	}
}
