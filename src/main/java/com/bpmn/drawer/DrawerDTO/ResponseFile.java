package com.bpmn.drawer.DrawerDTO;

public class ResponseFile {
	  private String name;
	  private String url;
	  
	public ResponseFile(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public ResponseFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
