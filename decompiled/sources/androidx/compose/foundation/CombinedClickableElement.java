package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;
import p1014t1.C19723A;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p156G1.C2960g;
import p635a1.AbstractC10458p;
import p773h0.C14245A;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lz1/S;", "Lh0/A;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class CombinedClickableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17406l f32390Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC14274b0 f32391Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f32392o0;

    /* JADX INFO: renamed from: p0 */
    public final String f32393p0;

    /* JADX INFO: renamed from: q0 */
    public final C2960g f32394q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC1426a f32395r0;

    /* JADX INFO: renamed from: s0 */
    public final String f32396s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC1426a f32397t0;

    /* JADX INFO: renamed from: u0 */
    public final InterfaceC1426a f32398u0;

    public CombinedClickableElement(InterfaceC17406l interfaceC17406l, InterfaceC14274b0 interfaceC14274b0, boolean z6, String str, C2960g c2960g, InterfaceC1426a interfaceC1426a, String str2, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3) {
        this.f32390Y = interfaceC17406l;
        this.f32391Z = interfaceC14274b0;
        this.f32392o0 = z6;
        this.f32393p0 = str;
        this.f32394q0 = c2960g;
        this.f32395r0 = interfaceC1426a;
        this.f32396s0 = str2;
        this.f32397t0 = interfaceC1426a2;
        this.f32398u0 = interfaceC1426a3;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C14245A c14245a = new C14245A(this.f32390Y, this.f32391Z, this.f32392o0, this.f32393p0, this.f32394q0, this.f32395r0);
        c14245a.f44703T0 = this.f32396s0;
        c14245a.f44704U0 = this.f32397t0;
        c14245a.f44705V0 = this.f32398u0;
        return c14245a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return AbstractC16544l.m18089b(this.f32390Y, combinedClickableElement.f32390Y) && AbstractC16544l.m18089b(this.f32391Z, combinedClickableElement.f32391Z) && this.f32392o0 == combinedClickableElement.f32392o0 && AbstractC16544l.m18089b(this.f32393p0, combinedClickableElement.f32393p0) && AbstractC16544l.m18089b(this.f32394q0, combinedClickableElement.f32394q0) && this.f32395r0 == combinedClickableElement.f32395r0 && AbstractC16544l.m18089b(this.f32396s0, combinedClickableElement.f32396s0) && this.f32397t0 == combinedClickableElement.f32397t0 && this.f32398u0 == combinedClickableElement.f32398u0;
    }

    public final int hashCode() {
        InterfaceC17406l interfaceC17406l = this.f32390Y;
        int iHashCode = (interfaceC17406l != null ? interfaceC17406l.hashCode() : 0) * 31;
        InterfaceC14274b0 interfaceC14274b0 = this.f32391Z;
        int iHashCode2 = (((iHashCode + (interfaceC14274b0 != null ? interfaceC14274b0.hashCode() : 0)) * 31) + (this.f32392o0 ? 1231 : 1237)) * 31;
        String str = this.f32393p0;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C2960g c2960g = this.f32394q0;
        int iHashCode4 = (this.f32395r0.hashCode() + ((iHashCode3 + (c2960g != null ? c2960g.f8849a : 0)) * 31)) * 31;
        String str2 = this.f32396s0;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        InterfaceC1426a interfaceC1426a = this.f32397t0;
        int iHashCode6 = (iHashCode5 + (interfaceC1426a != null ? interfaceC1426a.hashCode() : 0)) * 31;
        InterfaceC1426a interfaceC1426a2 = this.f32398u0;
        return iHashCode6 + (interfaceC1426a2 != null ? interfaceC1426a2.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        boolean z6;
        C19723A c19723a;
        C14245A c14245a = (C14245A) abstractC10458p;
        String str = c14245a.f44703T0;
        String str2 = this.f32396s0;
        if (!AbstractC16544l.m18089b(str, str2)) {
            c14245a.f44703T0 = str2;
            AbstractC21690f.m22211p(c14245a);
        }
        boolean z10 = c14245a.f44704U0 == null;
        InterfaceC1426a interfaceC1426a = this.f32397t0;
        if (z10 != (interfaceC1426a == null)) {
            c14245a.m15573P0();
            AbstractC21690f.m22211p(c14245a);
            z6 = true;
        } else {
            z6 = false;
        }
        c14245a.f44704U0 = interfaceC1426a;
        boolean z11 = c14245a.f44705V0 == null;
        InterfaceC1426a interfaceC1426a2 = this.f32398u0;
        if (z11 != (interfaceC1426a2 == null)) {
            z6 = true;
        }
        c14245a.f44705V0 = interfaceC1426a2;
        boolean z12 = c14245a.f44844F0;
        boolean z13 = this.f32392o0;
        boolean z14 = z12 != z13 ? true : z6;
        c14245a.m15575R0(this.f32390Y, this.f32391Z, z13, this.f32393p0, this.f32394q0, this.f32395r0);
        if (!z14 || (c19723a = c14245a.f44848J0) == null) {
            return;
        }
        c19723a.m20669M0();
    }
}
