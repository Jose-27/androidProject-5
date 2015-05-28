package com.example.jj.top10downloads;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.StringReader;
import java.util.ArrayList;

/**
 * Created by jj on 5/28/15.
 */
public class ParseApplication {
    private String data;
    private ArrayList<Application> application;

    public ParseApplication(String xmlData){
        data = xmlData;
        application = new ArrayList<Application>();

    }

    public ArrayList<Application> getApplication() {
        return application;
    }

    public boolean process() {
        boolean operationStatus = true;
        Application currentRecord = null;
        boolean inEntry = false;
        String textValue = "";

        try{

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();

            xpp.setInput(new StringReader(this.data));
            int eventType = xpp.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT){
                String tagName = xpp.getName();
                if(eventType == XmlPullParser.START_DOCUMENT){

                }else if(eventType == XmlPullParser.END_DOCUMENT){

                }else if(eventType == XmlPullParser.START_TAG){

                }else if(eventType == XmlPullParser.TEXT){
                    textValue = xpp.getText();

                }else if(eventType == XmlPullParser.END_TAG){

                }
                eventType = xpp.next();
            }




        }catch (Exception e){
            e.printStackTrace();
            operationStatus = false;
        }


        return operationStatus;
    }
}
