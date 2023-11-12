package com.fit.se.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DETAI")
public class DeTai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MADETAI")
	private int maDeTai;
	@Column(name = "TENDETAI")
	private String tenDeTai;
	@Column(name = "NAM")
	private int nam;
	@Column(name = "MOTADETAI")
	private String moTaDeTai;
	@Column(name = "URLHINH")
	private String urlHinh;
	
	@ManyToOne
	@JoinColumn(name = "MAGV")
	private GiangVien giangVien;
}
