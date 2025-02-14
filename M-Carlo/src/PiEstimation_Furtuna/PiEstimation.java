package PiEstimation_Furtuna;
/**
 *
 * @author furtuna
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PiEstimation extends javax.swing.JFrame {
private Timer timer;
    private int nPoints;
    private int radiusValue;
    private final int centerX = 350;
    private final int centerY = 350;
    private boolean isRunning = false;
    private int currentPoints = 0;
    private int insideCircle = 0;
    private ArrayList<Point> pointsList = new ArrayList<>();
    
    /**
     * Creates new form PiEstimation
     */
    public PiEstimation() {
        initComponents();
        setupDrawingPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        scrollPane = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        radiusField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pointsField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        scrollPane.setBackground(new java.awt.Color(0, 0, 0));
        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Constantia", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pi Estimation");

        outputArea.setEditable(false);
        outputArea.setBackground(new java.awt.Color(51, 51, 51));
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        outputArea.setForeground(new java.awt.Color(255, 255, 255));
        outputArea.setRows(5);
        outputArea.setBorder(null);
        outputArea.setEnabled(false);
        jScrollPane2.setViewportView(outputArea);

        startButton.setBackground(new java.awt.Color(0, 0, 0));
        startButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start");
        startButton.setBorder(null);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setBackground(new java.awt.Color(0, 0, 0));
        stopButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        stopButton.setForeground(new java.awt.Color(255, 255, 255));
        stopButton.setText("Stop");
        stopButton.setBorder(null);

        resetButton.setBackground(new java.awt.Color(0, 0, 0));
        resetButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Radius");

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Points");

        radiusField.setBackground(new java.awt.Color(0, 0, 0));
        radiusField.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        radiusField.setForeground(new java.awt.Color(255, 255, 255));
        radiusField.setBorder(null);

        pointsField.setBackground(new java.awt.Color(0, 0, 0));
        pointsField.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        pointsField.setForeground(new java.awt.Color(255, 255, 255));
        pointsField.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(radiusField)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pointsField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPane)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radiusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pointsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startButton)
                            .addComponent(stopButton)
                            .addComponent(resetButton))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        validateAndStartSimulation();
    }//GEN-LAST:event_startButtonActionPerformed
private void validateAndStartSimulation() {

    try {

        String radiusText = radiusField.getText().trim();

        String pointsText = pointsField.getText().trim();

        

        if (radiusText.isEmpty() || pointsText.isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(this, "Please enter both radius and total points.");

            return;

        }

        

        radiusValue = Integer.parseInt(radiusText);

        nPoints = Integer.parseInt(pointsText);

        

        if (radiusValue <= 0 || nPoints <= 0) {

            javax.swing.JOptionPane.showMessageDialog(this, "Please enter positive numbers only.");

            return;

        }

        

        if (!isRunning) {

            startSimulation();

        }

    } catch (NumberFormatException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Please enter valid numbers only.");

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
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PiEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PiEstimation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JTextField pointsField;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField radiusField;
    private javax.swing.JButton resetButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
private static class Point {
    int x, y;
    boolean inside;
    Point(int x, int y, boolean inside) {
        this.x = x;
        this.y = y;
        this.inside = inside;
    }
}
    private void setupDrawingPanel() {
 DrawingPanel drawingPanel = new DrawingPanel();
    scrollPane.setViewportView(drawingPanel);
    drawingPanel.setPreferredSize(new Dimension(700, 700));
scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    stopButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            stopButtonActionPerformed(evt);
        }
    });

    resetButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            resetButtonActionPerformed(evt);
        }
    });
    }
    private class DrawingPanel extends javax.swing.JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (radiusValue > 0) {
            g.setColor(Color.BLACK);
            g.fillRect(centerX - radiusValue, centerY - radiusValue, 
                      2 * radiusValue, 2 * radiusValue);
            
            g.setColor(Color.BLUE);
            g.drawOval(centerX - radiusValue, centerY - radiusValue, 
                      2 * radiusValue, 2 * radiusValue);
            
            for (int i = 0; i < pointsList.size(); i++) {
                Point p = pointsList.get(i);
                g.setColor(p.inside ? Color.GREEN : Color.RED);
                g.fillOval(centerX + p.x, centerY + p.y, 2, 2);
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(700, 700);
    }
}

private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {
    stopSimulation();
}

private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
    resetSimulation();
}

private void startSimulation() {
    isRunning = true;
    currentPoints = 0;
    insideCircle = 0;
    pointsList.clear();
    progressBar.setValue(0);
    outputArea.setText("");

    timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
            if (currentPoints < nPoints) {
                addPoint();
                scrollPane.repaint();
                updateOutput();
            } else {
                stopSimulation();
            }
        }
    }, 0, 10);
}

private void stopSimulation() {
    if (timer != null) {
        timer.cancel();
        isRunning = false;
    }
}

private void resetSimulation() {
    stopSimulation();
   pointsList.clear();
    currentPoints = 0;
    insideCircle = 0;
    progressBar.setValue(0);
    outputArea.setText("");
    scrollPane.repaint();
}

private void addPoint() {
    Random rand = new Random();
    double x = rand.nextDouble() * 2 * radiusValue - radiusValue;
    double y = rand.nextDouble() * 2 * radiusValue - radiusValue;
    boolean inside = x * x + y * y <= radiusValue * radiusValue;
    if (inside) insideCircle++;
   pointsList.add(new Point((int)x, (int)y, inside));
    currentPoints++;
    progressBar.setValue((int)((double)currentPoints / nPoints * 100));
}

private void updateOutput() {
    double piEstimate = 4.0 * insideCircle / currentPoints;
    double circleArea = Math.PI * radiusValue * radiusValue;
    double squareArea = 4.0 * radiusValue * radiusValue;
    
    
    outputArea.setText(String.format(
        "Results:\n" +
        "Estimated π: %.6f\n" +
        "Circle Area (πr²): %.2f\n" +
        "Square Area (4r²): %.2f\n" +
        "Points Inside Circle: %d\n" +
        "Total Points Used: %d\n" +
        "Completion: %.1f%%",
        piEstimate, circleArea, squareArea, 
        insideCircle, currentPoints,
        (double)currentPoints / nPoints * 100));
}
}
