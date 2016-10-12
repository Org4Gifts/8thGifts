package tw.youth.project.gift2016.sql.aodr;

public class AODRDT {
	// 訂單副檔
	private String ORDER1;
	// 訂單編號
	private String FGNO;
	// 產品代號
	private long QTY;
	// 產品數量
	private float PRC;
	// 產品單價
	private String NOTE1;
	// 備註
	private long OQTY; // auto
	// 已出貨量

	public String getORDER1() {
		return ORDER1;
	}

	public void setORDER1(String oRDER1) {
		ORDER1 = oRDER1;
	}

	public String getFGNO() {
		return FGNO;
	}

	public void setFGNO(String fGNO) {
		FGNO = fGNO;
	}

	public long getQTY() {
		return QTY;
	}

	public void setQTY(long qTY) {
		QTY = qTY;
	}

	public float getPRC() {
		return PRC;
	}

	public void setPRC(float pRC) {
		PRC = pRC;
	}

	public String getNOTE1() {
		return NOTE1;
	}

	public void setNOTE1(String nOTE1) {
		NOTE1 = nOTE1;
	}

	public long getOQTY() {
		return OQTY;
	}

	public void setOQTY(long oQTY) {
		OQTY = oQTY;
	}

}
