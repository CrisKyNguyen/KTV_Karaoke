/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GD;

import java.sql.Date;
import java.sql.Time;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.DAO_DichVu;
import dao.DAO_HoaDonDichVu;
import entity.DichVu;
import entity.HoaDon;
import entity.HoaDonDichVu;
import entity.Phong;

/**
 *
 * @author ngphu
 */
public class GD_HoaDonDV extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GD_HoaDonDV() {
        initComponents();
    }
    
    private DefaultTableModel modelDSHDDV;
    private String[] colsDSHDDV={"STT", "Tên dịch vụ", "Giá", "Số lượng", "Giờ đặt", "Ngày đặt", "Thành tiền"};
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlOuter = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        lblMaPhong = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtMaPhong = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        pnlDSDVSuDung = new javax.swing.JPanel();
        scrollDVSuDung = new javax.swing.JScrollPane();
        tblDVSuDung = new javax.swing.JTable();
        lblDVSuDung = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 660));
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(204, 255, 255));

        pnlOuter.setBackground(new java.awt.Color(0, 204, 255));

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(0, 0, 102));
        lblTieuDe.setText("HOÁ ĐƠN DỊCH VỤ");

        lblMaHD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaHD.setForeground(new java.awt.Color(0, 0, 102));
        lblMaHD.setText("Mã hoá đơn");

        lblMaPhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMaPhong.setForeground(new java.awt.Color(0, 0, 102));
        lblMaPhong.setText("Mã phòng");

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(0, 0, 102));
        lblTongTien.setText("Tổng tiền");

        txtMaHD.setEditable(false);
        txtMaHD.setBackground(new java.awt.Color(204, 204, 204));

        txtMaPhong.setEditable(false);
        txtMaPhong.setBackground(new java.awt.Color(204, 204, 204));

        txtTongTien.setEditable(false);
        txtTongTien.setBackground(new java.awt.Color(204, 204, 204));

        pnlDSDVSuDung.setBackground(new java.awt.Color(204, 255, 255));
        pnlDSDVSuDung.setForeground(new java.awt.Color(0, 0, 102));

        lblDVSuDung.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblDVSuDung.setText("DỊCH VỤ ĐÃ SỬ DỤNG");
        
        // Model DSHDDV
        modelDSHDDV = new DefaultTableModel(colsDSHDDV,0);
        tblDVSuDung = new JTable(modelDSHDDV);
        scrollDVSuDung.setViewportView(tblDVSuDung);

        javax.swing.GroupLayout pnlDSDVSuDungLayout = new javax.swing.GroupLayout(pnlDSDVSuDung);
        pnlDSDVSuDung.setLayout(pnlDSDVSuDungLayout);
        pnlDSDVSuDungLayout.setHorizontalGroup(
            pnlDSDVSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollDVSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSDVSuDungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDVSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        pnlDSDVSuDungLayout.setVerticalGroup(
            pnlDSDVSuDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSDVSuDungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDVSuDung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDVSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOuterLayout = new javax.swing.GroupLayout(pnlOuter);
        pnlOuter.setLayout(pnlOuterLayout);
        pnlOuterLayout.setHorizontalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDSDVSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOuterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlOuterLayout.createSequentialGroup()
                                        .addComponent(lblMaHD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlOuterLayout.createSequentialGroup()
                                        .addComponent(lblTongTien)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMaPhong))
                        .addGap(163, 163, 163)))
                .addContainerGap())
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(lblTieuDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOuterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );
        pnlOuterLayout.setVerticalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe)
                .addGap(18, 18, 18)
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHD)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhong)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongTien)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlDSDVSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(pnlOuter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
    }// </editor-fold>//GEN-END:initComponents
    
    public void DocDuLieuDatabaseVaoTableDSHDDV(String maHD, String maPhong) {   	
    	HoaDon hd = new HoaDon(maHD);
    	Phong p = new Phong(maPhong);
    	double tongTienDV = 0;
    	
    	txtMaHD.setText(maHD);
    	txtMaPhong.setText(maPhong);
    	
    	ArrayList<HoaDonDichVu> dsHDDV = DAO_HoaDonDichVu.getAllHDDV(hd, p);
    	if(dsHDDV.size()!=0) {
    		int i = 1;
    		for (HoaDonDichVu hddv : dsHDDV) {
    			modelDSHDDV.addRow(new Object[] {
    					i++,
            			getTenDV(hddv.getDichVu().getMaDV()),
            			dinhDangTienTe(getGiaDV(hddv.getDichVu().getMaDV())),
            			hddv.getSoLuong(),
            			new Time(hddv.getGioDatDV().getTime())+"",
            			new SimpleDateFormat("dd-MM-yyyy").format(new Date(hddv.getGioDatDV().getTime())),
            			dinhDangTienTe(hddv.getSoLuong()*getGiaDV(hddv.getDichVu().getMaDV()))});
    			tongTienDV += hddv.getSoLuong()*getGiaDV(hddv.getDichVu().getMaDV());
    		}
    	}
    	txtTongTien.setText(dinhDangTienTe(tongTienDV));
    }
    
    public String dinhDangTienTe(double tien) {
    	Locale localeVN = new Locale("vi", "VN");
	    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    	return currencyVN.format(tien);
    }
    
    public String getTenDV(String maDV) {
    	ArrayList<DichVu> listDV = DAO_DichVu.getAllDichVu();
    	for (DichVu dv : listDV) {
    		if(dv.getMaDV().equalsIgnoreCase(maDV))
    			return dv.getTenDV();
    	}
    	return "";
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

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(GD_HoaDonDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_HoaDonDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_HoaDonDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_HoaDonDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
				new GD_HoaDonDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lblDVSuDung;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JPanel pnlDSDVSuDung;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlOuter;
    private javax.swing.JScrollPane scrollDVSuDung;
    private javax.swing.JTable tblDVSuDung;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
