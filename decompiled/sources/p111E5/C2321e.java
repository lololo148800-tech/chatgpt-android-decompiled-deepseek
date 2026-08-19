package p111E5;

import p025An.AbstractC0575H;
import p025An.C0621k0;
import p033B5.C0819c;
import p275Kn.C4821h;
import p275Kn.C4822i;
import p275Kn.InterfaceC4818e;
import p374P5.C6361n;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: E5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2321e implements InterfaceC2327k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2333q f7218a;

    /* JADX INFO: renamed from: b */
    public final C6361n f7219b;

    /* JADX INFO: renamed from: c */
    public final C4822i f7220c;

    /* JADX INFO: renamed from: d */
    public final C2330n f7221d;

    public C2321e(InterfaceC2333q interfaceC2333q, C6361n c6361n, C4822i c4822i, C2330n c2330n) {
        this.f7218a = interfaceC2333q;
        this.f7219b = c6361n;
        this.f7220c = c4822i;
        this.f7221d = c2330n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p111E5.InterfaceC2327k
    /* JADX INFO: renamed from: a */
    public final Object mo3428a(InterfaceC18770c interfaceC18770c) throws Throwable {
        C2320d c2320d;
        C4822i c4822i;
        C2321e c2321e;
        Object obj;
        Throwable th2;
        if (interfaceC18770c instanceof C2320d) {
            c2320d = (C2320d) interfaceC18770c;
            int i10 = c2320d.f7217q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2320d.f7217q0 = i10 - Integer.MIN_VALUE;
            } else {
                c2320d = new C2320d(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c2320d = new C2320d(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj2 = c2320d.f7215o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2320d.f7217q0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj2);
                c2320d.f7213Y = this;
                c4822i = this.f7220c;
                c2320d.f7214Z = c4822i;
                c2320d.f7217q0 = 1;
                if (c4822i.m5452a(c2320d) == enumC19250a) {
                    return enumC19250a;
                }
                c2321e = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = (InterfaceC4818e) c2320d.f7213Y;
                    try {
                        AbstractC9233X.m9807c(obj2);
                        C2325i c2325i = (C2325i) obj2;
                        ((C4821h) obj).m5454c();
                        return c2325i;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((C4821h) obj).m5454c();
                        throw th2;
                    }
                }
                C4822i c4822i2 = c2320d.f7214Z;
                c2321e = (C2321e) c2320d.f7213Y;
                AbstractC9233X.m9807c(obj2);
                c4822i = c4822i2;
            }
            C0819c c0819c = new C0819c(c2321e, 2);
            c2320d.f7213Y = c4822i;
            c2320d.f7214Z = null;
            c2320d.f7217q0 = 2;
            Object objM1168P = AbstractC0575H.m1168P(C18777j.f59682Y, new C0621k0(c0819c, null), c2320d);
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
            obj = c4822i;
            obj2 = objM1168P;
            C2325i c2325i2 = (C2325i) obj2;
            ((C4821h) obj).m5454c();
            return c2325i2;
        } catch (Throwable th4) {
            obj = c4822i;
            th2 = th4;
            ((C4821h) obj).m5454c();
            throw th2;
        }
    }
}
