package com.openai.feature.jawbone.impl.tools;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.jawbone.impl.tools.JawboneToolViewModelImpl", m20656f = "JawboneToolViewModelImpl.kt", m20657l = {146}, m20658m = "enableJawbone-t6WcDUE")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class JawboneToolViewModelImpl$enableJawbone$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public JawboneToolViewModelImpl f38444Y;

    /* JADX INFO: renamed from: Z */
    public String f38445Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f38446o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ JawboneToolViewModelImpl f38447p0;

    /* JADX INFO: renamed from: q0 */
    public int f38448q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JawboneToolViewModelImpl$enableJawbone$1(JawboneToolViewModelImpl jawboneToolViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38447p0 = jawboneToolViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38446o0 = obj;
        this.f38448q0 |= Integer.MIN_VALUE;
        return JawboneToolViewModelImpl.m14293n(this.f38447p0, null, false, this);
    }
}
