package com.pritam.designpatter101.solid.dependencyinversion.start;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
