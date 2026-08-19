package p943p7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: p7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18305c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18305c f58429Z = new C18305c(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18305c f58430o0 = new C18305c(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18305c f58431p0 = new C18305c(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58432Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18305c(int i10, int i11) {
        super(i10);
        this.f58432Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58432Y) {
            case 0:
                return "[Mobile Metric] Batch Closed";
            case 1:
                return "[Mobile Metric] Batch Deleted";
            default:
                return "[Mobile Metric] Method Called";
        }
    }
}
