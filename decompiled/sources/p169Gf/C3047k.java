package p169Gf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8063c5;
import p537W0.C8410b;
import p544W9.AbstractC8739x2;
import p635a1.InterfaceC10459q;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: Gf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C3047k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9189Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f9190Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f9191o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f9192p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f9193q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f9194r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f9195s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3047k(int i10, int i11, String str, InterfaceC10459q interfaceC10459q, int i12, int i13) {
        super(2);
        this.f9192p0 = i10;
        this.f9193q0 = i11;
        this.f9190Z = str;
        this.f9191o0 = interfaceC10459q;
        this.f9194r0 = i12;
        this.f9195s0 = i13;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9189Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f9194r0 | 1);
                int i10 = this.f9193q0;
                String str = (String) this.f9190Z;
                int i11 = this.f9192p0;
                AbstractC3051o.m3923a(i11, i10, iM6447d0, this.f9195s0, (C6021p) obj, (InterfaceC10459q) this.f9191o0, str);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f9194r0 | 1);
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f9191o0;
                int i12 = this.f9195s0;
                AbstractC8063c5.m8466i(this.f9192p0, this.f9193q0, iM6447d1, i12, (C6021p) obj, interfaceC10459q, (String) this.f9190Z);
                break;
            default:
                ((Number) obj2).intValue();
                int i13 = this.f9194r0 | 1;
                C8410b c8410b = (C8410b) this.f9191o0;
                int i14 = this.f9192p0;
                AbstractC8739x2.m9474c((InterfaceC10497n) this.f9190Z, i14, this.f9193q0, c8410b, (C6021p) obj, i13, this.f9195s0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3047k(InterfaceC10497n interfaceC10497n, int i10, int i11, C8410b c8410b, int i12, int i13) {
        super(2);
        this.f9190Z = interfaceC10497n;
        this.f9192p0 = i10;
        this.f9193q0 = i11;
        this.f9191o0 = c8410b;
        this.f9194r0 = i12;
        this.f9195s0 = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3047k(String str, InterfaceC10459q interfaceC10459q, int i10, int i11, int i12, int i13) {
        super(2);
        this.f9190Z = str;
        this.f9191o0 = interfaceC10459q;
        this.f9192p0 = i10;
        this.f9193q0 = i11;
        this.f9194r0 = i12;
        this.f9195s0 = i13;
    }
}
