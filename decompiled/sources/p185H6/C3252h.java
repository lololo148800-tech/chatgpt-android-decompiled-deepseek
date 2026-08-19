package p185H6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p001A.AbstractC0010F;
import p005A3.C0326m;
import p026Ao.InterfaceC0677k;
import p032B4.C0806a;
import p049Bm.InterfaceC1439n;
import p059C5.C1592j;
import p060C6.AbstractC1604a;
import p060C6.C1605b;
import p094De.C2025h;
import p1006s6.C19452b;
import p103Dn.AbstractC2124C;
import p103Dn.C2130F;
import p103Dn.C2134H;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1113xn.AbstractC21329w;
import p112E6.C2348g;
import p112E6.C2349h;
import p129En.C2602m;
import p136F6.AbstractC2674a;
import p571X9.AbstractC9166L3;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9799R4;
import p658b5.C11238i;
import p909nm.AbstractC17680n;
import p917o6.C17852e;
import p917o6.C17867t;
import p917o6.InterfaceC17842J;
import p942p6.C18301e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: H6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3252h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public long f9895Y;

    /* JADX INFO: renamed from: Z */
    public int f9896Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f9897o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0326m f9898p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C11238i f9899q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17852e f9900r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C17867t f9901s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3252h(C0326m c0326m, C11238i c11238i, C17852e c17852e, C17867t c17867t, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f9898p0 = c0326m;
        this.f9899q0 = c11238i;
        this.f9900r0 = c17852e;
        this.f9901s0 = c17867t;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3252h c3252h = new C3252h(this.f9898p0, this.f9899q0, this.f9900r0, this.f9901s0, interfaceC18770c);
        c3252h.f9897o0 = obj;
        return c3252h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3252h) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x007d: MOVE (r16 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:126), block:B:23:0x007b */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x007b: MOVE (r19 I:??[long, double]) = (r9 I:??[long, double]) (LINE:124), block:B:23:0x007b */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j10;
        long j11;
        InterfaceC2186j interfaceC2186j;
        InterfaceC2186j interfaceC2186j2;
        AbstractC1604a abstractC1604a;
        C18301e c18301e;
        InterfaceC2184i c2025h;
        InterfaceC2186j interfaceC2186j3;
        long jCurrentTimeMillis;
        Object objMo4133a;
        int i10 = 0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f9896Z;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC18770c interfaceC18770c = null;
        C0326m c0326m = this.f9898p0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    jCurrentTimeMillis = this.f9895Y;
                    interfaceC2186j3 = (InterfaceC2186j) this.f9897o0;
                    AbstractC9233X.m9807c(obj);
                    objMo4133a = obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
            }
            AbstractC9233X.m9807c(obj);
            interfaceC2186j3 = (InterfaceC2186j) this.f9897o0;
            int i12 = AbstractC2674a.f8212a;
            jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0((ArrayList) c0326m.f1142d, (C3245a) c0326m.f1143e);
            C11238i c11238i = this.f9899q0;
            this.f9897o0 = interfaceC2186j3;
            this.f9895Y = jCurrentTimeMillis;
            this.f9896Z = 1;
            if (arrayListM19362l0.size() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            objMo4133a = ((InterfaceC3250f) arrayListM19362l0.get(0)).mo4133a(c11238i, new C3246b(1, arrayListM19362l0), this);
            if (objMo4133a == enumC19250a) {
                return enumC19250a;
            }
            c18301e = (C18301e) objMo4133a;
            j11 = jCurrentTimeMillis;
            interfaceC2186j2 = interfaceC2186j3;
            abstractC1604a = null;
        } catch (AbstractC1604a e10) {
            j11 = j10;
            interfaceC2186j2 = interfaceC2186j;
            abstractC1604a = e10;
            c18301e = null;
        }
        C17852e c17852e = this.f9900r0;
        if (c18301e == null) {
            InterfaceC17842J interfaceC17842J = c17852e.f56921a;
            AbstractC16544l.m18091d(abstractC1604a);
            c0326m.getClass();
            c2025h = new C2025h(C0326m.m947o(interfaceC17842J, abstractC1604a), 3);
        } else {
            InterfaceC0677k interfaceC0677k = c18301e.f58418c;
            ArrayList arrayList = c18301e.f58417b;
            int i13 = c18301e.f58416a;
            if (200 > i13 || i13 >= 300) {
                InterfaceC17842J interfaceC17842J2 = c17852e.f56921a;
                if (!c0326m.f1139a) {
                    interfaceC0677k.close();
                }
                c2025h = new C2025h(C0326m.m947o(interfaceC17842J2, new C1605b(i13, AbstractC0010F.m19c(i13, "Http request failed with status code `", "`"), arrayList)), 3);
            } else {
                String strM10420b = AbstractC9799R4.m10420b(arrayList);
                C17867t c17867t = this.f9901s0;
                if (strM10420b == null || !AbstractC21329w.m21734u(strM10420b, "multipart/", true)) {
                    InterfaceC17842J interfaceC17842J3 = c17852e.f56921a;
                    c0326m.getClass();
                    C0806a c0806aM19598a = AbstractC9166L3.m9718c(null, null, c17867t, interfaceC17842J3, new C19452b(interfaceC0677k)).m19598a();
                    c0806aM19598a.f2235a = true;
                    c2025h = new C2025h(c0806aM19598a.m1843b(), 3);
                } else {
                    InterfaceC17842J interfaceC17842J4 = c17852e.f56921a;
                    c0326m.getClass();
                    C16525B c16525b = new C16525B();
                    C16525B c16525b2 = new C16525B();
                    c2025h = new C2134H(new C3254j(new C2130F(new C2219z0(new C2348g(c16525b2, c18301e, null)), new C2349h(c16525b2, interfaceC18770c, i10)), interfaceC17842J4, c17867t, c0326m, c16525b, 0), new C1592j(interfaceC17842J4, interfaceC18770c, 6));
                }
            }
        }
        this.f9897o0 = null;
        this.f9896Z = 2;
        AbstractC2124C.m3219r(interfaceC2186j2);
        Object objMo3141d = c2025h.mo3141d(new C2602m(interfaceC2186j2, this.f9898p0, this.f9900r0, c18301e, j11), this);
        EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
        if (objMo3141d != enumC19250a2) {
            objMo3141d = c17296c;
        }
        if (objMo3141d != enumC19250a2) {
            objMo3141d = c17296c;
        }
        return objMo3141d == enumC19250a ? enumC19250a : c17296c;
    }
}
