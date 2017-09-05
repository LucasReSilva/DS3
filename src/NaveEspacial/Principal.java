package NaveEspacial;

//classe que constroi os frames e menu, e inicia a fase.
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Principal extends JFrame {

    private Telainicial tela;
    private Nave nave;
    String linha;

    public Principal(int i) throws IOException {
        constroiMenuBar();
        constroiFase();
        configuraTela();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        new Telainicial().show();
    }

    private JMenuBar constroiMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opcoes");
        JMenuItem sobre = new JMenuItem("Sobre");
        sobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Projeto de POO UFS 2015 \nProf: Alberto Costa Neto \nAluno: Brenno Santana Soares\n\n"
                        + "       Comandos do jogo: \n"
                        + "Use a setas para guiar a nave \n Espaço "
                        + "para tiros Normais \n'Q' para tiros especiais\n "
                        + "Enter para reniciar \n" + "          Bom jogo!!",
                        "Informacoes", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        JMenuItem sair = new JMenuItem("Sair");
        sair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });
        JMenuItem record = new JMenuItem("Novo Jogo");
        record.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    new Telainicial().show();
                    dispose();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        menu.add(sobre);
        menu.add(new JSeparator());
        menu.add(sair);
        menu.add(new JSeparator());
        menu.add(record);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        return menuBar;

    }

    private JPanel constroiFase() throws IOException {
        Fase fase = new Fase(1);
        add(fase);
        return fase;

    }

    private JPanel Telainicial() {

        return null;

    }

    private void configuraTela() {
        setSize(800, 570);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Guerra no Espaço");

    }

}
