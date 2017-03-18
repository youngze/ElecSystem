package com.young.elec.web.action;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.young.elec.web.form.*;
import com.opensymphony.xwork2.*;

public class ElecTextAction extends ActionSupport implements ServletRequestAware, ModelDriven<ElecTextForm> {

	private ElecTextForm elecTextForm = new ElecTextForm();
	private HttpServletRequest request = null;
	
	public ElecTextForm getModel() {
		return elecTextForm;
	}	
	
	public String save() {
		System.out.println(request.getParameter("textName"));
		return "save";
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
}
