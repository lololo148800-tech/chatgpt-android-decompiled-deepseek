package p706df;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;

/* JADX INFO: renamed from: df.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C13099s extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41598Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13087g f41599Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13099s(C13087g c13087g, int i10) {
        super(2);
        this.f41598Y = i10;
        this.f41599Z = c13087g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41598Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f41599Z.f41580b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    String str = this.f41599Z.f41581c;
                    if (str != null) {
                        AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p2, 0, 3120, 120830);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
