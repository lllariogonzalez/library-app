package views;

import javax.swing.table.DefaultTableModel;

import controllers.LendingsController;
import controllers.BooksController;
import controllers.UsersController;
import services.NotificationService;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Reports extends javax.swing.JPanel {

    BooksController booksController = new BooksController();
    UsersController usersController = new UsersController();
    LendingsController lendingsController = new LendingsController();
    NotificationService notificationService = new NotificationService();

    public Reports() {
        initComponents();
        LoadReports();
        initStyles();
    }

    private void initStyles(){
        DefaultTableCellRenderer TablaRenderer = new DefaultTableCellRenderer();
        jTable2.getColumnModel().getColumn(0).setCellRenderer(TablaRenderer);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(TablaRenderer);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(TablaRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(TablaRenderer);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(TablaRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(TablaRenderer);
        jTable3.getColumnModel().getColumn(0).setCellRenderer(TablaRenderer);
        jTable3.getColumnModel().getColumn(1).setCellRenderer(TablaRenderer);
        jTable3.getColumnModel().getColumn(2).setCellRenderer(TablaRenderer);
        jTable3.getColumnModel().getColumn(3).setCellRenderer(TablaRenderer);
        TablaRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void LoadReports() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();

            // Limpiamos tablas
            model.setRowCount(0);
            model2.setRowCount(0);
            model3.setRowCount(0);
            // Generamos informes
            
            Map<Integer, Integer> bookCounts = new HashMap<>(); // Mapa para contar los préstamos por libro
            Map<Integer, Integer> userCounts = new HashMap<>(); // Mapa para contar los préstamos por usuario

                    
            lendingsController.getLendings().forEach((l) -> {
                try {
                    int bookId = l.getBookId();
                    int userId = l.getUserId();

                    // Contar los préstamos por libro
                    bookCounts.put(bookId, bookCounts.getOrDefault(bookId, 0) + 1);

                    // Contar los préstamos por usuario
                    userCounts.put(userId, userCounts.getOrDefault(userId, 0) + 1);
                    
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                model.addRow(new Object[]{l.getUserId(), l.getBookId(), l.getDateOut(), l.getDateReturn()});
            
            });
            
            
            // Ordenar los libros por cantidad de préstamos
            List<Map.Entry<Integer, Integer>> sortedBooks = new ArrayList<>(bookCounts.entrySet());
            sortedBooks.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

            // Ordenar los usuarios por cantidad de préstamos
            List<Map.Entry<Integer, Integer>> sortedUsers = new ArrayList<>(userCounts.entrySet());
            sortedUsers.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
            
            for (int i = 0; i < 3 && i < sortedBooks.size(); i++) {
                int bookId = sortedBooks.get(i).getKey();
                models.Books b = booksController.getBook(bookId);
                model2.addRow(new Object[]{b.getId(), b.getTitle(), b.getAuthor(), b.getGender()});
            }
            
            for (int i = 0; i < 3 && i < sortedUsers.size(); i++) {
                int userId = sortedUsers.get(i).getKey();
                models.Users u = usersController.getUser(userId);
                model3.addRow(new Object[]{u.getId(), u.getName(), u.getLastName(), u.getAddress()});
            }
            
        } catch (Exception e) {
            notificationService.showErrorNotification("Error al cargar los reportes");
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Reportes");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Autor", "Género"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ultimos movimientos:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Libros mas solicitados:");

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario ID", "Libro ID", "Fecha de Salida", "Fecha de Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuarios mas activos:");

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}