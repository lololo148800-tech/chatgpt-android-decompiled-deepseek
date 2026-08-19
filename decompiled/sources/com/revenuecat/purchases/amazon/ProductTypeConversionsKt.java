package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p025An.C0644w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m18067d2 = {"toRevenueCatProductType", "Lcom/revenuecat/purchases/ProductType;", "Lcom/amazon/device/iap/model/ProductType;", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ProductTypeConversionsKt {

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.ENTITLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.ProductType toRevenueCatProductType(ProductType productType) {
        AbstractC16544l.m18094g(productType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i10 == 1) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i10 == 2) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i10 == 3) {
            return com.revenuecat.purchases.ProductType.SUBS;
        }
        throw new C0644w(17);
    }
}
