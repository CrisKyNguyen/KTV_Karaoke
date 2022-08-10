package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.KhachHang;

import java.sql.Date;

public class DAO_KhachHang {
	public static ArrayList<KhachHang> getAllKhachHang() {
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			String sql= "select * from KhachHang";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maKH= rs.getString("maKH");
				String tenKH= rs.getString("tenKH");
				String gioiTinh= rs.getString("gioiTinh");
				Date ngaySinh= rs.getDate("ngaySinh");
				String soCMND= rs.getString("soCMND");
				String soDT= rs.getString("soDT");
				
				list.add(new KhachHang(maKH, tenKH, ngaySinh, gioiTinh, soDT, soCMND));
			}
			Database.getInstance().disconnect();
		} catch (SQLException e) {
			System.out.println(e);
		};
		
		return list;
		
	}
	
	public static ArrayList<KhachHang> timKH(String ten) {
		ArrayList<KhachHang> list= new ArrayList<KhachHang>();
		
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			
			String sql = "Select * from KhachHang where tenKH like N'%"+ten+"%' "
					+ "or maKH like N'%"+ten+"%'"
					+ "or gioiTinh like N'%"+ten+"%'"
		            + "or soCMND like N'%"+ten+"%'"
		            + "or soDT like N'%"+ten+"%'"
		            + "or ngaySinh like N'%"+ten+"%'";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maKH= rs.getString("maKH");
				String tenKH= rs.getString("tenKH");
				String gioiTinh= rs.getString("gioiTinh");
				Date ngaySinh= rs.getDate("ngaySinh");
				String soCMND= rs.getString("soCMND");
				String soDT= rs.getString("soDT");
				
				list.add(new KhachHang(maKH, tenKH, ngaySinh, gioiTinh, soDT, soCMND) );
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println(e);
		};
		
		return list;
		
	}
	
	public static KhachHang timKHTheoMa(String ma){
		KhachHang kh = new KhachHang();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from KhachHang "
						+ "where maKH = '"+ma+"' ";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					String maKH= rs.getString("maKH");
					String tenKH= rs.getString("tenKH");
					String gioiTinh= rs.getString("gioiTinh");
					Date ngaySinh= rs.getDate("ngaySinh");
					String soCMND= rs.getString("soCMND");
					String soDT= rs.getString("soDT");
					kh = new KhachHang(maKH, tenKH, ngaySinh, gioiTinh, soDT, soCMND);
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
		return kh;
	}
	
//	public KhachHang getElement(int index) {
//		ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
//		if(index<0 || index>dskh.size())
//			return null;
//		return dskh.get(index);
//	}
	public static boolean themKH(KhachHang kh) {
		
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "insert into KhachHang values(?,?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, kh.getMaKH());
			pstm.setString(2, kh.getTenKH());
			pstm.setString(3, kh.getGioiTinh());
			pstm.setDate(4, kh.getNgaySinh());
			pstm.setString(5, kh.getSoCMND());
			pstm.setString(6, kh.getSoDT());
			pstm.executeUpdate();
			return true;
		} catch (SQLException e1) {
			System.out.println("Thêm khách hàng không thành công!");
			return false;
		}
	}
	
//	public void xoaKH(String ma){		
//		Database.getInstance();
//    	Connection con = Database.getConnection();
//    	PreparedStatement s=null;
//    	String sql="Delete From KhachHang where maKH = ?";
//        try {
//           s=con.prepareStatement(sql);
//            s.setString(1, ma);
//            s.executeUpdate();
//        } catch (SQLException e) {
//           e.printStackTrace();
//        }finally {
//        	try {
//				s.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//        }
//	}
	
	public static boolean capNhatKH(KhachHang kh) throws Exception  {
		
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update KhachHang set tenKH = ?,gioiTinh = ?,ngaySinh = ?, soCMND = ?, soDT = ?  where maKH = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1,kh.getTenKH());
			pstm.setString(2,kh.getGioiTinh());
			pstm.setDate(3,kh.getNgaySinh());
			pstm.setString(4,kh.getSoCMND());
			pstm.setString(5,kh.getSoDT());
			pstm.setString(6,kh.getMaKH());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
//	
//	public int getSize() {
//		return DSKhachHang().size();
//	}
//
//	public ArrayList<KhachHang> getDsKH() {
//		return DSKhachHang();
//	}
//	public int count() {
//		return DSKhachHang().size();
//	}
//	public KhachHang timKiemTheoMa(String ma) {
//		KhachHang kh = new KhachHang();
//		if(DSKhachHang().contains(kh))
//			return DSKhachHang().get(DSKhachHang().indexOf(kh));
//		return null;
//	}
}