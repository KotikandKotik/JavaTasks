package com.task2;

import java.util.ArrayList;

public class SpamAnalyzerAbstract extends AbstractKeywordAnalyzer implements TextAnalyzer{



    @Override
    public ArrayList<String> getKeywords() {
        ArrayList<String> listSpam = new ArrayList<>();
        listSpam.add("kek");
        listSpam.add("lol");
        listSpam.add("cheburek");

        return listSpam ;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
