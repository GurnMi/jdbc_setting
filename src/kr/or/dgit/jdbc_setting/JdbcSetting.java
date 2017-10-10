package kr.or.dgit.jdbc_setting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JdbcSetting extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnInit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JdbcSetting frame = new JdbcSetting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JdbcSetting() {
		setTitle("데이타베이스 세팅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnInit = new JButton(new BtnAction("초기화"));
		btnInit.addActionListener(this);
		contentPane.add(btnInit);
		
		JButton btnExport = new JButton(new BtnAction("백업"));
		contentPane.add(btnExport);
		
		JButton btnImport = new JButton(new BtnAction("복원"));
		contentPane.add(btnImport);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInit) {
			btnInitActionPerformed(e);
		}
	}
	protected void btnInitActionPerformed(ActionEvent e) {
	}
}
