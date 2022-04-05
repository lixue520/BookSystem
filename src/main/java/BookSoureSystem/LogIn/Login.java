/*
 * Created by JFormDesigner on Tue Apr 05 11:57:19 CST 2022
 */

package BookSoureSystem.LogIn;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

import BookSoureSystem.LogIn.LoginTools.MysqlCompare;
import com.jgoodies.forms.factories.*;

/**
 * @author unknown
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        title1 = compFactory.createTitle("\u56fe\u4e66\u7ba1\u7406\u7cfb\u7edfv1.0");
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Name:");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(60, 40), label1.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(140, 40, 130, textField1.getPreferredSize().height);

        //---- label2 ----
        label2.setText("password");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(60, 80), label2.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(140, 80, 130, textField2.getPreferredSize().height);
        contentPane.add(title1);
        title1.setBounds(new Rectangle(new Point(150, 10), title1.getPreferredSize()));

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addActionListener(a->{
            new MysqlCompare().MysqlPass(this);
                }
        );
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(105, 150), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u5fd8\u8bb0\u5bc6\u7801");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(195, 150), button2.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        //创建可视化/默认关闭/大小可调
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }



    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;

    public JLabel getLabel1() {
        return label1;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JLabel getTitle1() {
        return title1;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    private JLabel title1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //

}
