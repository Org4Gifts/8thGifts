package tw.youth.project.gift2016.sql.ainventory;

public class AINVENTORY {
	// 多廠別盤存檔
	private String INVO;
	// 盤點單號
	private String FNO;
	// 儲存廠別
	private int YYMM;
	// 資料年月
	private String FGNO;
	// 禮品編號
	private long IVQTY;
	// 盤點數量
	private long SQTY; // auto
	// 系統數量

	public String getINVO() {
		return INVO;
	}

	public void setINVO(String iNVO) {
		INVO = iNVO;
	}

	public String getFNO() {
		return FNO;
	}

	public void setFNO(String fNO) {
		FNO = fNO;
	}

	public int getYYMM() {
		return YYMM;
	}

	public void setYYMM(int yYMM) {
		YYMM = yYMM;
	}

	public String getFGNO() {
		return FGNO;
	}

	public void setFGNO(String fGNO) {
		FGNO = fGNO;
	}

	public long getIVQTY() {
		return IVQTY;
	}

	public void setIVQTY(long iVQTY) {
		IVQTY = iVQTY;
	}

	public long getSQTY() {
		return SQTY;
	}

	public void setSQTY(long sQTY) {
		SQTY = sQTY;
	}

}
