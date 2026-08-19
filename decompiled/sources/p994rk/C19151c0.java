package p994rk;

import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: rk.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19151c0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C19151c0 f60861Z = new C19151c0(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19151c0 f60862o0 = new C19151c0(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C19151c0 f60863p0 = new C19151c0(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60864Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19151c0(int i10, int i11) {
        super(i10);
        this.f60864Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f60864Y) {
            case 0:
                return Boolean.valueOf(obj instanceof TextInputLayout);
            case 1:
                C19067A1 it = (C19067A1) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f60744Y;
            default:
                C19067A1 it2 = (C19067A1) obj;
                AbstractC16544l.m18094g(it2, "it");
                return it2.f60744Y;
        }
    }
}
