package j8;

import java.util.Arrays;
public class Yatzy_j8 {
// chance 
	public  int chance(int[] tab) {
		  return Arrays.stream(tab).sum();}//methode chance
//yatzy
	public  int yatzy(int[] tab) {
		int score=50;  
		int elem=tab[0];
		tab = Arrays.stream(tab).filter(x -> x ==elem).toArray();
		if(tab.length!=5) score=0;
		return score ;}//methode yatzy
//categorie One
	public int ones(int[] tab) {
		return (tab=Arrays.stream(tab).filter(value -> value== 1).toArray()).length;
		}//Ones
	//categorie Two
		public int twos(int[] tab) {
			return (tab=Arrays.stream(tab).filter(value -> value== 2).toArray()).length*2;
			}//Two
		//categorie Three
				public int threes(int[] tab) {
					return (tab=Arrays.stream(tab).filter(value -> value== 3).toArray()).length*3;
					}//Three
						//categorie fours
				public int fours(int[] tab) {
					return (tab=Arrays.stream(tab).filter(value -> value== 4).toArray()).length*4;
					}//fours
						//categorie fives
				public int fives(int[] tab) {
					return (tab=Arrays.stream(tab).filter(value -> value== 5).toArray()).length*5;
					}//fives
				//categorie sixes
				public int sixes(int[] tab) {
					return (tab=Arrays.stream(tab).filter(value -> value== 6).toArray()).length*6;
					}//sixes
				//paire
				public int paire(int[] tab) {
				int[] array = {sixes(tab)/6,fives(tab)/5,fours(tab)/4,threes(tab)/3,twos(tab)/2,ones(tab)};
			      boolean couple=false; int score=0;int i=0;
				while(couple==false && i<6)
				{if(array[i]>=2) 				{score=2*(6-i);				couple=true;}
				else i++;}
				return score;	
			}//paire
		public int triple(int[] tab) {
			int[] array = {sixes(tab)/6,fives(tab)/5,fours(tab)/4,threes(tab)/3,twos(tab)/2,ones(tab)};
		      boolean couple=false; int score=0;int i=0;
			while(couple==false && i<6)
			{if(array[i]>=3) 			{score=3*(6-i);			couple=true;}
			else i++;}
			return score;
				}//triple
		public int quatre(int[] tab) {
			int[] array = {sixes(tab)/6,fives(tab)/5,fours(tab)/4,threes(tab)/3,twos(tab)/2,ones(tab)};
		      boolean couple=false; int score=0;int i=0;
			while(couple==false && i<6)
			{if(array[i]>=4) 
			{score=4*(6-i);	couple=true;			}
			else i++;}
			return score;
	}//quatre
	public int deuxPaires(int[]tab) {
	int score=0;
	int score1=0;
	int [] tab1=new int[5];
	if(quatre(tab)!=0 ) {score=0;}
	else {if(paire(tab)==0) score=0;
	      else {score1=paire(tab);
	  	for(int i=0;i<5;i++) {//for
			if(tab[i]==score1/2) {tab1[i]=0;}
			else {tab1[i]=tab[i];}
			}//for 
	  	if(paire(tab1)==0) {score=0;}
		else {score=score1+paire(tab1);} } }
	return score;}//deuxPaires
	public int foula(int[] tab) {
		int score=0;	
	      int score1=0;
	      int [] tab1=new int[5];
	      if(triple(tab)==0 ) score=0;
	      else {score1=triple(tab);
	      for(int i=0;i<5;i++) {//for
				if(tab[i]==triple(tab)/3) {				tab1[i]=0;				}
				else {tab1[i]=tab[i];}}//for
				if(paire(tab1)==0) {score=0;}
				else {score=score1+paire(tab1);}}
	     return score; }//foula
		public int largeStraight(int[] tab) {
		int score=0;
		if(tab[0]==2 && tab[1]==3 && tab[2]==4 && tab[3]==5 && tab[4]==6 ) {score=20;}
	return score;}//large
		public int smallStraight(int[] tab) {
			int score=0;
			if(tab[0]==1 && tab[1]==2 && tab[2]==3 && tab[3]==4 && tab[4]==5 ) {score=15;}
			return score;}//small
}//classe 
