import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Geoform extends JFrame{

    private JPanel mainPanel;
    private JLabel pointA;
    private JTextField textfieldAlong;
    private JTextField textFieldlan;
    private JLabel pointB;
    private JTextField textFieldBlong;
    private JTextField textFieldBlan;
    private JButton buttonClear;
    private JButton buttonSolve;
    private JLabel result;
    private JTextField textResult;

    public Geoform(){
        JFrame frame = new JFrame();
        JTextField textField = new JTextField();

        frame.setTitle("Forma");
        frame.setSize(350,300);



        frame.add(mainPanel);
        frame.addWindowListener(new WindowAdapter() {


            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);

            }

        });


        frame.setVisible(true);



        buttonSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                calculateD();
            }
        });



        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfieldAlong.setText("0");
                textFieldlan.setText("0");

                textFieldBlong.setText("0");
                textFieldBlan.setText("0");

                textResult.setText("0");
            }
        });





    }


    private double laInRad(double lat){         // перевод широти із градусів в радіани
        double pi = Math.PI;
        double fi = lat * (pi/180);

        return fi;
    }

    private double deltaLanRad(double lan1, double lan2){           // розрахунок дельта довготи в родіанах
        double pi = Math.PI;
        double delta_lan = (lan2 - lan1)*(pi/180);

        return delta_lan;
    }


    private void calculateD()           // функція обчислення
    {

        double Along = Double.parseDouble(textfieldAlong.getText());
        double Alan =  Double.parseDouble(textFieldlan.getText());

        double Blong = Double.parseDouble(textFieldBlong.getText());
        double Blan = Double.parseDouble(textFieldBlan.getText());

        // double e = Math.E;
        //double R = 6371 * Math.pow(e, 3);

        double R =  6371;


        double D = R * Math.acos(  (Math.sin(laInRad(Along)) * Math.sin(laInRad(Blong))    ) + ( Math.cos(laInRad(Along)) *  Math.cos(laInRad(Blong)) * Math.cos(deltaLanRad(Alan,Blan))) );


        textResult.setText(""+D);

    }


    public static void main(String[] args) {
        Geoform fr = new Geoform();

    }
}





// Київ 50.27   30.31
// Львів 49.50  24.01
// відстань приблизно 460 км
