package tw.youth.project.gift2016.sql.aio;

public class AIO {
	// 多廠別進/銷主檔
	private String VHNO;
	// 單據編號
	private String FNO;
	// 廠別
	private int VHDT;
	// 單據日期
	private String ANO;
	// 單位編號
	private char DC; // ?
	// 進/銷
	private float TAMT;
	// 進銷金額
	private String MEMO;
	// 調撥理由

	public String getVHNO() {
		return VHNO;
	}

	public void setVHNO(String vHNO) {
		VHNO = vHNO;
	}

	public String getFNO() {
		return FNO;
	}

	public void setFNO(String fNO) {
		FNO = fNO;
	}

	public int getVHDT() {
		return VHDT;
	}

	public void setVHDT(int vHDT) {
		VHDT = vHDT;
	}

	public String getANO() {
		return ANO;
	}

	public void setANO(String aNO) {
		ANO = aNO;
	}

	public char getDC() {
		return DC;
	}

	public void setDC(char dC) {
		DC = dC;
	}

	public float getTAMT() {
		return TAMT;
	}

	public void setTAMT(float tAMT) {
		TAMT = tAMT;
	}

	public String getMEMO() {
		return MEMO;
	}

	public void setMEMO(String mEMO) {
		MEMO = mEMO;
	}

}
