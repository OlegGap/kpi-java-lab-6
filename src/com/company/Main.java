package com.company;

public class Main {

    public static void main(String[] args) {
	    Translator t = new Translator();
	    t.AddWord("tree", "дерево");
      t.AddWord("apple", "яблуко");
      t.AddWord("hello", "привіт");
      t.AddWord("world", "світ");

	    System.out.println(t.GetTranslate("tree"));
	    System.out.println(t.TranslateSentence("hello world"));
      System.out.println(t.GetTranslate("wefwj"));
    }
}
