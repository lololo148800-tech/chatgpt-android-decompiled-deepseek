package p184H5;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p033B5.C0825i;
import p033B5.C0840x;
import p033B5.InterfaceC0829m;
import p049Bm.InterfaceC1439n;
import p111E5.EnumC2324h;
import p259K5.C4539a;
import p374P5.C6354g;
import p374P5.C6361n;
import p374P5.C6363p;
import p496U5.ComponentCallbacks2C7559a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: H5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3240g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f9854Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3241h f9855Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6354g f9856o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f9857p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6361n f9858q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C0825i f9859r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C4539a f9860s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C3244k f9861t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3240g(C3241h c3241h, C6354g c6354g, Object obj, C6361n c6361n, C0825i c0825i, C4539a c4539a, C3244k c3244k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f9855Z = c3241h;
        this.f9856o0 = c6354g;
        this.f9857p0 = obj;
        this.f9858q0 = c6361n;
        this.f9859r0 = c0825i;
        this.f9860s0 = c4539a;
        this.f9861t0 = c3244k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3240g(this.f9855Z, this.f9856o0, this.f9857p0, this.f9858q0, this.f9859r0, this.f9860s0, this.f9861t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3240g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f9854Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3241h c3241h = this.f9855Z;
            C6354g c6354g = this.f9856o0;
            Object obj2 = this.f9857p0;
            C6361n c6361n = this.f9858q0;
            C0825i c0825i = this.f9859r0;
            this.f9854Y = 1;
            obj = C3241h.m4129b(c3241h, c6354g, obj2, c6361n, c0825i, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C3234a c3234a = (C3234a) obj;
        ComponentCallbacks2C7559a componentCallbacks2C7559a = this.f9855Z.f9863b;
        synchronized (componentCallbacks2C7559a) {
            try {
                C0840x c0840x = (C0840x) componentCallbacks2C7559a.f23954Y.get();
                if (c0840x == null) {
                    componentCallbacks2C7559a.m7914a();
                } else if (componentCallbacks2C7559a.f23955Z == null) {
                    Context context = c0840x.f2343a.f2316a;
                    componentCallbacks2C7559a.f23955Z = context;
                    context.registerComponentCallbacks(componentCallbacks2C7559a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zM11088v = this.f9855Z.f9865d.m11088v(this.f9860s0, this.f9856o0, c3234a);
        InterfaceC0829m interfaceC0829m = c3234a.f9806a;
        C6354g c6354g2 = this.f9856o0;
        EnumC2324h enumC2324h = c3234a.f9808c;
        C4539a c4539a = zM11088v ? this.f9860s0 : null;
        String str = c3234a.f9809d;
        boolean z6 = c3234a.f9807b;
        C3244k c3244k = this.f9861t0;
        return new C6363p(interfaceC0829m, c6354g2, enumC2324h, c4539a, str, z6, (c3244k instanceof C3244k) && c3244k.f9886g);
    }
}
