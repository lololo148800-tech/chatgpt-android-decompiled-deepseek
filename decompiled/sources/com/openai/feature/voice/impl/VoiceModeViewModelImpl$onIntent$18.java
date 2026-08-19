package com.openai.feature.voice.impl;

import android.content.Intent;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p124Ei.C2531n0;
import p124Ei.C2532n1;
import p124Ei.InterfaceC2548v0;
import p341Ni.C5784h0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$18", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {513, 515, 516}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$18 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40152Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40153Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2548v0 f40154o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$18(InterfaceC2548v0 interfaceC2548v0, VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40153Z = voiceModeViewModelImpl;
        this.f40154o0 = interfaceC2548v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$18(this.f40154o0, this.f40153Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceModeViewModelImpl$onIntent$18) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C5784h0 c5784h0;
        Intent intent;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40152Y;
        C17296C c17296c = C17296C.f55119a;
        VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40153Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                c5784h0 = voiceModeViewModelImpl.f39985l;
                intent = ((C2531n0) this.f40154o0).f7868a;
                this.f40152Y = 3;
                if (c5784h0.m6182p(intent, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C2153Q0 c2153q0 = voiceModeViewModelImpl.f40343c;
        VoiceModeViewModelImpl$onIntent$18$state$1 voiceModeViewModelImpl$onIntent$18$state$1 = new VoiceModeViewModelImpl$onIntent$18$state$1(2, null);
        this.f40152Y = 1;
        obj = AbstractC2124C.m3220s(c2153q0, voiceModeViewModelImpl$onIntent$18$state$1, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        if (!((C2532n1) obj).f7889U) {
            return c17296c;
        }
        C5784h0 c5784h1 = voiceModeViewModelImpl.f39985l;
        this.f40152Y = 2;
        if (c5784h1.m6175h(this) == enumC19250a) {
            return enumC19250a;
        }
        c5784h0 = voiceModeViewModelImpl.f39985l;
        intent = ((C2531n0) this.f40154o0).f7868a;
        this.f40152Y = 3;
        if (c5784h0.m6182p(intent, this) == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }
}
