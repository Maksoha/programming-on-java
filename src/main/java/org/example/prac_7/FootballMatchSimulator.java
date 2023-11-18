package org.example.prac_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulator extends JFrame implements ActionListener {
    private int milanScore = 0;
    private int madridScore = 0;
    private final JLabel resultLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;

    public FootballMatchSimulator() {
        setTitle("Football Match Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);

        setLayout(new GridLayout(4, 1));

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AC Milan")) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getActionCommand().equals("Real Madrid")) {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FootballMatchSimulator::new);
    }
}

