package estagio_dti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Index extends JFrame {
    private JTextField dateField;
    private JTextField smallDogsField;
    private JTextField largeDogsField;

    public Index() {
        setTitle("Input de Dados de Cães");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel dateLabel = new JLabel("Data:");
        dateField = new JTextField();
        JLabel smallDogsLabel = new JLabel("Número de cães pequenos:");
        smallDogsField = new JTextField();
        JLabel largeDogsLabel = new JLabel("Número de cães grandes:");
        largeDogsField = new JTextField();

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = dateField.getText();
                int smallDogs = Integer.parseInt(smallDogsField.getText());
                int largeDogs = Integer.parseInt(largeDogsField.getText());

                Petshop caninofeliz = new Petshop("Meu Canino Feliz", 2.0, 20, 40, 24, 48 ); //24 é 20 + 20% e 40 é igual a 40 + 20%
                Petshop vaiRex = new Petshop("Vai Rex", 1.7, 15, 50, 20, 55);
                Petshop chowChawgas = new Petshop("ChowChawgas", 0.8, 30, 45, 30, 45);

                Petshop[] petshops = {caninofeliz, vaiRex, chowChawgas};

                Petshop melhorPetshop = calcularMelhorPetshop(date, smallDogs, largeDogs, petshops);

                double custoTotal = melhorPetshop.calcularCustoTotal(date, smallDogs, largeDogs);
                JOptionPane.showMessageDialog(null, melhorPetshop.getNome() + " " + String.format("%.2f", custoTotal));
            }
        });

        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(smallDogsLabel);
        panel.add(smallDogsField);
        panel.add(largeDogsLabel);
        panel.add(largeDogsField);
        panel.add(new JLabel()); // espaço vazio
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Index();
    }

    public static Petshop calcularMelhorPetshop(String data, int pequenos, int grandes, Petshop[] petshops) {
        Petshop melhorPetshop = null;
        double menorCusto = Double.MAX_VALUE;

        for (Petshop petshop : petshops) {
            double custo = petshop.calcularCustoTotal(data, pequenos, grandes);
            if (custo < menorCusto || (custo == menorCusto && petshop.getDistancia() < (melhorPetshop != null ? melhorPetshop.getDistancia() : Double.MAX_VALUE))) {
                menorCusto = custo;
                melhorPetshop = petshop;
            }
        }

        return melhorPetshop;
    }
}

