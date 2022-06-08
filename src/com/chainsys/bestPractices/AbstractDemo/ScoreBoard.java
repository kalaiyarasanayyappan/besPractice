package com.chainsys.bestPractices.AbstractDemo;
public class ScoreBoard
{
public int TargetScore=215; 
private ScoreBoard(){
System.out.println("Object created for ScoreBoard");
} //createppject() is a factory method
public static ScoreBoard createObject() { return new ScoreBoard();
}
}