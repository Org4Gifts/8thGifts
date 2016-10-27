package tw.youth.project.gift2016.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	@org.junit.Test
	public void test() throws SQLException {
		
		System.out.println(new Operation("jdbc:mysql://localhost:3306/", "odise", "116025").chkLogin());
		//	mydb1?useUnicode=true&characterEncoding=utf-8
        PreparedStatement ps = Operation.conn.prepareStatement("select * from cmdev.dept where deptno LIKE ?");
        ps.setString(1, "%" + "" + "%"); //% 模糊搜尋
               ResultSet rs = ps.executeQuery();
               while(rs.next()){
                   System.out.print(rs.getString(1)+" , ");
                   System.out.print(rs.getString(2)+" , ");
                   System.out.println(rs.getString(3));
               }
               //setAutoCommit(false) 自動更新取消
               //Statment addBatch() 加入batch
               //executeBatch 執行待寫入
               //conn.commit 執行批次上傳	
               
               //ResultSetMetaData 可以取得欄位的細節
               
               //交易 問題 
               //conn.rollback(savepoint) 回朔到指定點
               //使用在AutoCommit(false)的時候
               //Savepoint savepoint = conn.setSavepoint(); 設定save point
               //conn.commit();
               //conn.releaseSavepoint(savepoint); 釋放savepoint
               }

}
