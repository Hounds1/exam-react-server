package exam.react.io.porting.service;

import exam.react.io.porting.projections.request.ChemistryAssetDiscardRequest;
import exam.react.io.porting.projections.request.ChemistryAssetInboundRequest;
import exam.react.io.porting.projections.request.ChemistryAssetReleaseRequest;
import exam.react.io.porting.projections.request.ChemistryAssetRentRequest;

public interface ChemistryAssetStateTransitionService {

    void inbound(ChemistryAssetInboundRequest req);

    void rent(ChemistryAssetRentRequest req);

    void release(ChemistryAssetReleaseRequest req);

    void discard(ChemistryAssetDiscardRequest req);
}
