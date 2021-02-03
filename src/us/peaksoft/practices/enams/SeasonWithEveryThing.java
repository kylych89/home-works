package us.peaksoft.practices.enams;

/**
 * Created by Alsalam on 03.02.2021.
 */
// энам сезон жонундо свойствасы конструктор жана геттер сеттери менен
public enum SeasonWithEveryThing {
    WINTER("Кыш"),
    SPRING("Жаз"),
    SUMMER("Жай"),
    AUTUMN("Куз");

    private String name;

    SeasonWithEveryThing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
