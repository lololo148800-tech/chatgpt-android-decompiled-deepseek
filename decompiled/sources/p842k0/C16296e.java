package p842k0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1014t1.EnumC19730g;
import p544W9.AbstractC8578W3;
import p571X9.AbstractC9233X;
import p749fd.C13628m;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: k0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16296e extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f50485Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f50486o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13628m f50487p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16296e(C13628m c13628m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50487p0 = c13628m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16296e c16296e = new C16296e(this.f50487p0, interfaceC18770c);
        c16296e.f50486o0 = obj;
        return c16296e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16296e) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        C19738o c19738o;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f50485Z;
        if (i10 != 0) {
            if (i10 == 1) {
                c19748y = (C19748y) this.f50486o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            c19738o = (C19738o) obj;
            if (c19738o != null) {
                c19738o.m20691a();
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c19748y = (C19748y) this.f50486o0;
        this.f50486o0 = c19748y;
        this.f50485Z = 1;
        obj = AbstractC8578W3.m9244a(c19748y, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C19738o c19738o2 = (C19738o) obj;
        c19738o2.m20691a();
        C13628m c13628m = this.f50487p0;
        ((C16305n) c13628m.f43062Z).f50513a.setValue(new C16303l(c19738o2.f62480c));
        this.f50486o0 = null;
        this.f50485Z = 2;
        obj = AbstractC16689K1.m18509f(c19748y, EnumC19730g.f62466Z, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c19738o = (C19738o) obj;
        if (c19738o != null) {
            c19738o.m20691a();
        }
        return C17296C.f55119a;
    }
}
