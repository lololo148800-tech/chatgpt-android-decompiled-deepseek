package p949pj;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p178H.C3124Q;
import p536W.C8408d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C18488s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8408d f58936Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18488s(C8408d c8408d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58936Y = c8408d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18488s(this.f58936Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18488s c18488s = (C18488s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18488s.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        try {
            this.f58936Y.m8961g();
        } catch (C3124Q unused) {
        }
        return C17296C.f55119a;
    }
}
