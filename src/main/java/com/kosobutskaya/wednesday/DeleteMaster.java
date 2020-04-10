package com.kosobutskaya.wednesday;

public class DeleteMaster<T> {
    public boolean delete(T[] massivArgument, T argument2){

        boolean deleted = false;

        for (int i = 0; i < massivArgument.length; i++) {
            if(massivArgument[i].equals(argument2)){
                massivArgument[i] = null;
                deleted = true;
            }
        }
        return deleted;
    }

}
