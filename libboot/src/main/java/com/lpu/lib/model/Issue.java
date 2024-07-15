package com.lpu.lib.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Issue 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="isid")
	private int isid;
	@Column(name="isdate")
	private Date isDate;
	@Column(name="expretdate")
	private Date expRetDate;
	@Column(name="actretdate")
	private Date actRetDate;
	private int fine = 0;
	
	@OneToOne
	@JoinColumn(name = "bid")
	Book book;
	
	@OneToOne
	@JoinColumn(name = "roll")
	Student student;

	public Issue() {
		super();
	}	

	public Issue(int isid, Date isDate, Date expRetDate, Date actRetDate, int fine, Book book, Student student) {
		super();
		this.isid = isid;
		this.isDate = isDate;
		this.expRetDate = expRetDate;
		this.actRetDate = actRetDate;
		this.fine = fine;
		this.book = book;
		this.student = student;
	}


	public int getIsid() {
		return isid;
	}

	public void setIsid(int isid) {
		this.isid = isid;
	}

	
	public Date getIsDate() {
		return isDate;
	}

	public void setIsDate(Date isDate) {
		this.isDate = isDate;
	}

	public Date getExpRetDate() {
		return expRetDate;
	}



	public void setExpRetDate(Date expRetDate) {
		this.expRetDate = expRetDate;
	}



	public Date getActRetDate() {
		return actRetDate;
	}



	public void setActRetDate(Date actRetDate) {
		this.actRetDate = actRetDate;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Issue [isid=" + isid + ", isDate=" + isDate + ", expRetDate=" + expRetDate + ", actRetDate="
				+ actRetDate + ", fine=" + fine + "]";
	}

	
	
}
