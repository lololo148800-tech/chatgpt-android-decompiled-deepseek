package p899n5;

import p025An.AbstractC0575H;
import p025An.C0621k0;
import p033B5.C0819c;
import p1075w5.C20835m;
import p275Kn.C4821h;
import p275Kn.C4822i;
import p275Kn.InterfaceC4818e;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: n5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17487d implements InterfaceC17491h {

    /* JADX INFO: renamed from: a */
    public final AbstractC17497n f55947a;

    /* JADX INFO: renamed from: b */
    public final C20835m f55948b;

    /* JADX INFO: renamed from: c */
    public final C4822i f55949c;

    /* JADX INFO: renamed from: d */
    public final EnumC17493j f55950d;

    public C17487d(AbstractC17497n abstractC17497n, C20835m c20835m, C4822i c4822i, EnumC17493j enumC17493j) {
        this.f55947a = abstractC17497n;
        this.f55948b = c20835m;
        this.f55949c = c4822i;
        this.f55950d = enumC17493j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p899n5.InterfaceC17491h
    /* JADX INFO: renamed from: a */
    public final Object mo19196a(InterfaceC18770c interfaceC18770c) throws Throwable {
        C17486c c17486c;
        C4822i c4822i;
        C17487d c17487d;
        Object obj;
        Throwable th2;
        if (interfaceC18770c instanceof C17486c) {
            c17486c = (C17486c) interfaceC18770c;
            int i10 = c17486c.f55946q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17486c.f55946q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17486c = new C17486c(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c17486c = new C17486c(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj2 = c17486c.f55944o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17486c.f55946q0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj2);
                c17486c.f55942Y = this;
                c4822i = this.f55949c;
                c17486c.f55943Z = c4822i;
                c17486c.f55946q0 = 1;
                if (c4822i.m5452a(c17486c) == enumC19250a) {
                    return enumC19250a;
                }
                c17487d = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = (InterfaceC4818e) c17486c.f55942Y;
                    try {
                        AbstractC9233X.m9807c(obj2);
                        C17489f c17489f = (C17489f) obj2;
                        ((C4821h) obj).m5454c();
                        return c17489f;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((C4821h) obj).m5454c();
                        throw th2;
                    }
                }
                C4822i c4822i2 = c17486c.f55943Z;
                c17487d = (C17487d) c17486c.f55942Y;
                AbstractC9233X.m9807c(obj2);
                c4822i = c4822i2;
            }
            C0819c c0819c = new C0819c(c17487d, 17);
            c17486c.f55942Y = c4822i;
            c17486c.f55943Z = null;
            c17486c.f55946q0 = 2;
            Object objM1168P = AbstractC0575H.m1168P(C18777j.f59682Y, new C0621k0(c0819c, null), c17486c);
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
            obj = c4822i;
            obj2 = objM1168P;
            C17489f c17489f2 = (C17489f) obj2;
            ((C4821h) obj).m5454c();
            return c17489f2;
        } catch (Throwable th4) {
            obj = c4822i;
            th2 = th4;
            ((C4821h) obj).m5454c();
            throw th2;
        }
    }
}
