package JavaBasics.task_11_1;

import JavaBasics.task_11_1.weapon.*;

public class Player {
    private Weapon weaponSlots [];

    public Player() {
        weaponSlots = new Weapon[]{
                new Gun(),
                new MachineGun(),
                new RPG(),
                new WaterGun(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if(slot < 1 || slot > getSlotsCount()){
            System.out.printf("У игрока нет оружия под номером %d\n", slot);
        } else {
            Weapon weapon = weaponSlots[slot - 1];
            weapon.shot();
        }
    }
}


