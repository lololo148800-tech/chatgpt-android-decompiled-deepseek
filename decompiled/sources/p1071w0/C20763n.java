package p1071w0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0120T;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: w0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C20763n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65903Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f65904Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f65905o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20763n(C0120T c0120t, int i10, int i11) {
        super(2);
        this.f65903Y = i11;
        this.f65904Z = c0120t;
        this.f65905o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f65903Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC20769q.m21301e(this.f65904Z, c6021p, C5997d.m6447d0(this.f65905o0 | 1));
                break;
            default:
                AbstractC20769q.m21302f(this.f65904Z, c6021p, C5997d.m6447d0(this.f65905o0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
