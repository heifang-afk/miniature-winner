package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login{
    //定义
    JFrame jf=new JFrame("demo登陆界面");
    //定义窗口大小

    //组装视图
    public void init(){
        //设置窗口相关的的属性
        jf.setBounds(960,540,400,300);//设置窗口位置,大小
        jf.setResizable(false);

        JPanel jPanel=new JPanel();
        //设置窗口整体垂直布局的一个box
        Box vBox=Box.createVerticalBox();
        //组装用户名
        Box uBox=Box.createHorizontalBox();//水平的一个box
        JLabel uLabel=new JLabel("用户名：");
        JTextField uField=new JTextField(15);
        uBox.add(uLabel);
        uBox.add(Box.createHorizontalStrut(20));//设置两个组件之间一个水平的间隔
        uBox.add(uField);
        //组装密码
        Box pBox=Box.createHorizontalBox();
        JLabel pLabel=new JLabel("密    码：");
        JTextField pField=new JTextField(15);
        pBox.add(pLabel);
        pBox.add(Box.createHorizontalStrut(20));//设置两个组件之间一个水平的间隔
        pBox.add(pField);

        //组装按钮
        Box btnBox=Box.createHorizontalBox();
        JButton loginBtn=new JButton("登陆");
        JButton registBtn=new JButton("注册");

        btnBox.add(loginBtn);
        btnBox.add(Box.createHorizontalStrut(100));
        btnBox.add(registBtn);

        //把这三个box垂直组装在vBox里

        vBox.add(Box.createVerticalStrut(60));
        vBox.add(uBox);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(pBox);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(btnBox);

        jPanel.add(vBox);
        jf.add(jPanel);

        //登陆，注册按钮响应
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取用户在文本框输入的数据
                String username=uField.getText().trim();
                String password=pField.getText().trim();
                System.out.println(username);
                System.out.println(password);
                String u="123";
                String p="123456";
                //对照用户密码是否正确
                if (!u.equals(username)){
                    JOptionPane.showMessageDialog(null, "用户名错误","消息提示",JOptionPane.WARNING_MESSAGE);
                }
                else if (!p.equals(password)){
                    JOptionPane.showMessageDialog(null, "密码错误","消息提示",JOptionPane.WARNING_MESSAGE);
                }
                else {
                    //账号密码正确，隐藏原界面，跳转到主界面
                    jf.setVisible(false);
                    System.out.println("111");
                    new MainMenu().setMm();
                }

            }
        });
        //设置窗口可见
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login().init();
    }
}
