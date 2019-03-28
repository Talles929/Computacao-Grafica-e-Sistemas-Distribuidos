package Apresentação;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import Funcionalidade.ThreadDesliga;
import Funcionalidade.Tempo;


public class PrimeiraTela extends JFrame {
	JButton Salvar;
	private int horas;
	private int minutos;
	private int segundos;
	JSpinner horaSpinner = new JSpinner();
	JSpinner minutosSpinner = new JSpinner();
	JSpinner segundosSpinner = new JSpinner();
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public PrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.BLACK);
		contentPane.setBorder(new EmptyBorder(30, 30, 30, 30));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		horaSpinner.setForeground(Color.BLACK);
		horaSpinner.setToolTipText("");
		horaSpinner.setBackground(Color.BLACK);
		horaSpinner.setAlignmentY(Component.TOP_ALIGNMENT);
		horaSpinner.setFont(new Font("Digital-7", Font.ITALIC, 80));
		
		
		// gera a lista com os valores de hora, minuto e segundos
		this.horaSpinner.setModel(new SpinnerNumberModel(0, 0, 110, 1));
		this.horaSpinner.setBounds(10, 88, 98, 80);
		minutosSpinner.setFont(new Font("Digital-7", Font.ITALIC, 80));
		this.minutosSpinner.setModel(new SpinnerNumberModel(00, 00, 59, 1));
		this.minutosSpinner.setBounds(152, 88, 98, 80);
		segundosSpinner.setFont(new Font("Digital-7", Font.ITALIC, 80));
		this.segundosSpinner.setModel(new SpinnerNumberModel(00, 00, 59, 1));
		this.segundosSpinner.setBounds(293, 88, 98, 80);
		contentPane.add(this.horaSpinner);
		contentPane.add(this.minutosSpinner);
		contentPane.add(this.segundosSpinner);

		JLabel Digite = new JLabel("Desligando Computador");
		Digite.setBackground(Color.RED);
		Digite.setForeground(SystemColor.BLUE);
	    Digite.setFont(new Font("Digital-7", Font.ITALIC, 30));
		Digite.setBounds(42, 15, 371, 50);
		contentPane.add(Digite);

		JLabel Horas = new JLabel("H");
		Horas.setFont(new Font("Digital-7", Font.ITALIC, 25));
		Horas.setForeground(SystemColor.BLUE);
		Horas.setBounds(118, 120, 46, 50);
		contentPane.add(Horas);

		JLabel Minutos = new JLabel("MIN");
		Minutos.setForeground(SystemColor.BLUE);
		Minutos.setFont(new Font("Digital-7", Font.ITALIC, 25));
		Minutos.setBounds(260, 120, 46, 50);
		contentPane.add(Minutos);

		JLabel Segundos = new JLabel("SEC");
		Segundos.setForeground(SystemColor.BLUE);
		Segundos.setFont(new Font("Digital-7", Font.ITALIC, 25));
		Segundos.setBounds(397, 120, 60, 50);
		contentPane.add(Segundos);

		Salvar = new JButton("START");
		Salvar.setContentAreaFilled(true);
		Salvar.setBorderPainted(true);
		Salvar.setIcon(new ImageIcon("D:\3.png"));
		Salvar.setBounds(160, 253, 181, 80);
		// Ação quando clica no botão de SALVAR
		Salvar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Object obj = e.getSource();
				if (obj == Salvar) {

					// cria um timer
					Tempo timer = new Tempo();
					// cria a thread
					ThreadDesliga thread = new ThreadDesliga();
					// seta os valores do horario para desligar o computador, a
					// partir da entrada do spinner
					int horaValor =  (Integer) horaSpinner.getValue();
					int minutosValor = (Integer)  minutosSpinner.getValue();
					int segundosValor = (Integer) segundosSpinner.getValue();
					timer.cadastraHorario(horaValor, minutosValor,
							segundosValor);
					// gera a thread
					thread.geraTimer(timer);
					// gera a nova tela
					dispose();
					System.out.println(thread);
					SegundaTela frame;

					try {
						frame = new SegundaTela(timer);
						frame.setVisible(true);
						frame.contador();

					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		contentPane.add(Salvar);
	}
}
