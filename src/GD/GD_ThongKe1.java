/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GD;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import entity.HoaDon;

import dao.DAO_HoaDon;

/**
 *
 * @author Windows
 */

public class GD_ThongKe1 extends javax.swing.JFrame {
    public GD_ThongKe1() {
        initComponents(); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlOuter = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JButton();
        cbxTKNgay = new javax.swing.JComboBox<>();
        btnQuayLai = new javax.swing.JButton();
        pnlThongKe = new javax.swing.JPanel();
        pnlBangThongKe = new javax.swing.JPanel();
        txtTongDoanhThu = new javax.swing.JTextField();
        lblTongDoanhThu = new javax.swing.JLabel();
        lblTongHD = new javax.swing.JLabel();
        txtTongHD = new javax.swing.JTextField();
        cbxTKThang = new javax.swing.JComboBox<>();
        cbxTKNam = new javax.swing.JComboBox<>();
        lblNgay = new javax.swing.JLabel();
        lblTKThang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(204, 255, 255));

        pnlOuter.setBackground(new java.awt.Color(0, 204, 255));

        lblThongKe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(0, 0, 102));
        lblThongKe.setText("THỐNG KÊ DOANH THU");

        btnThongKe.setBackground(new java.awt.Color(255, 255, 255));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setBorderPainted(false);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        cbxTKNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTKNgay.setPreferredSize(new java.awt.Dimension(70, 22));
        cbxTKNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTKNgayActionPerformed(evt);
            }
        });

        btnQuayLai.setBackground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnQuayLai.setText("QUAY LẠI");
        btnQuayLai.setBorderPainted(false);
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        pnlThongKe.setBackground(new java.awt.Color(204, 255, 255));
        
        
        javax.swing.GroupLayout pnlBangThongKeLayout = new javax.swing.GroupLayout(pnlBangThongKe);
        pnlBangThongKe.setLayout(pnlBangThongKeLayout);
        pnlBangThongKeLayout.setHorizontalGroup(
            pnlBangThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        pnlBangThongKeLayout.setVerticalGroup(
            pnlBangThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
           
        );
        setDataToChart1(pnlBangThongKe);
        
        txtTongDoanhThu.setEditable(false);
        txtTongDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTongDoanhThu.setForeground(new java.awt.Color(255, 0, 0));
        txtTongDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongDoanhThuActionPerformed(evt);
            }
        });

        lblTongDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTongDoanhThu.setForeground(new java.awt.Color(0, 0, 102));
        lblTongDoanhThu.setText("TỔNG DOANH THU");

        lblTongHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTongHD.setForeground(new java.awt.Color(0, 0, 102));
        lblTongHD.setText("TỔNG SỐ HOÁ ĐƠN");

        txtTongHD.setEditable(false);
        txtTongHD.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongKeLayout.createSequentialGroup()
                        .addComponent(pnlBangThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongKeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTongHD)
                            .addComponent(lblTongDoanhThu))
                        .addGap(28, 28, 28)
                        .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongDoanhThu)
                            .addComponent(txtTongHD, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149))))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBangThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongHD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTongHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTongDoanhThu)
                    .addComponent(lblTongDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );

        cbxTKThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTKThang.setPreferredSize(new java.awt.Dimension(70, 22));
        cbxTKThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTKThangActionPerformed(evt);
            }
        });

        cbxTKNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTKNam.setPreferredSize(new java.awt.Dimension(70, 22));

        lblNgay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNgay.setForeground(new java.awt.Color(0, 0, 102));
        lblNgay.setText("NGÀY");

        lblTKThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTKThang.setForeground(new java.awt.Color(0, 0, 102));
        lblTKThang.setText("THÁNG");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("NĂM");

        javax.swing.GroupLayout pnlOuterLayout = new javax.swing.GroupLayout(pnlOuter);
        pnlOuter.setLayout(pnlOuterLayout);
        pnlOuterLayout.setHorizontalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlOuterLayout.createSequentialGroup()
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(lblNgay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTKNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTKThang))
                            .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOuterLayout.createSequentialGroup()
                                .addComponent(cbxTKThang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTKNam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblThongKe))
                        .addGap(0, 145, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlOuterLayout.setVerticalGroup(
            pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOuterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThongKe))
                .addGap(18, 18, 18)
                .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxTKNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNgay))
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlOuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxTKThang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTKThang)
                        .addComponent(jLabel1)
                        .addComponent(cbxTKNam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>    
    
   
    public void setDataToChart1(JPanel jpnItem) {
    	List<HoaDon> listItem = DAO_HoaDon.getAllHoaDonDaThanhToan();
    	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
        	
            for (HoaDon item : listItem) {
                dataset.addValue(item.getTongThanhTien(), "Tổng thành tiền", item.getNgayLapHD());
               	
            }
        }
     
//        dataset.setValue(10000, "Tong tien", "Ngay1");
//        dataset.setValue(40000, "Tong tien", "Ngay2");
//        dataset.setValue(12000, "Tong tien", "Ngay3");
//        dataset.setValue(6000, "Tong tien", "Ngay4");
//        dataset.setValue(13000, "Tong tien", "Ngay5");
//        dataset.setValue(20000, "Tong tien", "Ngay6");
//        dataset.setValue(19000, "Tong tien", "Ngay7");
//        dataset.setValue(70000, "Tong tien", "Ngay8");
//        dataset.setValue(10000, "Tong tien", "Ngay9");
//        dataset.setValue(40000, "Tong tien", "Ngay10");
//        dataset.setValue(12000, "Tong tien", "Ngay11");
//        dataset.setValue(6000, "Tong tien", "Ngay12");
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ".toUpperCase(),
                "Ngày","Tổng tiền",
                dataset, PlotOrientation.VERTICAL, false, true, true);
        
        BarRenderer render = null;
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.orange);
        render = new BarRenderer();
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void cbxTKNgayActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        GD_Chinh ui = new GD_Chinh();
        this.setVisible(false);
        ui.setVisible(true);
    }                                          

    private void txtTongDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void cbxTKThangActionPerformed(java.awt.event.ActionEvent evt) {                                           
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
            java.util.logging.Logger.getLogger(GD_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_ThongKe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JComboBox<String> cbxTKNam;
    private javax.swing.JComboBox<String> cbxTKNgay;
    private javax.swing.JComboBox<String> cbxTKThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblTKThang;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JLabel lblTongHD;
    private javax.swing.JPanel pnlBangThongKe;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlOuter;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JTextField txtTongDoanhThu;
    private javax.swing.JTextField txtTongHD;
    // End of variables declaration                   
}