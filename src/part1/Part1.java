// Mostafa Hesham Ali Yousry Abdelwahab 40075978
// COMP 249
// Assignment 2 -Part 1 and 2
// July 25 2018

package part1;
import java.util.*;
import soccerplayer.SoccerPlayer;
import goalkeeper.Goalkeeper;
import defender.*;
import midfielder.*;
import forward.*;

/**
 * Class containing the driver method
 * @author Mostafa
 *
 */
public class Part1
{
	/**
	 * Takes an array of SoccerPlayer and copies it
	 * @param s an array of SoccerPlayer objects
	 * @return a copied array 
	 */
	public static SoccerPlayer[] teamSimilarTo(SoccerPlayer[] s)
	{
		SoccerPlayer[] copy = new SoccerPlayer[s.length];
		for(int i=0;i<s.length;i++)
		{
			String dummy= s[i].getClass().getSimpleName();
			if(dummy.equals("SoccerPlayer")) {copy[i]= new SoccerPlayer((SoccerPlayer)s[i]);}
			if(dummy.equals("Goalkeeper")) {copy[i]= new Goalkeeper((Goalkeeper)s[i]);}
			if(dummy.equals("Defender")) {copy[i]= new Defender((Defender)s[i]);}
			if(dummy.equals("CentreBack")) {copy[i]= new CentreBack((CentreBack)s[i]);}
			if(dummy.equals("Sweeper")) {copy[i]= new Sweeper((Sweeper)s[i]);}
			if(dummy.equals("WingBack")) {copy[i]= new WingBack((WingBack)s[i]);}
			if(dummy.equals("Midfielder")) {copy[i]= new Midfielder((Midfielder)s[i]);}
			if(dummy.equals("CentreMidfielder")) {copy[i]= new CentreMidfielder((CentreMidfielder)s[i]);}
			if(dummy.equals("WideMidfielder")) {copy[i]= new WideMidfielder((WideMidfielder)s[i]);}
			if(dummy.equals("DefensiveMidfielder")) {copy[i]= new DefensiveMidfielder((DefensiveMidfielder)s[i]);}
			if(dummy.equals("Forward")) {copy[i]= new Forward((Forward)s[i]);}
			if(dummy.equals("Striker")) {copy[i]= new Striker((Striker)s[i]);}
			if(dummy.equals("Winger")) {copy[i]= new Winger((Winger)s[i]);}
			if(dummy.equals("CentreForward")) {copy[i]= new CentreForward((CentreForward)s[i]);}

		}
		return copy;
	}
	
	
	public static void main(String[]args)
	{
		
		//Soccerplayer with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed
		/**
		 * Creating 18 players (from the 14 classes)
		 */
		SoccerPlayer a= new SoccerPlayer("Jo",new Date(82,11,3),"Bayern","Austria",3,1,20);
		SoccerPlayer a2= new SoccerPlayer("James",new Date(93,5,3),"Bayern","Germany",0,0,30);
		
		//Goalkeeper with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, goalsAllowed, shotsOnGoal,numSaves
		Goalkeeper b= new Goalkeeper("Alvaro",new Date(87,5,28),"Atleti","Germany",0,0,30,14,99,85);
		
		//Defender with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, numTackles
		Defender c=new Defender("Sergio",new Date(84,5,28),"Real","Spain",13,5,33,65);
		Defender c2=new Defender("Sergio",new Date(84,5,28),"Real","Spain",13,5,33,65);
		
		//CentreBack with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, numTackles,shotsBlocked
		CentreBack d= new CentreBack("Sergio",new Date(84,5,28),"Real","Spain",13,5,33,65,22);
		
		//Sweeper with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, numTackles,sweepUps
		Sweeper e= new Sweeper("Camus",new Date(88,9,28),"Real","Spain",6,1,33,50.5,12);
		Sweeper e2= new Sweeper("Jean",new Date(88,9,8),"Lyon","France",4,1,39,70,8);
		
		//WingBack with with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, numTackles, throwins
		WingBack f= new WingBack("Marcelo",new Date(88,10,2),"Real","Brazil",4,1,29,44.5,8);
		
		//Midfielder with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, attacksStopped
		Midfielder g= new Midfielder("Isco",new Date(93,10,2),"Real","Spain",4,1,32,20);
		Midfielder g2=new Midfielder("Boateng",new Date(93,1,28),"Bayern","Germany",2,0,35,24);
		
		//CentreMidfielder with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, attacksStopped, numPasses
		CentreMidfielder h= new CentreMidfielder("Boateng",new Date(93,1,28),"Bayern","Germany",2,0,35,24,900);
		
		//DefensiveMidfielder with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, attacksStopped, intercepts
		DefensiveMidfielder i =new DefensiveMidfielder("Isco",new Date(93,10,2),"Real","Spain",4,1,32,20,15);
		
		//WideMidfielder with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, attacksStopped, chances Created
		WideMidfielder j= new WideMidfielder("Luka",new Date(85,9,2),"Real","Croatia",4,2,32,22,7);
		
		//Forward with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, goalsScored,numAssists,shotsOnTarget
		Forward k = new Forward("Ronaldo",new Date(85,8,2),"Juve","Portugal",4,2,38,45,15,88);
		
		//CentreForward with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, goalsScored,numAssists,shotsOnTarget,longBallsReceived
		CentreForward l = new CentreForward("Higuain",new Date(89,8,2),"Juve","Argentina",6,2,30,20,10,50,20);
		
		//Winger with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, goalsScored,numAssists,shotsOnTarget, numCrosses
		Winger m= new Winger("Kroos",new Date(90,6,18),"Real","Germany",3,0,38,18,15,40,30);
		
		//Striker with name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, goalsScored,numAssists,shotsOnTarget, goalsToShotsRatio
		Striker n= new Striker("Messi",new Date(87,3,18),"Barca","Argentina",1,0,38,45,20,90,0.5);
		
		
		
		
		
		//In order for the attributes to be most secure:
		//The attributes of SoccerPlayer are protected because the subclasses of SoccerPlayer are located in other packages.
		
		//The attributes of Defender, Midfielder and Forward are default visivility because their respective subclasses
		// are located in the same package.
		
		//The attributes of all other classes are private because they do not have any subclasses
		
		System.out.println("Welcome to the program!");
		/**
		 * A SoccerPlayer array containing 18 players
		 */
		SoccerPlayer[] players= {a,a2,b,c,c2,d,e,e2,f,g,g2,h,i,j,k,l,m,n};
		
		
		
		
		System.out.println("Testing the equals method: c and c2 are equal, g and g2 are not");
		if(c.equals(c2) && !g.equals(g2))
		{
			System.out.println("The equals() method shows c=c2 and g!=g2. It works well");
		}
		
		System.out.print("\n\nPrinting all players'information:");
		int index;
		for(index=0;index<18;index++)
		{
			System.out.print(players[index].toString());
		}
		
		
		
		
		System.out.println("\n\nPrinting all players'information of the copied array:");
		/**
		 * this SoccerPlayer array will be a copy of the original array
		 */
		SoccerPlayer[] pp = teamSimilarTo(players);
		for(index=0;index<18;index++)
		{
			if(!pp[index].equals(players[index]))
			{
				System.out.print("There is an error in the copy");
			}
			else
			{
				
			}
		}
		// There is no error in copying because the correct constructor not the general SoccerPlayer was called with the corresponding parameter
		
		
		
		int maxGoals=0;
		/**
		 * In this part, we scan the array, check which player is a Forward or subclass of Forward ,
		 * and then store the maximum number of goals scored. We then scan the array a second time
		 * to print the players who have scored this number of goals.
		 */
		Forward fordummy;
		for (index=0;index<18;index++)
		{
			if((players[index] instanceof Forward) ||(players[index] instanceof Winger)||(players[index] instanceof Striker)||(players[index] instanceof CentreForward))
			{
				fordummy=(Forward) players[index];
				if(maxGoals<fordummy.getGoalsScored())
				{
					maxGoals= fordummy.getGoalsScored();
				}
				
			}
		}
		if (maxGoals==0) {System.out.println("\n\nNo player in this array has scored any goal");}
		else
		{
			System.out.print("\n\nPrinting players who scored the most number of goals("+maxGoals+")\n");
			for (index=0;index<18;index++)
			{
				if((players[index] instanceof Forward) ||(players[index] instanceof Winger)||(players[index] instanceof Striker)||(players[index] instanceof CentreForward))
				{
					fordummy=(Forward) players[index];
					if(maxGoals==fordummy.getGoalsScored())
					{
						System.out.print("Index in the array: "+index);
						System.out.println(fordummy.toString());
					}
					
				}
			}
		}
		
		int minSaves=-1;
		/**
		 * In this part, we scan the array, check which player is a Goalkeeper , and then store the minimum numSaves. We then scan the array a second timeto print the players who saved this number.
		 */
		Goalkeeper goaldummy;
		for(index=0;index<18;index++)
		{
			if(players[index] instanceof Goalkeeper)
			{
				goaldummy=(Goalkeeper) players[index];
				if(minSaves<goaldummy.getNumSaves())
				{
					minSaves=goaldummy.getNumSaves();
				}
				
			}
		}
		
		if(minSaves==-1) {System.out.println("\n\nThere are no goalkeepers in this array");}
		else
		{
			System.out.print("\n\nPrinting goalkeepers who saved the least number of gaols("+minSaves+")\n");
			for (index=0;index<18;index++)
			{
				if(players[index] instanceof Goalkeeper)
				{
					goaldummy=(Goalkeeper) players[index];
					if(minSaves==goaldummy.getNumSaves())
					{
						System.out.print("Index in the array: "+index);
						System.out.println(goaldummy.toString());
					}
					
				}
			}
		}
		
		
		
		
		/**
		 * We store in a hashtable the clubNames as keys with values as strings containing the index
		 */
		Hashtable<String,String> map = new Hashtable<String,String>();
		String dummy;
		
		for(index=0;index<18;index++)
		{
			if(map.containsKey(players[index].getClubName()))
			{
				dummy= map.get(players[index].getClubName())+" "+ Integer.toString(index);
				map.replace(players[index].getClubName(), dummy);
			}
			else
			{
				map.put(players[index].getClubName(), Integer.toString(index));
			}
		}
		/**
		 * If at least 2 players play at the same club, the program will go key by key (club by club) and print
		 * the corresponding players
		 */
		if(map.size()==18) {System.out.println("In this array, there are no players that play in the same club");}
		else
		{
			for(String club: map.keySet())
			{
				System.out.println("\nPlayers who play in "+club+":");
				String[]indexes= map.get(club).split(" ");
				for (int indexB=0;indexB<indexes.length;indexB++)
				{
					System.out.print("Index of the player in the array: "+ indexes[indexB]);
					System.out.println(players[Integer.parseInt(indexes[indexB])].toString());
				}
			}
		}
		
		System.out.println("\n\nThank you for using the program.It will close now");
		
		
		
		
		
		
		
	}
}
