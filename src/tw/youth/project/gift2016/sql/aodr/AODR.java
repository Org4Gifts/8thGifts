package tw.youth.project.gift2016.sql.aodr;

public class AODR {
	// 訂單主檔
	private String ORDER1;
	// 訂單編號
	private int ODATE;
	// 訂定日期
	private String EMPNO;
	// 員工編號
	private long TAMT;
	// 訂單金額
	private char PURPOSE;
	// 需求目的

	public String getORDER1() {
		return ORDER1;
	}

	public void setORDER1(String oRDER1) {
		ORDER1 = oRDER1;
	}

	public int getODATE() {
		return ODATE;
	}

	public void setODATE(int oDATE) {
		ODATE = oDATE;
	}

	public String getEMPNO() {
		return EMPNO;
	}

	public void setEMPNO(String eMPNO) {
		EMPNO = eMPNO;
	}

	public long getTAMT() {
		return TAMT;
	}

	public void setTAMT(long tAMT) {
		TAMT = tAMT;
	}

	public char getPURPOSE() {
		return PURPOSE;
	}

	public void setPURPOSE(char pURPOSE) {
		PURPOSE = pURPOSE;
	}

}
