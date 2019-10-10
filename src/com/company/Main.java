package com.company;
                            // completed by Sam Moriarty
//do note i chose to do this in java for a challenge it would of been much easier to keep this in javascropt (nodejs) and just order from the key

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

        URL url = new URL("http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals\n"); //this is a little buggy at gettingthe JSON

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            String urldata = reader.readLine();
            System.out.println(urldata);
            System.out.println("-----------------------------");


            LinkedList<Display> display = new LinkedList<Display>();
            LinkedList<Festivals> festivals = new LinkedList<Festivals>();
            JSONArray jsonArray = new JSONArray(urldata);

            for(int i=0; i<jsonArray.length();i++){
            try {
                JSONObject jObj = jsonArray.getJSONObject(i);
                String festivalName = jObj.getString("name");
                LinkedList<Band> bands = new LinkedList<Band>();                                        //this is getting the outter scope each festival
                JSONArray bandList = jObj.getJSONArray("bands");

                for (int j = 0; j < bandList.length(); j++) {
                    try {
                        JSONObject b = bandList.getJSONObject(j);
                        Band thisBand = new Band();                                                     //this is getting the bands from each festival
                        thisBand.setName(b.getString("name"));
                        thisBand.setRecordLabel(b.getString("recordLabel"));
                        thisBand.addFestivalPlayedAt(festivalName);
                        bands.add(thisBand);


                        for(int z =0; z< display.size();z++){

                            if(display.get(z).getRecordLabel().equals(thisBand.getRecordLabel())){              //this is putting them into a linked list to loop through and print them all out
                                display.get(z).addSignedBands(thisBand);
                                break;
                            }
                            else if(z == display.size()-1){
                                display.get(z).addRecordLabel(thisBand.getRecordLabel());               //this adds to a record label in display list if not already in or not
                                display.get(z).addSignedBands(thisBand);
                            }

                        }

                    } catch (Exception e) {
                        //some error thows with the band adding
                    }
                }
                Festivals fest = new Festivals();
                fest.setName(festivalName);
                fest.setBandsAttended(bands);

                festivals.add(fest);

            }
            catch(Exception e){
                    //some error occured throw here
            }
            }


            Collections.sort(display.get(1).getRecordLabel());
            for(int i =0; i <display.size(); i++){

               System.out.println(display.get(i).getRecordLabel());
               for(int j =0; i< display.get(i).getSignedBands().size(); j++){                                           //this prints out the display list
                System.out.println(display.get(i).getSignedBands().get(j).getName());
                System.out.println(display.get(i).getSignedBands().get(j).getFestivalPlayedAt().toString());

               }

            }



        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
