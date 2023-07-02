package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] lexemes = string.toCharArray();
        for (char lexeme : lexemes){
            abstractTextComponent.add(new SymbolLeaf(TextComponentType.SYMBOL, lexeme));
        }
    }

    // Write your code here!

}
