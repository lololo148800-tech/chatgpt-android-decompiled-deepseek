package p562X0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: X0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9014i extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C9014i f27511Z = new C9014i(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9014i f27512o0 = new C9014i(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27513Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9014i(int i10, int i11) {
        super(i10);
        this.f27513Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f27513Y) {
            case 0:
                return new C9013h(new LinkedHashMap());
            default:
                return null;
        }
    }
}
