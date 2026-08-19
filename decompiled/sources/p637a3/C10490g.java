package p637a3;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p761g3.C13814a;

/* JADX INFO: renamed from: a3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10490g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C10490g f31080Z = new C10490g(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10490g f31081o0 = new C10490g(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10490g f31082p0 = new C10490g(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10490g f31083q0 = new C10490g(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C10490g f31084r0 = new C10490g(0, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31085Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10490g(int i10, int i11) {
        super(i10);
        this.f31085Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f31085Y) {
            case 0:
                return C13814a.f43783B;
            case 1:
                throw new IllegalStateException("No default context");
            case 2:
                throw new IllegalStateException("No default glance id");
            case 3:
                throw new IllegalStateException("No default size");
            default:
                return null;
        }
    }
}
