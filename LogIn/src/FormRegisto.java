
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.isWhitespace;
import javax.swing.JOptionPane;

public class FormRegisto extends javax.swing.JFrame {

    public FormRegisto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctxRePassword = new javax.swing.JPasswordField();
        ctxPassword = new javax.swing.JPasswordField();
        ctxNome = new javax.swing.JTextField();
        ctxEmail = new javax.swing.JTextField();
        ctxMorada = new javax.swing.JTextField();
        ctxNIF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ctxTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de Registo de Utilizadores");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Email");

        jLabel2.setText("Nome");

        jLabel3.setText("NIF");

        jLabel4.setText("Morada");

        jLabel5.setText("Password");

        jLabel6.setText("Re-Password");

        ctxRePassword.setText("111111111");

        ctxPassword.setText("111111111");

        ctxNome.setText("Utilizador");

        ctxMorada.setText("Sitio");
        ctxMorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxMoradaActionPerformed(evt);
            }
        });

        ctxNIF.setText("111111111");

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("Validar Dados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registo de Utilizador");

        jLabel8.setText("Telefone");

        ctxTelefone.setText("111111111");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctxPassword)
                            .addComponent(ctxNIF)
                            .addComponent(ctxMorada)
                            .addComponent(ctxEmail)
                            .addComponent(ctxNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctxRePassword)
                            .addComponent(ctxTelefone))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(ctxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ctxMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ctxNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(ctxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ctxRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log = new Login();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void mensagemErro(String erro) {
        JOptionPane.showMessageDialog(null, erro, "Erro Validação", JOptionPane.ERROR_MESSAGE);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nome = ctxNome.getText();
        String email = ctxEmail.getText();
        String morada = ctxMorada.getText();
        String nif = ctxNIF.getText();
        String telefone = ctxTelefone.getText();
        String pass = ctxPassword.getText();
        String rePass = ctxRePassword.getText();
        if (nome.equals("") || email.equals("")
                || morada.equals("") || telefone.equals("")
                || nif.equals("") || pass.equals("") || rePass.equals("")) {
            mensagemErro("Preencha todos os campos");
        } else {
            if (!validaCampoNumerico(telefone)) {
                mensagemErro("O Campo telefone tem" + "de ser numerico com 9 digitos");
            }
            if (!validaCampoNumerico(nif)) {
                mensagemErro("O Campo nif tem" + " de ser numerico com 9 digitos");
            }
            if (!validaCampoString(nome)) {
                mensagemErro("O nome tem de ter somente caracteres");
            }
            if (!validaCampoString(morada)) {
                mensagemErro("A morada tem de ter somente caracteres");
            }
            if (!validaCampoEmail(email)) {
                mensagemErro("Email Inválido");
            }
            if (!validaCampoPass(pass)) {
                mensagemErro("A pass tem" + "de ser numerico com 8 caracteres");
            }
            if (!pass.equals(rePass)) {
                mensagemErro("A rePass tem" + " de ser Identica a Pass");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ctxMoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxMoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxMoradaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegisto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctxEmail;
    private javax.swing.JTextField ctxMorada;
    private javax.swing.JTextField ctxNIF;
    private javax.swing.JTextField ctxNome;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JPasswordField ctxRePassword;
    private javax.swing.JTextField ctxTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private boolean validaCampoNumerico(String valor) {
        int x, contador = 0, t = valor.length();
        char c;
        if (t != 9) {
            return false;
        } else {
            for (x = 0; x < t; x++) {
                c = valor.charAt(x);
                if (isDigit(c)) {
                    contador++;
                } else {
                    return false;
                }
            }
            if (t != contador) {
                return false;
            }
        }

        return true;
    }

    private boolean validaCampoString(String valor) {
        int x, contador = 0, t = valor.length();
        char c;
        if (t <= 2) {
            return false;
        } else {
            for (x = 0; x < t; x++) {
                c = valor.charAt(x);
                if (isLetter(c)) {
                    contador++;
                } else {
                    return false;
                }
            }
            if (t != contador) {
                return false;
            }
        }

        return true;
    }

    private boolean validaCampoEmail(String valor) {
        int x = 0, t = valor.length();
        char c;
        int arroba = valor.indexOf("@");
        int ponto = valor.indexOf(".com");
        int arrobaEspaço = valor.indexOf(' ');
        if (t <= 2) {
            return false;
        } else {
            for (x = 0; x < t; x++) {
                c = valor.charAt(x);
                if (arroba <= 0) {
                    mensagemErro("Falta o @");
                    return false;
                }
                if (arrobaEspaço > 0) {
                    mensagemErro("Espaço Vazio");
                    return false;
                }
                if (ponto < arroba) {
                    mensagemErro("Falta o .com");
                    return false;
                } else if (arrobaEspaço == ponto) {
                    mensagemErro("@.com ");
                    return false;
                }
            }
            return true;
        }
    }

    private boolean validaCampoPass(String valor) {
        int x = 0, t = valor.length();
        int contadorM = 0;
        int contadorm = 0;
        int contadorn = 0;
        int contadoresp = 0;
        char c;
        if (t < 8) {
            return false;
        } else {
            for (x = 0; x < t; x++) {
                c = valor.charAt(x);
                if (isUpperCase(c)) {
                    contadorM++;
                }
                if (isLowerCase(c)) {
                    contadorm++;
                }
                if (isDigit(c)) {
                    contadorn++;
                }
                if (!isDigit(c) && !isLetter(c)) {
                    contadoresp++;
                }
            }
            System.out.println(contadorM);
            System.out.println(contadorm);
            System.out.println(contadorn);
            System.out.println(contadoresp);
            if ((contadorM > 0) && (contadorm > 0) && (contadorn > 0) && (contadoresp > 0)) {
                return true;
            } else {
                return false;
            }
        }

    }
}
