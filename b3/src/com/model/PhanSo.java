package com.model;

public class PhanSo {
	/*
	 * câu a
	 */
	private int TuSo;
	private int MauSo;
	
	public int getTuSo() {
		return TuSo;
	}
	public void setTuSo(int tuSo) {
		TuSo = tuSo;
	}
	public int getMauSo() {
		return MauSo;
	}
	public void setMauSo(int mauSo) {
		MauSo = mauSo;
	}
	
	public void fixPhanSo() {
		if(this.getMauSo() == 0) {
			this.setTuSo(1);
			this.setMauSo(1);
			return;
		}
		int tu = this.getTuSo();
		int mau = this.getMauSo();
		while(mau != 0) {
			int temp = tu % mau;
			tu = mau;
			mau = temp;
		}
		int gcd = tu;
		if( gcd != 0) {
			this.setTuSo(this.getTuSo()/gcd);
			this.setMauSo(this.getMauSo()/gcd);
		}
	}
	
	public PhanSo() {
		this.TuSo = 1;
		this.MauSo = 1;
	}
	
	public PhanSo(int _TuSo, int _MauSo) {
		this.TuSo = _TuSo;
		this.MauSo = _MauSo;
		this.fixPhanSo();
	}
	
	/*
	 * Câu b
	 */
	public PhanSo addPhanSo(PhanSo _ps) {
		PhanSo ans = new PhanSo();
		ans.setTuSo(this.getTuSo() * _ps.getMauSo() + this.getMauSo() * _ps.getTuSo());
		ans.setMauSo(this.getMauSo() * _ps.getMauSo());
		this.fixPhanSo();
		return ans;
	}
	
	public PhanSo subPhanSo(PhanSo _ps) {
		PhanSo ans = new PhanSo();
		ans.setTuSo(this.getTuSo() * _ps.getMauSo() - this.getMauSo() * _ps.getTuSo());
		ans.setMauSo(this.getMauSo() * _ps.getMauSo());
		this.fixPhanSo();
		return ans;
	}
	
	public PhanSo mulPhanSo(PhanSo _ps) {
		PhanSo ans = new PhanSo();
		ans.setTuSo(this.getTuSo() *  _ps.getTuSo());
		ans.setMauSo(this.getMauSo() * _ps.getMauSo());
		this.fixPhanSo();
		return ans;
	}
	
	public PhanSo divPhanSo(PhanSo _ps) {
		PhanSo ans = new PhanSo();
		ans.setTuSo(this.getTuSo() * _ps.getMauSo());
		ans.setMauSo(this.getMauSo() * _ps.getTuSo());
		this.fixPhanSo();
		return ans;
	}
	
	/*
	 * Câu c
	 */
	public boolean Equals(PhanSo _ps) {
		return (this.getTuSo() * _ps.getMauSo() == this.getMauSo() * _ps.getTuSo());
	}
}
