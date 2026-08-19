package p169Gf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p479Td.C7320F;
import p523V9.AbstractC7981R5;
import p523V9.AbstractC8082f0;
import p575Xd.C9436E;
import p635a1.InterfaceC10459q;
import p989rd.EnumC18945g;

/* JADX INFO: renamed from: Gf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3044h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9171Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f9172Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f9173o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f9174p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f9175q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f9176r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f9177s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f9178t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC17302e f9179u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f9180v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3044h(InterfaceC1426a interfaceC1426a, String str, String str2, C7320F c7320f, boolean z6, C9436E c9436e, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f9173o0 = interfaceC1426a;
        this.f9172Z = str;
        this.f9176r0 = str2;
        this.f9177s0 = c7320f;
        this.f9174p0 = z6;
        this.f9178t0 = c9436e;
        this.f9179u0 = interfaceC1436k;
        this.f9180v0 = interfaceC10459q;
        this.f9175q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9171Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f9175q0 | 1);
                boolean z6 = this.f9174p0;
                C9436E c9436e = (C9436E) this.f9178t0;
                AbstractC7981R5.m8286c(this.f9173o0, this.f9172Z, (String) this.f9176r0, (C7320F) this.f9177s0, z6, c9436e, (InterfaceC1436k) this.f9179u0, (InterfaceC10459q) this.f9180v0, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f9175q0 | 1);
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f9180v0;
                boolean z10 = this.f9174p0;
                AbstractC8082f0.m8513e(this.f9172Z, (EnumC18945g) this.f9176r0, this.f9173o0, (InterfaceC1426a) this.f9177s0, (InterfaceC1426a) this.f9178t0, (InterfaceC1426a) this.f9179u0, interfaceC1426a, z10, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3044h(String str, EnumC18945g enumC18945g, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, InterfaceC1426a interfaceC1426a4, InterfaceC1426a interfaceC1426a5, boolean z6, int i10) {
        super(2);
        this.f9172Z = str;
        this.f9176r0 = enumC18945g;
        this.f9173o0 = interfaceC1426a;
        this.f9177s0 = interfaceC1426a2;
        this.f9178t0 = interfaceC1426a3;
        this.f9179u0 = interfaceC1426a4;
        this.f9180v0 = interfaceC1426a5;
        this.f9174p0 = z6;
        this.f9175q0 = i10;
    }
}
