package com.cap.ems.utility;

public class FunctionResponse {
	private String status;
	
	private int EMP_ID;
	private int Mgr_Id;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public int getMgr_Id() {
		return Mgr_Id;
	}
	public void setMgr_Id(int mgr_Id) {
		Mgr_Id = mgr_Id;
	}

}
