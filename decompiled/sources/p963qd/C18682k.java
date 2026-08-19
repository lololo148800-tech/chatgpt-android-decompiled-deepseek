package p963qd;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import ve.C20584h;

/* JADX INFO: renamed from: qd.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18682k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59466Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20584h f59467Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18682k(C20584h c20584h, int i10) {
        super(2);
        this.f59466Y = i10;
        this.f59467Z = c20584h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f59466Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String str = this.f59467Z.f65316b;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    String str2 = this.f59467Z.f65317c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    AbstractC4124r4.m4768b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
