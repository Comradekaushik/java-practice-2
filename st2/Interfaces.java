package st2;

import java.util.*;
import java.lang.*;

import ete.*;


public class Interfaces implements Walkinterface {
    @Override
    public   void walking() {
        System.out.println("Walking duck");


        
    }

    public static void main(String[] args){

        Interfaces newinterface1 = new Interfaces();
        Interfaces newinterface2 = new Interfaces();



        newinterface1.walking();
        // newinterface2.walking();



    }
}



