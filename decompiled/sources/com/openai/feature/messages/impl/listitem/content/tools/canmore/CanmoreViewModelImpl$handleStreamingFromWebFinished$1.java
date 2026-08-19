package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl", m20656f = "CanmoreViewModel.kt", m20657l = {259, 262}, m20658m = "handleStreamingFromWebFinished")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class CanmoreViewModelImpl$handleStreamingFromWebFinished$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public CanmoreViewModelImpl f38905Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38906Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ CanmoreViewModelImpl f38907o0;

    /* JADX INFO: renamed from: p0 */
    public int f38908p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanmoreViewModelImpl$handleStreamingFromWebFinished$1(CanmoreViewModelImpl canmoreViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38907o0 = canmoreViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38906Z = obj;
        this.f38908p0 |= Integer.MIN_VALUE;
        return CanmoreViewModelImpl.m14319n(this.f38907o0, this);
    }
}
