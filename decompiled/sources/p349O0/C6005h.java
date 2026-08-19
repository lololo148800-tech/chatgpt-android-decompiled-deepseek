package p349O0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1095x1.C21101v;

/* JADX INFO: renamed from: O0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6005h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C6005h f19499Z = new C6005h(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6005h f19500o0 = new C6005h(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19501Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6005h(int i10, int i11) {
        super(i10);
        this.f19501Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19501Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                }
                break;
            default:
                C21101v.f67029Z.invoke(obj);
                break;
        }
        return C17296C.f55119a;
    }
}
