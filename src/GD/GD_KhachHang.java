/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GD;

import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.DAO_KhachHang;
import entity.KhachHang;

/**
 *
 * @author ngphu
 */
public class GD_KhachHang extends javax.swing.JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GD_KhachHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private DefaultTableModel modelDSKH;
    private String[] cols={"Mã KH", "Tên KH", "Giới tính", "Ngày sinh","Số CMND", "Số ĐT"};
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnQuayLai = new javax.swing.JButton();
        lblTieuDe = new javax.swing.JLabel();
        pblTTKH = new javax.swing.JPanel();
        lblTTKH = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblMaKH = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblCMND = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        cbxGioiTinh = new javax.swing.JComboBox<>();
        txtNgaySinh = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        brnCapNhat = new javax.swing.JButton();
        pnlDSKH = new javax.swing.JPanel();
        lblDSKH = new javax.swing.JLabel();
        scrollDSKH = new javax.swing.JScrollPane();
        tblDSKH = new javax.swing.JTable();
        btnTimKH = new javax.swing.JButton();
        txtTimKH = new javax.swing.JTextField();
        btnRefesh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KHÁCH HÀNG");
        setBounds(new java.awt.Rectangle(1, 1, 1, 1));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("GD_KhachHang"); // NOI18N
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        btnQuayLai.setBackground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnQuayLai.setText("QUAY LẠI");
        btnQuayLai.setBorderPainted(false);
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(0, 0, 102));
        lblTieuDe.setText("KHÁCH HÀNG");

        pblTTKH.setBackground(new java.awt.Color(204, 255, 255));

        lblTTKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTTKH.setForeground(new java.awt.Color(0, 0, 102));
        lblTTKH.setText("THÔNG TIN KHÁCH HÀNG");

        lblTenKH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTenKH.setForeground(new java.awt.Color(0, 0, 102));
        lblTenKH.setText("Tên KH");

        lblMaKH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaKH.setForeground(new java.awt.Color(0, 0, 102));
        lblMaKH.setText("Mã KH");

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGioiTinh.setForeground(new java.awt.Color(0, 0, 102));
        lblGioiTinh.setText("Giới tính");

        lblNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNgaySinh.setForeground(new java.awt.Color(0, 0, 102));
        lblNgaySinh.setText("Ngày sinh");

        lblCMND.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCMND.setForeground(new java.awt.Color(0, 0, 102));
        lblCMND.setText("Số CMND");

        lblSDT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSDT.setForeground(new java.awt.Color(0, 0, 102));
        lblSDT.setText("Số ĐT");

        txtMaKH.setEditable(false);
        txtMaKH.setBackground(new java.awt.Color(204, 204, 204));

        cbxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

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

        brnCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        brnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        brnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_refesh (1).png"))); // NOI18N
        brnCapNhat.setText("CẬP NHẬT");
        brnCapNhat.setBorderPainted(false);
        brnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					brnCapNhatActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout pblTTKHLayout = new javax.swing.GroupLayout(pblTTKH);
        pblTTKH.setLayout(pblTTKHLayout);
        pblTTKHLayout.setHorizontalGroup(
            pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblTTKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pblTTKHLayout.createSequentialGroup()
                        .addComponent(lblTenKH)
                        .addGap(32, 32, 32)
                        .addComponent(txtTenKH))
                    .addGroup(pblTTKHLayout.createSequentialGroup()
                        .addComponent(lblGioiTinh)
                        .addGap(25, 25, 25)
                        .addComponent(cbxGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pblTTKHLayout.createSequentialGroup()
                        .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgaySinh)
                            .addComponent(lblCMND)
                            .addComponent(lblSDT))
                        .addGap(14, 14, 14)
                        .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT)
                            .addComponent(txtCMND)
                            .addComponent(txtNgaySinh)))
                    .addGroup(pblTTKHLayout.createSequentialGroup()
                        .addComponent(lblMaKH)
                        .addGap(36, 36, 36)
                        .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTTKH)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(pblTTKHLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(brnCapNhat)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        pblTTKHLayout.setVerticalGroup(
            pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblTTKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTTKH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCMND)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pblTTKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDSKH.setBackground(new java.awt.Color(204, 255, 255));

        lblDSKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDSKH.setForeground(new java.awt.Color(0, 0, 102));
        lblDSKH.setText("DANH SÁCH KHÁCH HÀNG");

        // ModelDSKH
        modelDSKH = new DefaultTableModel(cols,0);
        tblDSKH = new JTable(modelDSKH);
        scrollDSKH.setViewportView(tblDSKH);
        
        // Sự kiện click trên tblDSKH
        ListSelectionModel listSelectionModelDSKH = tblDSKH.getSelectionModel();
        // Thiết lập chỉ click được 1 dòng
        listSelectionModelDSKH.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Xử lý sự kiện click
        listSelectionModelDSKH.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				hienThiChiTietKH();
			}
		});

        javax.swing.GroupLayout pnlDSKHLayout = new javax.swing.GroupLayout(pnlDSKH);
        pnlDSKH.setLayout(pnlDSKHLayout);
        pnlDSKHLayout.setHorizontalGroup(
            pnlDSKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDSKH, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSKHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDSKH)
                .addGap(147, 147, 147))
        );
        pnlDSKHLayout.setVerticalGroup(
            pnlDSKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSKHLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblDSKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollDSKH, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );

        btnTimKH.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTimKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_tim.png"))); // NOI18N
        btnTimKH.setText("TÌM");
        btnTimKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKHActionPerformed(evt);
            }
        });

        btnRefesh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_refesh (1).png"))); // NOI18N
        btnRefesh.setBorderPainted(false);
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }

			private void btnRefeshActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				taiLaiDSKH();
			}
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pblTTKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTieuDe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKH, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDSKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTieuDe))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTimKH)
                            .addComponent(btnRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDSKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pblTTKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        setGiaTriMacDinh();
        DocDuLieuDatabaseVaoTableDSKH();
        
    }// </editor-fold>//GEN-END:initComponents
    
    public void setGiaTriMacDinh() {
    	txtMaKH.setText(maKhachHangMoi());
    	txtTenKH.setText("");
    	txtNgaySinh.setText("");
    	cbxGioiTinh.setSelectedIndex(0);
    	txtCMND.setText("");
    	txtSDT.setText("");
    }
    
    public void DocDuLieuDatabaseVaoTableDSKH() {
		ArrayList<KhachHang> list = DAO_KhachHang.getAllKhachHang();
		modelDSKH.setRowCount(0);
		for (KhachHang kh : list) {
			modelDSKH.addRow(new Object[] {
					kh.getMaKH(),kh.getTenKH(),kh.getGioiTinh(),
					new SimpleDateFormat("dd-MM-yyyy").format(kh.getNgaySinh()),
					kh.getSoCMND(),kh.getSoDT()});}
    }
    
    public void taiLaiDSKH() {
    	modelDSKH.setRowCount(0);
    	tblDSKH.clearSelection();
    	setGiaTriMacDinh();
    	DocDuLieuDatabaseVaoTableDSKH();
    	txtTimKH.setText("");
    }
    
    public void timKH(String ten) {
		ArrayList<KhachHang> list = DAO_KhachHang.timKH(ten);
		modelDSKH.setRowCount(0);
		for (KhachHang kh : list) {
			modelDSKH.addRow(new Object[] {
					kh.getMaKH(),kh.getTenKH(),kh.getGioiTinh(),
					new SimpleDateFormat("dd-MM-yyyy").format(kh.getNgaySinh()),
					kh.getSoCMND(),kh.getSoDT()});}
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
    
    public boolean capNhatKH() throws Exception {
    	String maKH, tenKH, gioiTinh, soCMND, soDT, ns;
    	Date ngaySinh;
    	
    	maKH = txtMaKH.getText();
    	tenKH = txtTenKH.getText();
    	ns = txtNgaySinh.getText().trim();
    	ngaySinh = Date.valueOf(ns.substring(6)+"-"+ns.substring(3,5)+"-"+ns.substring(0,2));
    	gioiTinh = cbxGioiTinh.getSelectedItem()+"";
    	soDT = txtSDT.getText();
    	soCMND = txtCMND.getText();
    	
    	KhachHang kh = new KhachHang(maKH, tenKH, ngaySinh, gioiTinh, soDT, soCMND);
    	if(!DAO_KhachHang.capNhatKH(kh)) {
    		JOptionPane.showMessageDialog(rootPane, "Cập nhật không thành công!");
    		return false;
    	}
    	JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!");
    	return true;
    }
    
    public void hienThiChiTietKH() {
    	int i = tblDSKH.getSelectedRow();
    	
    	String maKH = String.valueOf(tblDSKH.getValueAt(i, 0));
    	KhachHang kh = DAO_KhachHang.timKHTheoMa(maKH);
		
		txtMaKH.setText(kh.getMaKH());
		txtTenKH.setText(kh.getTenKH());
		cbxGioiTinh.setSelectedItem(kh.getGioiTinh());
		txtNgaySinh.setText(new SimpleDateFormat("dd-MM-yyyy").format(kh.getNgaySinh()));
		txtCMND.setText(kh.getSoCMND());
		txtSDT.setText(kh.getSoDT());
    }
    
//    public boolean themKH() {
//    	String maKH, tenKH, gioiTinh, soCMND, soDT;
//    	Date ngaySinh;
//    	
//    	maKH = txtMaKH.getText();
//    	tenKH = txtTenKH.getText();
//    	ngaySinh = Date.valueOf(txtNgaySinh.getText());
//    	gioiTinh = cbxGioiTinh.getSelectedItem()+"";
//    	soDT = txtSDT.getText();
//    	soCMND = txtCMND.getText();
//    	
//    	KhachHang kh = new KhachHang(maKH, tenKH, ngaySinh, gioiTinh, soDT, soCMND);
//    	if(!DAO_KhachHang.themKH(kh))
//    		return false;
//    	return true;
//    }
    
    private void brnCapNhatActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_brnCapNhatActionPerformed
        // TODO add your handling code here:
    	capNhatKH();
    }//GEN-LAST:event_brnCapNhatActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    	setGiaTriMacDinh();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        GD_Chinh ui_KH = new GD_Chinh();
        this.setVisible(false);
        ui_KH.setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(GD_KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnTimKH;
    private javax.swing.JComboBox<String> cbxGioiTinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblDSKH;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTTKH;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pblTTKH;
    private javax.swing.JPanel pnlDSKH;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JScrollPane scrollDSKH;
    private javax.swing.JTable tblDSKH;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKH;
    // End of variables declaration//GEN-END:variables
}
