package tw.youth.project.gift2016.sql.aqty;

public class AQTY {//
	// 多廠別進/銷彙總檔
	private int YYMM; // auto
	// 資料年月
	private String FNO; // auto
	// 廠別
	private String FGNO; // auto
	// 禮品編號
	private long PMQTY; // auto
	// 期初數量
	private long INQTY; // auto
	// 本月進貨
	private long UDQTY; // auto
	// 本月銷貨

	public int getYYMM() {
		return YYMM;
	}

	public void setYYMM(int yYMM) {
		YYMM = yYMM;
	}

	public String getFNO() {
		return FNO;
	}

	public void setFNO(String fNO) {
		FNO = fNO;
	}

	public String getFGNO() {
		return FGNO;
	}

	public void setFGNO(String fGNO) {
		FGNO = fGNO;
	}

	public long getPMQTY() {
		return PMQTY;
	}

	public void setPMQTY(long pMQTY) {
		PMQTY = pMQTY;
	}

	public long getINQTY() {
		return INQTY;
	}

	public void setINQTY(long iNQTY) {
		INQTY = iNQTY;
	}

	public long getUDQTY() {
		return UDQTY;
	}

	public void setUDQTY(long uDQTY) {
		UDQTY = uDQTY;
	}

}
