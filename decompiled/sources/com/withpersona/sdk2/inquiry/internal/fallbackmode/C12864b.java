package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p342Nj.C5813g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C12864b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f40770Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12869g f40771Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5813g f40772o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12864b(C12869g c12869g, C5813g c5813g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f40771Z = c12869g;
        this.f40772o0 = c5813g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C12864b(this.f40771Z, this.f40772o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12864b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40770Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C12863a c12863a = new C12863a(this.f40771Z, this.f40772o0, null);
            this.f40770Y = 1;
            obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c12863a, this);
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
