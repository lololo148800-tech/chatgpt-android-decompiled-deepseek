package com.openai.feature.conversations.impl.input;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1025te.EnumC19873d;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl", m20656f = "InputViewModelImpl.kt", m20657l = {424, 427, 427}, m20658m = "imageSelect")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class InputViewModelImpl$imageSelect$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public InputViewModelImpl f37930Y;

    /* JADX INFO: renamed from: Z */
    public EnumC19873d f37931Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f37932o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InputViewModelImpl f37933p0;

    /* JADX INFO: renamed from: q0 */
    public int f37934q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$imageSelect$1(InputViewModelImpl inputViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f37933p0 = inputViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f37932o0 = obj;
        this.f37934q0 |= Integer.MIN_VALUE;
        int i10 = InputViewModelImpl.f37880t;
        return this.f37933p0.m14262n(null, false, this);
    }
}
