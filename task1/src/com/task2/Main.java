package com.task2;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer [] test = new TextAnalyzer[]{new NegativeTextAnalyzerAbstract(),new SpamAnalyzerAbstract(),new TooLongTextAnalyzerAbstract(19)};
        System.out.println(checktext(test,"hvgjhjjlkdncs"));

    }
     static Label checktext (TextAnalyzer text1[],String text){
        Label text2 = Label.OK;
         for (TextAnalyzer t:text1) {
             text2= t.processText(text);
             if(text2!=Label.OK)
                 return text2;

         }
         return text2;
     }
}
