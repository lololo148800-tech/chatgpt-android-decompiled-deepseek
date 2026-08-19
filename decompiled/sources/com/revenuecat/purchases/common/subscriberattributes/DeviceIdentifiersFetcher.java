package com.revenuecat.purchases.common.subscriberattributes;

import android.app.Application;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "", "", "Lmm/C;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;LBm/k;)V", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface DeviceIdentifiersFetcher {
    void getDeviceIdentifiers(Application applicationContext, InterfaceC1436k completion);
}
