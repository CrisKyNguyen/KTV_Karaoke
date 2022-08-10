package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import connectDB.Database;
import entity.Phong;
import entity.LoaiPhong;

public class DAO_Phong {
	public static ArrayList<Phong> getAllPhong() {
		ArrayList<Phong> dsp = new ArrayList<Phong>();
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			String sql= "select * from Phong";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maPhong= rs.getString("maPhong");
				String tenPhong= rs.getString("tenPhong");
				LoaiPhong loaiPhong = new LoaiPhong(rs.getString("maLP"));
				Boolean tinhTrang = rs.getBoolean("tinhTrang");
				String ghiChu = rs.getString("ghiChu");
				
				dsp.add(new Phong(maPhong, tenPhong, loaiPhong, tinhTrang, ghiChu));
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println(e);
		};
		return dsp;
	}
	
//	public ArrayList<Phong> TimPhongTheoMa(String ma){
//		ArrayList<Phong> dsp= new ArrayList<Phong>();
//		Connection con = Database.getInstance().getConnection();
//		PreparedStatement stmt = null;
//		try {
//			String sql = "Select * from Phong where maPhong = ?";
//			stmt = con.prepareStatement(sql);
//			stmt.setString(1, ma);
//			ResultSet rs = stmt.executeQuery();
//			while(rs.next()) {
//				String maPhong= rs.getString("maPhong");
//				String tenPhong= rs.getString("tenPhong");
//				LoaiPhong loaiPhong = new LoaiPhong(rs.getString("maLP"));
//				Boolean tinhTrang = rs.getBoolean("tinhTrang");
//				String ghiChu = rs.getString("ghiChu");
//				Phong p = new Phong(maPhong, tenPhong, loaiPhong, tinhTrang, ghiChu);
//				dsp.add(p);
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return dsp;
//	}

	public static boolean themPhong(Phong p) {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "insert into Phong values(?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, p.getMaPhong());
			pstm.setString(2, p.getTenPhong());
			pstm.setString(3, p.getLoaiPhong().getMaLP());
			pstm.setBoolean(4, false);
			pstm.setString(5, p.getGhiChu());
			pstm.executeUpdate();
			return true;
		} catch (SQLException e1) {
			System.out.println(e1);
			return false;
		}
	}
	
	public static void xoaPhong(String maPhong){		
		Database.getInstance().connect();
    	Connection con = Database.getConnection();
    	PreparedStatement s=null;
    	String sql="Delete From Phong where maPhong = ?";
        try {
           s=con.prepareStatement(sql);
            s.setString(1, maPhong);
            s.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
        	try {
				s.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
        }
	}
	
	public static boolean capNhatPhong(Phong p) throws Exception  {
		
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update Phong set maPhong = ?, tenPhong = ?, maLP = ?, ghiChu = ? where maPhong = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, p.getMaPhong());
			pstm.setString(2, p.getTenPhong());
			pstm.setString(3, p.getLoaiPhong().getMaLP());
			pstm.setString(4, p.getGhiChu());
			pstm.setString(5, p.getMaPhong());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public static ArrayList<Phong> timPhong(String ten) {
		ArrayList<Phong> list= new ArrayList<Phong>();
		
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			
			String sql = "select * from Phong p join LoaiPhong lp "
					+ "on p.maLP = lp.maLP "
					+ "where maPhong like N'%"+ten+"%' "
					+ "or tenPhong like N'%"+ten+"%' "
					+ "or p.maLP like N'%"+ten+"%' "
					+ "or tenLP like N'%"+ten+"%' "
					+ "or giaLP like N'%"+ten+"%' ";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maPhong= rs.getString("maPhong");
				String tenPhong= rs.getString("tenPhong");
				LoaiPhong loaiPhong= new LoaiPhong(rs.getString("maLP"));
				String ghiChu= rs.getString("ghiChu");
				Boolean tinhTrang= rs.getBoolean("tinhTrang");
				
				list.add(new Phong(maPhong, tenPhong, loaiPhong, tinhTrang, ghiChu));
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println(e);
		};
		
		return list;
		
	}
	
	public static ArrayList<Phong> timPhongTrong(String ten) {
		ArrayList<Phong> list= new ArrayList<Phong>();
		
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			
			String sql = "select * from Phong p join LoaiPhong lp "
					+ "on p.maLP = lp.maLP "
					+ "where (maPhong like N'%"+ten+"%' "
					+ "or tenPhong like N'%"+ten+"%' "
					+ "or p.maLP like N'%"+ten+"%' "
					+ "or tenLP like N'%"+ten+"%' "
					+ "or giaLP like N'%"+ten+"%') "
					+ "and tinhTrang = 0";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maPhong= rs.getString("maPhong");
				String tenPhong= rs.getString("tenPhong");
				LoaiPhong loaiPhong= new LoaiPhong(rs.getString("maLP"));
				String ghiChu= rs.getString("ghiChu");
				Boolean tinhTrang= rs.getBoolean("tinhTrang");
				
				list.add(new Phong(maPhong, tenPhong, loaiPhong, tinhTrang, ghiChu));
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println(e);
		};
		
		return list;
		
	}
	
	public static ArrayList<Phong> getALLPhongDat() {
		ArrayList<Phong> list= new ArrayList<Phong>();
		
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			
			String sql = "Select * from Phong where tinhTrang = 1";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maPhong= rs.getString("maPhong");
				String tenPhong= rs.getString("tenPhong");
				LoaiPhong loaiPhong= new LoaiPhong(rs.getString("maLP"));
				String ghiChu= rs.getString("ghiChu");
				Boolean tinhTrang= rs.getBoolean("tinhTrang");
				
				list.add(new Phong(maPhong, tenPhong, loaiPhong, tinhTrang, ghiChu));
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println(e);
		};
		
		return list;
		
	}
	
	public static ArrayList<Phong> getALLPhongTrong() {
		ArrayList<Phong> list= new ArrayList<Phong>();
		
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			
			String sql = "select * from Phong where tinhTrang = 0";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maPhong= rs.getString("maPhong");
				String tenPhong= rs.getString("tenPhong");
				LoaiPhong loaiPhong= new LoaiPhong(rs.getString("maLP"));
				String ghiChu= rs.getString("ghiChu");
				Boolean tinhTrang= rs.getBoolean("tinhTrang");
				
				list.add(new Phong(maPhong, tenPhong, loaiPhong, tinhTrang, ghiChu));
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println(e);
		};
		
		return list;
		
	}
	
	public static boolean capNhatTinhTrangPhongDat(Phong p) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update Phong set tinhTrang = ? where maPhong = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setBoolean(1,true);
			pstm.setString(2, p.getMaPhong());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật tình trạng phòng thất bại!");
			return false;
		}
	}
	
	public static boolean capNhatTinhTrangPhongTrong(Phong p) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update Phong set tinhTrang = ? where maPhong = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setBoolean(1,false);
			pstm.setString(2, p.getMaPhong());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật tình trạng nhân viên thất bại!");
			return false;
		}
	}
}