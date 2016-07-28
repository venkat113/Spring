package com.venkat;

public class SpringException extends RuntimeException {
	private String ecptionmsg;
public SpringException(String ecptionmsg) {
	// TODO Auto-generated constructor stub
	this.ecptionmsg=ecptionmsg;
}
public String getEcptionmsg() {
	return ecptionmsg;
}
public void setEcptionmsg(String ecptionmsg) {
	this.ecptionmsg = ecptionmsg;
}

}
