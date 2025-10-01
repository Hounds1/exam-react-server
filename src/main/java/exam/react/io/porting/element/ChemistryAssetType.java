package exam.react.io.porting.element;

import lombok.Getter;

@Getter
public enum ChemistryAssetType implements EnumValue<String> {
    ACID("ACID", "산"),
    BASE("BASE", "염기"),
    ORGANIC("ORGANIC", "유기"),
    INORGANIC("INORGANIC", "무기");

    private final String type;
    private final String translated;

    ChemistryAssetType(String type, String translated) {
        this.type = type;
        this.translated = translated;
    }

    @Override
    public String getValue() {
        return type;
    }

    public boolean isAcid() {
        return this == ACID;
    }

    public boolean isBase() {
        return this == BASE;
    }

    public boolean isOrganic() {
        return this == ORGANIC;
    }

    public boolean isInorganic() {
        return this == INORGANIC;
    }
}
