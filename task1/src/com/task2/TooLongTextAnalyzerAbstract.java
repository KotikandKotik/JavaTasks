package com.task2;

public class TooLongTextAnalyzerAbstract implements TextAnalyzer{

    private int lkbyf;

    public TooLongTextAnalyzerAbstract(int lkbyf) {
        this.lkbyf = lkbyf;
    }

    @Override
    public Label processText(String text) {
        Label label1 = text.length()>lkbyf?Label.TOO_LONG:Label.OK;
        return label1;
    }
}
