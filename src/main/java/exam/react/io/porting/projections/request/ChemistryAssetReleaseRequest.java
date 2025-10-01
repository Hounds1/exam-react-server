package exam.react.io.porting.projections.request;

import exam.react.io.porting.element.ChemistryAssetState;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChemistryAssetReleaseRequest extends FormalChemistryAssetRequest {

    /*
    최사 번호
    ssoKey
    물질 상태(입고, 불출, 반납, 폐기)
 */
    // hidden
    private Integer comNum;
    private String ssoKey;
    private final ChemistryAssetState assetState = ChemistryAssetState.RELEASED;

    // 반납 정보
    private Long releaseDate;
    private Integer assetQuantity;
    private String quantityUnit;
}
