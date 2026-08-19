package com.openai.feature.voice.impl;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1081wc.C20862H;
import p124Ei.C2546u0;
import p124Ei.InterfaceC2548v0;
import p148Fi.C2769I0;
import p148Fi.C2809c;
import p148Fi.EnumC2753A0;
import p148Fi.EnumC2821g;
import p341Ni.C5784h0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$4", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {RCHTTPStatusCodes.BAD_REQUEST}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$4 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40171Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40172Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2548v0 f40173o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$4(InterfaceC2548v0 interfaceC2548v0, VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40172Z = voiceModeViewModelImpl;
        this.f40173o0 = interfaceC2548v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$4(this.f40173o0, this.f40172Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceModeViewModelImpl$onIntent$4) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM6183q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40171Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            boolean z6 = ((C2546u0) this.f40173o0).f7947a;
            this.f40171Y = 1;
            VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40172Z;
            voiceModeViewModelImpl.getClass();
            voiceModeViewModelImpl.m14397m(new VoiceModeViewModelImpl$handlePressed$2(z6));
            C5784h0 c5784h0 = voiceModeViewModelImpl.f39985l;
            if (z6) {
                voiceModeViewModelImpl.f39978L = true;
                voiceModeViewModelImpl.m14382u(C20862H.f66411s, C17690x.f56481Y);
                AbstractC8160o6.m8726a(c5784h0.f18872x, "Manually starting listening intently", null, 6);
                objM6183q = c5784h0.m6179l(new C2769I0(EnumC2821g.ActionRequest, new C2809c(EnumC2753A0.StartListeningIntently)), this);
                if (objM6183q != enumC19250a) {
                    objM6183q = c17296c;
                }
                if (objM6183q != enumC19250a) {
                    objM6183q = c17296c;
                }
            } else {
                objM6183q = c5784h0.m6183q(this);
                if (objM6183q != enumC19250a) {
                    objM6183q = c17296c;
                }
            }
            if (objM6183q == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
