/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GD;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.sql.Time;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

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
public class GD_HoaDon extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GD_HoaDon() {
        initComponents();
    }
	
	public String ma_HD;
	public String ma_Phong;
	
    private DefaultTableModel modelDSHD, modelDSPhongDat;
    private String[] colsDSHD={"Mã HD", "Tên khách hàng", "Số điện thoại", "Ngày lập", "Thuế VAT", "Tổng tiền"};
    private String[] colsDSPhongDat={"Mã phòng", "Tên phòng", "Loại phòng", "Giá", "Giờ đặt phòng", "Ngày đặt phòng"};
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        lblTienDV = new javax.swing.JLabel();
        lblSoDV = new javax.swing.JLabel();
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
        txtGioTra = new javax.swing.JTextField();
        lblTongThanhTien = new javax.swing.JLabel();
        txtTongThanhTien = new javax.swing.JTextField();
        txtNV = new javax.swing.JTextField();
        lblThanhTien = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        lblThue = new javax.swing.JLabel();
        txtThue = new javax.swing.JTextField();
        btnTimHD = new javax.swing.JButton();
        pnlDSHD = new javax.swing.JPanel();
        scrollDSHD = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        lblDSHD = new javax.swing.JLabel();
        pnlDSPhongSuDung = new javax.swing.JPanel();
        scrollDSPhongSuDung = new javax.swing.JScrollPane();
        tblPhongSuDung = new javax.swing.JTable();
        lblDSPhongSuDung = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        cboNgay = new javax.swing.JComboBox<>();
        cboThang = new javax.swing.JComboBox<>();
        cboNam = new javax.swing.JComboBox<>();
        lblNgay = new javax.swing.JLabel();
        lblThang = new javax.swing.JLabel();
        lblNam = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOÁ ĐƠN - THANH TOÁN");
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
        lblTieuDe.setText("HOÁ ĐƠN");

        pnlTTHD.setBackground(new java.awt.Color(204, 255, 255));
        pnlTTHD.setForeground(new java.awt.Color(0, 0, 102));

        lblTTHD.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTTHD.setForeground(new java.awt.Color(0, 0, 102));
        lblTTHD.setText("THÔNG TIN HOÁ ĐƠN");

        lblMaHD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaHD.setForeground(new java.awt.Color(0, 0, 102));
        lblMaHD.setText("Mã hoá đơn");

        txtMaHD.setEditable(false);
        txtMaHD.setBackground(new java.awt.Color(204, 204, 204));

        lblMaPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaPhong.setForeground(new java.awt.Color(0, 0, 102));
        lblMaPhong.setText("Mã phòng");

        lblTenPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTenPhong.setForeground(new java.awt.Color(0, 0, 102));
        lblTenPhong.setText("Tên phòng");

        lblLoaiPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblLoaiPhong.setForeground(new java.awt.Color(0, 0, 102));
        lblLoaiPhong.setText("Loại phòng");

        lblNgayDat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNgayDat.setForeground(new java.awt.Color(0, 0, 102));
        lblNgayDat.setText("Ngày đặt");

        lblNgayTra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNgayTra.setForeground(new java.awt.Color(0, 0, 102));
        lblNgayTra.setText("Ngày trả");

        lblGioDat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGioDat.setForeground(new java.awt.Color(0, 0, 102));
        lblGioDat.setText("Giờ đặt");

        lblGioTra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGioTra.setForeground(new java.awt.Color(0, 0, 102));
        lblGioTra.setText("Giờ trả");

        txtMaPhong.setEditable(false);
        txtMaPhong.setBackground(new java.awt.Color(204, 204, 204));

        lblKH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblKH.setForeground(new java.awt.Color(0, 0, 102));
        lblKH.setText("Khách hàng");

        txtKH.setEditable(false);
        txtKH.setBackground(new java.awt.Color(204, 204, 204));

        thanhNgan.setBackground(new java.awt.Color(0, 0, 0));
        thanhNgan.setForeground(new java.awt.Color(0, 0, 0));

        lblNV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNV.setForeground(new java.awt.Color(0, 0, 102));
        lblNV.setText("Nhân viên");

        lblGia1h.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGia1h.setForeground(new java.awt.Color(0, 0, 102));
        lblGia1h.setText("Giá/1h");

        lblSoGio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSoGio.setForeground(new java.awt.Color(0, 0, 102));
        lblSoGio.setText("Số giờ");

        lblTienPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTienPhong.setForeground(new java.awt.Color(0, 0, 102));
        lblTienPhong.setText("Tiền phòng");

        lblTienDV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTienDV.setForeground(new java.awt.Color(0, 0, 102));
        lblTienDV.setText("Tiền dịch vụ");

        lblSoDV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSoDV.setForeground(new java.awt.Color(0, 0, 102));
        lblSoDV.setText("Số dịch vụ");

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
        txtSoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoGioActionPerformed(evt);
            }
        });

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

        txtGioTra.setEditable(false);
        txtGioTra.setBackground(new java.awt.Color(204, 204, 204));

        lblTongThanhTien.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTongThanhTien.setForeground(new java.awt.Color(0, 0, 102));
        lblTongThanhTien.setText("TỔNG THÀNH TIỀN");

        txtTongThanhTien.setEditable(false);
        txtTongThanhTien.setBackground(new java.awt.Color(204, 204, 204));
        txtTongThanhTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTongThanhTien.setForeground(new java.awt.Color(255, 0, 0));

        txtNV.setEditable(false);
        txtNV.setBackground(new java.awt.Color(204, 204, 204));

        lblThanhTien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblThanhTien.setForeground(new java.awt.Color(0, 0, 102));
        lblThanhTien.setText("THÀNH TIỀN");

        txtThanhTien.setEditable(false);
        txtThanhTien.setBackground(new java.awt.Color(204, 204, 204));

        lblThue.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblThue.setForeground(new java.awt.Color(0, 0, 102));
        lblThue.setText("THUẾ VAT (10%)");

        txtThue.setEditable(false);
        txtThue.setBackground(new java.awt.Color(204, 204, 204));
        txtThue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtThue.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout pnlTTHDLayout = new javax.swing.GroupLayout(pnlTTHD);
        pnlTTHD.setLayout(pnlTTHDLayout);
        pnlTTHDLayout.setHorizontalGroup(
            pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTHDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thanhNgan)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                .addComponent(lblThanhTien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlTTHDLayout.createSequentialGroup()
                                            .addComponent(lblMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25))
                                        .addComponent(lblNgayDat, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNgayTra)
                                            .addComponent(lblGioDat)
                                            .addComponent(lblGioTra)
                                            .addComponent(lblLoaiPhong)
                                            .addComponent(lblTenPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGioDat)
                                    .addComponent(txtNgayDat)
                                    .addComponent(txtLoaiPhong)
                                    .addComponent(txtTenPhong)
                                    .addComponent(txtMaPhong)
                                    .addComponent(txtNgayTra)
                                    .addComponent(txtGioTra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblGia1h, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSoGio, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTienDV, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNV, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtGia1h, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSoGio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtTienDV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addComponent(lblKH)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addComponent(lblTienPhong)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTienGio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addComponent(lblSoDV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSoDV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(lblTongThanhTien)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                                        .addComponent(lblThue)
                                        .addGap(34, 34, 34)))
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTongThanhTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtThue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addComponent(lblMaHD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHD))
                    .addComponent(lblTTHD))
                .addGap(138, 138, 138))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaPhong)
                        .addComponent(lblKH))
                    .addComponent(txtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGia1h)
                            .addComponent(lblTenPhong))
                        .addGap(14, 14, 14)
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoGio)
                            .addComponent(lblLoaiPhong))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayDat)
                            .addComponent(lblTienPhong))
                        .addGap(11, 11, 11)
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoDV)
                            .addComponent(txtSoDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayTra))
                        .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNV)
                                    .addComponent(txtGioTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGioTra)))
                            .addGroup(pnlTTHDLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTienDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtGioDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTienDV)
                                        .addComponent(lblGioDat))))))
                    .addGroup(pnlTTHDLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtGia1h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSoGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTienGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblThanhTien)))
                .addGap(18, 18, 18)
                .addComponent(thanhNgan, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtThue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThue))
                .addGap(18, 18, 18)
                .addGroup(pnlTTHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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
        lblDSHD.setText("DANH SÁCH HOÁ ĐƠN");

        javax.swing.GroupLayout pnlDSHDLayout = new javax.swing.GroupLayout(pnlDSHD);
        pnlDSHD.setLayout(pnlDSHDLayout);
        pnlDSHDLayout.setHorizontalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDSHD)
            .addGroup(pnlDSHDLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblDSHD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDSHDLayout.setVerticalGroup(
            pnlDSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSHDLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblDSHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollDSHD, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        pnlDSPhongSuDung.setBackground(new java.awt.Color(204, 255, 255));

        lblDSPhongSuDung.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDSPhongSuDung.setForeground(new java.awt.Color(0, 0, 102));
        lblDSPhongSuDung.setText("DANH SÁCH PHÒNG ĐÃ SỬ DỤNG");
        
        javax.swing.GroupLayout pnlDSPhongSuDungLayout = new javax.swing.GroupLayout(pnlDSPhongSuDung);
        pnlDSPhongSuDung.setLayout(pnlDSPhongSuDungLayout);
        pnlDSPhongSuDungLayout.setHorizontalGroup(
            pnlDSPhongSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDSPhongSuDung)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSPhongSuDungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDSPhongSuDung)
                .addGap(180, 180, 180))
        );
        pnlDSPhongSuDungLayout.setVerticalGroup(
            pnlDSPhongSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSPhongSuDungLayout.createSequentialGroup()
                .addGap(6, 6, 6)
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

//      cboNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

//      cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNgay.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNgay.setForeground(new java.awt.Color(0, 0, 102));
        lblNgay.setText("NGÀY");

        lblThang.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblThang.setForeground(new java.awt.Color(0, 0, 102));
        lblThang.setText("THÁNG");

        lblNam.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblNam.setForeground(new java.awt.Color(0, 0, 102));
        lblNam.setText("NĂM");

        javax.swing.GroupLayout pnlOuterLayout = new javax.swing.GroupLayout(pnlOuter);
        pnlOuter.setLayout(pnlOuterLayout);
        pnlOuterLayout.setHorizontalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(419, 419, 419)
                        .addComponent(lblTieuDe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOuterLayout.createSequentialGroup()
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNgay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblThang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNam, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimHD))
                            .addComponent(pnlDSPhongSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDSHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlOuterLayout.setVerticalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnLamMoi))
                            .addComponent(txtTimKiem)
                            .addComponent(cboThang)
                            .addComponent(lblThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboNam)
                            .addComponent(lblNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboNgay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDSHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDSPhongSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlTTHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOuter, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
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
        
        cboThang.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				loadCBXNgay(cboThang.getSelectedItem()+"");
			}
		});

        cboNam.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				loadCBXThang(cboNam.getSelectedItem()+"");
			}
		});
        
        DocDuLieuDatabaseVaoTableDSHD();
        loadCBXNam();
        
    }// </editor-fold>    
    
    public void setGiaTriMacDinh() {
    	modelDSPhongDat.setRowCount(0);
    	
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
    	txtThanhTien.setText("");
    	txtTongThanhTien.setText("");
    }
    
    public boolean quanLy() {
    	ArrayList<NhanVien> listNV = DAO_NhanVien.getAllNhanVien();
    	for (NhanVien nv : listNV) {
    		if(nv.isTinhTrang()==true)
    			if((nv.getChucVu().getMaCV()).equalsIgnoreCase("CV001")==true) {
    				return true;
    			}
			}
    	return false;
    }
    
    public void DocDuLieuDatabaseVaoTxtDSHD() throws Exception {
    	
		int i = tblHD.getSelectedRow();
		HoaDon hd = DAO_HoaDon.timHDTheoMa(String.valueOf(tblHD.getValueAt(i, 0)));
		
		txtMaHD.setText(hd.getMaHD());
		txtKH.setText(getTenKH(hd.getKhachHang().getMaKH()));
		txtNV.setText(getTenNV(hd.getNhanVien().getMaNV()));
		
		txtThue.setText(dinhDangTienTe(hd.getThueVAT()));
		txtTongThanhTien.setText(dinhDangTienTe(hd.getTongThanhTien()));
		
		// Load tất cả hóa đơn phòng của hóa đơn được chọn
		modelDSPhongDat.setRowCount(0);
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
		txtThanhTien.setText(dinhDangTienTe(tienPhong+tongTienDV));
    }
    
    public void timHD(String ten) {
    	ArrayList<HoaDon> list = null;
		if(quanLy()) {
			list = DAO_HoaDon.timHDDaThanhToan(ten);
		}
		else {
			list = DAO_HoaDon.timHDDaThanhToanCuaNV(ten);
		}
		modelDSHD.setRowCount(0);
		for (HoaDon hd : list) {
			modelDSHD.addRow(new Object[] {
					hd.getMaHD(),
					getTenKH(hd.getKhachHang().getMaKH()),
					getSoDTKH(hd.getKhachHang().getMaKH()),
					new SimpleDateFormat("dd-MM-yyyy").format(new Date(hd.getNgayLapHD().getTime())),
					dinhDangTienTe(hd.getThueVAT()),
					dinhDangTienTe(hd.getTongThanhTien())});}
    }
    
    public void DocDuLieuDatabaseVaoTableDSHD() {
    	ArrayList<HoaDon> list = null;
    	LocalDate ngayHT = LocalDate.now();
		if(quanLy())
			list = DAO_HoaDon.getAllHoaDonDaThanhToan();
		else
			list = DAO_HoaDon.timHDDaThanhToanCuaNVTheoNgayHienTai(ngayHT+"");
		for (HoaDon hd : list) {
			modelDSHD.addRow(new Object[] {
					hd.getMaHD(),
					getTenKH(hd.getKhachHang().getMaKH()),
					getSoDTKH(hd.getKhachHang().getMaKH()),
					new SimpleDateFormat("dd-MM-yyyy").format(new Date(hd.getNgayLapHD().getTime())),
					dinhDangTienTe(hd.getThueVAT()),
					dinhDangTienTe(hd.getTongThanhTien())});}
    }
    
    public void DocDuLieuDatabaseVaoTableDSPhongDat(String ma) throws Exception {
		ArrayList<HoaDonPhong> list = DAO_HoaDonPhong.getAllHoaDonPhongTheoMaHD(ma);
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
    
    public String getTenNV(String maNV) {
    	ArrayList<NhanVien> listNV = DAO_NhanVien.getAllNhanVien();
    	for (NhanVien nv : listNV) {
    		if(nv.getMaNV().equalsIgnoreCase(maNV))
    			return nv.getTenNV();
    	}
    	return "";
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
    	modelDSHD.setRowCount(0);
    	DocDuLieuDatabaseVaoTableDSHD();
    	setGiaTriMacDinh();
    	txtTimKiem.setText("");
    }
    
    public String dinhDangTienTe(double tien) {
    	Locale localeVN = new Locale("vi", "VN");
	    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    	return currencyVN.format(tien);
    }
    
    public void loadCBXNam() {
    	String namOld = null;
    	String namNew = null;
    	cboNam.addItem("    ");
    	ArrayList<HoaDon> lstHD = null;
    	if(quanLy()) {
    		lstHD = DAO_HoaDon.getAllHoaDonDaThanhToan();
    	}
    	else {
    		lstHD = DAO_HoaDon.getAllHoaDonDaThanhToanTheoNV();
    	}
    	for (HoaDon hd : lstHD) {
    		namNew = (new Date(hd.getNgayLapHD().getTime())+"").substring(0,4);
    		if(!namNew.equalsIgnoreCase(namOld)) {
    			cboNam.addItem(namNew+"");
    		}
    		namOld = namNew;
		}
    }
    
    public void loadCBXThang(String namOld) {
    	String thangOld = null;
    	String thangNew = null;
    	String namNew = null;
    	cboThang.removeAllItems();
    	cboThang.addItem("    ");
    	ArrayList<HoaDon> lstHD = null;
    	if(quanLy()) {
    		lstHD = DAO_HoaDon.getAllHoaDonDaThanhToan();
    	}
    	else {
    		lstHD = DAO_HoaDon.getAllHoaDonDaThanhToanTheoNV();
    	}
    	for (HoaDon hd : lstHD) {
    		namNew = (new Date(hd.getNgayLapHD().getTime())+"").substring(0,4);
    		if(namNew.equalsIgnoreCase(namOld)) {
    			thangNew = (new Date(hd.getNgayLapHD().getTime())+"").substring(5,7);
    			if(!thangNew.equalsIgnoreCase(thangOld)) {
    				cboThang.addItem(thangNew);
    			}
    			thangOld = thangNew;
    		}
		}
    }
    
    public void loadCBXNgay(String thangOld) {
    	String ngayOld = null;
    	String ngayNew = null;
    	String thangNew = null;
    	cboNgay.removeAllItems();
    	cboNgay.addItem("    ");
    	ArrayList<HoaDon> lstHD = null;
    	if(quanLy()) {
    		lstHD = DAO_HoaDon.getAllHoaDonDaThanhToan();
    	}
    	else {
    		lstHD = DAO_HoaDon.getAllHoaDonDaThanhToanTheoNV();
    	}
    	for (HoaDon hd : lstHD) {
    		thangNew = (new Date(hd.getNgayLapHD().getTime())+"").substring(5,7);
    		if(thangNew.equalsIgnoreCase(thangOld)) {
    			ngayNew = (new Date(hd.getNgayLapHD().getTime())+"").substring(8);
    			if(!ngayNew.equalsIgnoreCase(ngayOld)) {
    				cboNgay.addItem(ngayNew);
    			}
    			ngayOld = ngayNew;
    		}
		}
    }
    
    public void timHDTheoNam(String nam) {
    	int yyyy;
    	ArrayList<HoaDon> list = null;
    	if(!nam.equalsIgnoreCase("    ")) {
    		yyyy = Integer.parseInt(nam);
    		if(quanLy())
    			list = DAO_HoaDon.getAllHoaDonDaThanhToan();
    		else
    			list = DAO_HoaDon.timHDDaThanhToanCuaNVTheoNam(yyyy);
    		modelDSHD.setRowCount(0);
    		for (HoaDon hd : list) {
    			modelDSHD.addRow(new Object[] {
    					hd.getMaHD(),
    					getTenKH(hd.getKhachHang().getMaKH()),
    					getSoDTKH(hd.getKhachHang().getMaKH()),
    					new SimpleDateFormat("dd-MM-yyyy").format(new Date(hd.getNgayLapHD().getTime())),
    					dinhDangTienTe(hd.getThueVAT()),
    					dinhDangTienTe(hd.getTongThanhTien())});}
    	}
    	return;
    }
    
    public void timHDTheoThang(String thang, String nam) {
    	int yyyy;
    	int mm;
    	ArrayList<HoaDon> list = null;
    	if(!nam.equalsIgnoreCase("    ") && !thang.equalsIgnoreCase("    ")) {
    		yyyy = Integer.parseInt(nam);
    		mm = Integer.parseInt(thang);
    		if(quanLy())
    			list = DAO_HoaDon.getAllHoaDonDaThanhToan();
    		else
    			list = DAO_HoaDon.timHDDaThanhToanCuaNVTheoThang(mm, yyyy);
    		modelDSHD.setRowCount(0);
    		for (HoaDon hd : list) {
    			modelDSHD.addRow(new Object[] {
    					hd.getMaHD(),
    					getTenKH(hd.getKhachHang().getMaKH()),
    					getSoDTKH(hd.getKhachHang().getMaKH()),
    					new SimpleDateFormat("dd-MM-yyyy").format(new Date(hd.getNgayLapHD().getTime())),
    					dinhDangTienTe(hd.getThueVAT()),
    					dinhDangTienTe(hd.getTongThanhTien())});}
    	}
    	else if (thang.equalsIgnoreCase("    ") && !nam.equalsIgnoreCase("    ")) {
			timHDTheoNam(nam);
		}
    	return;
    }
    
    public void timHDTheoNgay(String ngay, String thang, String nam) {
    	int yyyy;
    	int mm;
    	int dd;
    	ArrayList<HoaDon> list = null;
    	if(!nam.equalsIgnoreCase("    ") && !thang.equalsIgnoreCase("    ") && !ngay.equalsIgnoreCase("    ")) {
    		yyyy = Integer.parseInt(nam);
    		mm = Integer.parseInt(thang);
    		dd = Integer.parseInt(ngay);
    		if(quanLy())
    			list = DAO_HoaDon.getAllHoaDonDaThanhToan();
    		else
    			list = DAO_HoaDon.timHDDaThanhToanCuaNVTheoNgay(dd, mm, yyyy);
    		modelDSHD.setRowCount(0);
    		for (HoaDon hd : list) {
    			modelDSHD.addRow(new Object[] {
    					hd.getMaHD(),
    					getTenKH(hd.getKhachHang().getMaKH()),
    					getSoDTKH(hd.getKhachHang().getMaKH()),
    					new SimpleDateFormat("dd-MM-yyyy").format(new Date(hd.getNgayLapHD().getTime())),
    					dinhDangTienTe(hd.getThueVAT()),
    					dinhDangTienTe(hd.getTongThanhTien())});}
    	}
    	else if (ngay.equalsIgnoreCase("    ") && !thang.equalsIgnoreCase("    ")) {
			timHDTheoThang(thang, nam);
		}
    	else if (ngay.equalsIgnoreCase("    ") && thang.equalsIgnoreCase("    ")) {
			timHDTheoNam(nam);
		}
    	return;
    }
    
    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        GD_Chinh ui = new GD_Chinh();
        this.setVisible(false);
        ui.setVisible(true);
    }                                          

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {    
    	taiLai();
        // TODO add your handling code here:
    }                                         

    private void btnTimHDActionPerformed(java.awt.event.ActionEvent evt) {      
    	String ten = txtTimKiem.getText().replaceAll("\\s\\s+", " ").trim();
    	timHD(ten);
        // TODO add your handling code here:
    }                                        

    private void txtNgayTraActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtNgayDatActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnXemDVMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    	ma_HD = txtMaHD.getText();
    	ma_Phong = txtMaPhong.getText();
        GD_HoaDonDV ui_HDDV = new GD_HoaDonDV();
        
        ui_HDDV.DocDuLieuDatabaseVaoTableDSHDDV(ma_HD, ma_Phong);
        ui_HDDV.setVisible(true);
    }                                     

    private void txtSoGioActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(GD_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_HoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_HoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTimHD;
    private javax.swing.JButton btnXemDV;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboNgay;
    private javax.swing.JComboBox<String> cboThang;
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
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblNgayDat;
    private javax.swing.JLabel lblNgayTra;
    private javax.swing.JLabel lblTienDV;
    private javax.swing.JLabel lblSoGio;
    private javax.swing.JLabel lblTTHD;
    private javax.swing.JLabel lblTenPhong;
    private javax.swing.JLabel lblThang;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JLabel lblThue;
    private javax.swing.JLabel lblSoDV;
    private javax.swing.JLabel lblTienPhong;
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
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtThue;
    private javax.swing.JTextField txtTienDV;
    private javax.swing.JTextField txtTienGio;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongThanhTien;
    // End of variables declaration                   
}
