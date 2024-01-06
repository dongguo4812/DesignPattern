package com.dongguo.interpreter.解释器;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class Area {
    //免费城市
    Set<String> city = new HashSet<>();


    //免费人群
    Set<String> type = new HashSet<>();

    IDCardExpression idCardExpression;
    public Area() {
//        {"武汉市","青岛市","上海市"};
//        {"军人","老人","儿童"};
        city.add("武汉市");
        city.add("青岛市");
        city.add("上海市");
        type.add("军人");
        type.add("老人");
        type.add("儿童");
        TerminalExpression city = new TerminalExpression(this.city, ":");
        TerminalExpression type = new TerminalExpression(this.type, "-");
        idCardExpression = new OrExpression(city, type);

    }

    void getTicket(String expression){
        boolean result = idCardExpression.interpret(expression);
        if (result){
            System.out.println("免费");
        }else {
            System.out.println("不免费");
        }
    }
}
