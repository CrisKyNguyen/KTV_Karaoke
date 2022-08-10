package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import connectDB.Database;
import entity.HoaDon;
import entity.HoaDonPhong;
import entity.LoaiPhong;
import entity.Phong;

public class DAO_HoaDonPhong {

	public static ArrayList<HoaDonPhong> getAllHoaDonPhongTheoMaHD(String ma){
		ArrayList<HoaDonPhong> dshdp=new ArrayList<HoaDonPhong>();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from HoaDonPhong hdp join Phong p "
						+ "on hdp.maPhong = p.maPhong where hdp.maHD = '"+ma+"'";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					HoaDon hoaDon= new HoaDon(rs.getString("maHD"));
					String maPhong= rs.getString("maPhong");
					String tenPhong = rs.getString("tenPhong");
					LoaiPhong loaiPhong = new LoaiPhong(rs.getString("maLP"));
					Timestamp gioDatPhong = rs.getTimestamp("gioDatPhong");
					Timestamp gioTraPhong = rs.getTimestamp("gioTraPhong");
//					Double tienPhong = rs.getDouble("tienPhong");
//					Double soGio = rs.getDouble("soGio");
					Phong phong = new Phong(maPhong, tenPhong, loaiPhong, true, "");
					HoaDonPhong hdp=new HoaDonPhong(hoaDon, phong, gioDatPhong, gioTraPhong);
					dshdp.add(hdp);
				}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			try {
				s.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		return dshdp;
	}
	
	public static HoaDonPhong timHDPTheoHDvaPhong(String maHD, String maP){
		HoaDonPhong hdp = new HoaDonPhong();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from HoaDonPhong hdp join Phong p "
						+ "on hdp.maPhong = p.maPhong where hdp.maHD = '"+maHD+"' "
						+ "and hdp.maPhong = '"+maP+"'";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					HoaDon hoaDon= new HoaDon(rs.getString("maHD"));
					String maPhong= rs.getString("maPhong");
					String tenPhong = rs.getString("tenPhong");
					LoaiPhong loaiPhong = new LoaiPhong(rs.getString("maLP"));
					Timestamp gioDatPhong = rs.getTimestamp("gioDatPhong");
					Timestamp gioTraPhong = rs.getTimestamp("gioTraPhong");
//					Double tienPhong = rs.getDouble("tienPhong");
//					Double soGio = rs.getDouble("soGio");
					Phong phong = new Phong(maPhong, tenPhong, loaiPhong, true, "");
					hdp = new HoaDonPhong(hoaDon, phong, gioDatPhong, gioTraPhong);
				}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			try {
				s.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		return hdp;
	}
	
	public static ArrayList<HoaDonPhong> getAllHoaDonPhongDat(){
		ArrayList<HoaDonPhong> dshdp=new ArrayList<HoaDonPhong>();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from HoaDonPhong hdp join Phong p "
						+ "on hdp.maPhong = p.maPhong join HoaDon hd "
						+ "on hd.maHD = hdp.maHD "
						+ "where p.tinhTrang = 1 and hd.tinhTrang = 0";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					HoaDon hoaDon= new HoaDon(rs.getString("maHD"));
					String maPhong= rs.getString("maPhong");
					String tenPhong = rs.getString("tenPhong");
					LoaiPhong loaiPhong = new LoaiPhong(rs.getString("maLP"));
					Timestamp gioDatPhong = rs.getTimestamp("gioDatPhong");
					Timestamp gioTraPhong = rs.getTimestamp("gioTraPhong");
//					Double tienPhong = rs.getDouble("tienPhong");
//					Double soGio = rs.getDouble("soGio");
					Phong phong = new Phong(maPhong, tenPhong, loaiPhong, true, "");
					HoaDonPhong hdp=new HoaDonPhong(hoaDon, phong, gioDatPhong, gioTraPhong);
					dshdp.add(hdp);
				}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			try {
				s.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		return dshdp;
	}
	
