package p887m7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1053v3.p1054lN.IGDwkYw;

/* JADX INFO: renamed from: m7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17175a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C17175a f54859Z = new C17175a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C17175a f54860o0 = new C17175a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C17175a f54861p0 = new C17175a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C17175a f54862q0 = new C17175a(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C17175a f54863r0 = new C17175a(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C17175a f54864s0 = new C17175a(0, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54865Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17175a(int i10, int i11) {
        super(i10);
        this.f54865Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f54865Y) {
            case 0:
                return "Ignoring provided User-Agent header, because it is reserved.";
            case 1:
                return IGDwkYw.vHPexAHCYdfE;
            case 2:
                return "Unable to execute the request; we will retry later.";
            case 3:
                return "Unable to execute the request; we will retry later.";
            case 4:
                return "Unable to gzip request body";
            default:
                return "Datadog has not been initialized.";
        }
    }
}
