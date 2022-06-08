package com.chainsys.bestPractices.AbstractDemo;

public interface Ispelling {
	void spellCheck (String word); // must be implemented by all languages.
	void checkGrammar (String sentence); // must be implemented by all languages 
	int wordCount(String sentence); // the logic is the same for all language
	

}
abstract class Language implements Ispelling{
@Override
public int wordCount (String sentence)
{ 
	String[] words= sentence.split(" ");
	return words.length;
	}
}
class EnglishLanguage extends Ispelling
{
@Override
public void spellCheck (String word) {
System.out.println("English Spellchecker");
}
@Override
public void checkGrammar (String sentence) {
	System.out.println("English checkGrammer");
}
