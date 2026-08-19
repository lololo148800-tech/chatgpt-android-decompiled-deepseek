package com.revenuecat.purchases.common.caching;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18067d2 = {"<anonymous>", "", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DeviceCache$storefrontCacheKey$2 extends AbstractC16546n implements InterfaceC1426a {
    public static final DeviceCache$storefrontCacheKey$2 INSTANCE = new DeviceCache$storefrontCacheKey$2();

    public DeviceCache$storefrontCacheKey$2() {
        super(0);
    }

    @Override // p049Bm.InterfaceC1426a
    public final String invoke() {
        return "storefrontCacheKey";
    }
}
