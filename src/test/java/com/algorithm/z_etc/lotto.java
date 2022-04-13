package com.algorithm.z_etc;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

public class lotto {

    public static void main(String[] args) throws ClientProtocolException, IOException {
        int[] lotto = getLottoNumber();
        int drwNo = 1000;
        while(true) {
            // int drwNo = new Scanner(System.in).nextInt();
            int[] lotto_his = getLottoHistory(Integer.toString(drwNo));
            if(compareLottoNumber(lotto, lotto_his)){
                break;
            } else {
                drwNo--;
            }

            if(drwNo == 990){
                break;
            }
            // if(compareLottoNumber(lotto, lotto_his)){
            //     break;
            // } else {
            //     drwNo--;
            // }
        }
        print(lotto);
    }

    @SuppressWarnings("unchecked")
    public static int[] getLottoHistory(String num) throws ClientProtocolException, IOException {
        String url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=" + num;
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        
        ResponseHandler<String> handler = new BasicResponseHandler();
        String body = handler.handleResponse(response);

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.readValue(body, Map.class);

        int[] lotto = new int[6];
        lotto[0] = (int) map.get("drwtNo1");
        lotto[1] = (int) map.get("drwtNo2");
        lotto[2] = (int) map.get("drwtNo3");
        lotto[3] = (int) map.get("drwtNo4");
        lotto[4] = (int) map.get("drwtNo5");
        lotto[5] = (int) map.get("drwtNo6");
        return lotto;
    }

    public static int[] getLottoNumber() {
        int Lotto[] = new int[6];
        int random = 0;

        for(int i=0; i<6; i++) {
            while(true) {
                random = (int) (Math.random() * 100 % 45);
    
                if(random == 0) 
                    continue;
    
                for(int j=0; j<Lotto.length; j++) {
                    if(random == Lotto[j])
                        continue;
                }
    
                break;
            }

            Lotto[i] = random;
        }

        Arrays.sort(Lotto);
        return Lotto;
    }

    public static boolean compareLottoNumber(int arr1[], int arr2[]) {
        int sa = 0;
        for(int i=0; i< arr1.length; i++) {
            for(int j=0; j< arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    sa++;
                } 
            }
        }

        if(sa >= 4) {
            return false;
        } else {
            return true;
        }
    }
    
    public static void print(int Lotto[]) {
        Arrays.sort(Lotto);
        for(int i=0; i< Lotto.length; i++) {
            System.out.print(Lotto[i] + " ");
        }
        System.out.println();
    }
}
