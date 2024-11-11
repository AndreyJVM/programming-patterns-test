package org.vanier.view;

import org.vanier.controller.StudentRegistrationController;
import org.vanier.view.adminPanels.AdminMainMenuPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{
    private JPanel panelMain;
    private JButton teacherJButton;
    private JButton adminJButton;
    private JButton studentJButton;
    private JLabel welcomeLabel;


    public MainForm() {
        panelMain = new JPanel();
        welcomeLabel = new JLabel("Welcome to the School Management System, please select one of the following options to go to the given management menu");
        teacherJButton = new JButton("Teacher");
        adminJButton = new JButton("Admin");
        studentJButton = new JButton("Student");

        panelMain.add(welcomeLabel);
        // Add buttons to the panel
        panelMain.add(teacherJButton);
        panelMain.add(adminJButton);
        panelMain.add(studentJButton);

        this.setContentPane(panelMain);

        this.setTitle("Main Form");
        this.setSize(300, 200); // Adjust size as needed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        teacherJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherView teacherView= new TeacherView();
                teacherView.setVisible(true);
            }
        });


        adminJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminMainMenuPage adminMainMenuPage= new AdminMainMenuPage();
                adminMainMenuPage.setVisible(true);
            }
        });

        studentJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentRegistrationController();
            }
        });
    }


}