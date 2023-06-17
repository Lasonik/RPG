public abstract class Monsters {
    private String name;
    private int hp;
    private int str;
    private int agl;
    private int gold;

    private int xp;

    public Monsters(String name, int hp, int str, int agl, int gold) {
        this.name = name;
        this.hp = hp;
        this.str = str;
        this.agl = agl;
        this.gold = gold;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int i) {
        this.gold = 50;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int i) {
        this.xp = 50;
    }
    private int getRandomValue(){
        return (int) (Math.random()*(str*2) + agl);
    }
    public int attack() {
        return getRandomValue();
    }
}
