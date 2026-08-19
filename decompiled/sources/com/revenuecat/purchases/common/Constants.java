package com.revenuecat.purchases.common;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/common/Constants;", "", "()V", "GOOGLE_PLAY_MANAGEMENT_URL", "", "SUBS_ID_BASE_PLAN_ID_SEPARATOR", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Constants {
    public static final String GOOGLE_PLAY_MANAGEMENT_URL = "https://play.google.com/store/account/subscriptions";
    public static final Constants INSTANCE = new Constants();
    public static final String SUBS_ID_BASE_PLAN_ID_SEPARATOR = ":";

    private Constants() {
    }
}
