package lesson.oop;


import javax.swing.*;

public class TableExsamp extends JFrame {

    public TableExsamp(){
        setSize(640, 480);
        setTitle("TableExamle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Object[] headers={"¹","col","col2"};
        Object[][] data={{"1","fghj","hgfds"},{"2","hgfds","hgfds"},{"3","hgfd","hgfd"},{"3","hgfd","hgfd"},{"3","hgfd","hgfd"},{"3","hgfd","hgfd"}

        };
        JTable table=new JTable(data, headers);
        JScrollPane scrollPane=new JScrollPane(table);
        add(scrollPane);
    }
    public static void main(String[] args) {
        TableExsamp tableExsamp=new TableExsamp();
        tableExsamp.setVisible(true);



        //JOptionalPane

    }
}
