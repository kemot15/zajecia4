public class CourseOffer {
    //  double totalPrice = price1 + price2 + price3;
    //   double discountPrice = totalPrice * 0.9;
    // System.out.printf("  > Price after discount: %.2fzl (before: %.2fzl)", discountPrice, totalPrice);
    //double totalPrice;
    double afterDisscoun (double price1, double price2, double price3, int disscount){
        double sum = toatlPrice(price1, price2, price3);
        return sum - (sum*disscount)/100;

    }

    double toatlPrice (double price1, double price2, double price3) {
        return price1+price2+price3;
    }

}
