package p131F1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: F1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2626d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C2626d f8127Z = new C2626d(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2626d f8128o0 = new C2626d(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2626d f8129p0 = new C2626d(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8130Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2626d(int i10, int i11) {
        super(i10);
        this.f8130Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f8130Y) {
            case 0:
                ((Number) obj).longValue();
                return C17296C.f55119a;
            case 1:
                return Integer.valueOf(((C2636n) obj).f8154b);
            default:
                return Integer.valueOf(((C2636n) obj).f8155c.m7884a());
        }
    }
}
