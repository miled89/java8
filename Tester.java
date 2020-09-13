package j8;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yatzy_j8 yz=new Yatzy_j8();
		int [] tab=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
 			System.out.println("donner la valeur de dés numero :" +(i+1)+"   ");
         tab[i]=sc.nextInt();
		}
		System.out.println("score chance : "+yz.chance(tab));
		System.out.println("score yatzy : "+yz.yatzy(tab));
		System.out.println("score Ones : "+yz.ones(tab));
		System.out.println("score twos : "+yz.twos(tab));
		System.out.println("score threes : "+yz.threes(tab));
		System.out.println("score fours : "+yz.fours(tab));
		System.out.println("score fives : "+yz.fives(tab));
		System.out.println("score sixes : "+yz.sixes(tab));
		System.out.println("score paire : "+yz.paire(tab));
		System.out.println("score three : "+yz.triple(tab));
		System.out.println("score FoursOfkind : "+yz.quatre(tab));
		System.out.println("score deux paires : "+yz.deuxPaires(tab));
		System.out.println("score foula : "+yz.foula(tab));
		System.out.println("votre score Small straight est :"+yz.smallStraight(tab));
		System.out.println("votre score large Straight est :"+yz.largeStraight(tab));
		
	}

}
