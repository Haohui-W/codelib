package com.github.haohuiw.test_only.test01;
import java.util.*;
/**
 * @author Haohui
 */
public class CSV {

    public static void main(String[] args) {
        System.out.println(new CSV().parseCsvLine("2, Kate, '''HaiDian'',''Beijing''' ,Shopping, 49.6, 1979-12-56"));
    }

    public ArrayList<String> parseCsvLine(String lineContent) {
        // write code here
        char[] chars = lineContent.toCharArray();
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(chars);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\'') {
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    i++;
                    if (chars[i] == '\'' && chars[i + 1] != '\'') {
                        arrayList.add(stringBuilder.toString());
                        break;
                    }
                    if (chars[i] == '\'' && chars[i + 1] == '\'') {
                        i++;
                    }
                    stringBuilder.append(chars[i]);
                }
            } else if (chars[i] != ' ' && chars[i] != ',') {
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    if (i >= chars.length || chars[i] == ',') {
                        arrayList.add(stringBuilder.toString());
                        break;
                    }
                    stringBuilder.append(chars[i]);
                    i++;
                }
            }
        }
        return arrayList;
    }
}