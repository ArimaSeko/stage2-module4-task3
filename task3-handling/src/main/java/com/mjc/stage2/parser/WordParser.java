package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser{
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String text){
        char[] words = text.toCharArray();
        for (char word : words){
            abstractTextComponent.add(new SymbolLeaf(TextComponentType.WORD, word));
        }
    }

    // Write your code here!

}
