package p129En;

import mm.C17296C;
import p025An.AbstractC0575H;
import p077Cn.C1743k;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p909nm.C17692z;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: En.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C2608s implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1743k f8080Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f8081Z;

    public C2608s(C1743k c1743k, int i10) {
        this.f8080Y = c1743k;
        this.f8081Z = i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C2607r c2607r;
        if (interfaceC18770c instanceof C2607r) {
            c2607r = (C2607r) interfaceC18770c;
            int i10 = c2607r.f8079o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2607r.f8079o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2607r = new C2607r(this, interfaceC18770c);
            }
        } else {
            c2607r = new C2607r(this, interfaceC18770c);
        }
        Object obj2 = c2607r.f8077Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2607r.f8079o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(obj2);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj2);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj2);
        C17692z c17692z = new C17692z(this.f8081Z, obj);
        c2607r.f8079o0 = 1;
        if (this.f8080Y.mo2523o(c17692z, c2607r) == enumC19250a) {
            return enumC19250a;
        }
        c2607r.f8079o0 = 2;
        if (AbstractC0575H.m1171S(c2607r) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
