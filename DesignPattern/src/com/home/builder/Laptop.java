package com.home.builder;

public class Laptop {

	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Laptop(LaptopBuilder builder) {
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.hdd = builder.hdd;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsEnabled = builder.isGraphicsEnabled;
	}

	public static class LaptopBuilder {
		private String ram;
		private String hdd;
		private String cpu;
		private boolean isGraphicsEnabled;
		private boolean isBluetoothEnabled;

		public LaptopBuilder(String ram, String hdd, String cpu) {
			super();
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
		}

		public LaptopBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}

		public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Laptop build() {
			return new Laptop(this);
		}
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

}
