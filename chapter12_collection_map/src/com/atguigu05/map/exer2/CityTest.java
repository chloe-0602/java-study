package com.atguigu05.map.exer2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName: CityTest
 * Package: com.atguigu05.map.exer2
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 10:09
 * @Version 1.0
 */
public class CityTest {
    @Test
    public void test1(){
        Map cities = CityMap.model;
        for (Object obj : cities.keySet()) {
            System.out.print(obj + "\t\t");
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        l: while (true){
            System.out.println("请输入你所在的省份: ");
            String city = scanner.next();
            String[] provinces = (String[]) cities.get(city);

            if(provinces == null ||provinces.length ==0){

                System.out.println("你输入的信息有误，请重新输入！");
                continue;
            }

            for (int i = 0; i < provinces.length; i++) {
                System.out.print(provinces[i] +"\t\t");
            }
            System.out.println();
            System.out.println("请选择你所在的城市： ");
            String province = scanner.next();
            for (int i = 0; i < provinces.length; i++) {
                if(province.equals(provinces[i])){
                    System.out.println("信息登记完毕");
                    break l;
                }
            }

        }

        scanner.close();
    }
}

class CityMap{

    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
        model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
        model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
    }

}
