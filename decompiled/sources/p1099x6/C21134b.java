package p1099x6;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p001A.C0017I0;
import p060C6.C1607d;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p909nm.C17691y;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.InterfaceC17837E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: x6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21134b implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC17837E f67147Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f67148Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f67149o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21143k f67150p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17852e f67151q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17867t f67152r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC2186j f67153s0;

    public C21134b(InterfaceC17837E interfaceC17837E, C16525B c16525b, C16525B c16525b2, C21143k c21143k, C17852e c17852e, C17867t c17867t, InterfaceC2186j interfaceC2186j) {
        this.f67147Y = interfaceC17837E;
        this.f67148Z = c16525b;
        this.f67149o0 = c16525b2;
        this.f67150p0 = c21143k;
        this.f67151q0 = c17852e;
        this.f67152r0 = c17867t;
        this.f67153s0 = interfaceC2186j;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object mo395a(C17853f c17853f, InterfaceC18770c interfaceC18770c) {
        C21133a c21133a;
        C16525B c16525b;
        C21134b c21134b;
        Set set;
        C21134b c21134b2;
        C17853f c17853f2;
        C16525B c16525b2;
        C21143k c21143k;
        Set set2;
        C21134b c21134b3;
        InterfaceC2186j interfaceC2186j;
        if (interfaceC18770c instanceof C21133a) {
            c21133a = (C21133a) interfaceC18770c;
            int i10 = c21133a.f67146r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21133a.f67146r0 = i10 - Integer.MIN_VALUE;
            } else {
                c21133a = new C21133a(this, interfaceC18770c);
            }
        } else {
            c21133a = new C21133a(this, interfaceC18770c);
        }
        Object obj = c21133a.f67144p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21133a.f67146r0;
        if (i11 != 0) {
            if (i11 == 1) {
                c16525b2 = c21133a.f67143o0;
                c17853f2 = c21133a.f67142Z;
                c21134b2 = c21133a.f67141Y;
                AbstractC9233X.m9807c(obj);
            } else if (i11 == 2) {
                c17853f = c21133a.f67142Z;
                c21134b3 = c21133a.f67141Y;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = c21134b3.f67153s0;
                c21133a.f67141Y = null;
                c21133a.f67142Z = null;
                c21133a.f67146r0 = 3;
                if (interfaceC2186j.mo395a(c17853f, c21133a) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C16525B c16525b3 = this.f67148Z;
        InterfaceC17837E interfaceC17837E = this.f67147Y;
        if (interfaceC17837E != null && c16525b3.f51262Y != null) {
            throw new C1607d("Apollo: optimistic updates can only be applied with one network response", null);
        }
        c16525b3.f51262Y = c17853f;
        c16525b = this.f67149o0;
        if (c16525b.f51262Y == null) {
            if (interfaceC17837E != null) {
                C0017I0 c0017i0 = this.f67150p0.f67190b;
                UUID uuid = this.f67151q0.f56922b;
                c21133a.f67141Y = this;
                c21133a.f67142Z = c17853f;
                c21133a.f67143o0 = c16525b;
                c21133a.f67146r0 = 1;
                Object objM64B = c0017i0.m64B(uuid, c21133a);
                if (objM64B == enumC19250a) {
                    return enumC19250a;
                }
                c21134b2 = this;
                c17853f2 = c17853f;
                c16525b2 = c16525b;
                obj = objM64B;
            } else {
                set = C17691y.f56482Y;
                c21134b2 = this;
            }
            c16525b.f51262Y = set;
            c21134b = c21134b2;
        } else {
            c21134b = this;
        }
        c21143k = c21134b.f67150p0;
        Object obj2 = c21134b.f67149o0.f51262Y;
        AbstractC16544l.m18091d(obj2);
        set2 = (Set) obj2;
        c21133a.f67141Y = c21134b;
        c21133a.f67142Z = c17853f;
        c21133a.f67143o0 = null;
        c21133a.f67146r0 = 2;
        if (c21143k.m21591b(c21134b.f67151q0, c17853f, c21134b.f67152r0, set2, c21133a) == enumC19250a) {
            return enumC19250a;
        }
        c21134b3 = c21134b;
        interfaceC2186j = c21134b3.f67153s0;
        c21133a.f67141Y = null;
        c21133a.f67142Z = null;
        c21133a.f67146r0 = 3;
        if (interfaceC2186j.mo395a(c17853f, c21133a) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
        Set set3 = (Set) obj;
        c16525b = c16525b2;
        c17853f = c17853f2;
        set = set3;
        c16525b.f51262Y = set;
        c21134b = c21134b2;
        c21143k = c21134b.f67150p0;
        Object obj3 = c21134b.f67149o0.f51262Y;
        AbstractC16544l.m18091d(obj3);
        set2 = (Set) obj3;
        c21133a.f67141Y = c21134b;
        c21133a.f67142Z = c17853f;
        c21133a.f67143o0 = null;
        c21133a.f67146r0 = 2;
        if (c21143k.m21591b(c21134b.f67151q0, c17853f, c21134b.f67152r0, set2, c21133a) == enumC19250a) {
            return enumC19250a;
        }
        c21134b3 = c21134b;
        interfaceC2186j = c21134b3.f67153s0;
        c21133a.f67141Y = null;
        c21133a.f67142Z = null;
        c21133a.f67146r0 = 3;
        if (interfaceC2186j.mo395a(c17853f, c21133a) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
