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


    // method get all days by day
    @Override
    public World getByDay(String day) {
        for (World world : worlds) {
            if (world.getMonday().equals(day)) {
                world.setMonday("Биринчи кун... саат 08:00 жумушка келем, 12:00-13:00 обед," +
                        "\n18:00 Жава сабагына катышам, 21:30 уйго кетем.");
                return world;
            }else if (world.getTuesday().equals(day)){
                world.setTuesday("Экинчи кун... саат 08:00 жумушка келем, 12:00-13:00 обед," +
                        "\n18:00 софт скилл жана англис тил сабагына катышам, 21:30 уйго кетем.");
                return world;
            }else if (world.getWednesday().equals(day)){
                world.setWednesday("Учунчу кун... саат 08:00 жумушка келем, 12:00-13:00 обед," +
                        "\n18:00 Жава сабагына катышам, 21:30 уйго кетем.");
                return world;
            }else if (world.getThursday().equals(day)){
                world.setThursday("Тортунчу кун... саат 08:00 жумушка келем, 12:00-13:00 обед," +
                        "\n18:00 софт скилл жана англис тил сабагына катышам, 21:30 уйго кетем.");
                return world;
            }else if (world.getFriday().equals(day)){
                world.setFriday("Бешинчи кун... саат 08:00 жумушка келем, 12:00-13:00 обед," +
                        "саат 13:15-14:00 жума намазга барам" +
                        "\n18:00 Жава сабагына катышам, 21:30 уйго кетем.");
                return world;
            }else if (world.getSaturday().equals(day)){
                world.setSaturday("Алтынчы кун... саат 08:00 жумушка келем, 12:00-13:00 обед," +
                        "\n жумуштан бош убакытта код жазам тапшырмаларды кайталайм 18:00 уйго кетем.");
                return world;
            }else if (world.getSunday().equals(day)){
                world.setSunday("Дем алыш... уйдо эс алам уй-булом менен сейилдеп келем" +
                        "\n кечинде кайрадан сабактарды кайталап код жазам.");
                return world;
            }
        }
        return null;
    }


}