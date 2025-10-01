package exam.react.io.porting.element;

import lombok.Getter;

@Getter
public enum ChemistryAssetContainType implements EnumValue<String> {
    GLASS("GLASS", "유리");

    private final String type;
    private final String translated;

    ChemistryAssetContainType(String type, String translated) {
        this.type = type;
        this.translated = translated;
    }

    @Override
    public String getValue() {
        return type;
    }

    public boolean isGlass() {
        return this == GLASS;
    }
}
