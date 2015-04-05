package io.github.bote795.myapplication;

/**
 * Created by Nick on 4/4/2015.
 */
public class Db {
    final public static String[] NAMES = {"Darrin \"Flash\" Williams", "Professor Longfellow", "Madame Zostra", "Zoe Ingstrom", "Heather Granville" ,"Brandon Jaspers"};
    public static characters[] stats = new characters[7];
    Db(){
        Integer[] array1 = {4,4,4,5,6,7,7,8};
        Integer[] array2 = {2,3,3,4,5,6,6,7};
        Integer[] array3 = {1,2,3,4,5,5,5,7};
        Integer[] array4 = {2,3,3,4,5,5,5,7};

        stats[0]= new characters("Darrin \"Flash\" Williams", "20", "5'11", "188 lbs", "Track, Music, Shakesparean \"Literature\"","June 6th",
                array1, 4, array2, 2, array3 , 2, array4, 2);
        Integer[] array5 = {2,2,4,4,5,5,6,6};
        Integer[] array6 = {1,2,3,4,5,5,6,6};
        Integer[] array7 = {1,3,3,4,5,5,6,7};
        Integer[] array8 = {1,3,3,4,5,6,6,8};

        stats[1]=new characters( "Professor Longfellow", "57", "5 '11", "153 lbs", "Gaelic Music, Drama, Fine Wines", "July 27th",
                array5,3,array6,2,array7,2,array8 ,3);
        Integer[] array9 = {2,3,3,5,5,6,6,7};
        Integer[] array10 = {2,3,3,4,5,5,5,6};
        Integer[] array11 = {4,4,4,5,6,7,8,8};
        Integer[] array12 = {1,3,4,4,4,5,6,6};
        stats[2]= new characters("Madame Zostra", "37", "5'0", "150 lbs", "Astrology, Cooking, Baseball", "December 10th",
                array9 ,2,array10 ,3,array11 ,2,array12,3 );
        Integer[] array13 = {4,4,4,4,5,6,8,8};
        Integer[] array14 = {2,2,3,3,4,4,6,7};
        Integer[] array15 = {3,4,5,5,6,6,7,8};
        Integer[] array16 = {1,2,3,4,4,5,5,5};
        stats[3]= new characters("Zoe Ingstrom", "8","3'9", "49 lbs", "Dolls, Music","November 5th",
                array13,3, array14, 3, array15,2 ,array16,2 );
        Integer[] array17 = {3,3,4,5,6,6,7,8};
        Integer[] array18 = {3,3,3,4,5,6,7,8};
        Integer[] array19 = {3,3,3,4,5,6,6,6};
        Integer[] array20 = {2,3,3,4,5,6,7,8};
        stats[4]= new characters("Heather Granville","18","5'2" ,"120 lbs","Television, Shopping","August 2nd", array17,2, array18,2, array19,2, array20,3 );
        Integer[] array21 = {3,4,4,4,5,6,7,8};
        Integer[] array22 = {2,3,3,4,5,6,6,7};
        Integer[] array23 = {3,3,3,4,5,6,7,8};
        Integer[] array24 = {1,3,3,5,5,6,6,7};
        stats[5] = new characters("Brandon Jaspers","12", "5'1","100 lbs","Computers, Camping, Hockey","May 21st", array21, 2, array22,3, array23,3,array24,2);
    }

}
