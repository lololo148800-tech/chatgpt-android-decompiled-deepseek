package p587Y1;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;

/* JADX INFO: renamed from: Y1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9584j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C9584j f28840Z = new C9584j(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9584j f28841o0 = new C9584j(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28842Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9584j(int i10, int i11) {
        super(i10);
        this.f28842Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28842Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                }
                break;
        }
        return C17296C.f55119a;
    }
}
