/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GD;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dao.DAO_NhanVien;
import entity.NhanVien;

/**
 *
 * @author ngphu
 */
public class GD_DoiMatKhau extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(".//images//ktv_logo.PNG"));

    public GD_DoiMatKhau() {
        initComponents();
    }
                      
    private void initComponents() {

        pnlVien = new javax.swing.JPanel();
        pnlChinh = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        lblMatKhauCu = new javax.swing.JLabel();
        lblMatKhauMoi = new javax.swing.JLabel();
        lblNhapLai = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        txtMatKhauCu = new javax.swing.JTextField();
        txtMatKhauMoi = new javax.swing.JTextField();
        txtNhapLai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        setIconImage(icon.getImage());

        pnlVien.setBackground(new java.awt.Color(0, 204, 255));
        
        pnlChinh.setBackground(new java.awt.Color(204, 255, 255));

        lblTieuDe.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(0, 0, 102));
        lblTieuDe.setText("ĐỔI MẬT KHẨU");

        lblMatKhauCu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMatKhauCu.setForeground(new java.awt.Color(0, 0, 102));
        lblMatKhauCu.setText("Mật khẩu cũ");

        lblMatKhauMoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMatKhauMoi.setForeground(new java.awt.Color(0, 0, 102));
        lblMatKhauMoi.setText("Mật khẩu mới");

        lblNhapLai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNhapLai.setForeground(new java.awt.Color(0, 0, 102));
        lblNhapLai.setText("Nhập lại mật khẩu");

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnHuy.setText("HUỶ");
        btnHuy.setBorderPainted(false);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnXacNhan.setBackground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXacNhan.setText("XÁC NHẬN");
        btnXacNhan.setBorderPainted(false);
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnXacNhanActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout pnlChinhLayout = new javax.swing.GroupLayout(pnlChinh);
        pnlChinh.setLayout(pnlChinhLayout);
        pnlChinhLayout.setHorizontalGroup(
            pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNhapLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMatKhauMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChinhLayout.createSequentialGroup()
                        .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtMatKhauCu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNhapLai))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlChinhLayout.createSequentialGroup()
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChinhLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(lblTieuDe)
                .addGap(102, 102, 102))
        );
        pnlChinhLayout.setVerticalGroup(
            pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe)
                .addGap(18, 18, 18)
                .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhauCu)
                    .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhauMoi)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhapLai)
                    .addComponent(txtNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlVienLayout = new javax.swing.GroupLayout(pnlVien);
        pnlVien.setLayout(pnlVienLayout);
        pnlVienLayout.setHorizontalGroup(
            pnlVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlChinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVienLayout.setVerticalGroup(
            pnlVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    public boolean layNVDangLogin() throws Exception {
    	String matKhauCu = txtMatKhauCu.getText().trim();
    	String matKhauMoi = txtMatKhauMoi.getText().trim();
    	String matKhauNhapLai = txtNhapLai.getText().trim();
    	if (kiemTraDuLieuRong()) {
    		NhanVien nv = DAO_NhanVien.getNVDangLogin();
			if (matKhauCu.equalsIgnoreCase(nv.getMatKhau())) {
				if (!matKhauCu.equalsIgnoreCase(matKhauMoi)) {
					if (matKhauMoi.equalsIgnoreCase(matKhauNhapLai)) {
						DAO_NhanVien.capNhatPass(nv,matKhauMoi);
						JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công!");
						return true;
					}else JOptionPane.showMessageDialog(rootPane, "Mật khẩu nhập lại không khớp với mật khẩu mới!");
				}else JOptionPane.showMessageDialog(rootPane, "Mật khẩu mới không được trùng với mật khẩu cũ!");
			} else JOptionPane.showMessageDialog(rootPane, "Mật khẩu không đúng!");
		}
		return false;
   }

    public boolean kiemTraDuLieuRong() {
		String matKhauCu = txtMatKhauCu.getText().trim();
		String matKhauMoi=txtMatKhauMoi.getText().trim();
		String nhapLai = txtNhapLai.getText().trim();
		if (matKhauCu.trim().length() <= 0) { 
				JOptionPane.showMessageDialog(this, "Mật khẩu cũ không được để trống");
					return false;
		}
		if (matKhauMoi.trim().length() <= 0) { 
			JOptionPane.showMessageDialog(this, "Mật khẩu mới không được để trống");
				return false;
		}
		
		if (nhapLai.trim().length() <= 0) { 
			JOptionPane.showMessageDialog(this, "Mật khẩu nhập lại không được để trống");
				return false;
		}		
		return true;
    }
    
    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {                                       
        GD_ThongTinNhanVien uiThongTinNhanVien = new GD_ThongTinNhanVien();
        uiThongTinNhanVien.setVisible(true);
    	this.setVisible(false);
    }                                      

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                           
    	if (layNVDangLogin()) {
    		NhanVien nv = DAO_NhanVien.getNVDangLogin();
    		DAO_NhanVien.capNhatTinhTrangNVDX(nv);
    		this.setVisible(false);
    		GD_DangNhap uiLogIn = new GD_DangNhap();
    		uiLogIn.setVisible(true);
    	}
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
            java.util.logging.Logger.getLogger(GD_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel lblMatKhauCu;
    private javax.swing.JLabel lblMatKhauMoi;
    private javax.swing.JLabel lblNhapLai;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel pnlChinh;
    private javax.swing.JPanel pnlVien;
    private javax.swing.JTextField txtMatKhauCu;
    private javax.swing.JTextField txtMatKhauMoi;
    private javax.swing.JTextField txtNhapLai;
    // End of variables declaration                   
}
