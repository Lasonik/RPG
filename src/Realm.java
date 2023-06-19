import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Realm {
    private static BufferedReader br;
    private static Player player;
    private static BattleScene battleScene;
    public static void main(String[] args) throws IOException {
        //Инициализируем BufferedReader
        br = new BufferedReader(new InputStreamReader(System.in));
        //Инициализируем класс для боя
        player = new Player();
       battleScene = new BattleScene();
       printNavigation();

        //System.out.println(player.name + "\n" + "Level: "+ player.level + "\n" + "Strength: " +player.str+ "\n"+ "Agility: " +player.agl+ "\n"+ "Vitality: " +player.vit+ "\n" + "HP: " +player.maxHp(player.vit, player.hp)); //Testing stats.

    }

    private static void command(String string) throws IOException{
        switch (string){
            case "1":{
                System.out.println("Торговец еще не приехал");
                command(br.readLine());
            }
            break;
            case "2": {
                commitFight();
            }
            break;
            case "3":
                System.exit(1);
                break;
            case "да":
                command("2");
                break;
            case "нет": {
                printNavigation();
                command(br.readLine());
            }
        }
        //Снова ждем команды от пользователя
        command(br.readLine());
    }
    interface FightCallback {
        void fightWin();
        void fightLost();
    }
    private static void printNavigation() throws IOException {
        System.out.println("Куда вы хотите пойти?");
        System.out.println("1. К Торговцу");
        System.out.println("2. В темный лес");
        System.out.println("3. Выход");
        command(br.readLine());
    }
    private static void commitFight() {
        battleScene.fight(player, createMonster(), new FightCallback() {
            @Override
            public void fightWin() {
                System.out.println(String.format("%s победил! Теперь у вас %d опыта и %d золота, а также осталось %d едениц здоровья.", player.getName(), player.getXp(), player.getGold(), player.getHealthPoints()));
                System.out.println("Желаете продолжить поход или вернуться в город? (да/нет)");
                try {
                    command(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void fightLost() {
                System.exit(1);
            }
        });
    }
    private static Monsters createMonster() {
        //Рандомайзер
        int random = (int) (Math.random() * 10);
        //С вероятностью 50% создается или скелет, или гоблин
        if (random % 2 == 0) return new Goblin("Гоблин",50,5,10,50);
        else return new Skeleton("Скелет",75,10,5,75);
    }
}