package com.github.hubertpnj.notywatch.parsers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

public class HTMLSelectorExtractor implements ContentExtractor {

    private final String query;

    public HTMLSelectorExtractor(String query) {
        this.query = query;
    }

    @Override
    public List<String> extract(String content) {
        Document document = Jsoup.parse(content);
        Elements elements = document.select(query);
        return elements.stream().map(Element::text).collect(Collectors.toList());
    }
}
