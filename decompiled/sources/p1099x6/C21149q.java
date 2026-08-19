package p1099x6;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p086D6.C1970n;
import p094De.C2025h;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p826j6.C16137F;
import p909nm.C17690x;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.C17870w;
import p917o6.InterfaceC17842J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: x6.q */
/* JADX INFO: loaded from: classes.dex */
public final class C21149q implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2186j f67208Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17852e f67209Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16137F f67210o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f67211p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C21143k f67212q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17867t f67213r0;

    public C21149q(InterfaceC2186j interfaceC2186j, C17852e c17852e, C16137F c16137f, C16525B c16525b, C21143k c21143k, C17867t c17867t) {
        this.f67208Y = interfaceC2186j;
        this.f67209Z = c17852e;
        this.f67210o0 = c16137f;
        this.f67211p0 = c16525b;
        this.f67212q0 = c21143k;
        this.f67213r0 = c17867t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C21148p c21148p;
        Object c1970n;
        if (interfaceC18770c instanceof C21148p) {
            c21148p = (C21148p) interfaceC18770c;
            int i10 = c21148p.f67206Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21148p.f67206Z = i10 - Integer.MIN_VALUE;
            } else {
                c21148p = new C21148p(this, interfaceC18770c);
            }
        } else {
            c21148p = new C21148p(this, interfaceC18770c);
        }
        Object obj2 = c21148p.f67205Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21148p.f67206Z;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            boolean zM18089b = AbstractC16544l.m18089b(obj, c17296c);
            C17852e c17852e = this.f67209Z;
            if (zM18089b) {
                InterfaceC17842J interfaceC17842J = c17852e.f56921a;
                c1970n = new C2025h(new C17853f(c17852e.f56922b, interfaceC17842J, null, null, AbstractC21154v.f67230a, C17690x.f56481Y, C17870w.f56967a, false), 3);
            } else {
                c1970n = new C1970n(this.f67210o0.m17695n(c17852e), 5, new C21152t(this.f67211p0, this.f67212q0, this.f67209Z, this.f67213r0, null));
            }
            c21148p.f67206Z = 1;
            if (this.f67208Y.mo395a(c1970n, c21148p) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj2);
        }
        return c17296c;
    }
}
