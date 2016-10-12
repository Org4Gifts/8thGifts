package tw.youth.project.gift2016.sql;

import java.sql.Connection;
import java.util.ArrayList;

import tw.youth.project.gift2016.sql.aodr.AODR;

public class Operation {
	public static Connection conn;
	private String url;
	private String name;
	private String password;

	public Operation(String url, String name, String password) {
		this.url = url;
		this.name = name;
		this.password = password;
	}

	public boolean chkLogin() {
		conn = new DAO().getConn(url, name, password);
		return conn != null;
	}

	public ArrayList<AODR> getPresentList() {
		return null;
	}
}
