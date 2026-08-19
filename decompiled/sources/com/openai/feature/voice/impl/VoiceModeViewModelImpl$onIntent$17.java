package com.openai.feature.voice.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p124Ei.C2489Z;
import p124Ei.InterfaceC2548v0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$17", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$17 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2548v0 f40150Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40151Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$17(InterfaceC2548v0 interfaceC2548v0, VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40150Y = interfaceC2548v0;
        this.f40151Z = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$17(this.f40150Y, this.f40151Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        VoiceModeViewModelImpl$onIntent$17 voiceModeViewModelImpl$onIntent$17 = (VoiceModeViewModelImpl$onIntent$17) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        voiceModeViewModelImpl$onIntent$17.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean z6 = ((C2489Z) this.f40150Y).f7758a;
        VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40151Z;
        if (z6) {
            voiceModeViewModelImpl.f39985l.m6178k();
        } else {
            voiceModeViewModelImpl.f39985l.m6185s();
        }
        return C17296C.f55119a;
    }
}
