package exam.react.io.porting.projections.request;

import exam.react.io.porting.element.ChemistryAssetState;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChemistryAssetRentRequest extends FormalChemistryAssetRequest {

    /*
    최사 번호
    ssoKey
    물질 상태(입고, 불출, 반납, 폐기)
    */
    // hidden area
    private Integer comNum;
    private String ssoKey;
    private final ChemistryAssetState assetState = ChemistryAssetState.RENTED;

    // 불출 정보
    private Long rentDate; // editable field
    private Integer assetQuantity; // editable field
    private String quantityUnit;
    private String purpose; // editable field
    private String handlingFrequency; // editable field
    private Long rentStartDate; // editable field
    private Long rentEndDate; // editable field
    private String rentDepartment; // editable field
    private String usageLocation; // editable field
    private String rentalRequester; // editable field
    private String actualHandler; // editable field

    // 증빙 자료 파일
    // editable field / local transfer field
    private MultipartFile evidenceFile;

    // 입고 후 보관 장소
    // editable fields
    private String topFloor;
    private String floor;
    private Integer fcNum;
}
