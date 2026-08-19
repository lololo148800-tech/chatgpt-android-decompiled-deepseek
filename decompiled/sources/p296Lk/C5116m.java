package p296Lk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p759g1.C13800b;

/* JADX INFO: renamed from: Lk.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5116m extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C5116m f16716Z = new C5116m(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5116m f16717o0 = new C5116m(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16718Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5116m(int i10, int i11) {
        super(i10);
        this.f16718Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f16718Y) {
            case 0:
                ((Number) obj).intValue();
                return null;
            default:
                AbstractC16544l.m18094g((C5114k) obj, "$this$null");
                return new C13800b(0L);
        }
    }
}
