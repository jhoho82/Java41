package net.bitacademy.java41.step10.test2.ex4;

import net.bitacademy.java41.util.MichelinTire;

public class MichelinTireAdapter implements Tire{
	MichelinTire tire;
	
	public MichelinTireAdapter(MichelinTire otherTire) {
		this.tire = otherTire;
	}
	@Override
	public String getMaker() {
		return tire.getCorp();
	}
	
	@Override
	public double getDiameter() {
		return tire.getRadius() * 2;
	}
	
	@Override
	public String getDotNo() {
		return tire.getMadeDate();
	}
}







