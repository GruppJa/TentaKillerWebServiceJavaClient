package org.tentakiller.main;

import java.awt.EventQueue;

import org.tentakiller.viewer.Viewer;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		
		public void run() {
			try {
				Viewer window = new Viewer();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	}
}


