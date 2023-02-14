package CreationalDesignPattern.Jan02;

public class EnchantRoom extends Room {
    Spell spell;
    public EnchantRoom(int n, Spell spell) {
        super(n);
        this.spell = spell;
    }
}
