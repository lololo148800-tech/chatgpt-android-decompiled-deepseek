package p863l3;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: l3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16812c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C16812c f53943Z = new C16812c(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C16812c f53944o0 = new C16812c(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C16812c f53945p0 = new C16812c(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C16812c f53946q0 = new C16812c(2, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53947Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16812c(int i10, int i11) {
        super(i10);
        this.f53947Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f53947Y) {
            case 0:
                ((C16810a) obj).f53938a = (String) obj2;
                break;
            case 1:
                ((C16810a) obj).f53941d = (InterfaceC10497n) obj2;
                break;
            case 2:
                ((C16810a) obj).f53939b = (C16813d) obj2;
                break;
            default:
                ((C16810a) obj).f53940c = ((Number) obj2).intValue();
                break;
        }
        return C17296C.f55119a;
    }
}
