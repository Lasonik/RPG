public class Character {
    protected String name;
    protected int hp;
    protected int str;
    protected int agl;
    protected int gold;
    protected int xp;

    private int getRandomValue() {
        return (int) (Math.random() * (str * 2) + agl);
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int setHp(int hp) {
        this.hp = hp;
        return hp;
    }
    public int getHp() {
        return hp;
    }

    public int getStr() {
        return str;
    }

    public int setStr(int str) {
        this.str = str;
        return str;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getXp() {
        return xp;
    }
    public void setXp(int i){
        this.xp = xp;
    }

    public void setHealthPoints(int defenderHealth) {

    }

    public int getHealthPoints() {
        return hp;
    }

    protected int attack() {
        return getRandomValue();
    }

    public String getName() {
        return name;
    }
}
