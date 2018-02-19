package org.mgqclub.mgbasemod.proxy;

public class ServerProxy implements CommonProxy{

	@Override
	public boolean isClient() {
		return false;
	}

}
