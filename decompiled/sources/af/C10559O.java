package af;

import bf.C11349D;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;

/* JADX INFO: renamed from: af.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10559O extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31344Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11349D f31345Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10559O(C11349D c11349d, int i10) {
        super(2);
        this.f31344Y = i10;
        this.f31345Z = c11349d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31344Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f31345Z.f34319b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p, 0, 3120, 55294);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C11349D c11349d = this.f31345Z;
                    String str = c11349d != null ? c11349d.f34320c : null;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
