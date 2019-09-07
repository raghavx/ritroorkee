package com.ritroorkee;

public class Executive extends Manager implements Printable {
	private IPrinter printer;

	public void setPrinter(IPrinter printer) {
		this.printer = printer;

	}

	@Override
	public void print() {
		this.printer.print();

	}
}
