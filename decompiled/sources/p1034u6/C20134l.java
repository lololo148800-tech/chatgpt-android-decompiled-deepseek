package p1034u6;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p060C6.AbstractC1604a;
import p571X9.AbstractC9233X;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: u6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C20134l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f63776Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f63777Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20134l(C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63777Z = c16525b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20134l c20134l = new C20134l(this.f63777Z, interfaceC18770c);
        c20134l.f63776Y = obj;
        return c20134l;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20134l c20134l = (C20134l) create((C17853f) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20134l.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC1604a abstractC1604a = ((C17853f) this.f63776Y).f56935e;
        if (abstractC1604a != null) {
            C16525B c16525b = this.f63777Z;
            if (c16525b.f51262Y == null) {
                c16525b.f51262Y = abstractC1604a;
            }
        }
        return C17296C.f55119a;
    }
}
