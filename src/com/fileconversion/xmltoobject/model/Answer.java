package com.fileconversion.xmltoobject.model;

public class Answer {

	private long id;
	private String answername;
	private String postedby;

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answername=" + answername + ", postedby=" + postedby + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedby() {
		return postedby;
	}

	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}

}
