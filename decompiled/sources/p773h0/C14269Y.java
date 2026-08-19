package p773h0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: h0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C14269Y extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C14269Y f44768Z = new C14269Y(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14269Y f44769o0 = new C14269Y(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44770Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14269Y(int i10, int i11) {
        super(i10);
        this.f44770Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44770Y) {
            case 0:
                return C14249D.f44715a;
            default:
                return new C14296m0();
        }
    }
}
