package p103Dn;

import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p066Cc.C1625b;
import p129En.C2582B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.H */
/* JADX INFO: loaded from: classes2.dex */
public final class C2134H implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6538Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f6539Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f6540o0;

    /* JADX WARN: Multi-variable type inference failed */
    public C2134H(InterfaceC1439n interfaceC1439n, InterfaceC2184i interfaceC2184i) {
        this.f6538Y = 0;
        this.f6540o0 = (AbstractC19694j) interfaceC1439n;
        this.f6539Z = interfaceC2184i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r2v11, types: [Bm.o, sm.j] */
    /* JADX WARN: Type inference failed for: r2v14, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Bm.n, sm.j] */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        C2132G c2132g;
        Throwable th2;
        C2582B c2582b;
        C2134H c2134h;
        InterfaceC2186j interfaceC2186j2;
        InterfaceC2184i interfaceC2184i;
        C2136I c2136i;
        C2134H c2134h2;
        switch (this.f6538Y) {
            case 0:
                if (interfaceC18770c instanceof C2132G) {
                    c2132g = (C2132G) interfaceC18770c;
                    int i10 = c2132g.f6531Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2132g.f6531Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c2132g = new C2132G(this, interfaceC18770c);
                    }
                } else {
                    c2132g = new C2132G(this, interfaceC18770c);
                }
                Object obj = c2132g.f6530Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2132g.f6531Z;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C2582B c2582b2 = new C2582B(interfaceC2186j, c2132g.getContext());
                    try {
                        ?? r6 = this.f6540o0;
                        c2132g.f6533p0 = this;
                        c2132g.f6534q0 = interfaceC2186j;
                        c2132g.f6535r0 = c2582b2;
                        c2132g.f6531Z = 1;
                        if (r6.invoke(c2582b2, c2132g) == enumC19250a) {
                            return enumC19250a;
                        }
                        c2134h = this;
                        interfaceC2186j2 = interfaceC2186j;
                        c2582b = c2582b2;
                        c2582b.releaseIntercepted();
                        interfaceC2184i = c2134h.f6539Z;
                        c2132g.f6533p0 = null;
                        c2132g.f6534q0 = null;
                        c2132g.f6535r0 = null;
                        c2132g.f6531Z = 2;
                        if (interfaceC2184i.mo3141d(interfaceC2186j2, c2132g) == enumC19250a) {
                            return enumC19250a;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        c2582b = c2582b2;
                        c2582b.releaseIntercepted();
                        throw th2;
                    }
                } else if (i11 == 1) {
                    c2582b = c2132g.f6535r0;
                    interfaceC2186j2 = c2132g.f6534q0;
                    c2134h = c2132g.f6533p0;
                    try {
                        AbstractC9233X.m9807c(obj);
                        c2582b.releaseIntercepted();
                        interfaceC2184i = c2134h.f6539Z;
                        c2132g.f6533p0 = null;
                        c2132g.f6534q0 = null;
                        c2132g.f6535r0 = null;
                        c2132g.f6531Z = 2;
                        if (interfaceC2184i.mo3141d(interfaceC2186j2, c2132g) == enumC19250a) {
                            return enumC19250a;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        c2582b.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            case 1:
                if (interfaceC18770c instanceof C2136I) {
                    c2136i = (C2136I) interfaceC18770c;
                    int i12 = c2136i.f6542Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c2136i.f6542Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c2136i = new C2136I(this, interfaceC18770c);
                    }
                } else {
                    c2136i = new C2136I(this, interfaceC18770c);
                }
                Object objM3209h = c2136i.f6541Y;
                Object obj2 = EnumC19250a.f61036Y;
                int i13 = c2136i.f6542Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        interfaceC2186j = c2136i.f6545q0;
                        c2134h2 = c2136i.f6544p0;
                        AbstractC9233X.m9807c(objM3209h);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objM3209h);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(objM3209h);
                c2136i.f6544p0 = this;
                c2136i.f6545q0 = interfaceC2186j;
                c2136i.f6542Z = 1;
                objM3209h = AbstractC2124C.m3209h(this.f6539Z, interfaceC2186j, c2136i);
                if (objM3209h == obj2) {
                    return obj2;
                }
                c2134h2 = this;
                Throwable th5 = (Throwable) objM3209h;
                if (th5 != null) {
                    ?? r10 = c2134h2.f6540o0;
                    c2136i.f6544p0 = null;
                    c2136i.f6545q0 = null;
                    c2136i.f6542Z = 2;
                    if (r10.invoke(interfaceC2186j, th5, c2136i) == obj2) {
                        return obj2;
                    }
                }
                return C17296C.f55119a;
            case 2:
                Object objMo3141d = this.f6539Z.mo3141d(new C1625b(new C16556x(), interfaceC2186j, (InterfaceC1439n) this.f6540o0), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            default:
                Object objMo3141d2 = this.f6539Z.mo3141d(new C2163W(interfaceC2186j, (InterfaceC1439n) this.f6540o0), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2134H(InterfaceC2184i interfaceC2184i, InterfaceC1439n interfaceC1439n, int i10) {
        this.f6538Y = i10;
        switch (i10) {
            case 3:
                this.f6539Z = interfaceC2184i;
                this.f6540o0 = (AbstractC19694j) interfaceC1439n;
                break;
            default:
                this.f6539Z = interfaceC2184i;
                this.f6540o0 = (AbstractC19694j) interfaceC1439n;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2134H(InterfaceC2184i interfaceC2184i, InterfaceC1440o interfaceC1440o) {
        this.f6538Y = 1;
        this.f6539Z = interfaceC2184i;
        this.f6540o0 = (AbstractC19694j) interfaceC1440o;
    }
}
