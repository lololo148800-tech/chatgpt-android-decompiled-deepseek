package p823j3;

import java.util.concurrent.atomic.AtomicReference;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p561X.C8990d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C16076O extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49783Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f49784Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16104z f49785o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8990d f49786p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC0571F f49787q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AtomicReference f49788r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16076O(C16104z c16104z, C8990d c8990d, InterfaceC0571F interfaceC0571F, AtomicReference atomicReference, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49785o0 = c16104z;
        this.f49786p0 = c8990d;
        this.f49787q0 = interfaceC0571F;
        this.f49788r0 = atomicReference;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16076O c16076o = new C16076O(this.f49785o0, this.f49786p0, this.f49787q0, this.f49788r0, interfaceC18770c);
        c16076o.f49784Z = obj;
        return c16076o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16076O) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49783Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16075N c16075n = new C16075N((InterfaceC0571F) this.f49784Z, this.f49786p0, this.f49787q0, this.f49785o0, this.f49788r0);
            this.f49783Y = 1;
            obj = this.f49785o0.invoke(c16075n, this);
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
