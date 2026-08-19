package p291Lf;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5010g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C5010g f16346Z = new C5010g(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5010g f16347o0 = new C5010g(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5010g f16348p0 = new C5010g(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16349Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5010g(int i10, int i11) {
        super(i10);
        this.f16349Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16349Y) {
            case 0:
                return new LinkedHashMap();
            case 1:
                return null;
            default:
                return C5026w.f16429g;
        }
    }
}
