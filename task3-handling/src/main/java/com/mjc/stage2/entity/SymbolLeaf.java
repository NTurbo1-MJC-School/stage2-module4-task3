package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    // Write your code here!

    public SymbolLeaf(TextComponentType componentType) {
        super(componentType);
    }
    @Override
    public String operation() {
        return value + getComponentType().getDelimiter();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSize() {
        return 1 + getComponentType().getDelimiter().length();
    }
}
