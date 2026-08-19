package p103Dn;

import mm.C17296C;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p129En.AbstractC2592c;
import p571X9.AbstractC9233X;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Dn.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C2206t implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6769Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1758z f6770Z;

    public /* synthetic */ C2206t(InterfaceC1758z interfaceC1758z, int i10) {
        this.f6769Y = i10;
        this.f6770Z = interfaceC1758z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C2204s c2204s;
        C2218z c2218z;
        switch (this.f6769Y) {
            case 0:
                if (interfaceC18770c instanceof C2204s) {
                    c2204s = (C2204s) interfaceC18770c;
                    int i10 = c2204s.f6763o0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2204s.f6763o0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c2204s = new C2204s(this, interfaceC18770c);
                    }
                } else {
                    c2204s = new C2204s(this, interfaceC18770c);
                }
                Object obj2 = c2204s.f6761Y;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c2204s.f6763o0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj2);
                    if (obj == null) {
                        obj = AbstractC2592c.f8037b;
                    }
                    c2204s.f6763o0 = 1;
                    if (((C1757y) this.f6770Z).f5030p0.mo2523o(obj, c2204s) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj2);
                }
                return C17296C.f55119a;
            case 1:
                if (interfaceC18770c instanceof C2218z) {
                    c2218z = (C2218z) interfaceC18770c;
                    int i12 = c2218z.f6800o0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c2218z.f6800o0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c2218z = new C2218z(this, interfaceC18770c);
                    }
                } else {
                    c2218z = new C2218z(this, interfaceC18770c);
                }
                Object obj3 = c2218z.f6798Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c2218z.f6800o0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj3);
                    if (obj == null) {
                        obj = AbstractC2592c.f8037b;
                    }
                    c2218z.f6800o0 = 1;
                    if (((C1757y) this.f6770Z).f5030p0.mo2523o(obj, c2218z) == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj3);
                }
                return C17296C.f55119a;
            default:
                Object objMo2523o = ((C1757y) this.f6770Z).f5030p0.mo2523o((C17853f) obj, interfaceC18770c);
                return objMo2523o == EnumC19250a.f61036Y ? objMo2523o : C17296C.f55119a;
        }
    }
}
