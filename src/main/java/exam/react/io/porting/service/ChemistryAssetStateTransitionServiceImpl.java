package exam.react.io.porting.service;

import exam.react.io.porting.projections.StoredChemistryAsset;
import exam.react.io.porting.projections.request.ChemistryAssetDiscardRequest;
import exam.react.io.porting.projections.request.ChemistryAssetInboundRequest;
import exam.react.io.porting.projections.request.ChemistryAssetReleaseRequest;
import exam.react.io.porting.projections.request.ChemistryAssetRentRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChemistryAssetStateTransitionServiceImpl implements ChemistryAssetStateTransitionService {

    @Override
    public void inbound(ChemistryAssetInboundRequest req) {
        StoredChemistryAsset asset = StoredChemistryAsset.inbound(req);

        // ~ save into database

        // ~ return creation result
    }

    @Override
    public void rent(ChemistryAssetRentRequest req) {
        // ~ call asset from database

        // ~ calculate quantity (minus) and state transition (to State.RENTED)

        // ~ update origin asset

        // ~ create rental record

        // ~ insert record into database

        // ~ return rental result
    }

    @Override
    public void release(ChemistryAssetReleaseRequest req) {
        // ~ call asset from database

        // ~ calculate quantity (plus) and state transition (to State.RESTORED)

        // ~ update origin asset

        // ~ create release record

        // ~ insert record into database

        // ~ return release result
    }

    @Override
    public void discard(ChemistryAssetDiscardRequest req) {
        // ~ call asset from database;

        // ~ conclude logical deletion flag

        // ~ state transition (to State.DISCARDED == FINALIZED)

        // ~ suspend rental status if necessary

        // ~ update origin asset

        // ~ create discard record

        // ~ insert record into database

        // ~ return discard result
    }
}
