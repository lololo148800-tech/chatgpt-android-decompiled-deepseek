package com.revenuecat.purchases;

import com.revenuecat.purchases.amazon.attribution.AmazonDeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p009A7.FlM.nkFZpTrMPpn;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m18067d2 = {"Lcom/revenuecat/purchases/AttributionFetcherFactory;", "", "()V", "createAttributionFetcher", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "dispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AttributionFetcherFactory {
    public static final AttributionFetcherFactory INSTANCE = new AttributionFetcherFactory();

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AttributionFetcherFactory() {
    }

    public final DeviceIdentifiersFetcher createAttributionFetcher(Store store, Dispatcher dispatcher) {
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        int i10 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i10 == 1) {
            return new GoogleDeviceIdentifiersFetcher(dispatcher);
        }
        if (i10 == 2) {
            try {
                Object objNewInstance = AmazonDeviceIdentifiersFetcher.class.getConstructor(null).newInstance(null);
                AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher");
                return (DeviceIdentifiersFetcher) objNewInstance;
            } catch (ClassNotFoundException e10) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e10);
                throw e10;
            }
        }
        LogUtilsKt.errorLog$default(nkFZpTrMPpn.dAd + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
