package io;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p492U1.C7545j;
import p571X9.AbstractC9233X;
import p759g1.C13800b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: io.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C15046b extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ long f46766Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15105o f46767Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15046b(C15105o c15105o, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f46767Z = c15105o;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j10 = ((C13800b) obj2).f43584a;
        C15046b c15046b = new C15046b(this.f46767Z, (InterfaceC18770c) obj3);
        c15046b.f46766Y = j10;
        C17296C c17296c = C17296C.f55119a;
        c15046b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        long j10 = this.f46766Y;
        C15105o c15105o = this.f46767Z;
        c15105o.getClass();
        c15105o.f46993h.setValue(Boolean.valueOf(C13800b.m15306g(j10) < ((float) ((int) (((C7545j) c15105o.f46992g.getValue()).f23903a >> 32))) / 2.0f));
        return C17296C.f55119a;
    }
}
