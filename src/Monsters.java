public abstract class Monsters {
    private String name;
    private int hp;
    private int str;
    private int agl;
    private int gold;

    public Monsters(String name, int hp, int str, int agl, int gold) {
        this.name = name;
        this.hp = hp;
        this.str = str;
        this.agl = agl;
        this.gold = gold;
    }
}
