package p045Bj;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22204w0;
import p729ej.C13430u;

/* JADX INFO: renamed from: Bj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1309g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C1309g f3459Y = new C1309g(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        action.m14964a(new C22204w0(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        return C17296C.f55119a;
    }
}
