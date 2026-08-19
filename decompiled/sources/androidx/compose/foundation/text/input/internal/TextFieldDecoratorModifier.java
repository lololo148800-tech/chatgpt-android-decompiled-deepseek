package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p002A0.C0120T;
import p1014t1.C19723A;
import p1071w0.C20748f0;
import p1094x0.C21044c;
import p1139z0.C21574A0;
import p1139z0.C21582E0;
import p1139z0.C21640s0;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p635a1.AbstractC10458p;
import p870le.C16893m;
import p894n0.InterfaceC17406l;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Lz1/S;", "Lz0/s0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class TextFieldDecoratorModifier extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C21582E0 f32595Y;

    /* JADX INFO: renamed from: Z */
    public final C21574A0 f32596Z;

    /* JADX INFO: renamed from: o0 */
    public final C0120T f32597o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32598p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32599q0;

    /* JADX INFO: renamed from: r0 */
    public final C20748f0 f32600r0;

    /* JADX INFO: renamed from: s0 */
    public final C16893m f32601s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f32602t0;

    /* JADX INFO: renamed from: u0 */
    public final InterfaceC17406l f32603u0;

    public TextFieldDecoratorModifier(C21582E0 c21582e0, C21574A0 c21574a0, C0120T c0120t, boolean z6, boolean z10, C20748f0 c20748f0, C16893m c16893m, boolean z11, InterfaceC17406l interfaceC17406l) {
        this.f32595Y = c21582e0;
        this.f32596Z = c21574a0;
        this.f32597o0 = c0120t;
        this.f32598p0 = z6;
        this.f32599q0 = z10;
        this.f32600r0 = c20748f0;
        this.f32601s0 = c16893m;
        this.f32602t0 = z11;
        this.f32603u0 = interfaceC17406l;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C21640s0(this.f32595Y, this.f32596Z, this.f32597o0, this.f32598p0, this.f32599q0, this.f32600r0, this.f32601s0, this.f32602t0, this.f32603u0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return AbstractC16544l.m18089b(this.f32595Y, textFieldDecoratorModifier.f32595Y) && AbstractC16544l.m18089b(this.f32596Z, textFieldDecoratorModifier.f32596Z) && AbstractC16544l.m18089b(this.f32597o0, textFieldDecoratorModifier.f32597o0) && AbstractC16544l.m18089b(null, null) && this.f32598p0 == textFieldDecoratorModifier.f32598p0 && this.f32599q0 == textFieldDecoratorModifier.f32599q0 && AbstractC16544l.m18089b(this.f32600r0, textFieldDecoratorModifier.f32600r0) && AbstractC16544l.m18089b(this.f32601s0, textFieldDecoratorModifier.f32601s0) && this.f32602t0 == textFieldDecoratorModifier.f32602t0 && AbstractC16544l.m18089b(this.f32603u0, textFieldDecoratorModifier.f32603u0);
    }

    public final int hashCode() {
        int iHashCode = (this.f32600r0.hashCode() + ((((((this.f32597o0.hashCode() + ((this.f32596Z.hashCode() + (this.f32595Y.hashCode() * 31)) * 31)) * 961) + (this.f32598p0 ? 1231 : 1237)) * 31) + (this.f32599q0 ? 1231 : 1237)) * 31)) * 31;
        C16893m c16893m = this.f32601s0;
        return this.f32603u0.hashCode() + ((((iHashCode + (c16893m == null ? 0 : c16893m.hashCode())) * 31) + (this.f32602t0 ? 1231 : 1237)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C21640s0 c21640s0 = (C21640s0) abstractC10458p;
        boolean z6 = c21640s0.f68553E0;
        boolean z10 = z6 && !c21640s0.f68554F0;
        boolean z11 = this.f32598p0;
        boolean z12 = this.f32599q0;
        boolean z13 = z11 && !z12;
        C21582E0 c21582e0 = c21640s0.f68550B0;
        C20748f0 c20748f0 = c21640s0.f68562N0;
        C0120T c0120t = c21640s0.f68552D0;
        InterfaceC17406l interfaceC17406l = c21640s0.f68557I0;
        C21582E0 c21582e1 = this.f32595Y;
        c21640s0.f68550B0 = c21582e1;
        c21640s0.f68551C0 = this.f32596Z;
        C0120T c0120t2 = this.f32597o0;
        c21640s0.f68552D0 = c0120t2;
        c21640s0.f68553E0 = z11;
        c21640s0.f68554F0 = z12;
        C20748f0 c20748f1 = this.f32600r0;
        c20748f1.getClass();
        c21640s0.f68562N0 = c20748f1;
        c21640s0.f68555G0 = this.f32601s0;
        c21640s0.f68556H0 = this.f32602t0;
        InterfaceC17406l interfaceC17406l2 = this.f32603u0;
        c21640s0.f68557I0 = interfaceC17406l2;
        if (z13 != z10 || !AbstractC16544l.m18089b(c21582e1, c21582e0) || !AbstractC16544l.m18089b(c21640s0.f68562N0, c20748f0)) {
            if (z13 && c21640s0.m21990S0()) {
                c21640s0.m21993V0(false);
            } else if (!z13) {
                c21640s0.m21987P0();
            }
        }
        if (z6 != z11) {
            AbstractC21690f.m22211p(c21640s0);
        }
        boolean zM18089b = AbstractC16544l.m18089b(c0120t2, c0120t);
        C21044c c21044c = c21640s0.f68560L0;
        C19723A c19723a = c21640s0.f68559K0;
        if (!zM18089b) {
            c19723a.m20669M0();
            c21044c.f66932D0.m20669M0();
            if (c21640s0.f30972y0) {
                c0120t2.f510l = c21640s0.f68569U0;
            }
        }
        if (AbstractC16544l.m18089b(interfaceC17406l2, interfaceC17406l)) {
            return;
        }
        c19723a.m20669M0();
        c21044c.f66932D0.m20669M0();
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f32595Y + ", textLayoutState=" + this.f32596Z + ", textFieldSelectionState=" + this.f32597o0 + sVDIzpC.XULWJvLuF + this.f32598p0 + ", readOnly=" + this.f32599q0 + ", keyboardOptions=" + this.f32600r0 + ", keyboardActionHandler=" + this.f32601s0 + ", singleLine=" + this.f32602t0 + ", interactionSource=" + this.f32603u0 + ')';
    }
}
