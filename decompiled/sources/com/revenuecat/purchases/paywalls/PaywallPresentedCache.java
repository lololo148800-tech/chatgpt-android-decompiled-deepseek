package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\nR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "", "<init>", "()V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getAndRemovePresentedEvent", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "paywallEvent", "Lmm/C;", "cachePresentedPaywall", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "event", "receiveEvent", "<set-?>", "lastPaywallImpressionEvent", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallPresentedCache {
    private PaywallEvent lastPaywallImpressionEvent;

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaywallEventType.values().length];
            try {
                iArr[PaywallEventType.IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallEventType.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final synchronized void cachePresentedPaywall(PaywallEvent paywallEvent) {
        AbstractC16544l.m18094g(paywallEvent, "paywallEvent");
        this.lastPaywallImpressionEvent = paywallEvent;
    }

    public final synchronized PaywallEvent getAndRemovePresentedEvent() {
        PaywallEvent paywallEvent;
        paywallEvent = this.lastPaywallImpressionEvent;
        this.lastPaywallImpressionEvent = null;
        return paywallEvent;
    }

    public final synchronized void receiveEvent(PaywallEvent event) {
        try {
            AbstractC16544l.m18094g(event, "event");
            int i10 = WhenMappings.$EnumSwitchMapping$0[event.getType().ordinal()];
            if (i10 == 1) {
                LogUtilsKt.verboseLog("Caching paywall impression event.");
                this.lastPaywallImpressionEvent = event;
            } else if (i10 == 2) {
                LogUtilsKt.verboseLog("Clearing cached paywall impression event.");
                this.lastPaywallImpressionEvent = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
