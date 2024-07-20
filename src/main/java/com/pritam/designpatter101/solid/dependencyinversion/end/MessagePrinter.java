package com.pritam.designpatter101.solid.dependencyinversion.end;

import com.pritam.designpatter101.solid.dependencyinversion.start.Formatter;
import com.pritam.designpatter101.solid.dependencyinversion.start.JSONFormatter;
import com.pritam.designpatter101.solid.dependencyinversion.start.Message;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter();//creates formatter
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
		}
	}
}
