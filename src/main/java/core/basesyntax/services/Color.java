package core.basesyntax.services;

public enum Color {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    PURPLE("purple"),
    PINK("pink"),
    BROWN("brown"),
    GRAY("gray"),
    BLACK("black"),
    WHITE("white");

    private final String value;

    Color(String value) {

        this.value = value;
    }

    public String getValue() {

        return value;
    }
}
