package com.revenuecat.purchases.utils;

import android.os.Build;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, m18067d2 = {"isAndroidNOrNewer", "", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AndroidVersionUtilsKt {
    public static final boolean isAndroidNOrNewer() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
