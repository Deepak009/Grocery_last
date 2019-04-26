package com.example.grocery_last.helper;

/**
 * Created by iwish on 5/23/2017.
 */

public class Constants {


    public static String STARTUP_SCREEN_SF = "startup_screen_sf";


    //public static String URL = "http://192.168.1.202/";

    //http://192.168.1.222/grocery_website/admin/android_process/check_user.php


    //public static String URL = "http://192.168.1.222/";
    public static String URL = "http://192.168.1.3/";


    //public static String SUBFOLDER = "grocery_website/admin/android_process/";
    public static String SUBFOLDER = "grocery_market/";
    //public static String USERNAME = URL+SUBFOLDER+"username";
    public static String LOGINCHECK = URL+SUBFOLDER+"check_user.php";
    //public static String LOGINCHECK = URL+SUBFOLDER+"logincheck.php";
    public static String INSERTCOMPANY = URL+SUBFOLDER+"insert_company_jsno.php";
    public static String COMPANYDATA = URL+SUBFOLDER+"companydatajsn.php";



    //public static String SHAREDPREFERENCE =  "ListingPreference";
    public static String SHAREDPREFERENCE_CITYNAME =  "ListingPreference_cityname";
    public static String SHAREDPREFERENCE_CITYID =  "ListingPreference_cityid";
}
