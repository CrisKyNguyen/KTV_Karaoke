/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GD;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.DAO_ChucVu;
import dao.DAO_HoaDon;
import dao.DAO_HoaDonPhong;
import dao.DAO_KhachHang;
import dao.DAO_LoaiPhong;
import dao.DAO_NhanVien;
import dao.DAO_Phong;
import entity.ChucVu;
import entity.HoaDon;
import entity.HoaDonPhong;
import entity.KhachHang;
import entity.LoaiPhong;
import entity.NhanVien;
import entity.Phong;

/**
 *
 * @author ngphu
 */
public class GD_Chinh extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GD_Chinh() {
        initComponents();
    }
	
	ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(".//images//ktv_logo.PNG"));
	
    private DefaultTableModel modelDSKH, modelDSPhongTrong, modelDSPhongDat;
    private String[] colsDSKH={"Mã KH", "Tên khách hàng", "Số điện thoại"};
    private String[] colsDSPhongTrong={"Mã phòng", "Tên phòng", "Loại phòng", "Giá"};
    private String[] colsDSPhongDat={"Mã phòng", "Tên phòng", "Loại phòng", "Giá", "Giờ đặt phòng", "Ngày đặt phòng"};
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlOuter = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        lblThongTinKH = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblCMND = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        cbxGioiTinh = new javax.swing.JComboBox<>();
        txtNgaySinh = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblMaKH = new javax.swing.JLabel();
        pnlDSKH = new javax.swing.JPanel();
        scrollKH = new javax.swing.JScrollPane();
        tblDSKH = new javax.swing.JTable();
        lblDSKH = new javax.swing.JLabel();
        pnlDSPhong = new javax.swing.JPanel();
        scrollPhongTrong = new javax.swing.JScrollPane();
        tblPhongTrong = new javax.swing.JTable();
        lblDSPhongTrong = new javax.swing.JLabel();
        btnDatPhong = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimPhong = new javax.swing.JButton();
        pnlPhongDat = new javax.swing.JPanel();
        scrollPhongDat = new javax.swing.JScrollPane();
        tblDSPhongDat = new javax.swing.JTable();
        lblPhongDat = new javax.swing.JLabel();
        txtTimPhong = new javax.swing.JTextField();
        lblTenNVLogin = new javax.swing.JLabel();
        txtTimKH = new javax.swing.JTextField();
        btnTimKH = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menuKH = new javax.swing.JMenu();
        menuPhong = new javax.swing.JMenu();
        menuDV = new javax.swing.JMenu();
        menuNV = new javax.swing.JMenu();
        menuThongKe = new javax.swing.JMenu();
        menuThanhToan = new javax.swing.JMenu();
        menuDangXuat = new javax.swing.JMenu();
        menuThanhToan = new javax.swing.JMenu();
        menuHoaDon = new javax.swing.JMenu();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setIconImage(icon.getImage());
        setTitle(" ĐẶT PHÒNG");
        
        pnlMain.setBackground(new java.awt.Color(204, 255, 255));

        pnlOuter.setBackground(new java.awt.Color(0, 204, 255));

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(0, 0, 102));
        lblTieuDe.setText("ĐẶT PHÒNG");

        pnlKhachHang.setBackground(new java.awt.Color(204, 255, 255));
        pnlKhachHang.setForeground(new java.awt.Color(0, 0, 102));

        lblThongTinKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblThongTinKH.setForeground(new java.awt.Color(0, 0, 102));
        lblThongTinKH.setText("THÔNG TIN KHÁCH HÀNG");

        lblTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTen.setForeground(new java.awt.Color(0, 0, 102));
        lblTen.setText("Tên KH");

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGioiTinh.setForeground(new java.awt.Color(0, 0, 102));
        lblGioiTinh.setText("Giới tính");

        lblNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNgaySinh.setForeground(new java.awt.Color(0, 0, 102));
        lblNgaySinh.setText("Ngày sinh");

        lblCMND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCMND.setForeground(new java.awt.Color(0, 0, 102));
        lblCMND.setText("Số CMND");

        lblSDT.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblSDT.setForeground(new java.awt.Color(0, 0, 102));
        lblSDT.setText("Số ĐT");

        cbxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        txtCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDActionPerformed(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_lamMoi.png"))); // NOI18N
        btnLamMoi.setText("LÀM MỚI");
        btnLamMoi.setBorderPainted(false);
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_add.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.setBorderPainted(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnThemActionPerformed(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ktv_logo.PNG"))); // NOI18N

        txtMaKH.setEditable(false);
        txtMaKH.setBackground(new java.awt.Color(204, 204, 204));
        txtMaKH.setForeground(new java.awt.Color(0, 0, 102));

        lblMaKH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaKH.setForeground(new java.awt.Color(0, 0, 102));
        lblMaKH.setText("Mã KH");

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKhachHangLayout.createSequentialGroup()
                        .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lblThongTinKH))
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTen)
                                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCMND)
                                    .addComponent(lblSDT)
                                    .addComponent(lblNgaySinh))
                                .addGap(28, 28, 28)
                                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSDT)
                                    .addComponent(txtCMND)
                                    .addComponent(txtNgaySinh)
                                    .addComponent(cbxGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlKhachHangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                                .addComponent(lblMaKH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongTinKH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaKH))
                .addGap(27, 27, 27)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCMND)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addContainerGap())
        );

        pnlDSKH.setBackground(new java.awt.Color(204, 255, 255));

        lblDSKH.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblDSKH.setForeground(new java.awt.Color(0, 0, 102));
        lblDSKH.setText("DANH SÁCH KHÁCH HÀNG");
        
        // Model DSKH
        modelDSKH = new DefaultTableModel(colsDSKH,0);
        tblDSKH = new JTable(modelDSKH);
        scrollKH.setViewportView(tblDSKH);
        
        tblDSKH.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblDSKH.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblDSKH.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblDSKH.getColumnModel().getColumn(2).setPreferredWidth(100);
        
        // Sự kiện click trên tblDSKH
        ListSelectionModel listSelectionModelDSKH = tblDSKH.getSelectionModel();
        // Thiết lập chỉ click được 1 dòng
        listSelectionModelDSKH.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Xử lý sự kiện click
        listSelectionModelDSKH.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
