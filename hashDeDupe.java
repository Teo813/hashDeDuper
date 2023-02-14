package com.company;
import java.util.HashSet;
public class hashDeDupe
{
    public static void main(String[] args) {
        //make hashset
        HashSet<Integer> deDupe = new HashSet<>();
        int[] list = {1,2,3,4,4,6,6,6};
        for (int n:list){
            //add elements from list to hashset
            deDupe.add(list[n-1]);
            //hashset automatically removes duplicates by nature
        }
            System.out.println(deDupe);
    }
}
