package us.peaksoft.homeWork10.services;

import us.peaksoft.homeWork10.models.World;

public class Work implements WorkServiceImpl {
    private String name;
    private String address;
    private World[] worlds;

    public Work(String name, String address, World[] worlds) {
        this.name = name;
        this.address = address;
        this.worlds = worlds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public World[] getWorlds() {
        return worlds;
    }

    public void setWorlds(World[] worlds) {
        this.worlds = worlds;
    }


    @Override
    public World getByDays(String day) {
        for (World world:worlds ) {
            if (world.getDays().equals(day)){
                return world;
            }
        }
        return null;
    }
}