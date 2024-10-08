public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static void endCharacterCheck() {
        Month months[] = Month.values();
        for(Month month: months) {
            if (month.name().toLowerCase().endsWith("y")) {
                System.out.println(month + " ends with 'y'");
            } else {
                System.out.println(month + " Doesn't end with 'y'");
            }
        };
    }
}
