package p148Fi;

import kotlin.jvm.internal.AbstractC16546n;
import p015Ad.AbstractC0434i;
import p040Bd.C1032Y1;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Fi.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C2776M extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8484Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2778N f8485Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2776M(C2778N c2778n, int i10) {
        super(0);
        this.f8484Y = i10;
        this.f8485Z = c2778n;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C1032Y1 c1032y1;
        switch (this.f8484Y) {
            case 0:
                C2778N c2778n = this.f8485Z;
                C1032Y1 c1032y2 = c2778n.f8490d;
                if (c1032y2 != null) {
                    return AbstractC0434i.m1091c(c1032y2, c2778n.f8487a, null);
                }
                return null;
            default:
                C2778N c2778n2 = this.f8485Z;
                C2862x0 c2862x0 = c2778n2.f8489c;
                if (c2862x0 == null || (c1032y1 = c2862x0.f8633b) == null) {
                    return null;
                }
                return AbstractC0434i.m1091c(c1032y1, c2778n2.f8487a, null);
        }
    }
}
