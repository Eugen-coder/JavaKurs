package Lesson_29_07032025.HW_2_07032025;

public class GameApp {
    public static void main(String[] args) {

        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior();
        characters[1] = new Mage();
        characters[2] = new Archer();

        for (GameCharacter character : characters) {
            character.attack();
        }



    }
}
