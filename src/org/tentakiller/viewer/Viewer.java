package org.tentakiller.viewer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;

import javax.swing.JButton;

import org.tentakiller.controller.Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.table.DefaultTableModel;

public class Viewer {
	
	Controller controller = new Controller();

	public JFrame frame;
	private JTable table_1;
	/**
	 * Create the application.
	 */
	public Viewer() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btnNewButton = new JButton("Show Students");
		JScrollPane scrollpane = new JScrollPane();
		
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		String[] COLUMNS = {"Id", "Name", "Email"};
		DefaultTableModel model = new DefaultTableModel(COLUMNS, 0); 
		table_1 = new JTable();
		table_1.setModel(model);
		frame.getContentPane().add(table_1, BorderLayout.CENTER);
		frame.getContentPane().add(scrollpane, BorderLayout.CENTER);
		scrollpane.setViewportView(table_1);
		
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			String[][] students = controller.getStudents();
			
			for(String[] s: students) {
				model.addRow(new Object[]{s[0], s[1], s[2]});
			}
		}
	});}
}
