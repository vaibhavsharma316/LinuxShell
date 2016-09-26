package com.example.linuxshell;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellExecuter {

	
	public String response(String comm)
	{
		StringBuffer sb=new StringBuffer();
		Process process;
		try {
		process=Runtime.getRuntime().exec(comm);
		process.waitFor();
		BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		
		while((line=reader.readLine())!=null)
		{
			
			sb.append(line+"\n");
			
			
		}
		
		
		
		
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
		
		
		return sb.toString();
		
	}
	
	
	
}
