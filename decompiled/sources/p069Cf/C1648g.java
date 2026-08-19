package p069Cf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1071w0.AbstractC20739b;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8003U3;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8090g0;
import p544W9.AbstractC8626e3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Cf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1648g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4663Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f4664Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f4665o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f4666p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1648g(int i10, InterfaceC10459q interfaceC10459q, int i11, int i12) {
        super(2);
        this.f4663Y = i12;
        this.f4664Z = i10;
        this.f4665o0 = interfaceC10459q;
        this.f4666p0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f4663Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC8003U3.m8307c(this.f4664Z, C5997d.m6447d0(this.f4666p0 | 1), c6021p, this.f4665o0);
                break;
            case 1:
                AbstractC8626e3.m9276e(this.f4664Z, C5997d.m6447d0(this.f4666p0 | 1), c6021p, this.f4665o0);
                break;
            case 2:
                AbstractC8090g0.m8548g(C5997d.m6447d0(this.f4664Z | 1), this.f4666p0, c6021p, this.f4665o0);
                break;
            case 3:
                AbstractC8071d5.m8482a(C5997d.m6447d0(this.f4664Z | 1), this.f4666p0, c6021p, this.f4665o0);
                break;
            default:
                AbstractC20739b.m21257b(C5997d.m6447d0(this.f4664Z | 1), this.f4666p0, c6021p, this.f4665o0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1648g(InterfaceC10459q interfaceC10459q, int i10, int i11, int i12) {
        super(2);
        this.f4663Y = i12;
        this.f4665o0 = interfaceC10459q;
        this.f4664Z = i10;
        this.f4666p0 = i11;
    }
}
