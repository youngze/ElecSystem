package com.young.elec.web.form;

import java.util.Date;

public class ElecTextForm {

	/**
	 * VO���󣬶�Ӧҳ���������ֵ
	 * VO�����PO����Ĺ�ϵ��
	 * 		��ͬ��: ����javabean
	 * 		��ͬ��: VO��������Կ�����
	 */

	private int textID;
	private String textName;
	private String textDate;
	private String textRemark;
	public int getTextID() {
		return textID;
	}
	public void setTextID(int textID) {
		this.textID = textID;
	}
	public String getTextName() {
		return textName;
	}
	public void setTextName(String textName) {
		this.textName = textName;
	}
	public String getTextDate() {
		return textDate;
	}
	public void setTextDate(String textDate) {
		this.textDate = textDate;
	}
	public String getTextRemark() {
		return textRemark;
	}
	public void setTextRemark(String textRemark) {
		this.textRemark = textRemark;
	}

}
