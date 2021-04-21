package com.task2;

import java.util.ArrayList;

public  abstract class AbstractKeywordAnalyzer implements TextAnalyzer {


   private static String text;

   abstract public ArrayList<String> getKeywords();
   abstract public Label getLabel();
   public Label processText(String text){

      for (String s:getKeywords()) {
         if(text.contains(s))
            return getLabel();


      }
      return Label.OK;

   }


}
