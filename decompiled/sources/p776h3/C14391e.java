package p776h3;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: h3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C14391e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C14391e f45120Z = new C14391e(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14391e f45121o0 = new C14391e(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14391e f45122p0 = new C14391e(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C14391e f45123q0 = new C14391e(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C14391e f45124r0 = new C14391e(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C14391e f45125s0 = new C14391e(2, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C14391e f45126t0 = new C14391e(2, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f45127Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14391e(int i10, int i11) {
        super(i10);
        this.f45127Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45127Y) {
            case 0:
                ((C14395i) obj).f45132d = (InterfaceC10497n) obj2;
                break;
            case 1:
                ((C14395i) obj).f45134f = ((C14387a) obj2).f45114a;
                break;
            case 2:
                ((C14395i) obj).f45133e = ((C14388b) obj2).f45115a;
                break;
            case 3:
                ((C14396j) obj).f45135d = (InterfaceC10497n) obj2;
                break;
            case 4:
                ((C14396j) obj).f45137f = ((C14388b) obj2).f45115a;
                break;
            case 5:
                ((C14396j) obj).f45136e = ((C14387a) obj2).f45114a;
                break;
            default:
                ((C14397k) obj).f45138a = (InterfaceC10497n) obj2;
                break;
        }
        return C17296C.f55119a;
    }
}
