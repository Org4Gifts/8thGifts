package tw.youth.project.gift2016.sql;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		
		new Operation("jdbc:mysql://localhost:3306/", "root", "123456").chkLogin();
	}

}
