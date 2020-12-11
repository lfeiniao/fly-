package main.create.factory.abs;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: flyDesign
 * @description: 工厂方法的工厂方法
 * @author: liuyang
 * @create: 2020-12-10 11:17
 **/
public class CompanyFactory {

    private  static  final Map<String, ICompanyFactory> companyMap = new HashMap<>();
    static{

        companyMap.put("BYD", new BYDCompany());
    }
    public static ICompanyFactory getFactory(String name){
        return companyMap.get(name);
    }
}