//				DocDuLieuDatabaseVaoTxtDSKH(); 
			}
		});
        
        javax.swing.GroupLayout pnlDSKHLayout = new javax.swing.GroupLayout(pnlDSKH);
        pnlDSKH.setLayout(pnlDSKHLayout);
        pnlDSKHLayout.setHorizontalGroup(
            pnlDSKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollKH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSKHLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(lblDSKH)
                .addGap(51, 51, 51))
        );
        pnlDSKHLayout.setVerticalGroup(
            pnlDSKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDSKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollKH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pnlDSPhong.setBackground(new java.awt.Color(204, 255, 255));

        lblDSPhongTrong.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblDSPhongTrong.setForeground(new java.awt.Color(0, 0, 102));
        lblDSPhongTrong.setText("DANH SÁCH PHÒNG CÒN TRỐNG");
        
        // Model DSPhongTrong
        modelDSPhongTrong = new DefaultTableModel(colsDSPhongTrong,0);
        tblPhongTrong = new JTable(modelDSPhongTrong);
        scrollPhongTrong.setViewportView(tblPhongTrong);
        
        tblPhongTrong.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblPhongTrong.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblPhongTrong.getColumnModel().getColumn(1).setPreferredWidth(152);
        tblPhongTrong.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblPhongTrong.getColumnModel().getColumn(3).setPreferredWidth(150);
        
        // Sự kiện click trên tblDSKH
        ListSelectionModel listSelectionModelDSPhongTrong = tblPhongTrong.getSelectionModel();
        // Thiết lập chỉ click được 1 dòng
        listSelectionModelDSPhongTrong.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        // Xử lý sự kiện click
        listSelectionModelDSPhongTrong.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
//				DocDuLieuDatabaseVaoTxtDSKH(); 
			}
		});

        javax.swing.GroupLayout pnlDSPhongLayout = new javax.swing.GroupLayout(pnlDSPhong);
        pnlDSPhong.setLayout(pnlDSPhongLayout);
        pnlDSPhongLayout.setHorizontalGroup(
            pnlDSPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPhongTrong, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSPhongLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDSPhongTrong)
                .addGap(142, 142, 142))
        );
        pnlDSPhongLayout.setVerticalGroup(
            pnlDSPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDSPhongTrong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPhongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnDatPhong.setBackground(new java.awt.Color(255, 255, 255));
        btnDatPhong.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_dat.png"))); // NOI18N
        btnDatPhong.setText("ĐẶT PHÒNG");
        btnDatPhong.setBorderPainted(false);
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnDatPhongActionPerformed(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_refesh .png"))); // NOI18N
        btnCapNhat.setText("CẬP NHẬT");
        btnCapNhat.setBorderPainted(false);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnTimPhong.setBackground(new java.awt.Color(255, 255, 255));
        btnTimPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTimPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_tim.png"))); // NOI18N
        btnTimPhong.setText("TÌM");
        btnTimPhong.setBorderPainted(false);
        btnTimPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimPhongActionPerformed(evt);
            }
        });

        pnlPhongDat.setBackground(new java.awt.Color(204, 255, 255));

        lblPhongDat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPhongDat.setForeground(new java.awt.Color(0, 0, 102));
        lblPhongDat.setText("DANH SÁCH PHÒNG ĐÃ ĐẶT");
        
        // Model DSPhongDat
        modelDSPhongDat = new DefaultTableModel(colsDSPhongDat,0);
        tblDSPhongDat = new JTable(modelDSPhongDat);
        scrollPhongDat.setViewportView(tblDSPhongDat);
        
        tblDSPhongDat.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblDSPhongDat.getColumnModel().getColumn(0).setPreferredWidth(94);
        tblDSPhongDat.getColumnModel().getColumn(1).setPreferredWidth(160);
        tblDSPhongDat.getColumnModel().getColumn(2).setPreferredWidth(160);
        tblDSPhongDat.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblDSPhongDat.getColumnModel().getColumn(4).setPreferredWidth(150);
        tblDSPhongDat.getColumnModel().getColumn(5).setPreferredWidth(150);

        javax.swing.GroupLayout pnlPhongDatLayout = new javax.swing.GroupLayout(pnlPhongDat);
        pnlPhongDat.setLayout(pnlPhongDatLayout);
        pnlPhongDatLayout.setHorizontalGroup(
            pnlPhongDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPhongDat)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhongDatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPhongDat)
                .addGap(282, 282, 282))
        );
        pnlPhongDatLayout.setVerticalGroup(
            pnlPhongDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPhongDatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPhongDat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPhongDat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        txtTimPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimPhongActionPerformed(evt);
            }
        });

        lblTenNVLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTenNVLogin.setText("NHÂN VIÊN ĐANG ĐĂNG NHẬP");
        lblTenNVLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTenNVLoginMouseClicked(evt);
            }
        });

        btnTimKH.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTimKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_tim.png"))); // NOI18N
        btnTimKH.setText("TÌM");
        btnTimKH.setBorderPainted(false);
        btnTimKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOuterLayout = new javax.swing.GroupLayout(pnlOuter);
        pnlOuter.setLayout(pnlOuterLayout);
        pnlOuterLayout.setHorizontalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTieuDe)
                        .addGap(196, 196, 196)
                        .addComponent(lblTenNVLogin))
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addComponent(pnlKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(btnCapNhat)
                                .addGap(107, 107, 107)
                                .addComponent(btnDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlPhongDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlOuterLayout.createSequentialGroup()
                                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pnlDSKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOuterLayout.createSequentialGroup()
                                                .addComponent(txtTimKH)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimKH)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pnlDSPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                                .addComponent(txtTimPhong)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimPhong)))))))))
                .addContainerGap())
        );
        pnlOuterLayout.setVerticalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTieuDe)
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTenNVLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOuterLayout.createSequentialGroup()
                                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTimPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(txtTimPhong))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTimKH)
                                    .addComponent(btnTimKH, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                .addGap(9, 9, 9)))
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlDSKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDSPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCapNhat)
                            .addComponent(btnDatPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPhongDat, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOuter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOuter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.setPreferredSize(new java.awt.Dimension(66, 40));

        menuKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuKH.setForeground(new java.awt.Color(0, 0, 102));
        menuKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_KH.png"))); // NOI18N
        menuKH.setText("KHÁCH HÀNG");
        menuKH.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuKH.setPreferredSize(new java.awt.Dimension(165, 40));
        menuKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuKHMouseClicked(evt);
            }
        });
        menuKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKHActionPerformed(evt);
            }
        });
        menu.add(menuKH);

        menuPhong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuPhong.setForeground(new java.awt.Color(0, 0, 102));
        menuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_Phong.png"))); // NOI18N
        menuPhong.setText("  PHÒNG HÁT     ");
        menuPhong.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuPhong.setPreferredSize(new java.awt.Dimension(160, 40));
        menuPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPhongMouseClicked(evt);
            }
        });
        menu.add(menuPhong);
        menuPhong.getAccessibleContext().setAccessibleDescription("");

        menuDV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuDV.setForeground(new java.awt.Color(0, 0, 102));
        menuDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_DV (5).png"))); // NOI18N
        menuDV.setText("  DỊCH VỤ      ");
        menuDV.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuDV.setPreferredSize(new java.awt.Dimension(145, 40));
        menuDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDVMouseClicked(evt);
            }
        });
        menu.add(menuDV);

        menuNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuNV.setForeground(new java.awt.Color(0, 0, 102));
        menuNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_NV.png"))); // NOI18N
        menuNV.setText("  NHÂN VIÊN       ");
        menuNV.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuNV.setPreferredSize(new java.awt.Dimension(160, 40));
        menuNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuNVMouseClicked(evt);
            }
        });
        menu.add(menuNV);

        menuThongKe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuThongKe.setForeground(new java.awt.Color(0, 0, 102));
        menuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_TK.png"))); // NOI18N
        menuThongKe.setText("THỐNG KÊ   ");
        menuThongKe.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuThongKe.setPreferredSize(new java.awt.Dimension(160, 40));
        menuThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuThongKeMouseClicked(evt);
            }
        });
        menu.add(menuThongKe);

        menuThanhToan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuThanhToan.setForeground(new java.awt.Color(0, 0, 102));
        menuThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_ThanhToan.png"))); // NOI18N
        menuThanhToan.setText("THANH TOÁN");
        menuThanhToan.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuThanhToan.setPreferredSize(new java.awt.Dimension(163, 40));
        menuThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuThanhToanMouseClicked(evt);
            }
        });
        menu.add(menuThanhToan);
        

        menuHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuHoaDon.setForeground(new java.awt.Color(0, 0, 102));
        menuHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_HD.png"))); // NOI18N
        menuHoaDon.setText("  HOÁ ĐƠN");
        menuHoaDon.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuHoaDon.setPreferredSize(new java.awt.Dimension(150, 40));
        menuHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHoaDonMouseClicked(evt);
            }
        });
        menu.add(menuHoaDon);
        

        menuDangXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuDangXuat.setForeground(new java.awt.Color(0, 0, 102));
        menuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_logOut (1).png"))); // NOI18N
        menuDangXuat.setText("ĐĂNG XUẤT");
        menuDangXuat.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuDangXuat.setPreferredSize(new java.awt.Dimension(160, 40));
        menuDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					menuDangXuatMouseClicked(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        menu.add(menuDangXuat);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        
        if (!quanLy()) {
        	menuNV.setEnabled(false);
			menuThongKe.setEnabled(false);
        }
        
        hienThiNVDN();
        setGiaTriMacDinh();
        DocDuLieuDatabaseVaoTableDSPhongTrong();
        DocDuLieuDatabaseVaoTableDSPhongDat();
        
    }// </editor-fold>//GEN-END:initComponents
    
    public void hienThiNVDN() {
    	NhanVien nv = DAO_NhanVien.getNVDangLogin();
		if(nv.isTinhTrang()==true)
			lblTenNVLogin.setText(getTenCV(nv.getChucVu().getMaCV())+" - " + nv.getTenNV());
    }
    
    public boolean quanLy() {
    	NhanVien nv = DAO_NhanVien.getNVDangLogin();
    	if(nv.isTinhTrang()==true) {
    		if((nv.getChucVu().getMaCV()).equalsIgnoreCase("CV001")==true) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public void setGiaTriMacDinh() {
    	txtMaKH.setText(maKhachHangMoi());
    	txtTen.setText("");
    	txtNgaySinh.setText("");
    	cbxGioiTinh.setSelectedIndex(0);
    	txtCMND.setText("");
    	txtSDT.setText("");
    }
    
    public void DocDuLieuDatabaseVaoTxtDSKH() {
		ArrayList<KhachHang> lstKH = DAO_KhachHang.getAllKhachHang();
		int i = tblDSKH.getSelectedRow();
		KhachHang kh = lstKH.get(i);
		txtMaKH.setText(kh.getMaKH());
		txtTen.setText(kh.getTenKH());
		cbxGioiTinh.setSelectedItem(kh.getGioiTinh());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		txtNgaySinh.setText(sdf.format(kh.getNgaySinh()));
		txtCMND.setText(kh.getSoCMND());
		txtSDT.setText(kh.getSoDT());
    }
    
    public void DocDuLieuDatabaseVaoTableDSKH() {
		ArrayList<KhachHang> list = DAO_KhachHang.getAllKhachHang();
		modelDSKH.setRowCount(0);
		for (KhachHang kh : list) {
			modelDSKH.addRow(new Object[] {
					kh.getMaKH(),
					kh.getTenKH(),kh.getSoDT()});}
    }
    
    public void DocDuLieuDatabaseVaoTableDSPhongTrong() {
		ArrayList<Phong> list = DAO_Phong.getALLPhongTrong();
		modelDSPhongTrong.setRowCount(0);
		for (Phong p : list) {
			modelDSPhongTrong.addRow(new Object[] {
					p.getMaPhong(),p.getTenPhong(),
					getTenLP(p.getLoaiPhong().getMaLP()),
					getGiaLP(p.getLoaiPhong().getMaLP())});}
    }
    
    public void DocDuLieuDatabaseVaoTableDSPhongDat() {
		ArrayList<HoaDonPhong> list = DAO_HoaDonPhong.getAllHoaDonPhongDat();
		modelDSPhongDat.setRowCount(0);
		for (HoaDonPhong hdp : list) {
			modelDSPhongDat.addRow(new Object[] {
					hdp.getPhong().getMaPhong(),
					getTenPhong(hdp.getPhong().getMaPhong()),
					getTenLP(hdp.getPhong().getLoaiPhong().getMaLP()),
					getGiaLP(hdp.getPhong().getLoaiPhong().getMaLP()),
					new Time(hdp.getGioDatPhong().getTime()),
					new SimpleDateFormat("dd-MM-yyyy").format(new Date(hdp.getGioDatPhong().getTime()))});}
    }
    
    public boolean kiemTraDuLieu() {
		String tenKH=txtTen.getText().trim();
		String ngaySinh=txtNgaySinh.getText().trim();
		String soCMND = txtCMND.getText().trim();
		String soDT = txtSDT.getText().trim();
		if (tenKH.trim().length() > 0) {
			if (!(tenKH.matches("[^.\\-\\/\\_\\+\\@\\!\\$\\^\\&\\*\\(\\)\\d]+"))) {
				JOptionPane.showMessageDialog(this, "Tên khách hàng không chứa số và ký tự đặc biệt");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(this, "Tên khách hàng không được để trống");
			return false;
		}
		
		if (ngaySinh.trim().length() > 0) {
			if (!(ngaySinh.matches("\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{2}|\\d{4})\\b"))) {
				JOptionPane.showMessageDialog(this, "Ngày sinh có định dạng dd-MM-yyyy \nVD: 01-01-2000");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống");
			return false;
		}
		
		if (soCMND.trim().length() > 0) {
			if (!(soCMND.matches("[0-9]{9}")) && !(soCMND.matches("[0-9]{12}"))) {
				JOptionPane.showMessageDialog(this, "CMND phải gồm 9 hoặc 12 số");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(this, "CMND không được để trống");
			return false;
		}
		if (soDT.trim().length() > 0) {
			if (!(soDT.matches("[0-9]{10}"))) {
				JOptionPane.showMessageDialog(this, "Số điện thoại phải gồm 10 số");
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
			return false;
		}
		return true;
    }
    
    public String getTenPhong(String maPhong) {
    	ArrayList<Phong> listPhong = DAO_Phong.getAllPhong();
    	for (Phong p : listPhong) {
    		if(p.getMaPhong().equalsIgnoreCase(maPhong))
    			return p.getTenPhong();
    	}
    	return "";
    }
    
    public String getTenCV(String maCV) {
    	ArrayList<ChucVu> listCV = DAO_ChucVu.getAllChucVu();
    	for (ChucVu cv : listCV) {
    		if(cv.getMaCV().equalsIgnoreCase(maCV))
    			return cv.getTenCV();
    	}
    	return "";
    }
    
    public String getTenLP(String maLP) {
    	ArrayList<LoaiPhong> listLP = DAO_LoaiPhong.getAllLoaiPhong();
    	for (LoaiPhong lp : listLP) {
    		if(lp.getMaLP().equalsIgnoreCase(maLP))
    			return lp.getTenLP();
    	}
    	return "";
    }
    
    public String getGiaLP(String maLP) {
    	ArrayList<LoaiPhong> listLP = DAO_LoaiPhong.getAllLoaiPhong();
    	for (LoaiPhong lp : listLP) {
    		if(lp.getMaLP().equalsIgnoreCase(maLP)) {
    			Locale localeVN = new Locale("vi", "VN");
    		    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    		    String giaLP = currencyVN.format(lp.getGiaLP());
//    			BigDecimal giaLP = new BigDecimal(lp.getGiaLP()).setScale(0, BigDecimal.ROUND_HALF_UP);
    			return giaLP;
    		}
    	}
    	return "";
    }
    
    public String maKhachHangMoi() {
    	ArrayList<KhachHang> listKH = DAO_KhachHang.getAllKhachHang();
    	String ma = listKH.get(listKH.size()-1).getMaKH().substring(2);
    	
    	int i = Integer.parseInt(ma) + 1;
    	
    	if(i<10)
    		ma = "00" + i;
    	else if(i>=10 && i<=99)
    		ma = "0" + i;
    	else if(i>=100)
    		ma = i+"";
    	return "KH"+ma;
    }
    
    public boolean themKH() throws ParseException {
    	String maKH, tenKH, gioiTinh, soCMND, soDT, ns;
    	Date ngaySinh;
    	
    	if(kiemTraDuLieu()) {
    		maKH = txtMaKH.getText();
        	tenKH = txtTen.getText();
        	ns = txtNgaySinh.getText();
        	ngaySinh = Date.valueOf(ns.substring(6)+"-"+ns.substring(3,5)+"-"+ns.substring(0,2));
        	gioiTinh = cbxGioiTinh.getSelectedItem()+"";
        	soDT = txtSDT.getText();
        	soCMND = txtCMND.getText();
        	
        	KhachHang kh = new KhachHang(maKH, tenKH, ngaySinh, gioiTinh, soDT, soCMND);
        	if(!DAO_KhachHang.themKH(kh))
        		return false;
        	JOptionPane.showMessageDialog(rootPane, "Thêm khách hàng thành công!");
    	}
    	return true;
    }
    
    public void timKH(String ten) {
		ArrayList<KhachHang> list = DAO_KhachHang.timKH(ten);
		if(list.size()==0) {
			JOptionPane.showMessageDialog(rootPane, "Không tìm thấy khách hàng này!", "Lỗi!", JOptionPane.WARNING_MESSAGE);
			return;
		}
		modelDSKH.setRowCount(0);
		for (KhachHang kh : list) {
			modelDSKH.addRow(new Object[] {
					kh.getMaKH(),
					kh.getTenKH(),
					kh.getSoDT()});}
    }
    
    public void timPhongTrong(String ten) {
		ArrayList<Phong> list = DAO_Phong.timPhongTrong(ten);
		if(list.size()==0) {
			JOptionPane.showMessageDialog(rootPane, "Không tìm thấy phòng này!", "Lỗi!", JOptionPane.WARNING_MESSAGE);
			return;
		}
		modelDSPhongTrong.setRowCount(0);
		for (Phong p : list) {
			modelDSPhongTrong.addRow(new Object[] {
					p.getMaPhong(),p.getTenPhong(),
					getTenLP(p.getLoaiPhong().getMaLP()),
					getGiaLP(p.getLoaiPhong().getMaLP())});}
    }
    
    public String maHoaDonMoi() {
    	ArrayList<HoaDon> listHD = DAO_HoaDon.getAllHoaDon();
    	String ma = listHD.get(listHD.size()-1).getMaHD().substring(2);
    	
    	int i = Integer.parseInt(ma) + 1;
    	
    	if(i<10)
    		ma = "00" + i;
    	else if(i>=10 && i<=99)
    		ma = "0" + i;
    	else if(i>=100)
    		ma = i+"";
    	return "HD"+ma;
    }
    
    public boolean themHD() throws Exception {
    	String maHD, maKH;
    	int[] rows = tblDSKH.getSelectedRows();
    	Timestamp ngayLapHD = new Timestamp(System.currentTimeMillis());
    	
    	maHD = maHoaDonMoi();
    	maKH = String.valueOf(tblDSKH.getValueAt(rows[0], 0));
    			
    	HoaDon hd = new HoaDon(maHD, null, new KhachHang(maKH), ngayLapHD, 0, 0, false);
    	if(!DAO_HoaDon.themHD(hd))
    		return false;
    	themHDP(maHD);
    	JOptionPane.showMessageDialog(rootPane, "Đặt phòng thành công!");
    	return true;
    }
    
    public boolean themHDP(String maHD) throws Exception {
    	String maPhong;
    	int[] rows = tblPhongTrong.getSelectedRows();
    	
    	for (int i : rows) {
    		maPhong = String.valueOf(tblPhongTrong.getValueAt(i, 0));
        	Timestamp gioDatPhong = new Timestamp(System.currentTimeMillis());
        			
        	HoaDonPhong hdp = new HoaDonPhong(new HoaDon(maHD), new Phong(maPhong), gioDatPhong, null);
        	if(!DAO_HoaDonPhong.themHDP(hdp))
        		return false;
        	DAO_Phong.capNhatTinhTrangPhongDat(hdp.getPhong());
		}
//    	JOptionPane.showMessageDialog(rootPane, "Thêm hóa đơn phòng thành công!");
    	return true;
    }
    
    private void txtCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDActionPerformed

    private void menuThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuThanhToanMouseClicked
        // TODO add your handling code here:
        GD_ThanhToan ui_TT = new GD_ThanhToan();
        this.setVisible(false);
        ui_TT.setVisible(true);

    }//GEN-LAST:event_menuThanhToanMouseClicked

    private void menuHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuThanhToanMouseClicked
        // TODO add your handling code here:
    	GD_HoaDon ui_HD = new GD_HoaDon();
        this.setVisible(false);
        ui_HD.setVisible(true);
    }//GEN-LAST:event_menuThanhToanMouseClicked

    
    private void menuThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuThongKeMouseClicked
        // TODO add your handling code here:
    	if(quanLy()) {
    		GD_ThongKe ui_TK = new GD_ThongKe();
            this.setVisible(false);
            ui_TK.setVisible(true);
    	}
    }//GEN-LAST:event_menuThongKeMouseClicked

    private void menuNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuNVMouseClicked
        // TODO add your handling code here:
    	if(quanLy()) {
    		GD_NhanVien ui_NV = new GD_NhanVien();
            this.setVisible(false);
            ui_NV.setVisible(true);
    	}
    }//GEN-LAST:event_menuNVMouseClicked

    private void menuDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDVMouseClicked
        // TODO add your handling code here:
        GD_DichVu ui_DV = new GD_DichVu();
        this.setVisible(false);
        ui_DV.setVisible(true);
    }//GEN-LAST:event_menuDVMouseClicked

    private void menuPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPhongMouseClicked
        // TODO add your handling code here:
        GD_PhongHat ui_PH = new GD_PhongHat();
        this.setVisible(false);
        ui_PH.setVisible(true);
    }//GEN-LAST:event_menuPhongMouseClicked

    private void menuKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKHActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menuKHActionPerformed

    private void menuKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuKHMouseClicked
        // TODO add your handling code here:
        GD_KhachHang ui_KH = new GD_KhachHang();
        this.setVisible(false);
        ui_KH.setVisible(true);
    }//GEN-LAST:event_menuKHMouseClicked

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtTimPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimPhongActionPerformed

    private void menuDangXuatMouseClicked(java.awt.event.MouseEvent evt) throws Exception {//GEN-FIRST:event_menuDangXuatMouseClicked
        // TODO add your handling code here:
    	
    	int result = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc muốn đăng xuất ra khỏi hệ thống?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
        	GD_DangNhap uiLogout = new GD_DangNhap();
            
            NhanVien nv = DAO_NhanVien.getNVDangLogin();
    		if(nv.isTinhTrang()==true)
    			DAO_NhanVien.capNhatTinhTrangNVDX(nv);
            
            this.setVisible(false);
            uiLogout.setVisible(true);
        	return;
        } else if (result == JOptionPane.NO_OPTION) {
        	JOptionPane.showMessageDialog(rootPane, "Đã hủy thao tác Đăng xuất!");
        	return;
        }
    }//GEN-LAST:event_menuDangXuatMouseClicked
    
    private void lblTenNVLoginMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    	GD_ThongTinNhanVien uiTTNV = new GD_ThongTinNhanVien();
    	this.setVisible(false);
    	uiTTNV.setVisible(true);
    }//GEN-LAST:event_txtTimPhongActionPerformed

    private void btnTimPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimPhongActionPerformed
        // TODO add your handling code here:
    	String ten = txtTimPhong.getText().replaceAll("\\s\\s+", " ").trim();
    	timPhongTrong(ten);
    	setGiaTriMacDinh();
    }//GEN-LAST:event_btnTimPhongActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    	themKH();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
    	tblDSKH.clearSelection();
    	DocDuLieuDatabaseVaoTableDSPhongDat();
    	DocDuLieuDatabaseVaoTableDSPhongTrong();
    	setGiaTriMacDinh();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnDatPhongActionPerformed
        // TODO add your handling code here:
    	themHD();
    }//GEN-LAST:event_btnDatPhongActionPerformed

    private void btnTimKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKHActionPerformed
        // TODO add your handling code here:
    	String ten = txtTimKH.getText().replaceAll("\\s\\s+", " ").trim();
    	timKH(ten);
    	setGiaTriMacDinh();
    }//GEN-LAST:event_btnTimKHActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GD_Chinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_Chinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_Chinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_Chinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_Chinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKH;
    private javax.swing.JButton btnTimPhong;
    private javax.swing.JComboBox<String> cbxGioiTinh;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblDSKH;
    private javax.swing.JLabel lblDSPhongTrong;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblPhongDat;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTenNVLogin;
    private javax.swing.JLabel lblThongTinKH;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuDV;
    private javax.swing.JMenu menuDangXuat;
    private javax.swing.JMenu menuThanhToan;
    private javax.swing.JMenu menuHoaDon;
    private javax.swing.JMenu menuKH;
    private javax.swing.JMenu menuNV;
    private javax.swing.JMenu menuPhong;
    private javax.swing.JMenu menuThongKe;
    private javax.swing.JPanel pnlDSKH;
    private javax.swing.JPanel pnlDSPhong;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlOuter;
    private javax.swing.JPanel pnlPhongDat;
    private javax.swing.JScrollPane scrollKH;
    private javax.swing.JScrollPane scrollPhongDat;
    private javax.swing.JScrollPane scrollPhongTrong;
    private javax.swing.JTable tblDSKH;
    private javax.swing.JTable tblDSPhongDat;
    private javax.swing.JTable tblPhongTrong;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKH;
    private javax.swing.JTextField txtTimPhong;
    // End of variables declaration//GEN-END:variables
}
