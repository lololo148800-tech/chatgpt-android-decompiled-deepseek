package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21056J;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: J0.I4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3929I4 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C3929I4 f12085Z = new C3929I4(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3929I4 f12086o0 = new C3929I4(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12087Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3929I4(int i10, int i11) {
        super(i10);
        this.f12087Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12087Y) {
            case 0:
                C3935J4 c3935j4 = (C3935J4) obj2;
                return AbstractC17681o.m19382k(Float.valueOf(c3935j4.f12115a.m6409g()), Float.valueOf(c3935j4.f12117c.m6409g()), Float.valueOf(c3935j4.f12116b.m6409g()));
            default:
                return Integer.valueOf(((InterfaceC21056J) obj).mo21531l(((Number) obj2).intValue()));
        }
    }
}
