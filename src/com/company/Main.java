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
           // urldata = urldata.substring(1,(urldata.length()-1));


            System.out.println(urldata);


            System.out.println("-----------------------------");

            JSONArray jsonArray = new JSONArray(urldata);
                System.out.println(jsonArray.length());


            for(int i=0; i<jsonArray.length();i++){

                JSONObject jObj = jsonArray.getJSONObject(i);
                System.out.println(jObj);

                String festivallName = jObj.getString("name");
                LinkedList<Band> bands = new LinkedList<Band>();
                System.out.println(festivallName);

               // System.out.println(  jObj.get("bands")    );
                JSONArray bandList =  jObj.getJSONArray("bands") ;
                System.out.println(bandList);


                /*for(int j =0 ; j<  bandList.length()      ;j++){

                    JSONObject b = jsonArray.getJSONObject(j);
                    Band thisBand = new Band();
                    thisBand.setName(b.getString("name"));
                    thisBand.setRecordLabel(b.getString("recordLabel"));

                    System.out.println(thisBand.toString());

               }*/



            }


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
