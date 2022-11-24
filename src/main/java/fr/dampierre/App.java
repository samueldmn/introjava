package fr.dampierre;
import java.util.Random;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {

    
    // public static void main(String[] args) {

    //     int salaire = 400;
    //     int prime = 250;
    //     int quota = 10;
    //     Scanner clavier = new Scanner(System.in);
        
    //     System.out.println("Entrez nombre de ventes : ");
    //     int nbVentes = clavier.nextInt();
    //     clavier.close();

    //     if (nbVentes >= quota){
    //         salaire += prime;
    //         System.out.println("Félicitations ! Vous avez rempli le quota.");
    //     }
    //     else{
    //         int nbVentesManquantes = quota - nbVentes;
    //         System.out.println("Il vous manque " + nbVentesManquantes + " ventes pour atteindre le quota");
    //     }
    //     System.out.println("Votre salaire est de :" + salaire);
    // }


    // public static void main(String[] args) {

    //     int salaire = 400;
    //     int prime = 250;
    //     int quota = 10;
    //     Scanner clavier = new Scanner(System.in);
        
    //     System.out.println("Entrez nombre de ventes : ");
    //     int nbVentes = clavier.nextInt();
    //     clavier.close();

    //     if (nbVentes >= quota){
    //         salaire += prime;
    //     }

    //     System.out.println(salaire);
    // }
    
    // public static void main(String[] args) {

    //     // Récupérer le nombre d'heures travaillées
    //     int heureTravaillees = 120;
    //     Scanner clavier = new Scanner(System.in);
    //     System.out.println("Entrer le nombre d'heures travaillées : ");
    //     int heureTravaillees = clavier.nextInt();

    //     // Récupérer le taux horaire 
    //     System.out.println("Entrer le taux Horaire : ");
    //     double tauxHoraire = clavier.nextDouble();


    //     // Multiplier le nombre d'heures par le taux horaire
    //     double salaireBrut = tauxHoraire * heureTravaillees;

    //     // Afficher le résulltat
    //     System.out.println("Le salaire brut est de : " + salaireBrut);

    // public static void main(String[] args) {
        // System.out.println("combien avez vous de piece de 1");
        // Scanner clavier = new Scanner(System.in);
        // int nbdepiecede1= clavier.nextInt();
        
        // System.out.println("combien avez vous de piece de 5");
        // int nbdepiecede5= clavier.nextInt();

        // System.out.println("combien avez vous de piece de 10");
        // int nbdepiecede10= clavier.nextInt();

        // System.out.println("combien avez vous de piece de 20");
        // int nbdepiecede20= clavier.nextInt();

        // System.out.println("combien avez vous de piece de 50");
        // int nbdepiecede50= clavier.nextInt();
        // clavier.close();

        // double total= nbdepiecede1*0.01+nbdepiecede5*0.05+nbdepiecede10*0.10+nbdepiecede20*0.20+nbdepiecede50*0.50;
        
        // if (total<1){
        //     double nbdepiecemanquante=1-total;
        //     System.out.println("il vous manque "+nbdepiecemanquante+" piece");

        // }
        // else if (total==1) {
        //     System.out.println("vous avez exactement de quoi vous payer le café-crème");
            
        // }
        // else{
        //     double pieceentrop=total-1;
        //     System.out.println("il vous reste "+pieceentrop+" piece");
        // }

        public static void main(String[]args) {
          // Scanner clavier= new Scanner(System.in);
          // System.out.println("Entre une lettre :");
          // String entrée = clavier.nextLine();
          // //enléve les espace avant et après
          // entrée = entrée.trim();
          // entrée = entrée.toLowerCase();
          // if (entrée.equals("r")){
          // System.out.println("Vous avez choisi le rouge");
          //   }
          //   else if (entrée.equals("v")) {
          //     System.out.println("Vous avez choisi le vert");
              
          //   }
          //   else if (entrée.equals("b")) {
          //     System.out.println("Vous avez choisi le bleu");}
          //   else{
          //     System.out.println("Connais pas");}}
        
      //   int nbdecase= 0;
      //   int nblancer=5;
      //   boolean gagner = false;

      //   Random generateur = new Random();

      //   //ou: while (nbdecase!=20)

      //   while (!gagner){
      //     nbdecase=0;

      //   for (int i = 1; i <=nblancer; i++) {
          
      //     int lancer = generateur.nextInt(6) + 1;
      //    nbdecase = lancer+ nbdecase;
      //    System.out.println("vous avez fait: "+lancer);
      //    System.out.println("vous etes sur la case: "+nbdecase);
         
      //    }
         
      //    if (nbdecase== 20) {
      //     System.out.println("gagner");
      //     gagner=true;
      //    } 
        
      //    else{
      //     System.out.println("perdu : "+nbdecase);
          
      //    }
         
      //   }
  //   int nb1=0;
  //   int nb2=1;
  //   int resultat;
  //   System.out.print(nb1+" "+nb2+" ");
  //   for(int i=0 ;i <10;i++){
  //     resultat=nb1+nb2;
  //     System.out.print(resultat+" ");
  //     nb1=nb2;
  //     nb2=resultat;
  //   }
  // }
  // for(int i = 1;i <= 5;i++){
  //   System.out.print(Math.pow(i, 2)+" ");
  // }
// for(int i=1;i<=40;i++){
//   for (int j = 1; j <=3; j++) {
    
//   }
//   System.out.print("-");
  
  

// }
// System.out.println("-^-");
Random generateur = new Random();
System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel");
System.out.print("Entrez un nombre : " );
Scanner clavier = new Scanner(System.in);
int nbEntrez= clavier.nextInt(); 
System.out.println("Vous proposez : "+nbEntrez);
int nbPensais= generateur.nextInt(30);
System.out.println("Le nombre auquel je pensais était : "+nbPensais);
int dif= nbPensais-nbEntrez;
while (nbEntrez!=nbPensais) {
 
if (nbEntrez==nbPensais) {
  System.out.println("Quel bol, vous avez trouvé"); 


}
 
}



  





}}
     
  
        