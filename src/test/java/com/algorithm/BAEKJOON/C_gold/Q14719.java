package com.algorithm.BAEKJOON.C_gold;

import java.util.Scanner;

/**
 * 14719 빗물
 * 골드Ⅴ
 */
public class Q14719 {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int h = scan.nextInt(), w = scan.nextInt();

            int[] block = new int[w];
            for(int i=0; i<w; i++) {
                block[i] = scan.nextInt();
            }
            
            int[][] box = new int[h][w];
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    box[i][j] = j;
                }
            }

            for(int i=0; i<box.length; i++) {
                for(int j : box[i]) {
                    System.out.print("□ ");
                    System.out.print("■ ");
                }
                System.out.println();
            }
        }
        
    }
}
