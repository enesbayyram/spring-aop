package com.jforce.model;

public class Personel {

	private String isim;
	
	private String soyisim;
	
	private String maas;
	
	public Personel() {

	}

	public Personel(String isim, String soyisim, String maas) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}
	
	public void personelInfo()
	{
		System.out.println("İsim    : " + getIsim());
		System.out.println("Soyisim :"+  getSoyisim());
		System.out.println("Maaş    :" + getMaas());
	}
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getMaas() {
		return maas;
	}

	public void setMaas(String maas) {
		this.maas = maas;
	}
}
