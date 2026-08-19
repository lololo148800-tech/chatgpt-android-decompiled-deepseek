package p926of;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p403Qd.C6644m;
import p594Y9.AbstractC9991w4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: of.Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C18161Y extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57921Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6644m f57922Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f57923o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f57924p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f57925q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18161Y(C6644m c6644m, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f57921Y = i11;
        this.f57922Z = c6644m;
        this.f57923o0 = interfaceC1426a;
        this.f57924p0 = interfaceC10459q;
        this.f57925q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f57921Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f57925q0 | 1);
                AbstractC9991w4.m10632a(this.f57922Z, this.f57923o0, this.f57924p0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f57925q0 | 1);
                AbstractC9991w4.m10632a(this.f57922Z, this.f57923o0, this.f57924p0, c6021p, iM6447d1);
                break;
            default:
                int iM6447d2 = C5997d.m6447d0(this.f57925q0 | 1);
                AbstractC9991w4.m10633b(this.f57922Z, this.f57923o0, this.f57924p0, c6021p, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }
}
