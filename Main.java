package acm;

/**
 * name:李世豪
 * time:2020/3/11
 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] hash_table = new int[n]; // 开个长度为n的哈希表

		for (int i = 0; i < n; i++) {
			int temp = cin.nextInt();
			hash_table[temp]++;
			if (hash_table[temp] == 2) { // 发现第一个重复的数就行了，因为只要找一个
				System.out.println(temp);
				break;
			}
		}
	}
}
