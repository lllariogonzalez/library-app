package views;

import controllers.UsersController;
import services.NotificationService;

public class UpUsers extends javax.swing.JPanel {

    boolean isEdition = false;
    models.Users userEdition;
    UsersController usersController = new UsersController();
    NotificationService notificationService = new NotificationService();

    public UpUsers() {
        initComponents();
        isEdition();
        initStyles();
    }

    public UpUsers(models.Users user) {
        initComponents();
        isEdition = true;
        userEdition = user;
        isEdition();
    }
    
    public void initStyles(){
        nameTxt.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del usuario.");
        domTxt.putClientProperty("JTextField.placeholderText", "Ingrese el domicilio del usuario.");
        phoneTxt.putClientProperty("JTextField.placeholderText", "Ingrese el telefono del usuario.");
        apPTxt.putClientProperty("JTextField.placeholderText", "Ingrese el apellido del usuario.");
        emailTxt.putClientProperty("JTextField.placeholderText", "Ingrese el email del usuario.");
    }

    private void isEdition() {

        if (isEdition) {
            title.setText("Editar Usuario");
            button.setText("Guardar");

            if (userEdition != null) {
                nameTxt.setText(userEdition.getName());
                apPTxt.setText(userEdition.getLastName());
                emailTxt.setText(userEdition.getEmail());
                domTxt.setText(userEdition.getAddress());
                phoneTxt.setText(userEdition.getTel());
            }
        }
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
        title = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        apPLbl = new javax.swing.JLabel();
        apPTxt = new javax.swing.JTextField();
        apMLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        domLbl = new javax.swing.JLabel();
        domTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        phoneLbl = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Registrar nuevo usuario");

        nameLbl.setText("Nombre");

        apPLbl.setText("Apellido");

        apMLbl.setText("Email");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        domLbl.setText("Domicilio");

        domTxt.setToolTipText("");

        button.setBackground(new java.awt.Color(204, 36, 75));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        phoneLbl.setText("Teléfono");

        phoneTxt.setToolTipText("");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apPLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apMLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(domLbl)
                    .addComponent(domTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(49, 49, 49)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(4, 4, 4)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(apPLbl)
                        .addGap(4, 4, 4)
                        .addComponent(apPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(apMLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(domLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(domTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String nombre = nameTxt.getText().trim();
        String apP = apPTxt.getText().trim();
        String email = emailTxt.getText().trim();
        String dom = domTxt.getText().trim();
        String tel = phoneTxt.getText().trim();

        // Validaciones para los campos, no deben estar vacíos
        if (nombre.isEmpty() || apP.isEmpty() || email.isEmpty() || dom.isEmpty() || tel.isEmpty()) {
            notificationService.showErrorNotification("Debe llenar todos los campos. \n");
            nameTxt.requestFocus();
            return;
        }
        // el email debe ser válido
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")){
            notificationService.showErrorNotification("Debe agregar un email válido. \n");
            return;
        }
        // el número de teléfono debe tener 10 dígitos
        if(!tel.matches("\\d{10}")){
            notificationService.showErrorNotification("Debe agregar un teléfono válido de 10 dígitos. \n");
            return;
        }

        models.Users user = isEdition ? userEdition : new models.Users();
        user.setName(nombre);
        user.setLastName(apP);
        user.setEmail(email);
        user.setAddress(dom);
        user.setTel(tel);

        try {

            if (!isEdition) {
                usersController.registerUser(user);
            } else {
                usersController.editUser(user);
            }

            String successMsg = isEdition ? "modificado" : "registrado";
            notificationService.showSuccessNotification("Usuario " + successMsg + " exitosamente.\n");

            if (!isEdition) {
                nameTxt.setText("");
                apPTxt.setText("");
                emailTxt.setText("");
                domTxt.setText("");
                phoneTxt.setText("");
            }

            Dashboard.ShowJPanel(new Users());
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            notificationService.showErrorNotification("Ocurrió un error al " + errorMsg + " el usuario. \n");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apMLbl;
    private javax.swing.JLabel apPLbl;
    private javax.swing.JTextField apPTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel domLbl;
    private javax.swing.JTextField domTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}