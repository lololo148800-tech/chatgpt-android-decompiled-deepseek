package com.openai.feature.voice.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p124Ei.C2532n1;
import p148Fi.AbstractC2829i1;
import p148Fi.C2769I0;
import p148Fi.C2798X0;
import p148Fi.C2800Y0;
import p148Fi.C2808b1;
import p148Fi.C2809c;
import p148Fi.C2811c1;
import p148Fi.C2820f1;
import p148Fi.C2823g1;
import p148Fi.C2826h1;
import p148Fi.EnumC2753A0;
import p148Fi.EnumC2821g;
import p341Ni.C5784h0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$1", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {371}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40118Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40119Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$1(VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40119Z = voiceModeViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$1(this.f40119Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceModeViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM6183q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40118Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f40118Y = 1;
            VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40119Z;
            C2532n1 c2532n1 = (C2532n1) voiceModeViewModelImpl.m14391f();
            AbstractC2829i1 abstractC2829i1 = c2532n1.f7895b;
            if (AbstractC16544l.m18089b(abstractC2829i1, C2820f1.f8553a) ? true : AbstractC16544l.m18089b(abstractC2829i1, C2798X0.f8527a) ? true : AbstractC16544l.m18089b(abstractC2829i1, C2800Y0.f8529a)) {
                objM6183q = voiceModeViewModelImpl.m14378q(c2532n1.f7896c, null, false, false, this);
                if (objM6183q != enumC19250a) {
                    objM6183q = c17296c;
                }
            } else {
                boolean zM18089b = AbstractC16544l.m18089b(abstractC2829i1, C2826h1.f8565a) ? true : AbstractC16544l.m18089b(abstractC2829i1, C2823g1.f8561a) ? true : AbstractC16544l.m18089b(abstractC2829i1, C2808b1.f8535a);
                C5784h0 c5784h0 = voiceModeViewModelImpl.f39985l;
                if (zM18089b) {
                    AbstractC8160o6.m8726a(c5784h0.f18872x, "Resuming listening", null, 6);
                    objM6183q = c5784h0.m6179l(new C2769I0(EnumC2821g.ActionRequest, new C2809c(EnumC2753A0.ResumeListening)), this);
                    if (objM6183q != enumC19250a) {
                        objM6183q = c17296c;
                    }
                    if (objM6183q != enumC19250a) {
                        objM6183q = c17296c;
                    }
                } else if (!AbstractC16544l.m18089b(abstractC2829i1, C2811c1.f8539a) || (objM6183q = c5784h0.m6183q(this)) != enumC19250a) {
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
