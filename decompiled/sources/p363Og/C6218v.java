package p363Og;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1048uo.AbstractC20405l;
import p283L5.AbstractC4941g;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7910I5;
import p537W0.C8410b;
import p544W9.AbstractC8532O4;
import p623Zf.C10324t;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;
import p968qi.EnumC18738u;

/* JADX INFO: renamed from: Og.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C6218v extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20230Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f20231Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f20232o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f20233p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f20234q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f20235r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f20236s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6218v(int i10, int i11, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, String str, boolean z6) {
        super(2);
        this.f20230Y = 0;
        this.f20235r0 = interfaceC1426a;
        this.f20231Z = interfaceC10459q;
        this.f20236s0 = str;
        this.f20232o0 = z6;
        this.f20233p0 = i10;
        this.f20234q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20230Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f20233p0 | 1);
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f20231Z;
                AbstractC8532O4.m9195b((InterfaceC1426a) this.f20235r0, interfaceC10459q, (String) this.f20236s0, this.f20232o0, (C6021p) obj, iM6447d0, this.f20234q0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f20233p0 | 1);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f20236s0;
                AbstractC20405l.m21070a((C10324t) this.f20235r0, interfaceC1436k, (InterfaceC10459q) this.f20231Z, this.f20232o0, (C6021p) obj, iM6447d1, this.f20234q0);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f20233p0 | 1);
                C8410b c8410b = (C8410b) this.f20236s0;
                InterfaceC10446d interfaceC10446d = (InterfaceC10446d) this.f20235r0;
                AbstractC17758g.m19481a((InterfaceC10459q) this.f20231Z, interfaceC10446d, this.f20232o0, c8410b, (C6021p) obj, iM6447d2, this.f20234q0);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iM6447d3 = C5997d.m6447d0(this.f20233p0 | 1);
                EnumC18738u enumC18738u = (EnumC18738u) this.f20231Z;
                AbstractC4941g.m5553L((String) this.f20236s0, enumC18738u, this.f20232o0, (InterfaceC1426a) this.f20235r0, (C6021p) obj, iM6447d3, this.f20234q0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d4 = C5997d.m6447d0(this.f20233p0 | 1);
                InterfaceC10459q interfaceC10459q2 = (InterfaceC10459q) this.f20231Z;
                AbstractC7910I5.m8208a((String) this.f20236s0, interfaceC10459q2, this.f20232o0, (String) this.f20235r0, (C6021p) obj, iM6447d4, this.f20234q0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6218v(C10324t c10324t, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, boolean z6, int i10, int i11) {
        super(2);
        this.f20230Y = 1;
        this.f20235r0 = c10324t;
        this.f20236s0 = interfaceC1436k;
        this.f20231Z = interfaceC10459q;
        this.f20232o0 = z6;
        this.f20233p0 = i10;
        this.f20234q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6218v(InterfaceC10459q interfaceC10459q, InterfaceC10446d interfaceC10446d, boolean z6, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f20230Y = 2;
        this.f20231Z = interfaceC10459q;
        this.f20235r0 = interfaceC10446d;
        this.f20232o0 = z6;
        this.f20236s0 = c8410b;
        this.f20233p0 = i10;
        this.f20234q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6218v(String str, Object obj, boolean z6, Object obj2, int i10, int i11, int i12) {
        super(2);
        this.f20230Y = i12;
        this.f20236s0 = str;
        this.f20231Z = obj;
        this.f20232o0 = z6;
        this.f20235r0 = obj2;
        this.f20233p0 = i10;
        this.f20234q0 = i11;
    }
}
