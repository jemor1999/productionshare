package com.study.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String md5(String str) throws NoSuchAlgorithmException {
        String resoult = str;
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(resoult.getBytes());
        byte[] digest = md5.digest();
        resoult = new String(digest);
        return resoult;
    }
}
