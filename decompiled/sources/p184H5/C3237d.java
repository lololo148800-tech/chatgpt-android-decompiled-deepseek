package p184H5;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p033B5.C0823g;
import p033B5.C0825i;
import p049Bm.InterfaceC1439n;
import p160G5.C3003i;
import p374P5.C6354g;
import p374P5.C6361n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: H5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3237d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f9832Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3241h f9833Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16525B f9834o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f9835p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6354g f9836q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f9837r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16525B f9838s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C0825i f9839t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3237d(C3241h c3241h, C16525B c16525b, C16525B c16525b2, C6354g c6354g, Object obj, C16525B c16525b3, C0825i c0825i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f9833Z = c3241h;
        this.f9834o0 = c16525b;
        this.f9835p0 = c16525b2;
        this.f9836q0 = c6354g;
        this.f9837r0 = obj;
        this.f9838s0 = c16525b3;
        this.f9839t0 = c0825i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3237d(this.f9833Z, this.f9834o0, this.f9835p0, this.f9836q0, this.f9837r0, this.f9838s0, this.f9839t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3237d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f9832Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3003i c3003i = (C3003i) this.f9834o0.f51262Y;
            C0823g c0823g = (C0823g) this.f9835p0.f51262Y;
            C6361n c6361n = (C6361n) this.f9838s0.f51262Y;
            this.f9832Y = 1;
            obj = C3241h.m4128a(this.f9833Z, c3003i, c0823g, this.f9836q0, this.f9837r0, c6361n, this.f9839t0, this);
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
