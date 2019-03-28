package Apresentação;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Funcionalidade.ThreadDesliga;
import Funcionalidade.ThreadSuspender;
import Funcionalidade.Tempo;


public class SegundaTela extends JFrame {

	private Tempo timer = new Tempo();
	private JLabel NewLabel_1 = new JLabel(Integer.toString(timer.getHora()));
	private JLabel NewLabel_2 = new JLabel(Integer.toString(timer.getMinutos()));
	private JLabel NewLabel_3 = new JLabel(
			Integer.toString(timer.getSegundos()));

	private JPanel contentPane;

	public SegundaTela(Tempo timer) throws InterruptedException {
		this.timer = timer;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setDoubleBuffered(false);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel TimerAtivado = new JLabel("Vai desligar em");
		TimerAtivado.setForeground(SystemColor.BLUE);
		TimerAtivado.setAlignmentX(Component.CENTER_ALIGNMENT);
		TimerAtivado.setFont(new Font("Digital-7", Font.ITALIC, 60));
		TimerAtivado.setBounds(0, 11, 434, 101);
		contentPane.add(TimerAtivado);
		JLabel NewLabel = new JLabel();
		NewLabel.setBounds(40, 171, 46, 14);
		contentPane.add(NewLabel);
		NewLabel_1.setFont(new Font("Digital-7", Font.ITALIC, 80));
		NewLabel_1.setForeground(SystemColor.WHITE);
		NewLabel_1.setText(Integer.toString(timer.getHora()));
		NewLabel_1.setBounds(10, 164, 103, 75);
		contentPane.add(NewLabel_1);
		NewLabel_2.setFont(new Font("Digital-7", Font.ITALIC, 80));
		NewLabel_2.setForeground(SystemColor.WHITE);
		NewLabel_2.setText(Integer.toString(timer.getMinutos()));
		NewLabel_2.setBounds(147, 164, 111, 75);
		contentPane.add(NewLabel_2);
		NewLabel_3.setFont(new Font("Digital-7", Font.ITALIC, 80));
		NewLabel_3.setForeground(SystemColor.WHITE);
		NewLabel_3.setText(Integer.toString(timer.getSegundos()));
		NewLabel_3.setBounds(279, 164, 133, 75);
		contentPane.add(NewLabel_3);

		JLabel TempoRestante = new JLabel("Tempo Restante");
		TempoRestante.setForeground(SystemColor.BLUE);
		TempoRestante.setBounds(40, 123, 113, 14);
		contentPane.add(TempoRestante);

		JLabel H = new JLabel("H");
		H.setForeground(SystemColor.BLUE);
		H.setBounds(99, 193, 46, 20);
		contentPane.add(H);

		JLabel Min = new JLabel("MIN");
		Min.setForeground(SystemColor.BLUE);
		Min.setBounds(258, 193, 46, 20);
		contentPane.add(Min);

		JLabel Seg = new JLabel("SEG");
		Seg.setForeground(SystemColor.BLUE);
		Seg.setBounds(388, 193, 46, 20);
		contentPane.add(Seg);

	}

	public void contador() throws InterruptedException {
		new ThreadSuspender(1000, NewLabel_1, NewLabel_2, NewLabel_3, timer)
				.start();
		;

	}
}
