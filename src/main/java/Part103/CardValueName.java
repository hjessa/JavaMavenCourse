package Part103;

public enum CardValueName {

    JOPEK(11),
    DAMA(12),
    KING(13),
    ACE(14);

    private int value;

    private CardValueName(int value){this.value = value;}

    public static CardValueName fromValue(int value) {
        for (CardValueName cvn : CardValueName.values()) {
            if (cvn.getValue() == value) {
                return cvn;
            }
        }
        return null; // lub wyrzuć wyjątek, jeśli wartość niepoprawna
    }

    public int getValue() {
        return value;
    }
}
