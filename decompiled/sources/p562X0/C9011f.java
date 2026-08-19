package p562X0;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: X0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9011f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C9011f f27501Z = new C9011f(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9011f f27502o0 = new C9011f(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27503Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9011f(int i10, int i11) {
        super(i10);
        this.f27503Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f27503Y) {
            case 0:
                return new C9013h((Map) obj);
            default:
                return obj;
        }
    }
}
