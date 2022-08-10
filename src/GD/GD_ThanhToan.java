/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GD;

import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.DAO_DichVu;
import dao.DAO_HoaDon;
import dao.DAO_HoaDonDichVu;
import dao.DAO_HoaDonPhong;
import dao.DAO_KhachHang;
import dao.DAO_LoaiPhong;
import dao.DAO_NhanVien;
import dao.DAO_Phong;
import entity.DichVu;
import entity.HoaDon;
import entity.HoaDonDichVu;
import entity.HoaDonPhong;
import entity.KhachHang;
import entity.LoaiPhong;
import entity.NhanVien;
import entity.Phong;

/**
 *
 * @author ngphu
 */
public class GD_ThanhToan extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GD_ThanhToan() {
        initComponents();
    }
    
	public String ma_HD;
	public String ma_Phong;
	
    private DefaultTableModel modelDSHD, modelDSPhongDat;
    private String[] colsDSHD={"Mã HD", "Tên khách hàng", "Số điện thoại"};
    private String[] colsDSPhongDat={"Mã phòng", "Tên phòng", "Loại phòng", "Giá", "Giờ đặt phòng", "Ngày đặt phòng"};
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlOuter = new javax.swing.JPanel();
        btnQuayLai = new javax.swing.JButton();
        lblTieuDe = new javax.swing.JLabel();
        pnlTTHD = new javax.swing.JPanel();
        lblTTHD = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        lblMaPhong = new javax.swing.JLabel();
        lblTenPhong = new javax.swing.JLabel();
        lblLoaiPhong = new javax.swing.JLabel();
        lblNgayDat = new javax.swing.JLabel();
        lblNgayTra = new javax.swing.JLabel();
        lblGioDat = new javax.swing.JLabel();
        lblGioTra = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        lblKH = new javax.swing.JLabel();
        txtKH = new javax.swing.JTextField();
        thanhNgan = new javax.swing.JSeparator();
        lblNV = new javax.swing.JLabel();
        lblGia1h = new javax.swing.JLabel();
        lblSoGio = new javax.swing.JLabel();
        lblTienPhong = new javax.swing.JLabel();
        lblSoDV = new javax.swing.JLabel();
        lblTienDV = new javax.swing.JLabel();
        lblThue = new javax.swing.JLabel();
        btnXemDV = new javax.swing.JButton();
        txtTenPhong = new javax.swing.JTextField();
        txtGia1h = new javax.swing.JTextField();
        txtLoaiPhong = new javax.swing.JTextField();
        txtSoGio = new javax.swing.JTextField();
        txtNgayDat = new javax.swing.JTextField();
        txtTienGio = new javax.swing.JTextField();
        txtNgayTra = new javax.swing.JTextField();
        txtSoDV = new javax.swing.JTextField();
        txtTienDV = new javax.swing.JTextField();
        txtGioDat = new javax.swing.JTextField();
        txtThue = new javax.swing.JTextField();
        txtGioTra = new javax.swing.JTextField();
        lblTongThanhTien = new javax.swing.JLabel();
        txtTongThanhTien = new javax.swing.JTextField();
        lblTienTra = new javax.swing.JLabel();
        txtTienTra = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        lblTienThua = new javax.swing.JLabel();
        btnTinhTienThua = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        txtNV = new javax.swing.JTextField();
        btnTimHD = new javax.swing.JButton();
        pnlDSHD = new javax.swing.JPanel();
        scrollDSHD = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        lblDSHD = new javax.swing.JLabel();
        pnlDSPhongSuDung = new javax.swing.JPanel();
        scrollDSPhongSuDung = new javax.swing.JScrollPane();
        tblPhongSuDung = new javax.swing.JTable();
        lblDSPhongSuDung = new javax.swing.JLabel();
        txtTimHD = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THANH TOÁN");
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(204, 255, 255));

        pnlOuter.setBackground(new java.awt.Color(0, 204, 255));
        pnlOuter.setPreferredSize(new java.awt.Dimension(1180, 680));

        btnQuayLai.setBackground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnQuayLai.setText("QUAY LẠI");
        btnQuayLai.setBorderPainted(false);
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(0, 0, 102));
        lblTieuDe.setText("     THANH TOÁN     ");

        pnlTTHD.setBackground(new java.awt.Color(204, 255, 255));

        lblTTHD.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTTHD.setForeground(new java.awt.Color(0, 0, 102));
        lblTTHD.setText("HOÁ ĐƠN PHÒNG");

        lblMaHD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaHD.setText("Mã hoá đơn");

        txtMaHD.setEditable(false);
        txtMaHD.setBackground(new java.awt.Color(204, 204, 204));

        lblMaPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaPhong.setText("Mã phòng");

        lblTenPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTenPhong.setText("Tên phòng");

        lblLoaiPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblLoaiPhong.setText("Loại phòng");

        lblNgayDat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNgayDat.setText("Ngày đặt");

        lblNgayTra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNgayTra.setText("Ngày trả");

        lblGioDat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGioDat.setText("Giờ đặt");

        lblGioTra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGioTra.setText("Giờ trả");

        txtMaPhong.setEditable(false);
        txtMaPhong.setBackground(new java.awt.Color(204, 204, 204));

        lblKH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblKH.setText("Khách hàng");

        txtKH.setEditable(false);
        txtKH.setBackground(new java.awt.Color(204, 204, 204));

        thanhNgan.setBackground(new java.awt.Color(0, 0, 0));
        thanhNgan.setForeground(new java.awt.Color(0, 0, 0));

        lblNV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNV.setText("Nhân viên");

        lblGia1h.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGia1h.setText("Giá/1h");

        lblSoGio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSoGio.setText("Số giờ");

        lblTienPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTienPhong.setText("Tiền phòng");

        lblSoDV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSoDV.setText("Số dịch vụ");

        lblTienDV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTienDV.setText("Tiền dịch vụ");

        lblThue.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblThue.setText("Thuế VAT");

        btnXemDV.setBackground(new java.awt.Color(255, 204, 153));
        btnXemDV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXemDV.setForeground(new java.awt.Color(204, 153, 0));
        btnXemDV.setText("XEM DỊCH VỤ");
        btnXemDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemDVMouseClicked(evt);
            }
        });

        txtTenPhong.setEditable(false);
        txtTenPhong.setBackground(new java.awt.Color(204, 204, 204));

        txtGia1h.setEditable(false);
        txtGia1h.setBackground(new java.awt.Color(204, 204, 204));

        txtLoaiPhong.setEditable(false);
        txtLoaiPhong.setBackground(new java.awt.Color(204, 204, 204));
        txtLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiPhongActionPerformed(evt);
            }
        });

        txtSoGio.setEditable(false);
        txtSoGio.setBackground(new java.awt.Color(204, 204, 204));

        txtNgayDat.setEditable(false);
        txtNgayDat.setBackground(new java.awt.Color(204, 204, 204));
        txtNgayDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayDatActionPerformed(evt);
            }
        });

        txtTienGio.setEditable(false);
        txtTienGio.setBackground(new java.awt.Color(204, 204, 204));

        txtNgayTra.setEditable(false);
        txtNgayTra.setBackground(new java.awt.Color(204, 204, 204));
        txtNgayTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayTraActionPerformed(evt);
            }
        });

        txtSoDV.setEditable(false);
        txtSoDV.setBackground(new java.awt.Color(204, 204, 204));

        txtTienDV.setEditable(false);
        txtTienDV.setBackground(new java.awt.Color(204, 204, 204));

        txtGioDat.setEditable(false);
        txtGioDat.setBackground(new java.awt.Color(204, 204, 204));

        txtThue.setEditable(false);
        txtThue.setBackground(new java.awt.Color(204, 204, 204));

        txtGioTra.setEditable(false);
        txtGioTra.setBackground(new java.awt.Color(204, 204, 204));

        lblTongThanhTien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTongThanhTien.setText("TỔNG THÀNH TIỀN");

        txtTongThanhTien.setEditable(false);
        txtTongThanhTien.setBackground(new java.awt.Color(204, 204, 204));
        txtTongThanhTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblTienTra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTienTra.setText("Tiền trả");

        txtTienThua.setEditable(false);
        txtTienThua.setBackground(new java.awt.Color(204, 204, 204));
        txtTienThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienThuaActionPerformed(evt);
            }
        });

        lblTienThua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTienThua.setText("Tiền thừa");

        btnTinhTienThua.setBackground(new java.awt.Color(255, 255, 255));
        btnTinhTienThua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTinhTienThua.setText("TÍNH TIỀN THỪA");
        btnTinhTienThua.setBorderPainted(false);
        btnTinhTienThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTienThuaActionPerformed(evt);
            }
        });

        btnThanhToan.setBackground(new java.awt.Color(204, 255, 204));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(0, 204, 0));
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.setBorderPainted(false);
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnThanhToanActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        txtNV.setEditable(false);
        txtNV.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlTTHDLayout = new javax.swing.GroupLayout(pnlTTHD);
        pnlTTHD.setLayout(pnlTTHDLayout);
        pnlTTHDLayout.setHorizontalGroup(
            pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thanhNgan)
                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblMaHD)
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                                .addComponent(lblMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblNgayTra)
                                                    .addComponent(lblNgayDat)
                                                    .addComponent(lblGioDat)
                                                    .addComponent(lblGioTra)
                                                    .addComponent(lblNV))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtGioTra)
                                                    .addComponent(txtGioDat)
                                                    .addComponent(txtNV, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTTHDLayout.createSequentialGroup()
                                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblTenPhong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblLoaiPhong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(19, 19, 19)))
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblKH)
                                            .addComponent(lblSoGio)
                                            .addComponent(lblGia1h)
                                            .addComponent(lblTienPhong)
                                            .addComponent(lblSoDV)
                                            .addComponent(lblTienDV)
                                            .addComponent(lblThue))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTienDV, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSoDV, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTienGio, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSoGio, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtGia1h, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtKH)
                                            .addComponent(txtThue)))
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                                        .addComponent(btnXemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblTongThanhTien)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTienTra)
                                    .addComponent(lblTienThua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTienThua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTienTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTinhTienThua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTTHD)
                        .addGap(199, 199, 199))))
        );
        pnlTTHDLayout.setVerticalGroup(
            pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTTHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaHD))
                .addGap(22, 22, 22)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaPhong)
                    .addComponent(lblKH)
                    .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenPhong)
                    .addComponent(lblGia1h)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia1h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiPhong)
                    .addComponent(lblSoGio)
                    .addComponent(txtLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayDat)
                    .addComponent(lblTienPhong)
                    .addComponent(txtNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayTra)
                            .addComponent(lblSoDV)
                            .addComponent(txtSoDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioDat)
                    .addComponent(lblTienDV)
                    .addComponent(txtTienDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioTra)
                    .addComponent(lblThue)
                    .addComponent(txtThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNV)
                            .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(thanhNgan, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTienTra)
                    .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTienTra)
                        .addComponent(txtTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addComponent(btnTinhTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTienThua)))
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        btnTimHD.setBackground(new java.awt.Color(255, 255, 255));
        btnTimHD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTimHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_tim.png"))); // NOI18N
        btnTimHD.setText("TÌM");
        btnTimHD.setBorderPainted(false);
        btnTimHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimHDActionPerformed(evt);
            }
        });

        pnlDSHD.setBackground(new java.awt.Color(204, 255, 255));

        lblDSHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDSHD.setForeground(new java.awt.Color(0, 0, 102));
        lblDSHD.setText("DANH SÁCH HOÁ ĐƠN      ");
        
        // Model DSHD
        modelDSHD = new DefaultTableModel(colsDSHD,0);
        tblHD = new JTable(modelDSHD);
        scrollDSHD.setViewportView(tblHD);
        
        // Sự kiện click trên tblDSHD
        ListSelectionModel listSelectionModelDSHD = tblHD.getSelectionModel();
        // Thiết lập chỉ click được 1 dòng
        listSelectionModelDSHD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Xử lý sự kiện click
        listSelectionModelDSHD.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				try {
					setGiaTriMacDinh();
					DocDuLieuDatabaseVaoTxtDSHD();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});

        javax.swing.GroupLayout pnlDSHDLayout = new javax.swing.GroupLayout(pnlDSHD);
        pnlDSHD.setLayout(pnlDSHDLayout);
        pnlDSHDLayout.setHorizontalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDSHD, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSHDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDSHD)
                .addGap(151, 151, 151))
        );
        pnlDSHDLayout.setVerticalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDSHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDSHD, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        pnlDSPhongSuDung.setBackground(new java.awt.Color(204, 255, 255));

        lblDSPhongSuDung.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDSPhongSuDung.setForeground(new java.awt.Color(0, 0, 102));
        lblDSPhongSuDung.setText("DANH SÁCH PHÒNG ĐANG SỬ DỤNG     ");
        
        // Model DSPhongDat
        modelDSPhongDat = new DefaultTableModel(colsDSPhongDat,0);
        tblPhongSuDung = new JTable(modelDSPhongDat);
        scrollDSPhongSuDung.setViewportView(tblPhongSuDung);
        
        // Sự kiện click trên tblDSPhongSuDung
        ListSelectionModel listSelectionModelDSPhongDat = tblPhongSuDung.getSelectionModel();
        // Thiết lập chỉ click được 1 dòng
        listSelectionModelDSPhongDat.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Xử lý sự kiện click
        listSelectionModelDSPhongDat.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				try {
					DocDuLieuDatabaseVaoTxtDSPhongSuDung();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

        javax.swing.GroupLayout pnlDSPhongSuDungLayout = new javax.swing.GroupLayout(pnlDSPhongSuDung);
        pnlDSPhongSuDung.setLayout(pnlDSPhongSuDungLayout);
        pnlDSPhongSuDungLayout.setHorizontalGroup(
            pnlDSPhongSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDSPhongSuDung)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSPhongSuDungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDSPhongSuDung)
                .addGap(104, 104, 104))
        );
        pnlDSPhongSuDungLayout.setVerticalGroup(
            pnlDSPhongSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSPhongSuDungLayout.createSequentialGroup()
                .addComponent(lblDSPhongSuDung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDSPhongSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_refesh (1).png"))); // NOI18N
        btnLamMoi.setBorderPainted(false);
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
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
                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309)
                        .addComponent(lblTieuDe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOuterLayout.createSequentialGroup()
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimHD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimHD))
                            .addComponent(pnlDSHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDSPhongSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlTTHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlOuterLayout.setVerticalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTTHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnTimHD, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                .addComponent(txtTimHD))
                            .addComponent(btnLamMoi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDSPhongSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOuter, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOuter, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        
        DocDuLieuDatabaseVaoTableDSHD();
        
    }// </editor-fold>//GEN-END:initComponents
    
    public void setGiaTriMacDinh() {
    	txtMaHD.setText("");
    	txtMaPhong.setText("");
    	txtKH.setText("");
    	txtTenPhong.setText("");
    	txtGia1h.setText("");
    	txtLoaiPhong.setText("");
    	txtSoGio.setText("");
    	txtTienGio.setText("");
    	txtNgayDat.setText("");
    	txtNgayTra.setText("");
    	txtGioDat.setText("");
    	txtGioTra.setText("");
    	txtSoDV.setText("");
    	txtTienDV.setText("");
    	txtThue.setText("");
    	txtNV.setText("");
    	txtTongThanhTien.setText("");
    	txtTienTra.setText("");
    	txtTienThua.setText("");
    }
    
    public void DocDuLieuDatabaseVaoTxtDSHD() throws Exception {
    	String tenNV = null;
    	double tongThanhTien = 0;
    	double tienPhong = 0;
    	double tienDV = 0;
    	
		int i = tblHD.getSelectedRow();
		HoaDon hd = new HoaDon(String.valueOf(tblHD.getValueAt(i, 0)));
//		HoaDon hd = lstHD.get(i);
		
		// Cập nhật giờ trả phòng của hóa đơn được chọn
		capNhatGioTraPhong(hd.getMaHD());
		
		// Tính tổng tiền phòng của hóa đơn
		ArrayList<HoaDonPhong> lstHDP = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(hd.getMaHD());
		for (HoaDonPhong hdp : lstHDP) {
			tienPhong += hdp.tinhGio()*getGiaLP(hdp.getPhong().getLoaiPhong().getMaLP());
			ArrayList<HoaDonDichVu> lstHDDV = DAO_HoaDonDichVu.getAllHDDV(hd, hdp.getPhong());
			for (HoaDonDichVu hddv : lstHDDV) {
				tienDV += hddv.getSoLuong()*getGiaDV(hddv.getDichVu().getMaDV());
			}
		}
		
		tongThanhTien = (1+0.1)*(tienPhong+tienDV);
		
		// Tính tổng tiền dịch vụ của hóa đơn
		
		// Lấy tên của nhân viên đang đăng nhập trong hệ thống
		ArrayList<NhanVien> listNV = DAO_NhanVien.getAllNhanVien();
    	for (NhanVien nv : listNV) {
			if(nv.isTinhTrang()==true)
				tenNV = nv.getTenNV();
		}
		
		txtMaHD.setText(String.valueOf(tblHD.getValueAt(i, 0)));
		txtKH.setText(String.valueOf(tblHD.getValueAt(i, 1)));
		txtNV.setText(tenNV);
		
		txtTongThanhTien.setText(dinhDangTienTe(tongThanhTien));
		
		// Load tất cả hóa đơn phòng của hóa đơn được chọn
		DocDuLieuDatabaseVaoTableDSPhongDat(hd.getMaHD());
    }
    
    public void DocDuLieuDatabaseVaoTxtDSPhongSuDung() throws Exception {
    	double tongTienDV = 0;
    	int soDV = 0;
    	
    	int i = tblHD.getSelectedRow();
    	int j = tblPhongSuDung.getSelectedRow();
    	HoaDon hd = new HoaDon(String.valueOf(tblHD.getValueAt(i, 0)));
    	
		ArrayList<HoaDonPhong> lstDSHDP = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(hd.getMaHD());
		HoaDonPhong hdp = lstDSHDP.get(j);
		
		ArrayList<HoaDonDichVu> lstHDDV = DAO_HoaDonDichVu.getAllHDDV
				(hd, new Phong(String.valueOf(tblPhongSuDung.getValueAt(j, 0))));
		for (HoaDonDichVu hddv : lstHDDV) {
			tongTienDV += hddv.getSoLuong()*getGiaDV(hddv.getDichVu().getMaDV());
			soDV ++;
		}
		
		double tienPhong = hdp.tinhGio()*getGiaLP(hdp.getPhong().getLoaiPhong().getMaLP());
		double thue = (tienPhong+tongTienDV)*0.1;
		
		txtMaPhong.setText(hdp.getPhong().getMaPhong());
		txtTenPhong.setText(getTenPhong(hdp.getPhong().getMaPhong()));
		txtGia1h.setText(dinhDangTienTe(getGiaLP(hdp.getPhong().getLoaiPhong().getMaLP())));
		txtLoaiPhong.setText(getTenLP(hdp.getPhong().getLoaiPhong().getMaLP()));
		txtNgayDat.setText(new SimpleDateFormat("dd-MM-yyyy").format(new Date(hdp.getGioDatPhong().getTime())));
		txtNgayTra.setText(new SimpleDateFormat("dd-MM-yyyy").format(new Date(hdp.getGioTraPhong().getTime())));
		txtGioDat.setText(new Time(hdp.getGioDatPhong().getTime())+"");
		txtGioTra.setText(new Time(hdp.getGioTraPhong().getTime())+"");
		txtSoGio.setText(hdp.tinhGio()+"");
		txtTienGio.setText(dinhDangTienTe(tienPhong));
		
		txtSoDV.setText(soDV+"");
		txtTienDV.setText(dinhDangTienTe(tongTienDV));
		
		txtThue.setText(dinhDangTienTe(thue));
    }
    
    public void timHD(String ten) {
		ArrayList<HoaDon> list = DAO_HoaDon.timHDChuaThanhToan(ten);
		modelDSHD.setRowCount(0);
		for (HoaDon hd : list) {
			modelDSHD.addRow(new Object[] {
					hd.getMaHD(),
					getTenKH(hd.getKhachHang().getMaKH()),
					getSoDTKH(hd.getKhachHang().getMaKH())});}
    }
    
    public void thanhToan() throws HeadlessException, Exception {
    	String maHD, maNV = null;
    	double tongThanhTien = 0;
    	double tienPhong = 0;
    	double tienDV = 0;
    	double thueVAT = 0;
    	Timestamp ngayLapHD = new Timestamp(System.currentTimeMillis());
    	
    	ArrayList<NhanVien> listNV = DAO_NhanVien.getAllNhanVien();
    	for (NhanVien nv : listNV) {
			if(nv.isTinhTrang()==true)
				maNV = nv.getMaNV();
		}
    	
    	int i = tblHD.getSelectedRow();
    	HoaDon hd = new HoaDon(String.valueOf(tblHD.getValueAt(i, 0)));

		
    	ArrayList<HoaDonPhong> lstHDP = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(hd.getMaHD());
		for (HoaDonPhong hdp : lstHDP) {
			tienPhong += hdp.tinhGio()*getGiaLP(hdp.getPhong().getLoaiPhong().getMaLP());
			ArrayList<HoaDonDichVu> lstHDDV = DAO_HoaDonDichVu.getAllHDDV(hd, hdp.getPhong());
			for (HoaDonDichVu hddv : lstHDDV) {
				tienDV += hddv.getSoLuong()*getGiaDV(hddv.getDichVu().getMaDV());
			}
		}
		
		thueVAT = (tienPhong+tienDV)*0.1;
		tongThanhTien = (1+0.1)*(tienPhong+tienDV);
		
		maHD = hd.getMaHD();
		
		HoaDon hdNew = new HoaDon(maHD, new NhanVien(maNV), null, ngayLapHD, tongThanhTien, thueVAT, true);
    	
    	int result = JOptionPane.showConfirmDialog(rootPane,
                "Bạn có chắc muốn thanh toán hóa đơn này!",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
        	if(!DAO_HoaDon.capNhatHD(hdNew))
        		JOptionPane.showMessageDialog(rootPane, "Thanh toán thất bại!");
        	capNhatPhongTrong(hd.getMaHD());
        	JOptionPane.showMessageDialog(rootPane, "Thanh toán thành công!");
        } else if (result == JOptionPane.NO_OPTION) {
        	JOptionPane.showMessageDialog(rootPane, "Đã hủy thao tác thanh toán!");
        }
    }
    
    public boolean tinhTienThua() {
    	double tongThanhTien = 0;
    	double tienPhong = 0;
    	double tienDV = 0;
    	
    	if(txtTienTra.getText().equalsIgnoreCase("")) {
    		JOptionPane.showMessageDialog(rootPane, "Chưa nhập tiền khách trả!");
    		return false;
    	}
    	
    	double tienTra = Double.parseDouble(txtTienTra.getText());
    	
    	// Load hóa đơn chưa thanh toán
		int i = tblHD.getSelectedRow();
		HoaDon hd = new HoaDon(String.valueOf(tblHD.getValueAt(i, 0)));
		
		// Tính tổng thành tiền của hóa đơn
		ArrayList<HoaDonPhong> lstHDP = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(hd.getMaHD());
		for (HoaDonPhong hdp : lstHDP) {
			tienPhong += hdp.tinhGio()*getGiaLP(hdp.getPhong().getLoaiPhong().getMaLP());
			ArrayList<HoaDonDichVu> lstHDDV = DAO_HoaDonDichVu.getAllHDDV(hd, hdp.getPhong());
			for (HoaDonDichVu hddv : lstHDDV) {
				tienDV += hddv.getSoLuong()*getGiaDV(hddv.getDichVu().getMaDV());
			}
		}
		
		tongThanhTien = (1+0.1)*(tienPhong+tienDV);
		
		txtTienThua.setText(dinhDangTienTe(tienTra-tongThanhTien));
		return true;
    }
    
    public void DocDuLieuDatabaseVaoTableDSHD() {
		ArrayList<HoaDon> list = DAO_HoaDon.getAllHoaDonChuaThanhToan();
		modelDSHD.setRowCount(0);
		modelDSPhongDat.setRowCount(0);
		for (HoaDon hd : list) {
			modelDSHD.addRow(new Object[] {
					hd.getMaHD(),
					getTenKH(hd.getKhachHang().getMaKH()),
					getSoDTKH(hd.getKhachHang().getMaKH())});}
    }
    
    public void DocDuLieuDatabaseVaoTableDSPhongDat(String ma) throws Exception {
		ArrayList<HoaDonPhong> list = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(ma);
		modelDSPhongDat.setRowCount(0);
		for (HoaDonPhong hdp : list) {
			modelDSPhongDat.addRow(new Object[] {
					hdp.getPhong().getMaPhong(),
					getTenPhong(hdp.getPhong().getMaPhong()),
					getTenLP(hdp.getPhong().getLoaiPhong().getMaLP()),
					dinhDangTienTe(getGiaLP(hdp.getPhong().getLoaiPhong().getMaLP())),
					new Time(hdp.getGioDatPhong().getTime()),
					new SimpleDateFormat("dd-MM-yyyy").format(new Date(hdp.getGioDatPhong().getTime()))});}
    }
    
    public String getTenKH(String maKH) {
    	ArrayList<KhachHang> listKH = DAO_KhachHang.getAllKhachHang();
    	for (KhachHang kh : listKH) {
    		if(kh.getMaKH().equalsIgnoreCase(maKH))
    			return kh.getTenKH();
    	}
    	return "";
    }
    
    public void capNhatGioTraPhong(String ma) throws Exception {
    	ArrayList<HoaDonPhong> list = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(ma);
    	for (HoaDonPhong hdp : list) {
    		DAO_HoaDonPhong.capNhatHDP(hdp);
		}
    }
    
    public void capNhatPhongTrong(String ma) throws Exception {
    	ArrayList<HoaDonPhong> list = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(ma);
    	for (HoaDonPhong hdp : list) {
    		DAO_Phong.capNhatTinhTrangPhongTrong(new Phong(hdp.getPhong().getMaPhong()));
		}
    }
    
    public String getSoDTKH(String maKH) {
    	ArrayList<KhachHang> listKH = DAO_KhachHang.getAllKhachHang();
    	for (KhachHang kh : listKH) {
    		if(kh.getMaKH().equalsIgnoreCase(maKH))
    			return kh.getSoDT();
    	}
    	return "";
    }
    
    public String getTenPhong(String maPhong) {
    	ArrayList<Phong> listPhong = DAO_Phong.getAllPhong();
    	for (Phong p : listPhong) {
    		if(p.getMaPhong().equalsIgnoreCase(maPhong))
    			return p.getTenPhong();
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
    
    public double getGiaLP(String maLP) {
    	ArrayList<LoaiPhong> listLP = DAO_LoaiPhong.getAllLoaiPhong();
    	for (LoaiPhong lp : listLP) {
    		if(lp.getMaLP().equalsIgnoreCase(maLP)) {
//    			BigDecimal giaLP = new BigDecimal(lp.getGiaLP()).setScale(0, BigDecimal.ROUND_HALF_UP);
    			return lp.getGiaLP();
    		}
    	}
    	return 0;
    }
    
    public double getGiaDV(String maDV) {
    	ArrayList<DichVu> listDV = DAO_DichVu.getAllDichVu();
    	for (DichVu dv : listDV) {
    		if(dv.getMaDV().equalsIgnoreCase(maDV)) {
//    			BigDecimal giaLP = new BigDecimal(lp.getGiaLP()).setScale(0, BigDecimal.ROUND_HALF_UP);
    			return dv.getGiaDV();
    		}
    	}
    	return 0;
    }
    
    public void taiLai() {
    	tblHD.clearSelection();
    	tblPhongSuDung.clearSelection();
    	setGiaTriMacDinh();
    	DocDuLieuDatabaseVaoTableDSHD();
    	txtTimHD.setText("");
    }
    
    public String dinhDangTienTe(double tien) {
    	Locale localeVN = new Locale("vi", "VN");
	    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    	return currencyVN.format(tien);
    }

    private void txtLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiPhongActionPerformed

    private void txtNgayDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayDatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayDatActionPerformed

    private void txtNgayTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayTraActionPerformed

    private void txtTienThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienThuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienThuaActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        GD_Chinh ui = new GD_Chinh();
        this.setVisible(false);
        ui.setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnXemDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemDVMouseClicked
        // TODO add your handling code here:
    	ma_HD = txtMaHD.getText();
    	ma_Phong = txtMaPhong.getText();
        GD_HoaDonDV ui_HDDV = new GD_HoaDonDV();
        
        ui_HDDV.DocDuLieuDatabaseVaoTableDSHDDV(ma_HD, ma_Phong);
        ui_HDDV.setVisible(true);
    }//GEN-LAST:event_btnXemDVMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    	taiLai();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimHDActionPerformed
        // TODO add your handling code here:
    	String ten = txtTimHD.getText().replaceAll("\\s\\s+", " ").trim();
    	timHD(ten);
    }//GEN-LAST:event_btnTimHDActionPerformed

    private void btnTinhTienThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTienThuaActionPerformed
        // TODO add your handling code here:
    	tinhTienThua();
    }//GEN-LAST:event_btnTinhTienThuaActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, Exception {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
    	thanhToan();
    	DocDuLieuDatabaseVaoTableDSHD();
    	setGiaTriMacDinh();
    }//GEN-LAST:event_btnThanhToanActionPerformed

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
            java.util.logging.Logger.getLogger(GD_ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_ThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnTimHD;
    private javax.swing.JButton btnTinhTienThua;
    private javax.swing.JButton btnXemDV;
    private javax.swing.JLabel lblDSHD;
    private javax.swing.JLabel lblDSPhongSuDung;
    private javax.swing.JLabel lblGia1h;
    private javax.swing.JLabel lblGioDat;
    private javax.swing.JLabel lblGioTra;
    private javax.swing.JLabel lblKH;
    private javax.swing.JLabel lblLoaiPhong;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JLabel lblNV;
    private javax.swing.JLabel lblNgayDat;
    private javax.swing.JLabel lblNgayTra;
    private javax.swing.JLabel lblSoDV;
    private javax.swing.JLabel lblSoGio;
    private javax.swing.JLabel lblTTHD;
    private javax.swing.JLabel lblTenPhong;
    private javax.swing.JLabel lblThue;
    private javax.swing.JLabel lblTienDV;
    private javax.swing.JLabel lblTienPhong;
    private javax.swing.JLabel lblTienThua;
    private javax.swing.JLabel lblTienTra;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTongThanhTien;
    private javax.swing.JPanel pnlDSHD;
    private javax.swing.JPanel pnlDSPhongSuDung;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlOuter;
    private javax.swing.JPanel pnlTTHD;
    private javax.swing.JScrollPane scrollDSHD;
    private javax.swing.JScrollPane scrollDSPhongSuDung;
    private javax.swing.JTable tblHD;
    private javax.swing.JTable tblPhongSuDung;
    private javax.swing.JSeparator thanhNgan;
    private javax.swing.JTextField txtGia1h;
    private javax.swing.JTextField txtGioDat;
    private javax.swing.JTextField txtGioTra;
    private javax.swing.JTextField txtKH;
    private javax.swing.JTextField txtLoaiPhong;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtNV;
    private javax.swing.JTextField txtNgayDat;
    private javax.swing.JTextField txtNgayTra;
    private javax.swing.JTextField txtSoDV;
    private javax.swing.JTextField txtSoGio;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtThue;
    private javax.swing.JTextField txtTienDV;
    private javax.swing.JTextField txtTienGio;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTienTra;
    private javax.swing.JTextField txtTimHD;
    private javax.swing.JTextField txtTongThanhTien;
    // End of variables declaration//GEN-END:variables
}
