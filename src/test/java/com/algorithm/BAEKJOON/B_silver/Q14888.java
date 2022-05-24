package com.algorithm.BAEKJOON.B_silver;
import java.util.*;
import java.io.*;
/**
 * 14888 연산자 끼워넣기
 * 실버Ⅰ
 */
public class Q14888 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int o = n -1;

        String[] nb = br.readLine().split(" ");
        String[] ob = br.readLine().split(" ");
        List<String> list = new ArrayList<String>();
        for(int i=0; i<n+o; i++) {
            if(i % 2 == 0) {
            }
        }
        bw.close();
    }

    public static String[] getOperator() {
        return null;
    }
}
