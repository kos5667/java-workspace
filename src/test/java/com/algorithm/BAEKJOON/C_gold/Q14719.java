package com.algorithm.BAEKJOON.C_gold;

/**
 * 14719 빗물
 * 골드Ⅴ
 */
public class Q14719 {
    public static void main(String[] args) {
        int x=5,y = 5;

        int[][] box = new int[5][5];
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                box[i][j] = j;
            }
        }

        // for(int i=0; i<box.length; i++) {
        //     for(int j : box[i]) {
        //         System.out.print(i+","+j+" ");
        //     }
        //     System.out.println();
        // }
    }
}
