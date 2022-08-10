package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.DichVu;

public class DAO_DichVu {
	public static ArrayList<DichVu> getAllDichVu() {
		ArrayList<DichVu> dsdv = new ArrayList<DichVu>();
		
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			String sql= "select * from DichVu";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maDV= rs.getString("maDV");
				String tenDV= rs.getString("TenDV");
				Double giaDV= rs.getDouble("giaDV");
				
				dsdv.add(new DichVu(maDV, tenDV, giaDV));
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println(e);
		};
		return dsdv;
	}
	
	public static boolean themDV(DichVu dv) {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "insert into DichVu values(?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, dv.getMaDV());
			pstm.setString(2, dv.getTenDV());
			pstm.setDouble(3, dv.getGiaDV());
			pstm.executeUpdate();
			return true;
		} catch (SQLException e1) {
			System.out.println(e1);
			return false;
		}
	}
	
	public static void xoaDV(String maDV){		
		Database.getInstance().connect();
    	Connection con = Database.getConnection();
    	PreparedStatement s=null;
    	String sql="Delete From DichVu where maDV = ?";
        try {
           s=con.prepareStatement(sql);
            s.setString(1, maDV);
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
	
	public static boolean capNhatDV(DichVu dv) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update DichVu set tenDV = ?, giaDV = ? where maDV = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(3, dv.getMaDV());
			pstm.setString(1, dv.getTenDV());
			pstm.setDouble(2, dv.getGiaDV());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật thông tin dịch vụ thất bại!");
			return false;
		}
	}
	
	public static ArrayList<DichVu> timDV(String ten){
		ArrayList<DichVu> dsdv=new ArrayList<DichVu>();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from DichVu where maDV like N'%"+ten+"%' "
			            + "or tenDV like N'%"+ten+"%'"
			            + "or giaDV like N'%"+ten+"%'";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					String maDV= rs.getString("maDV");
					String tenDV= rs.getString("tenDV");
					Double giaDV= rs.getDouble("giaDV");
					DichVu dv=new DichVu(maDV, tenDV, giaDV);
					dsdv.add(dv);
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
		return dsdv;
	}
}
