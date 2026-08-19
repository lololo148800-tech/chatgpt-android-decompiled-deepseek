package p478Tc;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p152Fm.AbstractC2922d;

/* JADX INFO: renamed from: Tc.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C7307k extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C7307k f23148Z = new C7307k(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7307k f23149o0 = new C7307k(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23150Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7307k(int i10, int i11) {
        super(i10);
        this.f23150Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f23150Y) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalActivity not present");
            default:
                return AbstractC2922d.f8758Y;
        }
    }
}
