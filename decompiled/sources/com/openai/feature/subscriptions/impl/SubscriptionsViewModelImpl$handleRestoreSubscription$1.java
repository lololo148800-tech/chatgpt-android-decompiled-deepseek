package com.openai.feature.subscriptions.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.subscriptions.impl.SubscriptionsViewModelImpl", m20656f = "SubscriptionsViewModelImpl.kt", m20657l = {109}, m20658m = "handleRestoreSubscription")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SubscriptionsViewModelImpl$handleRestoreSubscription$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SubscriptionsViewModelImpl f39907Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39908Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SubscriptionsViewModelImpl f39909o0;

    /* JADX INFO: renamed from: p0 */
    public int f39910p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionsViewModelImpl$handleRestoreSubscription$1(SubscriptionsViewModelImpl subscriptionsViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39909o0 = subscriptionsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39908Z = obj;
        this.f39910p0 |= Integer.MIN_VALUE;
        return SubscriptionsViewModelImpl.m14372o(this.f39909o0, this);
    }
}
