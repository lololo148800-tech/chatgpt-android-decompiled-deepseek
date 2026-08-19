package p033B5;

import java.util.List;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p184H5.C3244k;
import p374P5.C6354g;
import p397Q5.C6579h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: B5.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0839w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f2336Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6354g f2337Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0840x f2338o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6579h f2339p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0825i f2340q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC0829m f2341r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0839w(C6354g c6354g, C0840x c0840x, C6579h c6579h, C0825i c0825i, InterfaceC0829m interfaceC0829m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f2337Z = c6354g;
        this.f2338o0 = c0840x;
        this.f2339p0 = c6579h;
        this.f2340q0 = c0825i;
        this.f2341r0 = interfaceC0829m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C0839w(this.f2337Z, this.f2338o0, this.f2339p0, this.f2340q0, this.f2341r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0839w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f2336Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            List list = this.f2338o0.f2345c.f2297a;
            boolean z6 = this.f2341r0 != null;
            C6354g c6354g = this.f2337Z;
            C3244k c3244k = new C3244k(c6354g, list, 0, c6354g, this.f2339p0, this.f2340q0, z6);
            this.f2336Y = 1;
            obj = c3244k.m4132a(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
