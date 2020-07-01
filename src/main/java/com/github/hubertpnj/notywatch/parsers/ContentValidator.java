package com.github.hubertpnj.notywatch.parsers;

public interface ContentValidator<C> {

    boolean validate(C content);
}
