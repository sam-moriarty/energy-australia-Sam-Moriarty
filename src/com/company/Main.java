package com.company;


import com.google.gson.stream.JsonReader;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;
import org.json.*;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;


public class Main {

    public static void main(String[] args) throws MalformedURLException, ParseException, JSONException {
	// write your code here

        URL url = new URL("http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals\n");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            String urldata = reader.readLine();

            System.out.println(urldata.substring(1,(urldata.length()-1)));


            System.out.println("-----------------------------");

            //JSONArray jsonArray = jsonObject.getJSONArray("userInfo");
            //JSONObject jsonObject = new JSONObject(urldata);
            // List<String> list = new ArrayList<String>();


            //System.out.println( jsonObject    );










        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }







    }
}
