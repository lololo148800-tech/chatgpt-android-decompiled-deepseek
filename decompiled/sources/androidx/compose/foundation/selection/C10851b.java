package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC10839g;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p156G1.C2960g;
import p349O0.C6013l;
import p349O0.C6021p;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.InterfaceC14267W;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10851b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC14267W f32570Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f32571Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f32572o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2960g f32573p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1426a f32574q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10851b(InterfaceC14267W interfaceC14267W, boolean z6, boolean z10, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        super(3);
        this.f32570Y = interfaceC14267W;
        this.f32571Z = z6;
        this.f32572o0 = z10;
        this.f32573p0 = c2960g;
        this.f32574q0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(-1525724089);
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            objM6514H = AbstractC0168G.m536y(c6021p);
        }
        InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
        InterfaceC10459q interfaceC10459qMo428M = AbstractC10839g.m11214a(C10456n.f30959Y, interfaceC17406l, this.f32570Y).mo428M(new SelectableElement(this.f32571Z, interfaceC17406l, null, this.f32572o0, this.f32573p0, this.f32574q0));
        c6021p.m6553p(false);
        return interfaceC10459qMo428M;
    }
}
