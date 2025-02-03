package intro.designPuzzle;

public abstract class Character {

    WeaponBehaviour weaponBehavior;
    /**
     * Engages in a fight using the character's current weapon.
     */
    abstract void fight();

    void setWeaponBehavior(WeaponBehaviour weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
