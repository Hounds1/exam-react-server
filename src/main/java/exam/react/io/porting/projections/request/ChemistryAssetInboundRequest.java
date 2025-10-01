package exam.react.io.porting.projections.request;

import exam.react.io.porting.element.ChemistryAssetContainType;
import exam.react.io.porting.element.ChemistryAssetState;
import exam.react.io.porting.element.ChemistryAssetStoreType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChemistryAssetInboundRequest extends FormalChemistryAssetRequest {

    /*
        최사 번호
        ssoKey
        물질 상태(입고, 불출, 반납, 폐기)
     */
    // hidden
    private Integer comNum;
    private String ssoKey;
    private final ChemistryAssetState assetState = ChemistryAssetState.INBOUND;

    // 입고 정보
    private String inboundDate; // editable field
    private Integer assetQuantity; // editable field
    private String quantityUnit; // editable field
    private ChemistryAssetContainType containingType; // editable field
    private String inboundType;
    private ChemistryAssetStoreType storeType; // editable field
    private String provideCompany;
    private String chargeDetachment;
    private String chargeDepartment;
    private String handlingArea;
    private String handlingUser;
    private String description; // editable field

    // 입고 후 보관 장소
    // editable fields
    private String topFloor;
    private String floor;
    private Integer fcNum;
}
