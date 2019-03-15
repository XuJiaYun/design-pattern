package com.nju.role;

public class MonsterFactory {

    public static Monster createMonster(int id){
        if(id==0){
            return new LowMonster(100,200);
        }
        else if(id==1){
            return new MidMonster(100,200);
        }else{
            return new HighMonster(100,200);
        }
    }

}
