package views;

import utils.Utils;

import controllers.BooksController;
import controllers.LendingsController;
import controllers.UsersController;
import services.NotificationService;

public class Lendings extends javax.swing.JPanel {

    NotificationService notificationService = new NotificationService();
    LendingsController lendingsController = new LendingsController();
    BooksController booksController = new BooksController();
    UsersController usersController = new UsersController();

    public Lendings() {
        initComponents();
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del usuario.");
        libroIdTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del libro a prestar.");
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
        jSeparator1 = new javax.swing.JSeparator();
        folioLbl = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        libroIdLbl = new javax.swing.JLabel();
        libroIdTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        folioLbl.setText("Usuario ID");

        folioTxt.setToolTipText("");

        libroIdLbl.setText("Libro ID");

        button.setBackground(new java.awt.Color(204, 36, 75));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Prestar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Préstamo de libro");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/read.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(folioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(libroIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(image)))
                .addGap(45, 45, 45))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(folioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(libroIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(image)))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        String folio = folioTxt.getText();
        String bookId = libroIdTxt.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || bookId.isEmpty()) {
            notificationService.showErrorNotification("Debe llenar todos los campos. \n");
            folioTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(folio) || !Utils.isNumeric(bookId)) {
            notificationService.showErrorNotification("Los campos ID deben ser números enteros. \n");
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(bookId) <= 0) {
            notificationService.showErrorNotification("Los campos ID deben ser mayor que 0. \n");
            folioTxt.requestFocus();
            return;
        }

        try {
            
            // Validamos existencia del usuario
            models.Users currentUser = usersController.getUser(Integer.parseInt(folio));
            if (currentUser == null) {
                notificationService.showErrorNotification("No se encontró ningún usuario con ese folio. \n");
                folioTxt.requestFocus();
                return;
            }
            
            // Validamos existencia del libro
            models.Books currentBook = booksController.getBook(Integer.parseInt(bookId));
            if (currentBook == null){
                notificationService.showErrorNotification("No se encontró ningún libro con ese ID. \n");
                libroIdTxt.requestFocus();
                return;
            }
            // Validamos disponibilidad del libro.
            else if (currentBook.getAvailable() < 1) {
                notificationService.showErrorNotification("Ya no hay más libros disponibles con esa ID para prestar. \n");
                libroIdTxt.requestFocus();
                return;
            }
            
            
            // Validamos que el usuario no tenga ya ese libro prestado.
            models.Lendings currentLending = lendingsController.getLending(currentUser.getId(), currentBook.getId());
            if (currentLending != null) {
                notificationService.showErrorNotification("Esa persona ya cuenta con el préstamo de ese mismo Libro. \n");
                libroIdTxt.requestFocus();
                return;
            }

            // Todo OK: Prestamos libro.
            models.Lendings lending = new models.Lendings();
            lending.setBookId(currentBook.getId());
            lending.setUserId(currentUser.getId());
            lending.setDateOut(Utils.getCurrentDate());
            lendingsController.registerLending(lending);
            
            // Modificamos el libro restandole 1 en disponibilidad.
            currentBook.setAvailable(currentBook.getAvailable() - 1);
            booksController.editBook(currentBook);
            
            notificationService.showSuccessNotification("Libro ID: " + currentBook.getId() + " prestado exitosamente a " + currentUser.getName() + ".\n");
            folioTxt.setText("");
            libroIdTxt.setText("");

        } catch (Exception e) {
            notificationService.showErrorNotification("Ocurrió un error al prestar el libro. \n");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel folioLbl;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel libroIdLbl;
    private javax.swing.JTextField libroIdTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}