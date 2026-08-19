package com.statsig.androidsdk;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigNetworkImpl", m20656f = "StatsigNetwork.kt", m20657l = {519}, m20658m = "initializeImpl$build_release")
@Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigNetworkImpl$initializeImpl$1 extends AbstractC19687c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$initializeImpl$1(StatsigNetworkImpl statsigNetworkImpl, InterfaceC18770c<? super StatsigNetworkImpl$initializeImpl$1> interfaceC18770c) {
        super(interfaceC18770c);
        this.this$0 = statsigNetworkImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initializeImpl$build_release(null, null, null, null, null, null, null, null, null, this);
    }
}
