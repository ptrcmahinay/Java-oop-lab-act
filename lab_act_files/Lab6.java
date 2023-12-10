// This lab ia about inheritance

import java.util.Scanner;

public class Lab6{
    String character;
    int strength;
    int dexterity;
    int intelligence;

    public void setCharacter(String character){
        this.character = character;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setDexterity (int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence (int intelligence) {
        this.intelligence = intelligence;
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintCharacter pc = new PrintCharacter();

        System.out.println("What is your character's name?: ");
        String charName = in.nextLine();
        pc.setCharacter(charName);


        System.out.println("Choose your character class: ");
        System.out.println("(1) Fighter");
        System.out.println("(2) Mage");
        int charClass = in.nextInt();
        

        System.out.println("Enter character's stats: ");
        System.out.println("Strength: ");
        int strength = in.nextInt();
        pc.setStrength(strength);

        System.out.println("Dexterity: ");
        int dexterity = in.nextInt();
        pc.setDexterity(dexterity);

        System.out.println("Intelligence: ");
        int intelligence = in.nextInt();
        pc.setIntelligence(intelligence);

        pc.characterClass(charClass);
        pc.characterDetails();
        pc.updateStats(charClass);

        in.close();
    }
}
    
