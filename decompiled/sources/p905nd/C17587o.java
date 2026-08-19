package p905nd;

import hm.InterfaceC14536a;
import hm.InterfaceC14537b;
import io.opentracing.util.GlobalTracer;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p1130yi.AbstractC21544c;
import p313Mc.C5317a;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9233X;
import p948pi.C18422e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: nd.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C17587o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC14536a f56280Y;

    /* JADX INFO: renamed from: Z */
    public int f56281Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5317a f56282o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17572E f56283p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17587o(C5317a c5317a, C17572E c17572e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f56282o0 = c5317a;
        this.f56283p0 = c17572e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17587o(this.f56282o0, this.f56283p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C17587o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC14536a interfaceC14536a;
        Throwable th2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f56281Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C5317a c5317a = this.f56282o0;
            AbstractC21544c.m21827a().getClass();
            GlobalTracer globalTracer = GlobalTracer.f46995Y;
            InterfaceC14537b interfaceC14537b = c5317a.f17503c;
            if (interfaceC14537b == null) {
                AbstractC16544l.m18103p("datadogSpan");
                throw null;
            }
            InterfaceC14536a interfaceC14536aMo3850R0 = GlobalTracer.f46996Z.mo3850R0(interfaceC14537b);
            AbstractC16544l.m18093f(interfaceC14536aMo3850R0, "activateSpan(...)");
            C17572E c17572e = this.f56283p0;
            try {
                this.f56280Y = interfaceC14536aMo3850R0;
                this.f56281Z = 1;
                Object objM3221t = AbstractC2124C.m3221t(c17572e.f64176f, this);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC14536a = interfaceC14536aMo3850R0;
                obj = objM3221t;
            } catch (Throwable th3) {
                interfaceC14536a = interfaceC14536aMo3850R0;
                th2 = th3;
                throw th2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC14536a = this.f56280Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    throw th2;
                } catch (Throwable th5) {
                    AbstractC7942M5.m8232a(interfaceC14536a, th2);
                    throw th5;
                }
            }
        }
        C18422e c18422e = (C18422e) obj;
        AbstractC7942M5.m8232a(interfaceC14536a, null);
        return c18422e;
    }
}
