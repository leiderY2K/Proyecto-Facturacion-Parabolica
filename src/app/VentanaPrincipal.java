package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Leider
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    Color naranja=new Color(0,15,29);
    Color naranjado=new Color(255,180,80);
    public VentanaPrincipal() {
        initComponents(); 
        inicioPng.setIcon(new javax.swing.ImageIcon("./img/iniciob.png"));
        clientesPng.setIcon(new javax.swing.ImageIcon("./img/clienteb.png"));
        facturasPng.setIcon(new javax.swing.ImageIcon("./img/facturab.png"));
        pagosPng.setIcon(new javax.swing.ImageIcon("./img/pagob.png"));
        adminPng.setIcon(new javax.swing.ImageIcon("./img/informeb.png"));
        Inicio p1 = new Inicio();
        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"
                ,"Septiembre" ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText(dia+" de "+meses[month - 1]+" de "+year);
        p1.setSize(870, 660);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        inicioBtn = new javax.swing.JPanel();
        inicioTxt = new javax.swing.JLabel();
        inicioPng = new javax.swing.JLabel();
        clientesBtn = new javax.swing.JPanel();
        clientesTxt = new javax.swing.JLabel();
        clientesPng = new javax.swing.JLabel();
        facturasBtn = new javax.swing.JPanel();
        facturasTxt = new javax.swing.JLabel();
        facturasPng = new javax.swing.JLabel();
        pagosBtn = new javax.swing.JPanel();
        pagosTxt = new javax.swing.JLabel();
        pagosPng = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        adminBtn = new javax.swing.JPanel();
        adminPng = new javax.swing.JLabel();
        adminTxt = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 15, 29));
        menu.setPreferredSize(new java.awt.Dimension(110, 700));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioBtn.setBackground(new java.awt.Color(0, 15, 29));
        inicioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicioBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicioBtnMouseExited(evt);
            }
        });

        inicioTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        inicioTxt.setForeground(new java.awt.Color(255, 255, 255));
        inicioTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inicioTxt.setText("Inicio");

        inicioPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout inicioBtnLayout = new javax.swing.GroupLayout(inicioBtn);
        inicioBtn.setLayout(inicioBtnLayout);
        inicioBtnLayout.setHorizontalGroup(
            inicioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioBtnLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(inicioPng, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        inicioBtnLayout.setVerticalGroup(
            inicioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioBtnLayout.createSequentialGroup()
                .addComponent(inicioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicioPng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu.add(inicioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 50));

        clientesBtn.setBackground(new java.awt.Color(0, 15, 29));
        clientesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientesBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesBtnMouseExited(evt);
            }
        });

        clientesTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        clientesTxt.setForeground(new java.awt.Color(255, 255, 255));
        clientesTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientesTxt.setText("Clientes");

        clientesPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout clientesBtnLayout = new javax.swing.GroupLayout(clientesBtn);
        clientesBtn.setLayout(clientesBtnLayout);
        clientesBtnLayout.setHorizontalGroup(
            clientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesBtnLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(clientesPng, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        clientesBtnLayout.setVerticalGroup(
            clientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesBtnLayout.createSequentialGroup()
                .addGroup(clientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clientesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(clientesBtnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clientesPng, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(clientesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 200, 50));

        facturasBtn.setBackground(new java.awt.Color(0, 15, 29));
        facturasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturasBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facturasBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturasBtnMouseExited(evt);
            }
        });

        facturasTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        facturasTxt.setForeground(new java.awt.Color(255, 255, 255));
        facturasTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        facturasTxt.setText("Facturas");

        facturasPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout facturasBtnLayout = new javax.swing.GroupLayout(facturasBtn);
        facturasBtn.setLayout(facturasBtnLayout);
        facturasBtnLayout.setHorizontalGroup(
            facturasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturasBtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(facturasPng, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(facturasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        facturasBtnLayout.setVerticalGroup(
            facturasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturasBtnLayout.createSequentialGroup()
                .addComponent(facturasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturasBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(facturasPng, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.add(facturasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 45));

        pagosBtn.setBackground(new java.awt.Color(0, 15, 29));
        pagosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagosBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagosBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagosBtnMouseExited(evt);
            }
        });

        pagosTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        pagosTxt.setForeground(new java.awt.Color(255, 255, 255));
        pagosTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pagosTxt.setText("Pagos");

        pagosPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pagosBtnLayout = new javax.swing.GroupLayout(pagosBtn);
        pagosBtn.setLayout(pagosBtnLayout);
        pagosBtnLayout.setHorizontalGroup(
            pagosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagosBtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(pagosPng, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pagosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        pagosBtnLayout.setVerticalGroup(
            pagosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagosBtnLayout.createSequentialGroup()
                .addComponent(pagosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagosBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pagosPng, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.add(pagosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 45));

        fecha.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("20 de Enero de 2022");
        menu.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 170, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bojaya-Choco");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 150, 30));

        adminBtn.setBackground(new java.awt.Color(0, 15, 29));
        adminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminBtnMouseExited(evt);
            }
        });

        adminPng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        adminTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        adminTxt.setForeground(new java.awt.Color(255, 255, 255));
        adminTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminTxt.setText("Informes");

        javax.swing.GroupLayout adminBtnLayout = new javax.swing.GroupLayout(adminBtn);
        adminBtn.setLayout(adminBtnLayout);
        adminBtnLayout.setHorizontalGroup(
            adminBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminBtnLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(adminPng, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        adminBtnLayout.setVerticalGroup(
            adminBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminPng, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.add(adminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 50));

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        barra.setOpaque(false);
        barra.setPreferredSize(new java.awt.Dimension(1200, 40));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addContainerGap(830, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 870, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 870, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited
   
    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMouse =evt.getX();
        yMouse =evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void clientesBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnMouseEntered
        clientesBtn.setBackground(naranjado);
        clientesTxt.setForeground(Color.black);
        clientesPng.setIcon(new javax.swing.ImageIcon("./img/cliente.png"));
    }//GEN-LAST:event_clientesBtnMouseEntered

    private void clientesBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnMouseExited
        clientesBtn.setBackground(naranja);
        clientesTxt.setForeground(Color.white);
        clientesPng.setIcon(new javax.swing.ImageIcon("./img/clienteb.png"));
    }//GEN-LAST:event_clientesBtnMouseExited

    private void facturasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasBtnMouseEntered
        facturasBtn.setBackground(naranjado);
        facturasTxt.setForeground(Color.black);
        facturasPng.setIcon(new javax.swing.ImageIcon("./img/factura.png"));

    }//GEN-LAST:event_facturasBtnMouseEntered

    private void facturasBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasBtnMouseExited
        facturasBtn.setBackground(naranja);
        facturasTxt.setForeground(Color.white);
        facturasPng.setIcon(new javax.swing.ImageIcon("./img/facturab.png"));

    }//GEN-LAST:event_facturasBtnMouseExited

    private void pagosBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagosBtnMouseEntered
        pagosBtn.setBackground(naranjado);
        pagosTxt.setForeground(Color.black);
        pagosPng.setIcon(new javax.swing.ImageIcon("./img/pago.png"));

    }//GEN-LAST:event_pagosBtnMouseEntered

    private void pagosBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagosBtnMouseExited
        pagosBtn.setBackground(naranja);
        pagosTxt.setForeground(Color.white);
        pagosPng.setIcon(new javax.swing.ImageIcon("./img/pagob.png"));
    }//GEN-LAST:event_pagosBtnMouseExited

    private void inicioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioBtnMouseEntered
        inicioBtn.setBackground(naranjado);
        inicioTxt.setForeground(Color.black);
        inicioPng.setIcon(new javax.swing.ImageIcon("./img/inicio.png"));
    }//GEN-LAST:event_inicioBtnMouseEntered

    private void inicioBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioBtnMouseExited
        inicioBtn.setBackground(naranja);
        inicioTxt.setForeground(Color.white);
        inicioPng.setIcon(new javax.swing.ImageIcon("./img/iniciob.png"));
    }//GEN-LAST:event_inicioBtnMouseExited

    private void clientesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnMouseClicked
        Clientes cl = new Clientes();
        cl.setSize(870, 710);
        cl.setLocation(0,0);
        
        content.removeAll();
        content.add(cl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_clientesBtnMouseClicked

    private void facturasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasBtnMouseClicked
        Facturas fa = new Facturas();
        fa.setSize(870, 710);
        fa.setLocation(0,0);
        
        content.removeAll();
        content.add(fa, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_facturasBtnMouseClicked

    private void inicioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioBtnMouseClicked
        Inicio in = new Inicio();
        in.setSize(870, 710);
        in.setLocation(0,0);
        
        content.removeAll();
        content.add(in, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_inicioBtnMouseClicked

    private void pagosBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagosBtnMouseClicked
        Pagos pa = new Pagos();
        pa.setSize(870, 710);
        pa.setLocation(0,0);
        
        content.removeAll();
        content.add(pa, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_pagosBtnMouseClicked

    private void adminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBtnMouseClicked
        Admin ad = new Admin();
        ad.setSize(870, 710);
        ad.setLocation(0,0);
        
        content.removeAll();
        content.add(ad, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_adminBtnMouseClicked

    private void adminBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBtnMouseEntered
        adminBtn.setBackground(naranjado);
        adminTxt.setForeground(Color.black);
        adminPng.setIcon(new javax.swing.ImageIcon("./img/informe.png"));
    }//GEN-LAST:event_adminBtnMouseEntered

    private void adminBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBtnMouseExited
        adminBtn.setBackground(naranja);
        adminTxt.setForeground(Color.white);
        adminPng.setIcon(new javax.swing.ImageIcon("./img/informeb.png"));
    }//GEN-LAST:event_adminBtnMouseExited
                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminBtn;
    private javax.swing.JLabel adminPng;
    private javax.swing.JLabel adminTxt;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel clientesBtn;
    private javax.swing.JLabel clientesPng;
    private javax.swing.JLabel clientesTxt;
    public static javax.swing.JPanel content;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel facturasBtn;
    private javax.swing.JLabel facturasPng;
    private javax.swing.JLabel facturasTxt;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel inicioBtn;
    private javax.swing.JLabel inicioPng;
    private javax.swing.JLabel inicioTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel pagosBtn;
    private javax.swing.JLabel pagosPng;
    private javax.swing.JLabel pagosTxt;
    // End of variables declaration//GEN-END:variables
}