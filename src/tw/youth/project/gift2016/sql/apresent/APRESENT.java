package tw.youth.project.gift2016.sql.apresent;

public class APRESENT {
	// 禮品基本檔
	private String FGNO;
	// 禮品編號
	private String FGNAME;
	// 禮品名稱
	private float PRC;
	// 禮品單價
	private byte GRADE;
	// 禮品等級
	private byte AUTHORITY;
	// 申請層級
	private String STATUS;
	// 申請狀態
	private String NOTE1;
	// 備註
	private long FQTY;
	// 安全庫存量
	private long IQTY; // auto
	// 即時庫存量

	public String getFGNO() {
		return FGNO;
	}

	public void setFGNO(String fGNO) {
		FGNO = fGNO;
	}

	public String getFGNAME() {
		return FGNAME;
	}

	public void setFGNAME(String fGNAME) {
		FGNAME = fGNAME;
	}

	public float getPRC() {
		return PRC;
	}

	public void setPRC(float pRC) {
		PRC = pRC;
	}

	public byte getGRADE() {
		return GRADE;
	}

	public void setGRADE(byte gRADE) {
		GRADE = gRADE;
	}

	public byte getAUTHORITY() {
		return AUTHORITY;
	}

	public void setAUTHORITY(byte aUTHORITY) {
		AUTHORITY = aUTHORITY;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getNOTE1() {
		return NOTE1;
	}

	public void setNOTE1(String nOTE1) {
		NOTE1 = nOTE1;
	}

	public long getFQTY() {
		return FQTY;
	}

	public void setFQTY(long fQTY) {
		FQTY = fQTY;
	}

	public long getIQTY() {
		return IQTY;
	}

	public void setIQTY(long iQTY) {
		IQTY = iQTY;
	}

}
