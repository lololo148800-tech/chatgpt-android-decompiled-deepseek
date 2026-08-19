package p1095x1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1140z1.C21658D;

/* JADX INFO: renamed from: x1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C21101v extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C21101v f67029Z = new C21101v(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21101v f67030o0 = new C21101v(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21101v f67031p0 = new C21101v(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67032Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21101v(int i10, int i11) {
        super(i10);
        this.f67032Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f67032Y) {
            case 0:
                ((C21658D) obj).f68637H0 = true;
                break;
            case 1:
                break;
            default:
                break;
        }
        return C17296C.f55119a;
    }
}
