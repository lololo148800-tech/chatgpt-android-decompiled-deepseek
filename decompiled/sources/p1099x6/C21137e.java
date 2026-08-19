package p1099x6;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.C0017I0;
import p002A0.C0132i;
import p049Bm.InterfaceC1439n;
import p060C6.C1608e;
import p1034u6.AbstractC20125c;
import p1034u6.C20126d;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1057v6.C20461a;
import p136F6.AbstractC2674a;
import p571X9.AbstractC9233X;
import p826j6.C16137F;
import p909nm.C17690x;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.C17867t;
import p917o6.C17870w;
import p917o6.InterfaceC17835C;
import p917o6.InterfaceC17842J;
import p917o6.InterfaceC17845M;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C21137e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f67164Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f67165Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f67166o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21143k f67167p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17852e f67168q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17867t f67169r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16137F f67170s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21137e(boolean z6, C21143k c21143k, C17852e c17852e, C17867t c17867t, C16137F c16137f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67166o0 = z6;
        this.f67167p0 = c21143k;
        this.f67168q0 = c17852e;
        this.f67169r0 = c17867t;
        this.f67170s0 = c16137f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21137e c21137e = new C21137e(this.f67166o0, this.f67167p0, this.f67168q0, this.f67169r0, this.f67170s0, interfaceC18770c);
        c21137e.f67165Z = obj;
        return c21137e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21137e) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C17853f c17853f;
        C17690x c17690x = C17690x.f56481Y;
        C17870w c17870w = C17870w.f56967a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67164Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f67165Z;
            C17867t c17867t = this.f67169r0;
            boolean z6 = this.f67166o0;
            C17852e c17852e = this.f67168q0;
            C21143k c21143k = this.f67167p0;
            if (z6) {
                c21143k.getClass();
                InterfaceC17842J interfaceC17842J = c17852e.f56921a;
                InterfaceC17835C executionContext = c17852e.f56923c;
                UUID uuid = c17852e.f56922b;
                int i11 = AbstractC2674a.f8212a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C0017I0 c0017i0 = c21143k.f67190b;
                    if (executionContext.mo4141d(AbstractC20125c.f63752a) != null) {
                        throw new ClassCastException();
                    }
                    InterfaceC17845M interfaceC17845M = (InterfaceC17845M) c0017i0.m63A(interfaceC17842J, c17867t, C20461a.f64952b);
                    AbstractC16544l.m18094g(executionContext, "executionContext");
                    c17870w.mo4139b(executionContext);
                    c17853f = new C17853f(uuid, interfaceC17842J, interfaceC17845M, null, null, c17690x, executionContext.mo4139b(new C20126d(jCurrentTimeMillis, System.currentTimeMillis(), 0L, 0L, true, null)), true);
                    this.f67164Y = 1;
                    if (interfaceC2186j.mo395a(c17853f, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } catch (C1608e e10) {
                    AbstractC16544l.m18094g(executionContext, "executionContext");
                    c17870w.mo4139b(executionContext);
                    c17853f = new C17853f(uuid, interfaceC17842J, null, null, e10, c17690x, executionContext.mo4139b(new C20126d(jCurrentTimeMillis, System.currentTimeMillis(), 0L, 0L, false, null)), true);
                }
            } else {
                c21143k.getClass();
                int i12 = AbstractC2674a.f8212a;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                InterfaceC2184i interfaceC2184iM17695n = this.f67170s0.m17695n(c17852e);
                C21142j c21142j = new C21142j(c21143k, c17852e, c17867t, null);
                this.f67164Y = 2;
                AbstractC2124C.m3219r(interfaceC2186j);
                Object objMo3141d = interfaceC2184iM17695n.mo3141d(new C0132i(new C21141i(interfaceC2186j, jCurrentTimeMillis2), 6, c21142j), this);
                if (objMo3141d != enumC19250a) {
                    objMo3141d = c17296c;
                }
                if (objMo3141d != enumC19250a) {
                    objMo3141d = c17296c;
                }
                if (objMo3141d != enumC19250a) {
                    objMo3141d = c17296c;
                }
                if (objMo3141d == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
