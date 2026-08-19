package p1156zj;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9306j0;
import p729ej.C13430u;

/* JADX INFO: renamed from: zj.M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22111M0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Throwable f69897Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22111M0(Throwable th2) {
        super(1);
        this.f69897Y = th2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        action.m14964a(new C22204w0(new InternalErrorInfo.CameraErrorInfo(AbstractC9306j0.m9889h("Unexpected camera error with type ", this.f69897Y.getClass().getCanonicalName()))));
        return C17296C.f55119a;
    }
}
