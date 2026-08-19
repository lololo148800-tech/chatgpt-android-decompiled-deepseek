package com.revenuecat.purchases.common.caching;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0017\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m18067d2 = {"Lyn/b;", "PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD", "J", "", "SHARED_PREFERENCES_PREFIX", "Ljava/lang/String;", "", "CUSTOMER_INFO_SCHEMA_VERSION", TokenNames.f32012I, "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DeviceCacheKt {
    public static final int CUSTOMER_INFO_SCHEMA_VERSION = 3;
    private static final long PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD;
    private static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";

    static {
        C21554a c21554a = C21555b.f68260Z;
        PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD = AbstractC8128k6.m8644j(25, EnumC21557d.HOURS);
    }
}
