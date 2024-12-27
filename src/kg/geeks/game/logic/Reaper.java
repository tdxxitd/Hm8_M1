package kg.geeks.game.logic;

public class Reaper extends Hero{

    public Reaper(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SUPER_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if(this.getHealth() == this.getHealth() * 0.3){
            this.setDamage(getDamage() * 2);
            System.out.println("Reaper use ability X2");
        } else if (this.getHealth() == this.getHealth() * 0.15) {
            this.setDamage(getDamage() * 3);
            System.out.println("Reaper use ability X3");
        }
    }
}
