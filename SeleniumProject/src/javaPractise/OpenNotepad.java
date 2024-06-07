package javaPractise;

import java.io.IOException;
	
	public class OpenNotepad {
		@SuppressWarnings("deprecation")
		public static void main(String[] args){
		Runtime rs = Runtime.getRuntime();
		try{
		rs.exec("notepad");
		}
		catch (IOException e){
		System.out.println(e);
		}
		}
		}

