package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: D0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1763A extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C1763A f5033Z = new C1763A(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1763A f5034o0 = new C1763A(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1763A f5035p0 = new C1763A(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5036Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1763A(int i10, int i11) {
        super(i10);
        this.f5036Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f5036Y) {
            case 0:
                return new C1821o0(1L);
            case 1:
                return null;
            default:
                return AbstractC1770D0.f5052b;
        }
    }
}
