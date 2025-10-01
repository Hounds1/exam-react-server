package exam.react.io.porting.projections.request;

import exam.react.io.porting.element.ChemistryAssetPhase;
import exam.react.io.porting.element.ChemistryAssetType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FormalChemistryAssetRequest {

    // TAG 정보
    private String assetSignature; // editable field

    // 화학물질 정보
    private String productName;
    private String MSDSName;
    private String auditSignature;
    private ChemistryAssetType assetType;
    private ChemistryAssetPhase assetPhase;
    private String relatedLaw;
}
