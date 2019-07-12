package com.IOFile;
import java.io.*;
/**
 * @author 王腾飞
 * @date 2019/7/2 13:53
 */
public class Tools {
        public   static String   findTxt(String  filePath)
        {
            String   s1="";
            File file=new  File(filePath);
            try {
                InputStream is=new FileInputStream(file);
                int len = 0;
                byte[] car = new byte[1024];
                while((len = is.read(car))!= -1) {    //3、操作：以每次car大小读取
                    String ss = new String(car,0,len);    // 将byte类型的数组转化成字符串，方便下面输出
                          s1=new String(car,0,len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  s1;
        }









}
