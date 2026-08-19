package p996rm;

import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import sm.AbstractC19691g;

/* JADX INFO: renamed from: rm.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C19252c extends AbstractC19691g {

    /* JADX INFO: renamed from: Y */
    public int f61042Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1439n f61043Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18770c f61044o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19252c(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c, InterfaceC18770c interfaceC18770c2) {
        super(interfaceC18770c);
        this.f61043Z = interfaceC1439n;
        this.f61044o0 = interfaceC18770c2;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f61042Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f61042Y = 2;
            AbstractC9233X.m9807c(obj);
            return obj;
        }
        this.f61042Y = 1;
        AbstractC9233X.m9807c(obj);
        InterfaceC1439n interfaceC1439n = this.f61043Z;
        AbstractC16544l.m18092e(interfaceC1439n, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC16529F.m18081e(2, interfaceC1439n);
        return interfaceC1439n.invoke(this.f61044o0, this);
    }
}
