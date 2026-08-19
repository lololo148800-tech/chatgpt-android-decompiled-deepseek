package p870le;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p269Kh.C4679f;
import p349O0.C6021p;

/* JADX INFO: renamed from: le.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16876d0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54165Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4679f f54166Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16876d0(C4679f c4679f, int i10) {
        super(2);
        this.f54165Y = i10;
        this.f54166Z = c4679f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54165Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f54166Z.f15228a.f15237b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 0, 3120, 120830);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    String str = this.f54166Z.f15228a.f15239d;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(str, null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12156l, c6021p2, 0, 0, 65530);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
