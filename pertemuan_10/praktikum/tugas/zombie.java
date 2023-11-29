package PBO.pertemuan_10.praktikum.tugas;

public class zombie implements destroyable {
    protected int health, level;

    public void heal() {

    }

    @Override
    public void destroyed() {
    }

    public String getZombieInfo() {
        String info = "Health = " + this.health;
        info += "\nLevel = " + this.level + "\n";
        return info;
    }
}
