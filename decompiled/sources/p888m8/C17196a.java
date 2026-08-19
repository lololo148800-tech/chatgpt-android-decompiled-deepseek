package p888m8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: m8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17196a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C17196a f54894Z = new C17196a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C17196a f54895o0 = new C17196a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C17196a f54896p0 = new C17196a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C17196a f54897q0 = new C17196a(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54898Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17196a(int i10, int i11) {
        super(i10);
        this.f54898Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f54898Y) {
            case 0:
                return "Internal operation failed on ComponentPredicate";
            case 1:
                return "Write operation failed.";
            case 2:
                return "Write operation failed, but no onError callback was provided.";
            default:
                return "Write operation ignored, session is expired or RUM feature is disabled.";
        }
    }
}
