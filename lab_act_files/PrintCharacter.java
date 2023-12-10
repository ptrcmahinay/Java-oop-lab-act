public class PrintCharacter extends Lab6{
    public void characterClass(int cc){
        if (cc == 1){
            System.out.println("You gain a 5+ bonus to Strength");
        } else{
            System.out.println("You gain a 5+ bonus to intelligence");
        }
    }

    public void characterDetails(){
        System.out.println("---Character details---");
        System.out.println("Name: " + character);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
    }

    public void updateStats(int cc){
        System.out.println("Updated Character Stats");
        if (cc == 1){
            int bonusStrength = strength + 5;
            System.out.println("Strength: " + bonusStrength);
            System.out.println("Dexterity: " + dexterity);
            System.out.println("Intelligence: " + intelligence);
        } else{
            int bonusIntelligence = intelligence + 5;
            System.out.println("Strength: " + strength);
            System.out.println("Dexterity: " + dexterity);
            System.out.println("Intelligence: " + bonusIntelligence);
        }
    }
}
