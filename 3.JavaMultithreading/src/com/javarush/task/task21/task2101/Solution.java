package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] a = new byte[4];

        for (int i = 0; i < ip.length; i++) {
            int z = ip[i] & 255;
            int x = mask[i] & 255;
            a[i] = (byte) (x & z);
        }
        return a;
    }

    public static void print(byte[] bytes) {
        String result = "";
        for (int i = 0; i < bytes.length; i++) {
            int x = bytes[i] & 255;
            int c;
            String a = "";
            while (x != 0) {
                c = x % 2;
                x /= 2;
                a = c + a;
            }


            for (int n = a.length(); n < 8; n++) {
                a = "0" + a;
            }
            result += " " + a + " ";
        }
        System.out.println(result);
    }
}
