package com.openai.feature.voice.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1705j;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p1155zi.C21936L0;
import p1155zi.EnumC22033m2;
import p124Ei.C2472Q;
import p124Ei.InterfaceC2548v0;
import p172Gi.EnumC3062D;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {373, 374}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40158Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40159Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2548v0 f40160o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$2(InterfaceC2548v0 interfaceC2548v0, VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40159Z = voiceModeViewModelImpl;
        this.f40160o0 = interfaceC2548v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$2(this.f40160o0, this.f40159Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceModeViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40158Y;
        VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40159Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C1970n c1970n = voiceModeViewModelImpl.f39994u.f41697b;
        this.f40158Y = 1;
        obj = AbstractC2124C.m3221t(c1970n, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C1705j c1705j = (C1705j) obj;
        C2472Q c2472q = (C2472Q) this.f40160o0;
        EnumC3062D enumC3062D = c2472q.f7703a;
        EnumC22033m2 enumC22033m2 = c2472q.f7704b;
        boolean z6 = c2472q.f7705c;
        C21936L0 c21936l0 = (C21936L0) voiceModeViewModelImpl.f39976J.getValue();
        boolean z10 = (c21936l0 != null ? c21936l0.f69488a : null) == null && !c1705j.f4879l;
        this.f40158Y = 2;
        if (voiceModeViewModelImpl.m14378q(enumC3062D, enumC22033m2, z6, z10, this) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
