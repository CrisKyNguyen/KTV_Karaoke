package entity;

import java.sql.Timestamp;
import java.text.NumberFormat;

public class HoaDonPhong {
	private HoaDon hoaDon;
	private Phong phong;
	private Timestamp gioDatPhong;
	private Timestamp gioTraPhong;
	
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	public Timestamp getGioDatPhong() {
		return gioDatPhong;
	}
	public void setGioDatPhong(Timestamp gioDatPhong) {
		this.gioDatPhong = gioDatPhong;
	}
	public Timestamp getGioTraPhong() {
		return gioTraPhong;
	}
	public void setGioTraPhong(Timestamp gioTraPhong) {
		this.gioTraPhong = gioTraPhong;
	}
	
	public HoaDonPhong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HoaDonPhong(HoaDon hoaDon, Phong phong, Timestamp gioDatPhong) {
		super();
		this.hoaDon = hoaDon;
		this.phong = phong;
		this.gioDatPhong = gioDatPhong;
	}
	
	public HoaDonPhong(HoaDon hoaDon, Phong phong, Timestamp gioDatPhong, Timestamp gioTraPhong) {
		super();
		this.hoaDon = hoaDon;
		this.phong = phong;
		this.gioDatPhong = gioDatPhong;
		this.gioTraPhong = gioTraPhong;
	}
	
	public int tinhGio() {
		NumberFormat numf = NumberFormat.getNumberInstance();
	    numf.setMaximumFractionDigits(1);
		double s = (double)(gioTraPhong.getTime() - gioDatPhong.getTime())/(3600*1000);
		int soGio = (int) (s/1);
		if (soGio<s)
			soGio+=1;
		return soGio;
	}
}
