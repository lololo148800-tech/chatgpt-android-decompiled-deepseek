package com.openai.feature.gizmoshome.impl.edit;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmoshome.impl.edit.SnorlaxEditViewModelImpl", m20656f = "SnorlaxEditViewModel.kt", m20657l = {79}, m20658m = "saveSnorlax")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class SnorlaxEditViewModelImpl$saveSnorlax$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public SnorlaxEditViewModelImpl f38400Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38401Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SnorlaxEditViewModelImpl f38402o0;

    /* JADX INFO: renamed from: p0 */
    public int f38403p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxEditViewModelImpl$saveSnorlax$1(SnorlaxEditViewModelImpl snorlaxEditViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38402o0 = snorlaxEditViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38401Z = obj;
        this.f38403p0 |= Integer.MIN_VALUE;
        return SnorlaxEditViewModelImpl.m14291o(this.f38402o0, this);
    }
}
