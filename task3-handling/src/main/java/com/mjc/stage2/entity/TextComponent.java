package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;
// Write your code here!

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        String str = "";

        componentList.forEach(component -> {
            str.concat(component.operation());
        });

        return str + getComponentType().getDelimiter();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
        size += textComponent.getSize();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
        size -= textComponent.getSize();
    }

    @Override
    public int getSize() {
        return size + getComponentType().getDelimiter().length();
    }
}
