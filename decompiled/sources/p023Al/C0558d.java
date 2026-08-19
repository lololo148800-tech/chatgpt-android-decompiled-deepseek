package p023Al;

import io.ktor.utils.p815io.C15071G;
import java.io.EOFException;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p488Tn.C7519b;
import p544W9.AbstractC8694q;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Al.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0558d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0559e f1773Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f1774Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558d(C0559e c0559e, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f1773Y = c0559e;
        this.f1774Z = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0558d(this.f1773Y, this.f1774Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C0558d c0558d = (C0558d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c0558d.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C0559e c0559e;
        C7519b c7519b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        long jMo7817U0 = 0;
        while (true) {
            c0559e = this.f1773Y;
            long jM9397d = AbstractC8694q.m9397d(c0559e.f1777d);
            long j10 = this.f1774Z;
            c7519b = c0559e.f1775b;
            if (jM9397d >= j10 || jMo7817U0 < 0) {
                break;
            }
            try {
                jMo7817U0 = c7519b.mo7817U0(c0559e.f1777d, Long.MAX_VALUE);
            } catch (EOFException unused) {
                jMo7817U0 = -1;
            }
        }
        if (jMo7817U0 == -1) {
            c7519b.close();
            c0559e.f1778e.m1279g0();
            c0559e.f1776c = new C15071G(null);
        }
        return C17296C.f55119a;
    }
}
