package com.dongguo.mediator.中介者;

/**
 * @author dongguo
 * @date 2024/1/6
 * @description:
 */
public class ControllerTower {
    private boolean canDo = true;
    public void acceptRequest(String action){
        if ("fly".equals(action) || "land".equals(action)){
            if (canDo){
                System.out.println("允许请求");
                canDo = false;
            }else {
                System.out.println("不允许请求");
            }
        }
        if ("success".equals(action)){
            canDo = true;
        }
    }
}
