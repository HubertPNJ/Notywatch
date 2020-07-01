package com.github.hubertpnj.notywatch.parsers;

public interface BaseContentExtractor<A,B> {

    B extract(A content);
}
