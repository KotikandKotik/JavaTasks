package com.task2;

import java.util.ArrayList;

public class NegativeTextAnalyzerAbstract extends AbstractKeywordAnalyzer implements TextAnalyzer{


    @Override
    public ArrayList<String> getKeywords() {
        ArrayList<String> listSpam = new ArrayList<>();
        listSpam.add(":(");
        listSpam.add("=(");
        listSpam.add(":|");

        return listSpam ;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT


                ;
    }
}
