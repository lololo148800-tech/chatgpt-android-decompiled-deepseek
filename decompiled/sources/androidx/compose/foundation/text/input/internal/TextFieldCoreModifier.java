package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p002A0.C0120T;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0627n0;
import p1139z0.C21574A0;
import p1139z0.C21582E0;
import p1139z0.C21608c0;
import p1139z0.C21612e0;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p635a1.AbstractC10458p;
import p773h0.C14322z0;
import p774h1.AbstractC14360p;
import p860l0.EnumC16673F0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "Lz1/S;", "Lz0/e0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class TextFieldCoreModifier extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final boolean f32586Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32587Z;

    /* JADX INFO: renamed from: o0 */
    public final C21574A0 f32588o0;

    /* JADX INFO: renamed from: p0 */
    public final C21582E0 f32589p0;

    /* JADX INFO: renamed from: q0 */
    public final C0120T f32590q0;

    /* JADX INFO: renamed from: r0 */
    public final AbstractC14360p f32591r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f32592s0;

    /* JADX INFO: renamed from: t0 */
    public final C14322z0 f32593t0;

    /* JADX INFO: renamed from: u0 */
    public final EnumC16673F0 f32594u0;

    public TextFieldCoreModifier(boolean z6, boolean z10, C21574A0 c21574a0, C21582E0 c21582e0, C0120T c0120t, AbstractC14360p abstractC14360p, boolean z11, C14322z0 c14322z0, EnumC16673F0 enumC16673F0) {
        this.f32586Y = z6;
        this.f32587Z = z10;
        this.f32588o0 = c21574a0;
        this.f32589p0 = c21582e0;
        this.f32590q0 = c0120t;
        this.f32591r0 = abstractC14360p;
        this.f32592s0 = z11;
        this.f32593t0 = c14322z0;
        this.f32594u0 = enumC16673F0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C21612e0(this.f32586Y, this.f32587Z, this.f32588o0, this.f32589p0, this.f32590q0, this.f32591r0, this.f32592s0, this.f32593t0, this.f32594u0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.f32586Y == textFieldCoreModifier.f32586Y && this.f32587Z == textFieldCoreModifier.f32587Z && AbstractC16544l.m18089b(this.f32588o0, textFieldCoreModifier.f32588o0) && AbstractC16544l.m18089b(this.f32589p0, textFieldCoreModifier.f32589p0) && AbstractC16544l.m18089b(this.f32590q0, textFieldCoreModifier.f32590q0) && AbstractC16544l.m18089b(this.f32591r0, textFieldCoreModifier.f32591r0) && this.f32592s0 == textFieldCoreModifier.f32592s0 && AbstractC16544l.m18089b(this.f32593t0, textFieldCoreModifier.f32593t0) && this.f32594u0 == textFieldCoreModifier.f32594u0;
    }

    public final int hashCode() {
        return this.f32594u0.hashCode() + ((this.f32593t0.hashCode() + ((((this.f32591r0.hashCode() + ((this.f32590q0.hashCode() + ((this.f32589p0.hashCode() + ((this.f32588o0.hashCode() + ((((this.f32586Y ? 1231 : 1237) * 31) + (this.f32587Z ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f32592s0 ? 1231 : 1237)) * 31)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C21612e0 c21612e0 = (C21612e0) abstractC10458p;
        boolean zM21952O0 = c21612e0.m21952O0();
        boolean z6 = c21612e0.f68456B0;
        C21582E0 c21582e0 = c21612e0.f68459E0;
        C21574A0 c21574a0 = c21612e0.f68458D0;
        C0120T c0120t = c21612e0.f68460F0;
        C14322z0 c14322z0 = c21612e0.f68463I0;
        boolean z10 = this.f32586Y;
        c21612e0.f68456B0 = z10;
        boolean z11 = this.f32587Z;
        c21612e0.f68457C0 = z11;
        C21574A0 c21574a1 = this.f32588o0;
        c21612e0.f68458D0 = c21574a1;
        C21582E0 c21582e1 = this.f32589p0;
        c21612e0.f68459E0 = c21582e1;
        C0120T c0120t2 = this.f32590q0;
        c21612e0.f68460F0 = c0120t2;
        c21612e0.f68461G0 = this.f32591r0;
        c21612e0.f68462H0 = this.f32592s0;
        C14322z0 c14322z1 = this.f32593t0;
        c21612e0.f68463I0 = c14322z1;
        c21612e0.f68464J0 = this.f32594u0;
        c21612e0.f68470P0.mo423N0(c21582e1, c0120t2, c21574a1, z10 || z11);
        if (!c21612e0.m21952O0()) {
            C0564B0 c0564b0 = c21612e0.f68466L0;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            c21612e0.f68466L0 = null;
            InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) c21612e0.f68465K0.f68321a.getAndSet(null);
            if (interfaceC0627n0 != null) {
                interfaceC0627n0.mo1275e(null);
            }
        } else if (!z6 || !AbstractC16544l.m18089b(c21582e0, c21582e1) || !zM21952O0) {
            c21612e0.f68466L0 = AbstractC0575H.m1156D(c21612e0.m10935y0(), null, null, new C21608c0(c21612e0, null), 3);
        }
        if (AbstractC16544l.m18089b(c21582e0, c21582e1) && AbstractC16544l.m18089b(c21574a0, c21574a1) && AbstractC16544l.m18089b(c0120t, c0120t2) && AbstractC16544l.m18089b(c14322z0, c14322z1)) {
            return;
        }
        AbstractC21690f.m22210o(c21612e0);
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f32586Y + ", isDragHovered=" + this.f32587Z + ", textLayoutState=" + this.f32588o0 + ", textFieldState=" + this.f32589p0 + ", textFieldSelectionState=" + this.f32590q0 + ", cursorBrush=" + this.f32591r0 + ", writeable=" + this.f32592s0 + ", scrollState=" + this.f32593t0 + ", orientation=" + this.f32594u0 + ')';
    }
}
