package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.Database;
import entity.NhanVien;
import entity.ChucVu;

import java.sql.Date;

public class DAO_NhanVien {
	public static ArrayList<NhanVien> getAllNhanVien() {
		ArrayList<NhanVien> dsnv= new ArrayList<NhanVien>();
		
		try {
			Database.getInstance().connect();
			Connection conn= Database.getConnection();
			String sql= "select * from NhanVien";
			
			PreparedStatement pstm= conn.prepareStatement(sql);
			
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				String maNV= rs.getString("maNV");
				String tenNV= rs.getString("tenNV");
				String gioiTinh = rs.getString("gioiTinh");
				String soDT = rs.getString("soDT");
				String soCMND = rs.getString("soCMND");
				Date ngaySinh = rs.getDate("ngaySinh");
				ChucVu chucVu = new ChucVu(rs.getString("maCV"));
				Date ngayVaoLam = rs.getDate("ngayVaoLam");
				String matKhau = rs.getString("matKhau");
				Boolean tinhTrang = rs.getBoolean("tinhTrang");
				
				dsnv.add(new NhanVien(maNV, tenNV, gioiTinh, soDT, soCMND, ngaySinh, chucVu, ngayVaoLam, matKhau, tinhTrang));
			}
			Database.getInstance().disconnect();;
		} catch (SQLException e) {
			System.out.println("Lấy danh sách nhân viên thất bại!");
		};
		
