package com.tal.zj.util;

/**
 * @Author 码农云帆哥
 * @Date 2017/11/18 16:57
 * @Description 命名工具包
 */
public class NameUtil {
    /**
     * @Author 码农云帆哥
     * @Date 2017/11/18 16:57
     * @Description 下划线转驼峰
     */
    public static String underlineToHump(String para){
        StringBuilder result=new StringBuilder();
        String a[]=para.split("_");
        for(String s:a){
            if (!para.contains("_")) {
                result.append(s);
                continue;
            }
            if(result.length()==0){
                result.append(s.toLowerCase());
            }else{
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
    /**
     * @Author 码农云帆哥
     * @Date 2017/11/18 16:57
     * @Description 驼峰转下划线
     */
    public static String humpToUnderline(String para){
        StringBuilder sb=new StringBuilder(para);
        int temp=0;//定位
        if (!para.contains("_")) {
            for(int i=0;i<para.length();i++){
                if(Character.isUpperCase(para.charAt(i))){
                    sb.insert(i+temp, "_");
                    temp+=1;
                }
            }
        }
        return sb.toString().toUpperCase();
    }
    /**
     * @Author ZhouJie
     * @Date 2019/1/30 20:18
     * @Description 首字符大小
     */
    public static String uppercaseFirstChar(String para) {
        if (Character.isLowerCase(para.charAt(0))) {
            char upperCaseFirstChar = Character.toUpperCase(para.charAt(0));
            para = new StringBuilder().append(Character.valueOf(upperCaseFirstChar)).append(para.substring(1)).toString();
        }
        return para;
    }
}
