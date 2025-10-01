package exam.react.io.porting.projections;

import exam.react.io.porting.element.ChemistryAssetPhase;
import exam.react.io.porting.element.ChemistryAssetState;
import exam.react.io.porting.element.ChemistryAssetType;
import exam.react.io.porting.projections.request.ChemistryAssetRentRequest;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class RentedChemistryAsset {

    //signatures
    private Integer comNum;
    private Integer chemistryAssetNum;
    private String assetSignature;
    private ChemistryAssetState assetState;

    // Chemistry Asset Meta
    private String productName;
    private String MSDSName;
    private String auditSignature;
    private ChemistryAssetType assetType;
    private ChemistryAssetPhase assetPhase;
    private String relatedLaw;

    private Long rentStartDate;
    private Long rentEndDate;
    private Integer rentQuantity; // editable field
    private String quantityUnit;
    private String purpose; // editable field
    private String handlingFrequency; // editable field
    private Long startRentDate; // editable field
    private Long endRentDate; // editable field
    private String rentDepartment; // editable field
    private String usageLocation; // editable field
    private String rentalRequester; // editable field
    private String actualHandler; // editable field

    private String topFloor;
    private String floor;
    private Integer fcNum;

    private Long regDate;

    private String logicallyDeleted;
    private Long deletedAt;
}
