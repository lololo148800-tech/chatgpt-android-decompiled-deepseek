package com.openai.feature.gizmoshome.impl.details;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmoshome.impl.details.SnorlaxHomeViewModelImpl", m20656f = "SnorlaxHomeViewModelImpl.kt", m20657l = {110}, m20658m = "renameConversation-zkqvc0s")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SnorlaxHomeViewModelImpl$renameConversation$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SnorlaxHomeViewModelImpl f38367Y;

    /* JADX INFO: renamed from: Z */
    public String f38368Z;

    /* JADX INFO: renamed from: o0 */
    public String f38369o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38370p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ SnorlaxHomeViewModelImpl f38371q0;

    /* JADX INFO: renamed from: r0 */
    public int f38372r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxHomeViewModelImpl$renameConversation$1(SnorlaxHomeViewModelImpl snorlaxHomeViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38371q0 = snorlaxHomeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38370p0 = obj;
        this.f38372r0 |= Integer.MIN_VALUE;
        return SnorlaxHomeViewModelImpl.m14288p(this.f38371q0, null, null, this);
    }
}
