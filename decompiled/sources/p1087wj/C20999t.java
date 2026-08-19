package p1087wj;

import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C20999t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f66838Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21001v f66839Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20979J f66840o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20999t(C21001v c21001v, C20979J c20979j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66839Z = c21001v;
        this.f66840o0 = c20979j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20999t(this.f66839Z, this.f66840o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20999t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66838Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C20998s c20998s = new C20998s(this.f66839Z, this.f66840o0, null);
            this.f66838Y = 1;
            obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(c20998s, this);
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
