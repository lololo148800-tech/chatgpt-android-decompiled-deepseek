package p009A7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: A7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0397g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C0397g f1318Z = new C0397g(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C0397g f1319o0 = new C0397g(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C0397g f1320p0 = new C0397g(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C0397g f1321q0 = new C0397g(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1322Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0397g(int i10, int i11) {
        super(i10);
        this.f1322Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f1322Y) {
            case 0:
                return "Thread was unable to set its own interrupted state";
            case 1:
                return "Uncaught exception during the task execution";
            case 2:
                return "Thread was unable to set its own interrupted state";
            default:
                return "Thread tried to sleep for a negative amount of time";
        }
    }
}