	public static ArrayList<HoaDonPhong> getAllHoaDonPhongDatTheoHDChuaThanhToan(){
		ArrayList<HoaDonPhong> dshdp=new ArrayList<HoaDonPhong>();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from HoaDon hd join HoaDonPhong hdp "
						+ "on hd.maHD = hdp.maHD join Phong p "
						+ "on hdp.maPhong = p.maPhong "
						+ "where hd.tinhTrang = 0";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					HoaDon hoaDon= new HoaDon(rs.getString("maHD"));
					String maPhong= rs.getString("maPhong");
					String tenPhong = rs.getString("tenPhong");
					LoaiPhong loaiPhong = new LoaiPhong(rs.getString("maLP"));
					Timestamp gioDatPhong = rs.getTimestamp("gioDatPhong");
					Timestamp gioTraPhong = rs.getTimestamp("gioTraPhong");
//					Double tienPhong = rs.getDouble("tienPhong");
//					Double soGio = rs.getDouble("soGio");
					Phong phong = new Phong(maPhong, tenPhong, loaiPhong, true, "");
					HoaDonPhong hdp=new HoaDonPhong(hoaDon, phong, gioDatPhong, gioTraPhong);
					dshdp.add(hdp);
				}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			try {
				s.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		return dshdp;
	}
	
	public static boolean themHDP(HoaDonPhong hdp) {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "insert into HoaDonPhong values(?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, hdp.getHoaDon().getMaHD());
			pstm.setString(2, hdp.getPhong().getMaPhong());
			pstm.setTimestamp(3,hdp.getGioDatPhong());
			pstm.setTimestamp(4, hdp.getGioTraPhong());
			pstm.executeUpdate();
			return true;
		} catch (SQLException e1) {
			System.out.println("Thêm hóa đơn phòng thất bại!");
			return false;
		}
	}
	
	public static boolean capNhatHDP(HoaDonPhong hdp) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update HoaDonPhong set gioTraPhong = ?"
					+ " where maPhong = ? and maHD = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			Timestamp gioHienTai = new Timestamp(System.currentTimeMillis());
			pstm.setTimestamp(1,gioHienTai);
			pstm.setString(2,hdp.getPhong().getMaPhong());
			pstm.setString(3,hdp.getHoaDon().getMaHD());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật thông tin hóa đơn phòng thất bại!");
			return false;
		}
	}
	
//	public static HoaDonPhong timHDP(HoaDon hd) {
//		HoaDonPhong hdp = new HoaDonPhong();
//		Database.getInstance().connect();
//    	Connection con= Database.getConnection();
//    	PreparedStatement s=null;
//    	try {
//    		String sql = "Select * from HoaDonPhong nv join ChucVu cv "
//					+ "on nv.maCV = cv.maCV "
//					+ "where maNV like N'%"+ten+"%' "
//		            + "or tenNV like N'%"+ten+"%'"
//		            + "or gioiTinh like N'%"+ten+"%' "
//		            + "or soDT like N'%"+ten+"%' "
//		            + "or soCMND like N'%"+ten+"%' "
//		            + "or ngaySinh like N'%"+ten+"%' " 
//					+ "or ngayVaoLam like N'%"+ten+"%' "
//					+ "or nv.maCV like N'%"+ten+"%' "
//					+ "or tenCV like N'%"+ten+"%' ";   
//			s =con.prepareStatement(sql);
//			ResultSet rs=s.executeQuery();
//			while(rs.next()) {
//				String maNV= rs.getString("maNV");
//				String tenNV= rs.getString("tenNV");
//				String gioiTinh = rs.getString("gioiTinh");
//				String soDT = rs.getString("soDT");
//				String soCMND = rs.getString("soCMND");
//				Date ngaySinh = rs.getDate("ngaySinh");
//				ChucVu chucVu = new ChucVu(rs.getString("maCV"));
//				Date ngayVaoLam = rs.getDate("ngayVaoLam");
//				String matKhau = rs.getString("matKhau");
//				Boolean tinhTrang = rs.getBoolean("tinhTrang");
//				NhanVien nv=new NhanVien(maNV,tenNV,gioiTinh,soDT,soCMND, ngaySinh,chucVu,ngayVaoLam,matKhau,tinhTrang);
//				dsnv.add(nv);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
//	}
}
