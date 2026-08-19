package fk;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: fk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13682c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13684e f43177Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13682c(C13684e c13684e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f43177Y = c13684e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13682c(this.f43177Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13682c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        try {
            return Boolean.valueOf(this.f43177Y.f43179a.delete());
        } catch (Exception unused) {
            return C17296C.f55119a;
        }
    }
}
