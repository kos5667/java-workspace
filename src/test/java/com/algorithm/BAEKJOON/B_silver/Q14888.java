package com.algorithm.BAEKJOON.B_silver;
import java.util.*;
import java.util.stream.IntStream;
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
        
        List<Integer> num_list = new ArrayList<Integer>();
        IntStream.range(0, n).forEach(i  -> {
            try {
                int num = Integer.parseInt(br.readLine());
                num_list.add(num);
            } catch (NumberFormatException | IOException e) {
                e.printStackTrace();
            }
        });

        List<Integer> opt_list = new ArrayList<Integer>();
        IntStream.range(0, 4).forEach(i  -> {
            try {
                int num = Integer.parseInt(br.readLine());
                opt_list.add(num);
            } catch (NumberFormatException | IOException e) {
                e.printStackTrace();
            }
        });
        
        if(opt_list.stream().mapToInt(Integer::intValue).sum() > o) {
            System.out.println("연산자는 n -1");
        }

        getSum(num_list, opt_list);

        br.close();
        bw.close();
    }

    public static String[] getSum(List<Integer> num_list, List<Integer> opt_list) {
        String a = "";
        for(int i=0; i < num_list.size() * opt_list.size(); i++) {
        }
        for(int i : num_list) {
            a += Integer.toString(i);
        }
        
        return null;
    }
    
    public static String[] getOperator(List<Integer> num_list, List<Integer> opt_list) {


        return null;
    }
}
