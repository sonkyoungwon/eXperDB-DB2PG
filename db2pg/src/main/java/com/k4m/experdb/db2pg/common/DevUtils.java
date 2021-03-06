package com.k4m.experdb.db2pg.common;


public class DevUtils {
	public final static String[] BackSlashSequence = {"\0","\\","\t","\r","\n", "\b", "\013"};
	public final static String[] BackSlashSequenceReplace = {"","\\\\","\\t","\\r","\\n", "\\b", "\\v"};
	
	
	public static String replaceEach(String string, String[] org, String[] replacements) {
		if (string == null) return null;
	    StringBuilder sb = new StringBuilder(string);
	    for (int i=0; i <= org.length - 1; i++) {
	        String key = org[i];
	        String value = replacements[i];

	        int start = sb.indexOf(key, 0);
	        while (start > -1) {
	            int end = start + key.length();
	            int nextSearchStart = start + value.length();
	            sb.replace(start, end, value);
	            start = sb.indexOf(key, nextSearchStart);
	        }
	    }
	    return sb.toString();
	}
	
	
	public static String classifyString(String str,String type) {
		String convStr = null;
		type = type.toLowerCase();
		if(str != null) {
			if(type.equals("capital")) {
				convStr = str.toUpperCase();
			} else if (type.equals("small")) {
				convStr = str.toLowerCase();
			} else {
				convStr = str;
			}
		} else {
			convStr = "";
		}
		return convStr;
	}
	
}
