package p547Wc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mh.AbstractC17270r;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p103Dn.InterfaceC2184i;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8239y5;
import p537W0.C8410b;
import p544W9.AbstractC8640h;
import p594Y9.AbstractC9733G3;
import p635a1.InterfaceC10459q;
import p758g0.InterfaceC13726B;
import p774h1.C14365u;
import p895n1.C17425e;
import pf.AbstractC18384B;

/* JADX INFO: renamed from: Wc.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C8758B extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26677Y = 2;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f26678Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f26679o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f26680p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f26681q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f26682r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f26683s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f26684t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8758B(InterfaceC1426a interfaceC1426a, String str, InterfaceC10459q interfaceC10459q, Integer num, C14365u c14365u, int i10, int i11) {
        super(2);
        this.f26682r0 = interfaceC1426a;
        this.f26679o0 = str;
        this.f26678Z = interfaceC10459q;
        this.f26683s0 = num;
        this.f26684t0 = c14365u;
        this.f26680p0 = i10;
        this.f26681q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26677Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f26680p0 | 1);
                String str = (String) this.f26679o0;
                AbstractC9733G3.m10320a(this.f26678Z, (C17425e) this.f26682r0, str, (String) this.f26683s0, (InterfaceC1440o) this.f26684t0, (C6021p) obj, iM6447d0, this.f26681q0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f26680p0 | 1);
                C8410b c8410b = (C8410b) this.f26684t0;
                Object obj3 = this.f26682r0;
                InterfaceC13726B interfaceC13726B = (InterfaceC13726B) this.f26683s0;
                AbstractC8239y5.m8886b(obj3, this.f26678Z, interfaceC13726B, (String) this.f26679o0, c8410b, (C6021p) obj, iM6447d1, this.f26681q0);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f26680p0 | 1);
                InterfaceC10459q interfaceC10459q = this.f26678Z;
                Integer num = (Integer) this.f26683s0;
                AbstractC8640h.m9303b((InterfaceC1426a) this.f26682r0, (String) this.f26679o0, interfaceC10459q, num, (C14365u) this.f26684t0, (C6021p) obj, iM6447d2, this.f26681q0);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iM6447d3 = C5997d.m6447d0(this.f26680p0 | 1);
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f26682r0;
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) this.f26684t0;
                AbstractC17270r.m18971a((String) this.f26679o0, (String) this.f26683s0, interfaceC1426a, interfaceC1426a2, this.f26678Z, (C6021p) obj, iM6447d3, this.f26681q0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d4 = C5997d.m6447d0(this.f26681q0 | 1);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f26683s0;
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) this.f26684t0;
                AbstractC18384B.m19862b((List) this.f26682r0, (InterfaceC2184i) this.f26679o0, this.f26680p0, interfaceC1436k, interfaceC1436k2, this.f26678Z, (C6021p) obj, iM6447d4);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8758B(InterfaceC10459q interfaceC10459q, C17425e c17425e, String str, String str2, InterfaceC1440o interfaceC1440o, int i10, int i11) {
        super(2);
        this.f26678Z = interfaceC10459q;
        this.f26682r0 = c17425e;
        this.f26679o0 = str;
        this.f26683s0 = str2;
        this.f26684t0 = interfaceC1440o;
        this.f26680p0 = i10;
        this.f26681q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8758B(Object obj, InterfaceC10459q interfaceC10459q, InterfaceC13726B interfaceC13726B, String str, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f26682r0 = obj;
        this.f26678Z = interfaceC10459q;
        this.f26683s0 = interfaceC13726B;
        this.f26679o0 = str;
        this.f26684t0 = c8410b;
        this.f26680p0 = i10;
        this.f26681q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8758B(String str, String str2, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f26679o0 = str;
        this.f26683s0 = str2;
        this.f26682r0 = interfaceC1426a;
        this.f26684t0 = interfaceC1426a2;
        this.f26678Z = interfaceC10459q;
        this.f26680p0 = i10;
        this.f26681q0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8758B(List list, InterfaceC2184i interfaceC2184i, int i10, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC10459q interfaceC10459q, int i11) {
        super(2);
        this.f26682r0 = list;
        this.f26679o0 = interfaceC2184i;
        this.f26680p0 = i10;
        this.f26683s0 = interfaceC1436k;
        this.f26684t0 = interfaceC1436k2;
        this.f26678Z = interfaceC10459q;
        this.f26681q0 = i11;
    }
}
