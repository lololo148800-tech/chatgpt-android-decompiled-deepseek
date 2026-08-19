package androidx.lifecycle;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p275Kn.AbstractC4817d;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: androidx.lifecycle.M */
/* JADX INFO: loaded from: classes.dex */
public final class C11077M extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f33387Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f33388Z;

    /* JADX INFO: renamed from: o0 */
    public int f33389o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC11105n f33390p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ EnumC11104m f33391q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC0571F f33392r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC19694j f33393s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11077M(AbstractC11105n abstractC11105n, EnumC11104m enumC11104m, InterfaceC0571F interfaceC0571F, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f33390p0 = abstractC11105n;
        this.f33391q0 = enumC11104m;
        this.f33392r0 = interfaceC0571F;
        this.f33393s0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11077M(this.f33390p0, this.f33391q0, this.f33392r0, this.f33393s0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11077M) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Type inference failed for: r15v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C16525B c16525b;
        C16525B c16525b2;
        InterfaceC0627n0 interfaceC0627n0;
        InterfaceC11110s interfaceC11110s;
        InterfaceC0627n0 interfaceC0627n1;
        InterfaceC11110s interfaceC11110s2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f33389o0;
        C17296C c17296c = C17296C.f55119a;
        AbstractC11105n abstractC11105n = this.f33390p0;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16525b2 = this.f33388Z;
            c16525b = this.f33387Y;
            try {
                AbstractC9233X.m9807c(obj);
                interfaceC0627n1 = (InterfaceC0627n0) c16525b.f51262Y;
                if (interfaceC0627n1 != null) {
                    interfaceC0627n1.mo1275e(null);
                }
                interfaceC11110s2 = (InterfaceC11110s) c16525b2.f51262Y;
                if (interfaceC11110s2 != null) {
                    abstractC11105n.mo7808c(interfaceC11110s2);
                }
                return c17296c;
            } catch (Throwable th2) {
                th = th2;
                interfaceC0627n0 = (InterfaceC0627n0) c16525b.f51262Y;
                if (interfaceC0627n0 != null) {
                    interfaceC0627n0.mo1275e(null);
                }
                interfaceC11110s = (InterfaceC11110s) c16525b2.f51262Y;
                if (interfaceC11110s != null) {
                    abstractC11105n.mo7808c(interfaceC11110s);
                }
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        if (abstractC11105n.mo7807b() == EnumC11104m.f33474Y) {
            return c17296c;
        }
        C16525B c16525b3 = new C16525B();
        C16525B c16525b4 = new C16525B();
        try {
            EnumC11104m enumC11104m = this.f33391q0;
            InterfaceC0571F interfaceC0571F = this.f33392r0;
            ?? r15 = this.f33393s0;
            this.f33387Y = c16525b3;
            this.f33388Z = c16525b4;
            this.f33389o0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            EnumC11103l.Companion.getClass();
            C11076L c11076l = new C11076L(C11101j.m12161c(enumC11104m), c16525b3, interfaceC0571F, C11101j.m12159a(enumC11104m), c0624m, AbstractC4817d.m5451a(), r15);
            c16525b4.f51262Y = c11076l;
            abstractC11105n.mo7806a(c11076l);
            if (c0624m.m1261q() == enumC19250a) {
                return enumC19250a;
            }
            c16525b = c16525b3;
            c16525b2 = c16525b4;
            interfaceC0627n1 = (InterfaceC0627n0) c16525b.f51262Y;
            if (interfaceC0627n1 != null) {
                interfaceC0627n1.mo1275e(null);
            }
            interfaceC11110s2 = (InterfaceC11110s) c16525b2.f51262Y;
            if (interfaceC11110s2 != null) {
                abstractC11105n.mo7808c(interfaceC11110s2);
            }
            return c17296c;
        } catch (Throwable th3) {
            th = th3;
            c16525b = c16525b3;
            c16525b2 = c16525b4;
            interfaceC0627n0 = (InterfaceC0627n0) c16525b.f51262Y;
            if (interfaceC0627n0 != null) {
                interfaceC0627n0.mo1275e(null);
            }
            interfaceC11110s = (InterfaceC11110s) c16525b2.f51262Y;
            if (interfaceC11110s != null) {
                abstractC11105n.mo7808c(interfaceC11110s);
            }
            throw th;
        }
    }
}
