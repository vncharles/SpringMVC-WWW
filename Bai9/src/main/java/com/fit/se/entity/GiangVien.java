package com.fit.se.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "GIANGVIEN")
public class GiangVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAGV")
	private int maGV;
	@Column(name = "TENGV")
	private String tenGV;
	@Column(name = "LINHVUCNGHIENCUU")
	private String linhVucNghienCuu;
	@Column(name = "DIENTHOAI")
	private String dienThoai;
	@Column(name = "EMAIL")
	private String email;
	
	public GiangVien(int maGV, String tenGV, String linhVucNghienCuu, String dienThoai, String email) {
		super();
		this.maGV = maGV;
		this.tenGV = tenGV;
		this.linhVucNghienCuu = linhVucNghienCuu;
		this.dienThoai = dienThoai;
		this.email = email;
	}

	public GiangVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMaGV() {
		return maGV;
	}

	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}

	public String getLinhVucNghienCuu() {
		return linhVucNghienCuu;
	}

	public void setLinhVucNghienCuu(String linhVucNghienCuu) {
		this.linhVucNghienCuu = linhVucNghienCuu;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "GiangVien [maGV=" + maGV + ", tenGV=" + tenGV + ", linhVucNghienCuu=" + linhVucNghienCuu
				+ ", dienThoai=" + dienThoai + ", email=" + email + "]";
	}
	
	
}
