import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {
    public List exercice1(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont tous les éléments sont en majuscules
         */
        liste=liste.stream().map((n)->n.toUpperCase()).collect(Collectors.toList());
        return liste;
    }

    public List exercice2(List<String> liste){

        liste=liste.stream().filter((n)->!n.equals("INUTILE")).collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */
        return liste;
    }

    public String exercice3(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */
        return  liste.stream().collect(Collectors.joining());
    }


    public String exercice4(List<String> liste){
        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */
        liste=liste.stream().map((n)->n.toUpperCase()).collect(Collectors.toList());
        liste=liste.stream().filter((n)->!n.equals("AAA")).collect(Collectors.toList());
        return  liste.stream().collect(Collectors.joining());

    }

    public List exercice5(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */
        liste=liste.stream().map((n)->n*2).collect(Collectors.toList());
        return liste;
    }

    public Integer exercice6(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */

        return liste.stream().reduce((n,l)->l*n).get();
    }

    public List exercice7(List<Integer> liste){
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */
        liste=liste.stream().filter((n)->(n*n)>50).collect(Collectors.toList());
        return liste;
    }

    public List exercice8(List<Integer> liste){
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */
        liste=liste.stream().map((n)->Integer.parseInt(String.valueOf(n*9).substring(0,1))).collect(Collectors.toList());
        return liste;
    }

    public List exercice9(){
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */
        return IntStream.iterate(1,(n)->n+1).filter((n)->n%21==0).limit(10).boxed().collect(Collectors.toList());

    }

    public List exercice10(){
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        return IntStream.iterate(1,(n)->(n+(2*(int)Math.sqrt(n)+1))).limit(20).boxed().collect(Collectors.toList());
    }
}
