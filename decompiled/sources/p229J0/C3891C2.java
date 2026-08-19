package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p117Eb.C2385o;
import p349O0.C6021p;
import p350O1.C6045C;
import p537W0.AbstractC8411c;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.C2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3891C2 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ InterfaceC14339Q f11800A0;

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ C4052f4 f11801B0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11802Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f11803Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f11804o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f11805p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C2385o f11806q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17406l f11807r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f11808s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1439n f11809t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC1439n f11810u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ InterfaceC1439n f11811v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC1439n f11812w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ InterfaceC1439n f11813x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ InterfaceC1439n f11814y0;

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ InterfaceC1439n f11815z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3891C2(Object obj, boolean z6, boolean z10, C2385o c2385o, InterfaceC17406l interfaceC17406l, boolean z11, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, InterfaceC1439n interfaceC1439n3, InterfaceC1439n interfaceC1439n4, InterfaceC1439n interfaceC1439n5, InterfaceC1439n interfaceC1439n6, InterfaceC1439n interfaceC1439n7, C4052f4 c4052f4, InterfaceC14339Q interfaceC14339Q, int i10) {
        super(3);
        this.f11802Y = i10;
        this.f11803Z = obj;
        this.f11804o0 = z6;
        this.f11805p0 = z10;
        this.f11806q0 = c2385o;
        this.f11807r0 = interfaceC17406l;
        this.f11808s0 = z11;
        this.f11809t0 = interfaceC1439n;
        this.f11810u0 = interfaceC1439n2;
        this.f11811v0 = interfaceC1439n3;
        this.f11812w0 = interfaceC1439n4;
        this.f11813x0 = interfaceC1439n5;
        this.f11814y0 = interfaceC1439n6;
        this.f11815z0 = interfaceC1439n7;
        this.f11801B0 = c4052f4;
        this.f11800A0 = interfaceC14339Q;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f11802Y) {
            case 0:
                InterfaceC1439n interfaceC1439n = (InterfaceC1439n) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6545h(interfaceC1439n) ? 4 : 2;
                }
                int i10 = iIntValue;
                if ((i10 & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C3879A2 c3879a2 = C3879A2.f11730a;
                    C4052f4 c4052f4 = this.f11801B0;
                    InterfaceC14339Q interfaceC14339Q = this.f11800A0;
                    boolean z6 = this.f11804o0;
                    boolean z10 = this.f11808s0;
                    InterfaceC17406l interfaceC17406l = this.f11807r0;
                    c3879a2.m4600b((String) this.f11803Z, interfaceC1439n, z6, this.f11805p0, this.f11806q0, interfaceC17406l, z10, this.f11809t0, this.f11810u0, this.f11811v0, this.f11812w0, this.f11813x0, this.f11814y0, this.f11815z0, c4052f4, null, AbstractC8411c.m8969c(2108828640, c6021p, new C3885B2(z6, z10, interfaceC17406l, c4052f4, interfaceC14339Q, 0)), c6021p, (i10 << 3) & 112, 14155776, 32768);
                }
                break;
            case 1:
                InterfaceC1439n interfaceC1439n2 = (InterfaceC1439n) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6545h(interfaceC1439n2) ? 4 : 2;
                }
                int i11 = iIntValue2;
                if ((i11 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C4082k4.f13034a.m4751b((String) this.f11803Z, interfaceC1439n2, this.f11804o0, this.f11805p0, this.f11806q0, this.f11807r0, this.f11808s0, this.f11809t0, this.f11810u0, this.f11811v0, this.f11812w0, this.f11813x0, this.f11814y0, this.f11815z0, this.f11800A0, this.f11801B0, null, null, c6021p2, (i11 << 3) & 112, 100663296, 196608);
                }
                break;
            default:
                InterfaceC1439n interfaceC1439n3 = (InterfaceC1439n) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p3.m6545h(interfaceC1439n3) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C3879A2 c3879a3 = C3879A2.f11730a;
                    String str = ((C6045C) this.f11803Z).f19682a.f10934Y;
                    C4052f4 c4052f5 = this.f11801B0;
                    InterfaceC14339Q interfaceC14339Q2 = this.f11800A0;
                    boolean z11 = this.f11804o0;
                    boolean z12 = this.f11808s0;
                    InterfaceC17406l interfaceC17406l2 = this.f11807r0;
                    c3879a3.m4600b(str, interfaceC1439n3, z11, this.f11805p0, this.f11806q0, interfaceC17406l2, z12, this.f11809t0, this.f11810u0, this.f11811v0, this.f11812w0, this.f11813x0, this.f11814y0, this.f11815z0, c4052f5, null, AbstractC8411c.m8969c(255570733, c6021p3, new C3885B2(z11, z12, interfaceC17406l2, c4052f5, interfaceC14339Q2, 1)), c6021p3, (iIntValue3 << 3) & 112, 14155776, 32768);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3891C2(String str, boolean z6, boolean z10, C2385o c2385o, InterfaceC17406l interfaceC17406l, boolean z11, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, InterfaceC1439n interfaceC1439n3, InterfaceC1439n interfaceC1439n4, InterfaceC1439n interfaceC1439n5, InterfaceC1439n interfaceC1439n6, InterfaceC1439n interfaceC1439n7, InterfaceC14339Q interfaceC14339Q, C4052f4 c4052f4) {
        super(3);
        this.f11802Y = 1;
        this.f11803Z = str;
        this.f11804o0 = z6;
        this.f11805p0 = z10;
        this.f11806q0 = c2385o;
        this.f11807r0 = interfaceC17406l;
        this.f11808s0 = z11;
        this.f11809t0 = interfaceC1439n;
        this.f11810u0 = interfaceC1439n2;
        this.f11811v0 = interfaceC1439n3;
        this.f11812w0 = interfaceC1439n4;
        this.f11813x0 = interfaceC1439n5;
        this.f11814y0 = interfaceC1439n6;
        this.f11815z0 = interfaceC1439n7;
        this.f11800A0 = interfaceC14339Q;
        this.f11801B0 = c4052f4;
    }
}
