package com.xrtb.commands;

import com.xrtb.bidder.Controller;

/**
 * A class that implements the shutdown notice sent to ZeroMQ if the bidder is getting ready to exit.
 * @author Ben M. Faul
 *
 */
public class ShutdownNotice extends BasicCommand {
	/**
	 * Empty constructor 
	 */
	public ShutdownNotice() {
		this.cmd = Controller.SHUTDOWNNOTICE;
		msg = "Shutdown notice from this bidder";
		name = "ShutDownNotice";
	}
	
	public ShutdownNotice(String who) {
		this();
		from = who;
	}
	
}
