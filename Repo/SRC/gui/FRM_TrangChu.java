package gui;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;

public class FRM_TrangChu extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public FRM_TrangChu() {
		setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("LAMINALO GHI-TA");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 65));
		lblNewLabel_3.setBounds(290, 130, 850, 80);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("PHẦN MỀM QUẢN LÝ CÔNG TY");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 56));
		lblNewLabel_2.setBounds(280, 38, 900, 73);
		add(lblNewLabel_2);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FRM_TrangChu.class.getResource("/icons/BG.jpg")));
		lblNewLabel.setBounds(0, 0, 1450, 733);
		add(lblNewLabel);

	}
}
