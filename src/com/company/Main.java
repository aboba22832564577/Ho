package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {



        ArrayList<String> list=new ArrayList<>();
        list.add("cowa");
        list.add("cowuuj");
        list.add("aow");
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else{
                    return o1.compareTo(o2);
                }
            }
        });

        System.out.println(list);

        }
    }
