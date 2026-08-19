package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p129En.C2582B;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.F */
/* JADX INFO: loaded from: classes2.dex */
public final class C2130F implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2184i f6524Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC19694j f6525Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C2130F(InterfaceC2184i interfaceC2184i, InterfaceC1440o interfaceC1440o) {
        this.f6524Y = interfaceC2184i;
        this.f6525Z = (AbstractC19694j) interfaceC1440o;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Bm.o, sm.j] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Bm.o, sm.j] */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        C2128E c2128e;
        C2130F c2130f;
        C2164W0 c2164w0;
        ?? r6;
        C2582B c2582b;
        Throwable th2;
        C2582B c2582b2;
        ?? r10;
        if (interfaceC18770c instanceof C2128E) {
            c2128e = (C2128E) interfaceC18770c;
            int i10 = c2128e.f6518Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2128e.f6518Z = i10 - Integer.MIN_VALUE;
            } else {
                c2128e = new C2128E(this, interfaceC18770c);
            }
        } else {
            c2128e = new C2128E(this, interfaceC18770c);
        }
        Object obj = c2128e.f6517Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2128e.f6518Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            try {
                InterfaceC2184i interfaceC2184i = this.f6524Y;
                c2128e.f6520p0 = this;
                c2128e.f6521q0 = interfaceC2186j;
                c2128e.f6518Z = 1;
                if (interfaceC2184i.mo3141d(interfaceC2186j, c2128e) == enumC19250a) {
                    return enumC19250a;
                }
                c2130f = this;
                c2582b = new C2582B(interfaceC2186j, c2128e.getContext());
                r10 = c2130f.f6525Z;
                c2128e.f6520p0 = c2582b;
                c2128e.f6521q0 = null;
                c2128e.f6518Z = 3;
                if (r10.invoke(c2582b, null, c2128e) == enumC19250a) {
                    return enumC19250a;
                }
                c2582b2 = c2582b;
                c2582b2.releaseIntercepted();
                return C17296C.f55119a;
            } catch (Throwable th3) {
                th = th3;
                c2130f = this;
                c2164w0 = new C2164W0(th);
                r6 = c2130f.f6525Z;
                c2128e.f6520p0 = th;
                c2128e.f6521q0 = null;
                c2128e.f6518Z = 2;
                if (AbstractC2124C.m3206e(c2164w0, r6, th, c2128e) == enumC19250a) {
                    return enumC19250a;
                }
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th4 = (Throwable) c2128e.f6520p0;
                AbstractC9233X.m9807c(obj);
                throw th4;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2582b2 = (C2582B) c2128e.f6520p0;
            try {
                AbstractC9233X.m9807c(obj);
                c2582b2.releaseIntercepted();
                return C17296C.f55119a;
            } catch (Throwable th5) {
                th2 = th5;
                c2582b2.releaseIntercepted();
                throw th2;
            }
        }
        interfaceC2186j = c2128e.f6521q0;
        c2130f = (C2130F) c2128e.f6520p0;
        try {
            AbstractC9233X.m9807c(obj);
            c2582b = new C2582B(interfaceC2186j, c2128e.getContext());
            try {
                r10 = c2130f.f6525Z;
                c2128e.f6520p0 = c2582b;
                c2128e.f6521q0 = null;
                c2128e.f6518Z = 3;
                if (r10.invoke(c2582b, null, c2128e) == enumC19250a) {
                    return enumC19250a;
                }
                c2582b2 = c2582b;
                c2582b2.releaseIntercepted();
                return C17296C.f55119a;
            } catch (Throwable th6) {
                th2 = th6;
                c2582b2 = c2582b;
                c2582b2.releaseIntercepted();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            c2164w0 = new C2164W0(th);
            r6 = c2130f.f6525Z;
            c2128e.f6520p0 = th;
            c2128e.f6521q0 = null;
            c2128e.f6518Z = 2;
            if (AbstractC2124C.m3206e(c2164w0, r6, th, c2128e) == enumC19250a) {
                return enumC19250a;
            }
            throw th;
        }
    }
}
