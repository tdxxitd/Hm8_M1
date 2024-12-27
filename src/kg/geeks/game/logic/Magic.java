package kg.geeks.game.logic;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int boost = RPG_Game.random.nextInt(5) + 2;
        for(Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + boost);
        }
    }
}
