package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p029B0.C0715b;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1116y0.C21352a;
import p1116y0.C21358g;
import p1139z0.C21585H;
import p204I1.C3581L;
import p349O0.C6002f0;
import p350O1.C6045C;
import p392Q0.C6546d;
import p571X9.AbstractC9233X;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8781Z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6045C f26821Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21358g f26822Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8781Z(C6045C c6045c, C21358g c21358g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26821Y = c6045c;
        this.f26822Z = c21358g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8781Z(this.f26821Y, this.f26822Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C8781Z c8781z = (C8781Z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c8781z.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C6045C c6045c = this.f26821Y;
        String str = c6045c.f19682a.f10934Y;
        C21358g c21358g = this.f26822Z;
        if (!AbstractC16544l.m18089b(str, c21358g.m21750b().f67817Y.toString())) {
            AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
            InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
            AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
            try {
                boolean zBooleanValue = ((Boolean) c21358g.f67828c.getValue()).booleanValue();
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                if (zBooleanValue) {
                    throw new IllegalStateException("TextFieldState does not support concurrent or nested editing.");
                }
                c21358g.m21751c(true);
                C21352a c21352a = new C21352a(c21358g.m21750b(), null, null, 14);
                try {
                    c21352a.m21748c(c21358g.m21750b().f67817Y.length(), c6045c.f19682a.f10934Y);
                    boolean z6 = ((C6546d) c21352a.m21746a().f63875Z).f21184o0 > 0;
                    boolean zM4266b = true ^ C3581L.m4266b(c21352a.f67816p0, c21358g.f67827b.m21857e());
                    if (z6) {
                        C21585H c21585h = c21358g.f67826a;
                        ((C6002f0) c21585h.f68345o0).setValue(null);
                        C0715b c0715b = (C0715b) c21585h.f68344Z;
                        c0715b.f2070b.clear();
                        c0715b.f2071c.clear();
                    }
                    c21358g.m21752d(c21352a, z6, zM4266b);
                } finally {
                    c21358g.m21751c(false);
                }
            } catch (Throwable th2) {
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                throw th2;
            }
        }
        return C17296C.f55119a;
    }
}
