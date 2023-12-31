package views;

import utils.Utils;
import controllers.BooksController;
import controllers.LendingsController;
import controllers.UsersController;
import services.NotificationService;

import java.awt.Color;

public class Returns extends javax.swing.JPanel {


    BooksController booksController = new BooksController();
    LendingsController lendingsController = new LendingsController();
    UsersController usersController = new UsersController();
    NotificationService notificationService = new NotificationService();

    public Returns() {
        initComponents();
        InitStyles();
    }
    
    private void InitStyles() {
        folioLbl.putClientProperty("FlatLaf.styleClass", "large");
        folioLbl.setForeground(Color.black);
        libroIdLbl.putClientProperty("FlatLaf.styleClass", "large");
        libroIdLbl.setForeground(Color.black);
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del usuario.");
        libroIdTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del libro que retorna.");
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
        title = new javax.swing.JLabel();
        folioLbl = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        libroIdLbl = new javax.swing.JLabel();
        libroIdTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Devolución de Libro");

        folioLbl.setBackground(new java.awt.Color(255, 255, 255));
        folioLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        folioLbl.setForeground(new java.awt.Color(0, 0, 0));
        folioLbl.setText("Usuario ID");

        libroIdLbl.setBackground(new java.awt.Color(255, 255, 255));
        libroIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        libroIdLbl.setForeground(new java.awt.Color(0, 0, 0));
        libroIdLbl.setText("Libro ID");

        button.setBackground(new java.awt.Color(204, 36, 75));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Devolver");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(folioLbl)
                    .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(libroIdLbl)
                    .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(title)
                        .addGap(57, 57, 57)
                        .addComponent(folioLbl)
                        .addGap(18, 18, 18)
                        .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(libroIdLbl)
                        .addGap(12, 12, 12)
                        .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String folio = folioTxt.getText().trim();
        String bookId = libroIdTxt.getText().trim();

        // Validaciones para los campos
        if (folio.isEmpty() || bookId.isEmpty()) {
            notificationService.showErrorNotification("Debe llenar todos los campos. \n");
            folioTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(folio) || !Utils.isNumeric(bookId)) {
            notificationService.showErrorNotification("Los campos IDdeben ser números enteros. \n");
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
                notificationService.showErrorNotification("No se encontró ningún usuario con ese ID. \n");
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
            
            // Validamos que el usuario tenga ese libro prestado.
            models.Lendings currentLending = lendingsController.getLending(currentUser.getId(), currentBook.getId());
            if (currentLending == null) {
                notificationService.showErrorNotification("No se ha podido encontrar el préstamo correspiendote a los datos ingresados. \n");
                libroIdTxt.requestFocus();
                return;
            }

            // Todo OK: Devolvemos libro.
            currentLending.setDateReturn(Utils.getCurrentDate());
            lendingsController.editLending(currentLending);
            
            // Modificamos el libro sumandole 1 en disponibilidad.
            currentBook.setAvailable(currentBook.getAvailable() + 1);
            booksController.editBook(currentBook);
            
            notificationService.showSuccessNotification("Libro ID: " + currentBook.getId() + " devuelto exitosamente por " + currentUser.getName() + ".\n");
            folioTxt.setText("");
            libroIdTxt.setText("");
            
        } catch (Exception e) {
            notificationService.showErrorNotification("Ocurrió un error al realizar la operación \n");
        }
        
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel folioLbl;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel libroIdLbl;
    private javax.swing.JTextField libroIdTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
