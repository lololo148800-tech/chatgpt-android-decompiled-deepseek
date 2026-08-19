package p103Dn;

import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p002A0.C0132i;
import p066Cc.C1625b;
import p086D6.C1971o;
import p129En.C2590a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Dn.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2146N implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6575Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i f6576Z;

    public /* synthetic */ C2146N(InterfaceC2184i interfaceC2184i, int i10) {
        this.f6575Y = i10;
        this.f6576Z = interfaceC2184i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        C2155S c2155s;
        C2590a e10;
        Object obj;
        switch (this.f6575Y) {
            case 0:
                Object objMo3141d = this.f6576Z.mo3141d(new C0132i(new C16558z(), 4, interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            case 1:
                if (interfaceC18770c instanceof C2155S) {
                    c2155s = (C2155S) interfaceC18770c;
                    int i10 = c2155s.f6602Z;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2155s.f6602Z = i10 - Integer.MIN_VALUE;
                    } else {
                        c2155s = new C2155S(this, interfaceC18770c);
                    }
                } else {
                    c2155s = new C2155S(this, interfaceC18770c);
                }
                Object obj2 = c2155s.f6601Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2155s.f6602Z;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c2155s.f6604p0;
                    try {
                        AbstractC9233X.m9807c(obj2);
                    } catch (C2590a e11) {
                        e10 = e11;
                        if (e10.f8031Y != obj) {
                            throw e10;
                        }
                    }
                    break;
                } else {
                    AbstractC9233X.m9807c(obj2);
                    Object obj3 = new Object();
                    C16558z c16558z = new C16558z();
                    try {
                        InterfaceC2184i interfaceC2184i = this.f6576Z;
                        C1625b c1625b = new C1625b(c16558z, interfaceC2186j, obj3, 3);
                        c2155s.f6604p0 = obj3;
                        c2155s.f6602Z = 1;
                        if (interfaceC2184i.mo3141d(c1625b, c2155s) == enumC19250a) {
                            return enumC19250a;
                        }
                    } catch (C2590a e12) {
                        e10 = e12;
                        obj = obj3;
                        if (e10.f8031Y != obj) {
                            throw e10;
                        }
                    }
                }
                return C17296C.f55119a;
            case 2:
                Object objMo3141d2 = this.f6576Z.mo3141d(new C1971o(interfaceC2186j, 3), interfaceC18770c);
                return objMo3141d2 == EnumC19250a.f61036Y ? objMo3141d2 : C17296C.f55119a;
            default:
                Object objMo3141d3 = this.f6576Z.mo3141d(new C1971o(interfaceC2186j, 24), interfaceC18770c);
                return objMo3141d3 == EnumC19250a.f61036Y ? objMo3141d3 : C17296C.f55119a;
        }
    }
}
