package com.openai.feature.voice.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p124Ei.C2495b0;
import p124Ei.C2532n1;
import p124Ei.InterfaceC2548v0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$15", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$15 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ VoiceModeViewModelImpl f40144Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2548v0 f40145Z;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$15$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125621 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ InterfaceC2548v0 f40146Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125621(InterfaceC2548v0 interfaceC2548v0) {
            super(1);
            this.f40146Y = interfaceC2548v0;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C2532n1 setState = (C2532n1) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, ((C2495b0) this.f40146Y).f7776a, null, null, false, false, false, false, null, -1, 2046);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$15(InterfaceC2548v0 interfaceC2548v0, VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40144Y = voiceModeViewModelImpl;
        this.f40145Z = interfaceC2548v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$15(this.f40145Z, this.f40144Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        VoiceModeViewModelImpl$onIntent$15 voiceModeViewModelImpl$onIntent$15 = (VoiceModeViewModelImpl$onIntent$15) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        voiceModeViewModelImpl$onIntent$15.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f40144Y.m14397m(new C125621(this.f40145Z));
        return C17296C.f55119a;
    }
}
