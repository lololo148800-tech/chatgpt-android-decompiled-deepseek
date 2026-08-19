package p320Mj;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.C12869g;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import mm.C17296C;
import mo.AbstractC17325B;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Mj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5455h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f17813Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12869g f17814Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f17815o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC17325B f17816p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5455h(C12869g c12869g, String str, AbstractC17325B abstractC17325B, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f17814Z = c12869g;
        this.f17815o0 = str;
        this.f17816p0 = abstractC17325B;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5455h(this.f17814Z, this.f17815o0, this.f17816p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5455h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f17813Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C5454g c5454g = new C5454g(this.f17814Z, this.f17815o0, this.f17816p0, null);
            this.f17813Y = 1;
            obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c5454g, this);
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
