package kg.geeks.game.logic;

public class Hacker extends Hero{
    private int stolenHealth;


    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STEAL_HEALTH_AND_HEAL);
    }

    public void stolenHealth(int stolenHealth) {
        this.stolenHealth = stolenHealth;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            stolenHealth = RPG_Game.random.nextInt(20) + 2;
            boss.setHealth(boss.getHealth() - this.stolenHealth);
            hero.setHealth(hero.getHealth() + this.stolenHealth);
            System.out.println(this.getName() + " steal " +
                    this.stolenHealth + " boss health and gave it to hero");
            break;
        }
    }
}
