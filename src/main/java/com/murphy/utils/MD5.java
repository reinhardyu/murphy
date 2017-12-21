package com.murphy.utils;

import java.security.MessageDigest;

/**
 * @author 杨成雨
 * @create 2017-12-20 9:39
 */
public class MD5 {
    private static String[] hexDigits = new String[]{"0", "a", "1", "b", "2", "c", "3", "d", "4", "e", "5", "f", "6", "g", "7", "h"};

    public MD5() {
    }

    public static String createPassword(String inputstr) {
        return encodeByMD5(inputstr);
    }

    public static boolean validatorPassword(String pass, String inputstr) {
        return pass.equals(encodeByMD5(inputstr));
    }

    private static String encodeByMD5(String originstr) {
        if(originstr != null) {
            try {
                MessageDigest ex = MessageDigest.getInstance("MD5");
                byte[] results = ex.digest(originstr.getBytes());
                String resultString = byteArrayToHexString(results);
                return resultString.toUpperCase();
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

        return null;
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultsb = new StringBuffer();
        boolean i = false;

        for(int var3 = 0; var3 < b.length; ++var3) {
            resultsb.append(byteToHexString(b[var3]));
        }

        return resultsb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if(b < 0) {
            n = b + 256;
        }

        int d1 = n / 32;
        int d2 = n / 16;
        return hexDigits[d1] + hexDigits[d2];
    }
}

