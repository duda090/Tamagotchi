import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TamagotchiGUI {
    private Tamagotchi tamagotchi;
    private JFrame frame;
    private JTextArea textArea;
    private JButton alimentarButton;
    private JButton brincarButton;
    private JButton dormirButton;
    private JButton verificarStatusButton;
    private JButton eventoAleatorioButton;
    private Timer timer;

    public TamagotchiGUI() {
        tamagotchi = new Tamagotchi();
        frame = new JFrame("Tamagotchi");
        textArea = new JTextArea(10, 30);
        alimentarButton = new JButton("Alimentar");
        brincarButton = new JButton("Brincar");
        dormirButton = new JButton("Dormir");
        verificarStatusButton = new JButton("Verificar Status");
        eventoAleatorioButton = new JButton("Evento Aleatório");

        // Configurações do JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(new JScrollPane(textArea));
        frame.add(alimentarButton);
        frame.add(brincarButton);
        frame.add(dormirButton);
        frame.add(verificarStatusButton);
        frame.add(eventoAleatorioButton);

        // Configurações do JTextArea
        textArea.setEditable(false);
        textArea.setText("Tamagotchi inicializado!");

        // Ações dos botões
        alimentarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamagotchi.alimentar();
                atualizarStatus();
            }
        });

        brincarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamagotchi.brincar();
                atualizarStatus();
            }
        });

        dormirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamagotchi.dormir();
                atualizarStatus();
            }
        });

        verificarStatusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarStatus();
            }
        });

        eventoAleatorioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamagotchi.eventoAleatorio();
                atualizarStatus();
            }
        });

        // Exibe o JFrame
        frame.pack();
        frame.setVisible(true);

        // Timer para aumentar a idade periodicamente
        timer = new Timer(5000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamagotchi.aumentarIdadePeriodicamente();  // Aumenta a idade a cada 5 segundos
                atualizarStatus();
            }
        });
        timer.start();
    }

    // Método para atualizar o status na interface gráfica
    private void atualizarStatus() {
        textArea.setText(tamagotchi.verificarStatus());
    }

    public static void main(String[] args) {
        new TamagotchiGUI();
    }
}
