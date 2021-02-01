package com.hometask1.NameMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameMatcherRegexp {
    public static void main(String[] args) {
        String text = "ivan ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Ivan IvAnov, Ivan   Ivanov, Ivan Ivanov";
        Pattern pattern = Pattern.compile ("\\b[A-Z][a-z]{2,}+\\s{1}+[A-Z][a-z]{2,}+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
