package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.PurchaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p025An.C0644w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, m18067d2 = {"toGooglePurchaseState", "", "Lcom/revenuecat/purchases/models/PurchaseState;", "toRevenueCatPurchaseState", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PurchaseStateConversionsKt {

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseState.values().length];
            try {
                iArr[PurchaseState.UNSPECIFIED_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseState.PURCHASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toGooglePurchaseState(PurchaseState purchaseState) {
        AbstractC16544l.m18094g(purchaseState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[purchaseState.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        throw new C0644w();
    }

    public static final PurchaseState toRevenueCatPurchaseState(int i10) {
        if (i10 == 0) {
            return PurchaseState.UNSPECIFIED_STATE;
        }
        if (i10 != 1) {
            return i10 != 2 ? PurchaseState.UNSPECIFIED_STATE : PurchaseState.PENDING;
        }
        return PurchaseState.PURCHASED;
    }
}
