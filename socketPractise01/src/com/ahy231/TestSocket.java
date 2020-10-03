package com.ahy231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class TestSocket {
	
	private static final int range_max = 255;

    public static void main(String[] args) throws IOException {
    	
    	InetAddress host = InetAddress.getLocalHost();
    	String ip = host.getHostAddress();
    	String rowIp = ip.replaceAll("\\.[^\\.]{1,3}$", ".");
    	List<String> resultSet = new ArrayList<String>();
    	
    	for (int piece = 1; piece < range_max; piece++) {
    		Process p = Runtime.getRuntime().exec("ping " + rowIp + piece);
    		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
    		String line = null;
    		StringBuilder sb = new StringBuilder();
    		while ((line = br.readLine()) != null) {
				if (line.length() > 0) {
					sb.append(line);
				}
			}
    		if (sb.toString().matches(".*字节=32.*")) {
    			resultSet.add(String.valueOf(piece));
    		}
    		System.out.println("已经完成：" + piece + "个ip测试");
    	}
    	
    	System.out.println("如下ip地址可以连接");
    	for (int round = 0; round < resultSet.size(); round++) {
    		System.out.println(rowIp + resultSet.get(round));
    	}
    	System.out.println("总共有：" + resultSet.size() + "个地址");
    }
}
