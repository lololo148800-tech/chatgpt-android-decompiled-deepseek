package p1140z1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: z1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21696i extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C21696i f68864Z = new C21696i(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21696i f68865o0 = new C21696i(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21696i f68866p0 = new C21696i(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68867Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21696i(int i10, int i11) {
        super(i10);
        this.f68867Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f68867Y) {
            case 0:
                return new C21658D(true, 2, 0);
            case 1:
                return new LinkedHashMap();
            default:
                return new C21658D(false, 3, 0);
        }
    }
}
