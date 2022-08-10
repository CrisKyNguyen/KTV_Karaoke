package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import connectDB.Database;
import entity.DichVu;
import entity.HoaDon;
import entity.HoaDonDichVu;
import entity.Phong;

public class DAO_HoaDonDichVu {
	public static ArrayList<HoaDonDichVu> getAllHDDV(HoaDon hd, Phong p) {
		ArrayList<HoaDonDichVu> dsHDDV = new ArrayList<HoaDonDichVu>();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
    	try {
    		String sql = "Select * from HoaDonDichVu where maHD = '"+hd.getMaHD()+"'"
					+ " and maPhong = '"+p.getMaPhong()+"'";   
			s =con.prepareStatement(sql);
			ResultSet rs=s.executeQuery();
			while(rs.next()) {
				HoaDon hoaDon = new HoaDon(rs.getString("maHD"));
				DichVu dichVu = new DichVu(rs.getString("maDV"));
				Phong phong = new Phong(rs.getString("maPhong"));
				int soLuong = rs.getInt("soLuong");
				Timestamp gioDatDV = rs.getTimestamp("gioDatDV");
				
				HoaDonDichVu hddv = new HoaDonDichVu(hoaDon, dichVu, phong, soLuong, gioDatDV);
				dsHDDV.add(hddv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsHDDV;
	}
	
	public static ArrayList<HoaDonDichVu> getAllHDDVTheoHDvaPhongvaDV(HoaDon hd, Phong p, DichVu dv) {
		ArrayList<HoaDonDichVu> dsHDDV = new ArrayList<HoaDonDichVu>();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
    	try {
    		String sql = "Select * from HoaDonDichVu where maHD = '"+hd.getMaHD()+"'"
					+ " and maPhong = '"+p.getMaPhong()+"'"
					+ " and maDV = '"+dv.getMaDV()+"'";   
			s =con.prepareStatement(sql);
			ResultSet rs=s.executeQuery();
			while(rs.next()) {
				HoaDon hoaDon = new HoaDon(rs.getString("maHD"));
				DichVu dichVu = new DichVu(rs.getString("maDV"));
				Phong phong = new Phong(rs.getString("maPhong"));
				int soLuong = rs.getInt("soLuong");
				Timestamp gioDatDV = rs.getTimestamp("gioDatDV");
				
				HoaDonDichVu hddv = new HoaDonDichVu(hoaDon, dichVu, phong, soLuong, gioDatDV);
				dsHDDV.add(hddv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				s.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		return dsHDDV;
	}
	
	public static boolean themHDDV(HoaDonDichVu hddv) {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "insert into HoaDonDichVu values (?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, hddv.getHoaDon().getMaHD());
			pstm.setString(2, hddv.getDichVu().getMaDV());
			pstm.setString(3, hddv.getPhong().getMaPhong());
			pstm.setInt(4,hddv.getSoLuong());
			pstm.setTimestamp(5, hddv.getGioDatDV());
			pstm.executeUpdate();
			return true;
		} catch (SQLException e1) {
			System.out.println("Thêm hóa đơn dịch vụ thất bại!");
			return false;
		}
	}
	
	public static boolean capNhatHDDV(HoaDonDichVu hddv) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update HoaDonDichVu set soLuong = ?, gioDatDV = ?"
					+ " where maPhong = ? and maHD = ? and maDV = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			Timestamp gioHienTai = new Timestamp(System.currentTimeMillis());
			pstm.setInt(1,hddv.getSoLuong());
			pstm.setTimestamp(2, gioHienTai);
			pstm.setString(3,hddv.getPhong().getMaPhong());
			pstm.setString(4,hddv.getHoaDon().getMaHD());
			pstm.setString(5,hddv.getDichVu().getMaDV());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật hóa đơn dịch vụ thất bại!");
			return false;
		}
	}
	
	public static boolean huyDatDV(HoaDonDichVu hddv){		
		Database.getInstance().connect();
    	Connection con = Database.getConnection();
    	PreparedStatement s=null;
    	String sql="delete from HoaDonDichVu where maHD = ? and maDV = ? and maPhong = ?";
        try {
           s=con.prepareStatement(sql);
            s.setString(1, hddv.getHoaDon().getMaHD());
            s.setString(2, hddv.getDichVu().getMaDV());
            s.setString(3, hddv.getPhong().getMaPhong());
            s.executeUpdate();
            return true;
        } catch (SQLException e) {
           e.printStackTrace();
           return false;
        }
	}
}
