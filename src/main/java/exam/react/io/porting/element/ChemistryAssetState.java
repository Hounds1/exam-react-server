package exam.react.io.porting.element;

import lombok.Getter;

@Getter
public enum ChemistryAssetState implements EnumValue<String> {

    INBOUND("INBOUND", "입고", false),
    RESTORED("RESTORED", "재입고", false),
    RENTED("RENTED", "불출", false),
    RELEASED("RELEASED", "반납", false),
    DISCARDED("DISCARDED", "폐기", true);

    private final String state;
    private final String translated;
    private final boolean finalized;

    ChemistryAssetState(String state, String translated, boolean finalized) {
        this.state = state;
        this.translated = translated;
        this.finalized = finalized;
    }

    @Override
    public String getValue() {
        return state;
    }

    public boolean isInbound() {
        return this == INBOUND;
    }

    public boolean isRented() {
        return this == RENTED;
    }

    public boolean isReleased() {
        return this == RELEASED;
    }

    public boolean isDiscarded() {
        return this == DISCARDED;
    }
}
