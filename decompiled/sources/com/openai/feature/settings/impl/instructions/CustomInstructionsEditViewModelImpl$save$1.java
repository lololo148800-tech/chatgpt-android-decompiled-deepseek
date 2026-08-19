package com.openai.feature.settings.impl.instructions;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.instructions.CustomInstructionsEditViewModelImpl", m20656f = "CustomInstructionsEditViewModel.kt", m20657l = {107}, m20658m = "save")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class CustomInstructionsEditViewModelImpl$save$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public CustomInstructionsEditViewModelImpl f39572Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f39573Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ CustomInstructionsEditViewModelImpl f39574o0;

    /* JADX INFO: renamed from: p0 */
    public int f39575p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomInstructionsEditViewModelImpl$save$1(CustomInstructionsEditViewModelImpl customInstructionsEditViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f39574o0 = customInstructionsEditViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f39573Z = obj;
        this.f39575p0 |= Integer.MIN_VALUE;
        return CustomInstructionsEditViewModelImpl.m14356n(this.f39574o0, this);
    }
}
