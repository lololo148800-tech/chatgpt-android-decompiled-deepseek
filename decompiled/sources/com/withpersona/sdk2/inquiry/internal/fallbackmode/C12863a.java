package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p342Nj.C5813g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12863a extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40767Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12869g f40768Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5813g f40769o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12863a(C12869g c12869g, C5813g c5813g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40768Z = c12869g;
        this.f40769o0 = c5813g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C12863a(this.f40768Z, this.f40769o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C12863a) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40767Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            FallbackModeService fallbackModeService = this.f40768Z.f40787a;
            FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.f40769o0.f18968a);
            this.f40767Y = 1;
            obj = fallbackModeService.m14536a(statusRequest, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
