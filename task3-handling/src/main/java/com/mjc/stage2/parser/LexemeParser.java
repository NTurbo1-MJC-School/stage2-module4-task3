package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    // Write your code here!
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {

    }
}
