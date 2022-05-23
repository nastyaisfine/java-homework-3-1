public class BonusMilesService {

    public int calculate(int cost) {

        int divider = 20; // рублей для одной бонусной мили
        int miles = cost / divider;

        return miles;
    }

}

