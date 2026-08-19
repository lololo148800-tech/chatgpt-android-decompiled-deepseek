package androidx.compose.foundation;

import kotlin.jvm.internal.AbstractC16546n;
import p003A1.AbstractC0168G;
import p003A1.C0280q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p156G1.C2960g;
import p349O0.C6013l;
import p349O0.C6021p;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.InterfaceC14267W;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.foundation.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10836d extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f32431Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f32432Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2960g f32433o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f32434p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1426a f32435q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1426a f32436r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1426a f32437s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10836d(boolean z6, String str, C2960g c2960g, String str2, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3) {
        super(3);
        this.f32431Y = z6;
        this.f32432Z = str;
        this.f32433o0 = c2960g;
        this.f32434p0 = str2;
        this.f32435q0 = interfaceC1426a;
        this.f32436r0 = interfaceC1426a2;
        this.f32437s0 = interfaceC1426a3;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17406l interfaceC17406l;
        InterfaceC10459q interfaceC10459qM10921b;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(1969174843);
        InterfaceC14267W interfaceC14267W = (InterfaceC14267W) c6021p.m6548k(AbstractC10839g.f32446a);
        boolean z6 = interfaceC14267W instanceof InterfaceC14274b0;
        if (z6) {
            c6021p.m6524S(-1726989699);
            c6021p.m6553p(false);
            interfaceC17406l = null;
        } else {
            c6021p.m6524S(-1726881726);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            interfaceC17406l = (InterfaceC17406l) objM6514H;
            c6021p.m6553p(false);
        }
        InterfaceC17406l interfaceC17406l2 = interfaceC17406l;
        boolean z10 = this.f32431Y;
        String str = this.f32432Z;
        C2960g c2960g = this.f32433o0;
        String str2 = this.f32434p0;
        InterfaceC1426a interfaceC1426a = this.f32435q0;
        InterfaceC1426a interfaceC1426a2 = this.f32436r0;
        InterfaceC1426a interfaceC1426a3 = this.f32437s0;
        if (z6) {
            interfaceC10459qM10921b = new CombinedClickableElement(interfaceC17406l2, (InterfaceC14274b0) interfaceC14267W, z10, str, c2960g, interfaceC1426a3, str2, interfaceC1426a, interfaceC1426a2);
        } else if (interfaceC14267W == null) {
            interfaceC10459qM10921b = new CombinedClickableElement(interfaceC17406l2, null, z10, str, c2960g, interfaceC1426a3, str2, interfaceC1426a, interfaceC1426a2);
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (interfaceC17406l2 != null) {
                interfaceC10459qM10921b = AbstractC10839g.m11214a(c10456n, interfaceC17406l2, interfaceC14267W).mo428M(new CombinedClickableElement(interfaceC17406l2, null, z10, str, c2960g, interfaceC1426a3, str2, interfaceC1426a, interfaceC1426a2));
            } else {
                interfaceC10459qM10921b = AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C10837e(interfaceC14267W, z10, str, c2960g, interfaceC1426a3, str2, interfaceC1426a, interfaceC1426a2));
            }
        }
        c6021p.m6553p(false);
        return interfaceC10459qM10921b;
    }
}
