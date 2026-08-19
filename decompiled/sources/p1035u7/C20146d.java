package p1035u7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: u7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20146d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C20146d f63815Z = new C20146d(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C20146d f63816o0 = new C20146d(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C20146d f63817p0 = new C20146d(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63818Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20146d(int i10, int i11) {
        super(i10);
        this.f63818Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f63818Y) {
            case 0:
                return "Can't move data from a null directory";
            case 1:
                return "Can't move data to a null directory";
            default:
                return "Can't wipe data from a null directory";
        }
    }
}
