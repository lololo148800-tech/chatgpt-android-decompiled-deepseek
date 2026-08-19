package p042Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1166t;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p736f0.InterfaceC13499q;
import p911o0.C17794y;

/* JADX INFO: renamed from: Bf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C1272n extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3380Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1166t f3381Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1272n(C1166t c1166t, int i10) {
        super(3);
        this.f3380Y = i10;
        this.f3381Z = c1166t;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f3380Y) {
            case 0:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                List list = this.f3381Z.f3107q;
                if (list != null) {
                    AbstractC1274p.m1988c(list, null, null, c6021p, 0);
                }
                break;
            default:
                C17794y ModalBottomSheet = (C17794y) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((iIntValue & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC1274p.m1986a(this.f3381Z, null, null, c6021p2, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
