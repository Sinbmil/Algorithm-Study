// 백준 Unrated - 10930(SHA-256)
// 문제링크: https://www.acmicpc.net/problem/10930

import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException  {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.getBytes());

        StringBuilder builder = new StringBuilder();
        for (byte b : md.digest()) {
            builder.append(String.format("%02x", b));
        }
        
        System.out.println(builder.toString());
    }
}
