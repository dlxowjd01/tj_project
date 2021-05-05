package com.tj.project.model;

public class ProgrammingVO {
	/** 번호 */
	private int pno;

	/** 이름 */
	private String writer;

	/** 제목 */
	private String subject;

	/** 사용여부 */
	private String contents;

	/** 등록 */
	private String nowdate;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getNowdate() {
		return nowdate;
	}

	public void setNowdate(String nowdate) {
		this.nowdate = nowdate;
	}
}
