package com.m1;
import java.util.*;

public class GlobalShipmentManifestValidator {

    static boolean isLeap(int y){
        return (y%400==0) || (y%4==0 && y%100!=0);
    }

    static boolean validDate(String d){
        if(!d.matches("20\\d{2}-\\d{2}-\\d{2}")) return false;

        String[] p = d.split("-");
        int y = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int day = Integer.parseInt(p[2]);

        if(m<1 || m>12) return false;

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(m==2 && isLeap(y)) days[1] = 29;

        return day>=1 && day<=days[m-1];
    }

    static boolean validCode(String c){
        if(!c.matches("SHIP-[1-9]\\d{5}")) return false;

        String num = c.substring(5);
        int count = 1;

        for(int i=1;i<num.length();i++){
            if(num.charAt(i)==num.charAt(i-1)){
                count++;
                if(count>3) return false;
            }else{
                count=1;
            }
        }
        return true;
    }

    static boolean validWeight(String w){
        if(!w.matches("^(0|[1-9]\\d*)\\.\\d{2}$")) return false;

        double val = Double.parseDouble(w);
        return val<=999999.99;
    }

    public static void main(String[] args){

        Set<String> modes = Set.of("AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT");
        Set<String> status = Set.of("DELIVERED","CANCELLED","IN_TRANSIT");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){

            String s = sc.nextLine();
            String[] st = s.split("\\|");

            boolean ok = true;

            if(st.length!=5) ok=false;
            else{
                if(!validCode(st[0])) ok=false;
                if(!validDate(st[1])) ok=false;
                if(!modes.contains(st[2])) ok=false;
                if(!validWeight(st[3])) ok=false;
                if(!status.contains(st[4])) ok=false;
            }

            if(ok) System.out.println("COMPLIANT RECORD");
            else System.out.println("NON-COMPLIANT RECORD");
        }
    }
}