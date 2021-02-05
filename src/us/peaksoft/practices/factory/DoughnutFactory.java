package us.peaksoft.practices.factory;

/**
 * Created by Sayfullah on 05.02.2021.
 */
public class DoughnutFactory {
    public Doughnut getDoughnut(DoughnutType doughnutType) {
        Doughnut result;
        switch (doughnutType) {
            case ALMOND:
                result = new AlmondDoughnut();
                break;
            case CHERRY:
                result = new CherryDoughnut();
                break;
            case CHOCOLATE:
                result = new ChocolateDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Doughnut not found " + doughnutType);
        }
        return result;
    }
}
