import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;

import dao.DAO_HoaDon;
import entity.HoaDon;
import entity.HoaDonPhong;
import entity.Phong;

public class test {

	public static void main(String[] args) {
		// tính giờ
		NumberFormat numf = NumberFormat.getNumberInstance();
	    numf.setMaximumFractionDigits(1);
		
		Timestamp stamp = new Timestamp(2021, 11, 26, 15, 49, 16, 0);
		Timestamp stampsau = new Timestamp(2021, 11, 27, 9, 49, 21, 0);
		Date date = new Date(stamp.getTime());
		Time time = new Time(stamp.getTime());
		LocalDate ngayHT = LocalDate.now();
		
		ArrayList<HoaDon> lstHD = DAO_HoaDon.getAllHoaDonDaThanhToan();
		for (HoaDon hd : lstHD) {
			Date nam = new Date(hd.getNgayLapHD().getTime());
			int ngay = (int) ((nam.getTime())/(31*23*3600*1000));
			String ngayN = (new Date(hd.getNgayLapHD().getTime())+"");
			System.out.println(ngayHT);
		}
		
		NumberFormat numf1 = NumberFormat.getNumberInstance();
		   numf1.setMaximumFractionDigits(1);
		double s = (double)(stampsau.getTime() - stamp.getTime())/(3600*1000);
		int soGio = (int) (s/1);
		if (soGio<s)
			soGio+=1;

		System.out.println(s);
		System.out.println(soGio);
		
//		System.out.println(nam);
		
//		System.out.println(date);
//		System.out.println(time);
//		System.out.println((double)(stampsau.getTime() - stamp.getTime())/(3600*1000));
//		System.out.println(Double.parseDouble(numf.format((double)(stampsau.getTime() - stamp.getTime())/(3600*1000))));
		//====================================================================
//		HoaDonPhong hdp = new HoaDonPhong(new HoaDon("HD001"), new Phong("PH001"), stamp, stamp);
	}

}
