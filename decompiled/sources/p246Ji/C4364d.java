package p246Ji;

import cf.AbstractC11728d;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7855B6;
import p537W0.C8410b;
import p544W9.AbstractC8491I;
import p544W9.AbstractC8739x2;
import p635a1.InterfaceC10459q;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: Ji.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4364d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14193Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f14194Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f14195o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f14196p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f14197q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f14198r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4364d(int i10, Object obj, Object obj2, int i11, int i12, int i13) {
        super(2);
        this.f14193Y = i13;
        this.f14194Z = i10;
        this.f14197q0 = obj;
        this.f14198r0 = obj2;
        this.f14195o0 = i11;
        this.f14196p0 = i12;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14193Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f14195o0 | 1);
                int i10 = this.f14194Z;
                AbstractC8739x2.m9473b(i10, (String) this.f14197q0, (String) this.f14198r0, (C6021p) obj, iM6447d0, this.f14196p0);
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC11728d.m13034b(this.f14194Z, (InterfaceC1436k) this.f14197q0, (InterfaceC10459q) this.f14198r0, this.f14195o0, (C6021p) obj, C5997d.m6447d0(this.f14196p0 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f14195o0 | 1);
                int i11 = this.f14194Z;
                AbstractC7855B6.m8121a(i11, (InterfaceC10459q) this.f14197q0, (InterfaceC1426a) this.f14198r0, (C6021p) obj, iM6447d1, this.f14196p0);
                break;
            default:
                ((Number) obj2).intValue();
                int i12 = this.f14196p0 | 1;
                C8410b c8410b = (C8410b) this.f14198r0;
                AbstractC8491I.m9150a((InterfaceC10497n) this.f14197q0, this.f14194Z, this.f14195o0, c8410b, (C6021p) obj, i12);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4364d(InterfaceC10497n interfaceC10497n, int i10, int i11, C8410b c8410b, int i12) {
        super(2);
        this.f14193Y = 3;
        this.f14197q0 = interfaceC10497n;
        this.f14194Z = i10;
        this.f14195o0 = i11;
        this.f14198r0 = c8410b;
        this.f14196p0 = i12;
    }
}
