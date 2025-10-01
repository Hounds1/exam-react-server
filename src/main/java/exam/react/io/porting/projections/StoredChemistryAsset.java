package exam.react.io.porting.projections;

import exam.react.io.porting.element.ChemistryAssetContainType;
import exam.react.io.porting.element.ChemistryAssetPhase;
import exam.react.io.porting.element.ChemistryAssetStoreType;
import exam.react.io.porting.element.ChemistryAssetType;
import exam.react.io.porting.projections.request.ChemistryAssetInboundRequest;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class StoredChemistryAsset {

    // signatures
    private Integer comNum;
    private Integer chemistryAssetNum;
    private String assetSignature;

    // Chemistry Asset Meta
    private String productName;
    private String MSDSName;
    private String auditSignature;
    private ChemistryAssetType assetType;
    private ChemistryAssetPhase assetPhase;
    private String relatedLaw;

    // Inbound Meta
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

    // Storage Area
    private String topFloor;
    private String floor;
    private Integer fcNum;

    public static StoredChemistryAsset inbound(ChemistryAssetInboundRequest req) {
        return StoredChemistryAsset.builder()
                // Signatures
                .comNum(req.getComNum())
                .assetSignature(req.getAssetSignature())

                // Chemistry Asset Meta
                .productName(req.getProductName())
                .MSDSName(req.getMSDSName())
                .auditSignature(req.getAuditSignature())
                .assetType(req.getAssetType())
                .assetPhase(req.getAssetPhase())
                .relatedLaw(req.getRelatedLaw())

                // Inbound Meta
                .inboundDate(req.getInboundDate())
                .assetQuantity(req.getAssetQuantity())
                .quantityUnit(req.getQuantityUnit())
                .containingType(req.getContainingType())
                .inboundType(req.getInboundType())
                .storeType(req.getStoreType())
                .provideCompany(req.getProvideCompany())
                .chargeDetachment(req.getChargeDetachment())
                .chargeDepartment(req.getChargeDepartment())
                .handlingArea(req.getHandlingArea())
                .handlingUser(req.getHandlingUser())
                .description(req.getDescription())

                // Storage Area
                .topFloor(req.getTopFloor())
                .floor(req.getFloor())
                .fcNum(req.getFcNum())
                .build();
    }
}
