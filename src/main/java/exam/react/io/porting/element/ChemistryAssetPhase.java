package exam.react.io.porting.element;

import lombok.Getter;

@Getter
public enum ChemistryAssetPhase implements EnumValue<String> {
    SOLID("SOLID", "고체"),
    LIQUID("LIQUID", "액체"),
    GAS("GAS", "가스"),
    PLASMA("PLASMA", "플라즈마");

    private final String phase;
    private final String translated;

    ChemistryAssetPhase(String phase, String translated) {
        this.phase = phase;
        this.translated = translated;
    }

    @Override
    public String getValue() {
        return phase;
    }

    public boolean isSolid() {
        return this == SOLID;
    }

    public boolean isLiquid() {
        return this == LIQUID;
    }

    public boolean isGas() {
        return this == GAS;
    }

    public boolean isPlasma() {
        return this == PLASMA;
    }
}
