package com.myproject.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "announcement")
public class Announcement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long announcementId;
	String activity;
	String date;

	public Announcement() {
		super();
	}

	public Announcement(Long announcementId, String activity, String date) {
		super();
		this.announcementId = announcementId;
		this.activity = activity;
		this.date = date;
	}

	public Long getAnnouncementId() {
		return announcementId;
	}

	public void setAnnouncementId(Long announcementId) {
		this.announcementId = announcementId;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "announcement [announcementId=" + announcementId + ", activity=" + activity + ", date=" + date + "]";
	}

}
