package com.IOFile;
import java.util.*;
/**
 *
 * @author 王腾飞
 * @date 2019/7/2 16:25
 */
public class TestProduct {
    public static void main(String[] args) {
        String  filePath="C:\\Users\\waitwind\\Desktop\\0702.txt";
        String   s1=Tools.findTxt(filePath);
        String s[]=s1.split(","+"\r?\n");
      //  System.out.println(s.length);
        String   s5[]=s1.split(",");
       // System.out.println(s5.length);
        List<Product> list1=new ArrayList<Product>();
        for (int i = 0; i <s.length ; i++) {
          //  System.out.print(s[0]);
            String  s2[]=s[i].split(",");
            Product p=new Product();
            p.setProductName(s2[0]);
            p.setPrice(Double.parseDouble(s2[1]));
            p.setType(s2[2]);
            p.setNum(Integer.parseInt(s2[3]));
            list1.add(p);
        }
        System.out.println("读取到该txt文档里面的数据为:");
        for(int k=0;k<list1.size();k++)
        {
            System.out.println(list1.get(k).getProductName()+"\t"+
                    list1.get(k).getPrice()+"\t"+
                    list1.get(k).getType()+"\t"+
                    list1.get(k).getNum() );
        }
        System.out.println("按照商品价格由低到高排序后的顺序:");
        Collections.sort(list1);
        //设置总的数量和为sum
        int  sum=0;
        double  TotalPrice=0;
        for (int n = 0; n <list1.size() ; n++) {
            sum=sum+list1.get(n).getNum();
            TotalPrice=TotalPrice+list1.get(n).getPrice()*list1.get(n).getNum();
            System.out.println(list1.get(n).getProductName()+"\t"+
                    list1.get(n).getPrice()+"\t"+
                    list1.get(n).getType()+"\t"+
                    list1.get(n).getNum() );
        }
        System.out.println("总的数量为:"+sum);
        System.out.println("这"+list1.size()+"种商品的总价格为:"+TotalPrice+"元");



    }
}
