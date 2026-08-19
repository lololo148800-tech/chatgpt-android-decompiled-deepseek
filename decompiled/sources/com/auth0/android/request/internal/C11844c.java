package com.auth0.android.request.internal;

import mm.C17296C;
import p001A.C0017I0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p437Rn.C6949g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.auth0.android.request.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11844c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6949g f35973Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11844c(C6949g c6949g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35973Y = c6949g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11844c(this.f35973Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11844c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return ((C0017I0) this.f35973Y.f22238Z).m77m();
    }
}
