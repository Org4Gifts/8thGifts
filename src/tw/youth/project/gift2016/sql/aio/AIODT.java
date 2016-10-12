package tw.youth.project.gift2016.sql.aio;

public class AIODT {
	// 多廠別進/銷副檔
	private String VHNO; // auto
	// 單據編號
	private String FGNO;
	// 禮品編號
	private int QTY;
	// 進銷數量
	private float PRC; // auto
	// 禮品單價
	private String ORDER1;
	// 訂單編號
	private String NOTE1;
	// 備註

	public String getVHNO() {
		return VHNO;
	}

	public void setVHNO(String vHNO) {
		VHNO = vHNO;
	}

	public String getFGNO() {
		return FGNO;
	}

	public void setFGNO(String fGNO) {
		FGNO = fGNO;
	}

	public int getQTY() {
		return QTY;
	}

	public void setQTY(int qTY) {
		QTY = qTY;
	}

	public float getPRC() {
		return PRC;
	}

	public void setPRC(float pRC) {
		PRC = pRC;
	}

	public String getORDER1() {
		return ORDER1;
	}

	public void setORDER1(String oRDER1) {
		ORDER1 = oRDER1;
	}

	public String getNOTE1() {
		return NOTE1;
	}

	public void setNOTE1(String nOTE1) {
		NOTE1 = nOTE1;
	}

}
