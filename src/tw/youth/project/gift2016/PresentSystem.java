package tw.youth.project.gift2016;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.youth.project.gift2016.info.SystemInfo;
import tw.youth.project.gift2016.sql.Operation;

public class PresentSystem extends JFrame {

	public static void main(String[] args) {
		new PresentSystem().setVisible(true);
	}

	public PresentSystem() {
		System.out.println("Initial frame");
		getContentPane().setLayout(null);
		setTitle(String.format("%s - %s", SystemInfo.SYSNAME, SystemInfo.VERSION));
		setBounds(SystemInfo.POINT_X, SystemInfo.POINT_Y, SystemInfo.WIDTH, SystemInfo.HEIGHT);
	}

	public synchronized boolean login(String name, String password) {
		System.out.println("Initial login");
		return new Operation("localhost", name, password).chkLogin();
	}

	public synchronized boolean logout() {
		System.out.println("Initial logout");
		if (Operation.conn != null) {
			try {
				Operation.conn.close();
			} catch (SQLException e) {
				System.out.println("SQLException : " + e.getMessage());
			}
			Operation.conn = null;
		}
		return Operation.conn == null;
	}

	public void close() {
		System.exit(0);
	}
}
