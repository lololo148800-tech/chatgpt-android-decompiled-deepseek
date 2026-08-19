package com.openai.feature.voice.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p124Ei.C2528m0;
import p124Ei.C2532n1;
import p124Ei.InterfaceC2548v0;
import p341Ni.C5784h0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$14", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$14 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2548v0 f40140Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40141Z;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$14$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125601 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C125601 f40142Y = new C125601();

        public C125601() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C2532n1 setState = (C2532n1) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, true, setState.f7899f, null, null, null, false, false, false, false, null, 1073741823, 2047);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$14$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125612 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C125612 f40143Y = new C125612();

        public C125612() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C2532n1 setState = (C2532n1) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -1073741825, 2047);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$14(InterfaceC2548v0 interfaceC2548v0, VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40140Y = interfaceC2548v0;
        this.f40141Z = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$14(this.f40140Y, this.f40141Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        VoiceModeViewModelImpl$onIntent$14 voiceModeViewModelImpl$onIntent$14 = (VoiceModeViewModelImpl$onIntent$14) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        voiceModeViewModelImpl$onIntent$14.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean z6 = ((C2528m0) this.f40140Y).f7859a;
        VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40141Z;
        if (z6) {
            voiceModeViewModelImpl.m14397m(C125601.f40142Y);
            C5784h0 c5784h0 = voiceModeViewModelImpl.f39985l;
            c5784h0.m6178k();
            AbstractC8160o6.m8726a(c5784h0.f18872x, "Muting remote audio", null, 6);
            c5784h0.f18869u.setSpeakerMute(true);
        } else {
            voiceModeViewModelImpl.m14397m(C125612.f40143Y);
            boolean z10 = ((C2532n1) voiceModeViewModelImpl.m14391f()).f7874F;
            C5784h0 c5784h1 = voiceModeViewModelImpl.f39985l;
            if (!z10) {
                c5784h1.m6185s();
            }
            AbstractC8160o6.m8726a(c5784h1.f18872x, "Unmuting remote audio", null, 6);
            c5784h1.f18869u.setSpeakerMute(false);
        }
        return C17296C.f55119a;
    }
}
