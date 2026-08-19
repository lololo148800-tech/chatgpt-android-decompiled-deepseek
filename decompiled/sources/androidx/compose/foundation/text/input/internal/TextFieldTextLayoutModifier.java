package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p1139z0.C21574A0;
import p1139z0.C21582E0;
import p1139z0.C21648w0;
import p1139z0.C21650x0;
import p1139z0.C21652y0;
import p1140z1.AbstractC21672S;
import p204I1.C3582M;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "Lz1/S;", "Lz0/y0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class TextFieldTextLayoutModifier extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C21574A0 f32604Y;

    /* JADX INFO: renamed from: Z */
    public final C21582E0 f32605Z;

    /* JADX INFO: renamed from: o0 */
    public final C3582M f32606o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32607p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC1439n f32608q0;

    public TextFieldTextLayoutModifier(C21574A0 c21574a0, C21582E0 c21582e0, C3582M c3582m, boolean z6, InterfaceC1439n interfaceC1439n) {
        this.f32604Y = c21574a0;
        this.f32605Z = c21582e0;
        this.f32606o0 = c3582m;
        this.f32607p0 = z6;
        this.f32608q0 = interfaceC1439n;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C21652y0 c21652y0 = new C21652y0();
        C21574A0 c21574a0 = this.f32604Y;
        c21652y0.f68621z0 = c21574a0;
        boolean z6 = this.f32607p0;
        c21652y0.f68619A0 = z6;
        c21574a0.f68314b = this.f32608q0;
        C21650x0 c21650x0 = c21574a0.f68313a;
        c21650x0.getClass();
        c21650x0.f68603Y.setValue(new C21648w0(this.f32605Z, this.f32606o0, z6, !z6));
        return c21652y0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return AbstractC16544l.m18089b(this.f32604Y, textFieldTextLayoutModifier.f32604Y) && AbstractC16544l.m18089b(this.f32605Z, textFieldTextLayoutModifier.f32605Z) && AbstractC16544l.m18089b(this.f32606o0, textFieldTextLayoutModifier.f32606o0) && this.f32607p0 == textFieldTextLayoutModifier.f32607p0 && AbstractC16544l.m18089b(this.f32608q0, textFieldTextLayoutModifier.f32608q0);
    }

    public final int hashCode() {
        int iHashCode = (((this.f32606o0.hashCode() + ((this.f32605Z.hashCode() + (this.f32604Y.hashCode() * 31)) * 31)) * 31) + (this.f32607p0 ? 1231 : 1237)) * 31;
        InterfaceC1439n interfaceC1439n = this.f32608q0;
        return iHashCode + (interfaceC1439n == null ? 0 : interfaceC1439n.hashCode());
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C21652y0 c21652y0 = (C21652y0) abstractC10458p;
        C21574A0 c21574a0 = this.f32604Y;
        c21652y0.f68621z0 = c21574a0;
        c21574a0.f68314b = this.f32608q0;
        boolean z6 = this.f32607p0;
        c21652y0.f68619A0 = z6;
        C21650x0 c21650x0 = c21574a0.f68313a;
        c21650x0.getClass();
        c21650x0.f68603Y.setValue(new C21648w0(this.f32605Z, this.f32606o0, z6, !z6));
    }

    public final String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.f32604Y + ", textFieldState=" + this.f32605Z + ", textStyle=" + this.f32606o0 + ", singleLine=" + this.f32607p0 + ", onTextLayout=" + this.f32608q0 + ')';
    }
}
