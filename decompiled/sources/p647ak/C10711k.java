package p647ak;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17311n;
import mm.C17312o;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8170q0;
import p571X9.AbstractC9233X;
import p949pj.InterfaceC18483p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ak.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10711k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f31830Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10713l f31831Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC8170q0 f31832o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10711k(AbstractC8170q0 abstractC8170q0, C10713l c10713l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f31831Z = c10713l;
        this.f31832o0 = abstractC8170q0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10711k(this.f31832o0, this.f31831Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10711k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objMo217k;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f31830Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC18483p interfaceC18483p = this.f31831Z.f31834b;
            this.f31830Y = 1;
            objMo217k = interfaceC18483p.mo217k(this);
            if (objMo217k == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objMo217k = ((C17312o) obj).f55139Y;
        }
        boolean z6 = objMo217k instanceof C17311n;
        AbstractC8170q0 abstractC8170q0 = this.f31832o0;
        if (!z6) {
            ?? r6 = ((C10638D0) abstractC8170q0).f31562a;
            String absolutePath = ((File) objMo217k).getAbsolutePath();
            AbstractC16544l.m18093f(absolutePath, "getAbsolutePath(...)");
            r6.invoke(absolutePath);
        }
        Throwable thM18979a = C17312o.m18979a(objMo217k);
        if (thM18979a != null) {
            ((C10638D0) abstractC8170q0).f31563b.invoke(thM18979a);
        }
        return C17296C.f55119a;
    }
}
