/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GD;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import entity.NhanVien;
import dao.DAO_NhanVien;
/**
 *
 * @author ngphu
 */
public class GD_DangNhap extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(".//images//ktv_logo.PNG"));
	public GD_DangNhap() {
        initComponents();
    }

                    
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        txtTaiKhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        sepTaiKhoan = new javax.swing.JSeparator();
        sepMatKhau = new javax.swing.JSeparator();
        lblTaiKhoan = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblThoat = new javax.swing.JLabel();
        lblDangNhap = new javax.swing.JLabel();
        lblQuenMK = new javax.swing.JLabel();
        sepQuenMK = new javax.swing.JSeparator();

        setTitle("ĐĂNG NHẬP");
        setUndecorated(true);
        setResizable(false);
        setIconImage(icon.getImage());
        
        pnlMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlLeft.setBackground(new java.awt.Color(204, 255, 255));
        pnlLeft.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                pnlLeftComponentMoved(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ktv_logo.PNG"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.PNG"))); // NOI18N

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlRight.setBackground(new java.awt.Color(0, 204, 255));
        pnlRight.setForeground(new java.awt.Color(0, 0, 102));

        txtTaiKhoan.setBackground(new java.awt.Color(0, 204, 255));
        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTaiKhoan.setForeground(new java.awt.Color(0, 0, 102));
        txtTaiKhoan.setText("Nhập tài khoản");
        txtTaiKhoan.setBorder(null);
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });

        txtMatKhau.setBackground(new java.awt.Color(0, 204, 255));
        txtMatKhau.setForeground(new java.awt.Color(0, 0, 102));
        txtMatKhau.setText("123");
        txtMatKhau.setBorder(null);
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                try {
					txtMatKhauKeyPressed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        sepTaiKhoan.setBackground(new java.awt.Color(0, 0, 102));
        sepTaiKhoan.setForeground(new java.awt.Color(0, 0, 102));
        sepTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sepTaiKhoan.setPreferredSize(new java.awt.Dimension(0, 3));

        sepMatKhau.setBackground(new java.awt.Color(0, 0, 102));
        sepMatKhau.setForeground(new java.awt.Color(0, 0, 102));

        lblTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(0, 0, 102));
        lblTaiKhoan.setText("Tài Khoản");

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(0, 0, 102));
        lblMatKhau.setText("Mật Khẩu");

        btnDangNhap.setBackground(new java.awt.Color(51, 0, 255));
        btnDangNhap.setForeground(new java.awt.Color(0, 0, 102));
        btnDangNhap.setText("ĐĂNG NHẬP");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        btnDangNhap.setContentAreaFilled(false);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnDangNhapActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnThoat.setBackground(new java.awt.Color(51, 0, 255));
        btnThoat.setForeground(new java.awt.Color(0, 0, 102));
        btnThoat.setText("THOÁT");
        btnThoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        btnThoat.setContentAreaFilled(false);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblThoat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblThoat.setText("X");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });

        lblDangNhap.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblDangNhap.setForeground(new java.awt.Color(0, 0, 102));
        lblDangNhap.setText("ĐĂNG NHẬP");

        lblQuenMK.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        lblQuenMK.setForeground(new java.awt.Color(0, 0, 102));
        lblQuenMK.setText("Quên mật khẩu?");
        lblQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMKMouseClicked(evt);
            }
        });

        sepQuenMK.setBackground(new java.awt.Color(0, 0, 0));
        sepQuenMK.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMatKhau)))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhau)
                    .addComponent(sepMatKhau)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addComponent(lblDangNhap)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                            .addComponent(lblThoat)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                            .addComponent(lblQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103)))))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addComponent(lblThoat)
                .addGap(35, 35, 35)
                .addComponent(lblDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaiKhoan))
                .addGap(1, 1, 1)
                .addComponent(sepTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuenMK)
                .addGap(1, 1, 1)
                .addComponent(sepQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    public int kiemTra(String taiKhoan, String matKhau) throws Exception {
    	ArrayList<NhanVien> listNV = DAO_NhanVien.getAllNhanVien(); 	
    	for (NhanVien nv : listNV) {
			if(taiKhoan.equalsIgnoreCase(nv.getMaNV())) {
				if(matKhau.equalsIgnoreCase(nv.getMatKhau())) {
					DAO_NhanVien.capNhatTinhTrangNVDN(nv);
					return 1;
				}
				return 2;
			}
    	}
    	return 0;
    }
    
    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, Exception {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
    	String taiKhoan = txtTaiKhoan.getText().trim();
    	@SuppressWarnings("deprecation")
		String matKhau = txtMatKhau.getText().trim();
    	
    	if(kiemTra(taiKhoan, matKhau)==2)
    		JOptionPane.showMessageDialog(rootPane, "Sai mật khẩu!");
    	else if (kiemTra(taiKhoan, matKhau)==0)
    		JOptionPane.showMessageDialog(rootPane, "Sai tài khoản hoặc mật khẩu!");
    	else {
    		GD_Chinh uiLogin= new GD_Chinh();
            this.setVisible(false);
            uiLogin.setVisible(true);
    	}
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblThoatMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void pnlLeftComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlLeftComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlLeftComponentMoved

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) throws HeadlessException, Exception {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            	String taiKhoan = txtTaiKhoan.getText().trim();
            	@SuppressWarnings("deprecation")
				String matKhau = txtMatKhau.getText().trim();
            	
            	if(kiemTra(taiKhoan, matKhau)==2)
            		JOptionPane.showMessageDialog(rootPane, "Sai mật khẩu!");
            	else if (kiemTra(taiKhoan, matKhau)==0)
            		JOptionPane.showMessageDialog(rootPane, "Sai tài khoản hoặc mật khẩu!");
            	else {
            		GD_Chinh uiLogin= new GD_Chinh();
                    this.setVisible(false);
                    uiLogin.setVisible(true);
            	}
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
        this.btnDangNhap.requestFocus();
    }//GEN-LAST:event_txtMatKhauActionPerformed
    
    private void lblQuenMKMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
    	GD_LayLaiMatKhau ui = new GD_LayLaiMatKhau();
    	ui.setVisible(true);
    }       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GD_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblQuenMK;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JSeparator sepMatKhau;
    private javax.swing.JSeparator sepQuenMK;
    private javax.swing.JSeparator sepTaiKhoan;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration                   
}
