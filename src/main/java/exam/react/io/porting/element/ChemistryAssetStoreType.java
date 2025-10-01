package exam.react.io.porting.element;

import lombok.Getter;

@Getter
public enum ChemistryAssetStoreType implements EnumValue<String> {
    ROOM("ROOM", "상온");

    private final String type;
    private final String translated;

    ChemistryAssetStoreType(String type, String translated) {
        this.type = type;
        this.translated = translated;
    }

    @Override
    public String getValue() {
        return type;
    }

    public boolean isRoom() {
        return this == ROOM;
    }
}
