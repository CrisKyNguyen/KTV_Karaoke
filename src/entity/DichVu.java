package entity;

import java.util.Objects;

public class DichVu {
	private String maDV;
	private String tenDV;
	private double giaDV;
	
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public double getGiaDV() {
		return giaDV;
	}
	public void setGiaDV(double giaDV) {
		this.giaDV = giaDV;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maDV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DichVu other = (DichVu) obj;
		return Objects.equals(maDV, other.maDV);
	}
	
	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DichVu(String maDV) {
		super();
		this.maDV = maDV;
	}
	
	public DichVu(String maDV, String tenDV, double giaDV) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.giaDV = giaDV;
	}
	
	@Override
	public String toString() {
		return "DichVu [maDV=" + maDV + ", tenDV=" + tenDV + ", giaDV=" + giaDV + "]";
	}
}
