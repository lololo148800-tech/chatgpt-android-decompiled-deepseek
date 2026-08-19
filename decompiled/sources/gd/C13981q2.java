package gd;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gd.q2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13981q2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f44039Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13985r2 f44040Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC16546n f44041o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13981q2(C13985r2 c13985r2, InterfaceC1426a interfaceC1426a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44040Z = c13985r2;
        this.f44041o0 = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13981q2(this.f44040Z, this.f44041o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13981q2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f44039Y;
        C13985r2 c13985r2 = this.f44040Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = c13985r2.f44046b;
            C13977p2 c13977p2 = new C13977p2(2, null);
            this.f44039Y = 1;
            if (AbstractC2124C.m3220s(c2153q0, c13977p2, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        try {
            this.f44041o0.invoke();
        } catch (IllegalStateException e10) {
            AbstractC8160o6.m8731f(c13985r2.f44047c, "Statsig not initialized", e10, null, 4);
        }
        return C17296C.f55119a;
    }
}
