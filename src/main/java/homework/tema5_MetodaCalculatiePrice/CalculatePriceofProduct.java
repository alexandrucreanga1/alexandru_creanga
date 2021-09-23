package homework.tema5_MetodaCalculatiePrice;

public class CalculatePriceofProduct {


    public double calculatePrice (double basePrice, double VAT) {
        return basePrice + (VAT/100 * basePrice);

    }

}
