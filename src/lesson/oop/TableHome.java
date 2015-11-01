package lesson.oop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Scanner;

public class TableHome {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Frame");
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JButton addButton=new JButton("Добавить");
        JButton deleteButton = new JButton("Удалить");
        JButton clearButton= new JButton("Очистить");

        Object[] headers = new Object[] {"#id", "title", "isbn", "description" };



        final DefaultTableModel dtm = new DefaultTableModel( new Object[][] {}, headers);
        JTable table=new JTable(dtm);
        JScrollPane tableScroll=new JScrollPane(table);
        tableScroll.setPreferredSize(new Dimension(400, 400));

        final String[] str = new String[4];
        str[0]="0";
        str[1]="Название";
        str[2]="34955";
        str[3]="Описание";

        for(int i=0;i<15;i++)
        {
            dtm.addRow(str);
        }

//        Scanner in = new Scanner(System.in);
//        DefaultTableModel dtm = new DefaultTableModel();
//        dtm.addRow(str);ghgedr ncnbwed


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String input = JOptionPane.showInputDialog(null,"Enter values separated by ';'");


                dtm.addRow( input.split(";") );

            }
        });


        frame.add(tableScroll, new GridBagConstraints(0, 0, 3, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));
        frame.add(addButton, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

        frame.add(deleteButton, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

        frame.add(clearButton, new GridBagConstraints(2,1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

        frame.setVisible(true);
        frame.pack();
    }
}