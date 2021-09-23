package homework.tema6_StringArray;

public class StringArray {

    public static void main(String[] args) {
        String [] numArray = new String[9];
        numArray[0] = "Alexandru";
        numArray[1] = "Creanga";
        numArray[2] = "este";
        numArray[3] = "student";
        numArray[4] = "la";
        numArray[5] = "Scoala";
        numArray[6] = "Informala";
        numArray[7] = "de";
        numArray[8] = "IT.";
        String propozitie = "";

        System.out.println("String Array elements displayed using 'FOR' loop:");

        for (int i=0; i<numArray.length;i++) {
            propozitie += numArray[i] + " ";
            System.out.print(numArray[i] + " ");  // aici este doar o modalitate de prezentare a string array intro singura linie :)

        }System.out.println("\n");
        System.out.println(propozitie);
    }

}