		return dsnv;
		
	}
	public static NhanVien getNVDangLogin() {
		NhanVien nv = new NhanVien();
		try {
			Database.getInstance().connect();
			Connection con = Database.getConnection();
			String sql = "Select * from NhanVien where tinhtrang = 1";
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				String maNV= rs.getString("maNV");
				String tenNV= rs.getString("tenNV");
				String gioiTinh = rs.getString("gioiTinh");
				String soDT = rs.getString("soDT");
				String soCMND = rs.getString("soCMND");
				Date ngaySinh = rs.getDate("ngaySinh");
				ChucVu chucVu = new ChucVu(rs.getString("maCV"));
				Date ngayVaoLam = rs.getDate("ngayVaoLam");
				String matKhau = rs.getString("matKhau");
				Boolean tinhTrang = rs.getBoolean("tinhTrang");
				
				nv = new NhanVien(maNV, tenNV, gioiTinh, soDT, soCMND, ngaySinh, chucVu, ngayVaoLam, matKhau, tinhTrang);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nv;
	}
	
	public static boolean themNV(NhanVien nv) {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "insert into NhanVien values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, nv.getMaNV());
			pstm.setString(2, nv.getTenNV());
			pstm.setString(3, nv.getGioiTinh());
			pstm.setDate(4, nv.getNgaySinh());
			pstm.setString(5, nv.getSoCMND());
			pstm.setString(6, nv.getChucVu().getMaCV());
			pstm.setString(7, nv.getSoDT());
			pstm.setDate(8, nv.getNgayVaoLam());
			pstm.setString(9, nv.getMatKhau());
			pstm.setBoolean(10,false);
			pstm.executeUpdate();
			return true;
		} catch (SQLException e1) {
			System.out.println("Thêm nhân viên thất bại!");
			return false;
		}

	}

	public static void xoaNV(String maNV){		
		Database.getInstance().connect();
    	Connection con = Database.getConnection();
    	PreparedStatement s=null;
    	String sql="delete from NhanVien where maNV = ?";
        try {
           s=con.prepareStatement(sql);
            s.setString(1, maNV);
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
	
	public static boolean capNhatNV(NhanVien nv) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update NhanVien set tenNV = ?, gioiTinh = ?, ngaySinh = ?, "
					+ " soCMND = ?, soDT = ?, maCV = ? where maNV = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1,nv.getTenNV());
			pstm.setString(2,nv.getGioiTinh());
			pstm.setDate(3,nv.getNgaySinh());
			pstm.setString(4,nv.getSoCMND());
			pstm.setString(5,nv.getSoDT());
			pstm.setString(6,nv.getChucVu().getMaCV());
			pstm.setString(7,nv.getMaNV());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật thông tin nhân viên thất bại!");
			return false;
		}
	}
	
	public static boolean capNhatPass(NhanVien nv, String mk) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update NhanVien set matKhau = ? where maNV = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1,mk);
			pstm.setString(2,nv.getMaNV());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật mật khẩu thất bại!");
			return false;
		}
	}
	
	public static boolean capNhatTinhTrangNVDN(NhanVien nv) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update NhanVien set tinhTrang = ? where maNV = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setBoolean(1,true);
			pstm.setString(2, nv.getMaNV());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật tình trạng nhân viên thất bại!");
			return false;
		}
	}
	
	public static boolean capNhatTinhTrangNVDX(NhanVien nv) throws Exception  {
		try {
			Database.getInstance().connect();
			Connection conn = Database.getConnection();
			String sql = "update NhanVien set tinhTrang = ? where maNV = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setBoolean(1,false);
			pstm.setString(2, nv.getMaNV());
			pstm.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println("Cập nhật tình trạng nhân viên thất bại!");
			return false;
		}
	}
	
	public static int count() {
		return getAllNhanVien().size();
	}
	
	public static NhanVien timKiemTheoMa(String ma) {
		NhanVien nv = new NhanVien();
		if(getAllNhanVien().contains(nv))
			return getAllNhanVien().get(getAllNhanVien().indexOf(nv));
	return null;
	}
	
	public static ArrayList<NhanVien> timNV(String ten){
		ArrayList<NhanVien> dsnv=new ArrayList<NhanVien>();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from NhanVien nv join ChucVu cv "
						+ "on nv.maCV = cv.maCV "
						+ "where maNV like N'%"+ten+"%' "
			            + "or tenNV like N'%"+ten+"%'"
			            + "or gioiTinh like N'%"+ten+"%' "
			            + "or soDT like N'%"+ten+"%' "
			            + "or soCMND like N'%"+ten+"%' "
			            + "or ngaySinh like N'%"+ten+"%' " 
						+ "or ngayVaoLam like N'%"+ten+"%' "
						+ "or nv.maCV like N'%"+ten+"%' "
						+ "or tenCV like N'%"+ten+"%' ";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					String maNV= rs.getString("maNV");
					String tenNV= rs.getString("tenNV");
					String gioiTinh = rs.getString("gioiTinh");
					String soDT = rs.getString("soDT");
					String soCMND = rs.getString("soCMND");
					Date ngaySinh = rs.getDate("ngaySinh");
					ChucVu chucVu = new ChucVu(rs.getString("maCV"));
					Date ngayVaoLam = rs.getDate("ngayVaoLam");
					String matKhau = rs.getString("matKhau");
					Boolean tinhTrang = rs.getBoolean("tinhTrang");
					NhanVien nv=new NhanVien(maNV,tenNV,gioiTinh,soDT,soCMND, ngaySinh,chucVu,ngayVaoLam,matKhau,tinhTrang);
					dsnv.add(nv);
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
		return dsnv;
	}
	
	public static NhanVien timNVTheoMa(String ma){
		NhanVien nv = new NhanVien();
		Database.getInstance().connect();
    	Connection con= Database.getConnection();
    	PreparedStatement s=null;
		try {	
				String sql = "Select * from NhanVien "
						+ "where maNV = '"+ma+"' ";   
				s =con.prepareStatement(sql);
				ResultSet rs=s.executeQuery();
				while(rs.next()) {
					String maNV= rs.getString("maNV");
					String tenNV= rs.getString("tenNV");
					String gioiTinh= rs.getString("gioiTinh");
					Date ngaySinh= rs.getDate("ngaySinh");
					String soCMND= rs.getString("soCMND");
					String soDT= rs.getString("soDT");
					String matKhau = rs.getString("matKhau");
					nv = new NhanVien(maNV, tenNV, gioiTinh, soDT, soCMND, ngaySinh, null, ngaySinh, matKhau, false);
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
		return nv;
	}
}