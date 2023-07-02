package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        int i=0;
        while (i < parsers.size()){
            if (parsers.get(i) == null){
                parsers.get(i).setNextParser(parsers.get(i++));
            }else{
                return parsers.get(i);
            }
        }
        throw new RuntimeException();
    }
}
