package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p080D0.C1837w0;
import p1071w0.C20750g0;
import p1139z0.C21587J;
import p1139z0.C21611e;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Lz1/S;", "Lz0/J;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C21611e f32583Y;

    /* JADX INFO: renamed from: Z */
    public final C20750g0 f32584Z;

    /* JADX INFO: renamed from: o0 */
    public final C1837w0 f32585o0;

    public LegacyAdaptingPlatformTextInputModifier(C21611e c21611e, C20750g0 c20750g0, C1837w0 c1837w0) {
        this.f32583Y = c21611e;
        this.f32584Z = c20750g0;
        this.f32585o0 = c1837w0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C1837w0 c1837w0 = this.f32585o0;
        return new C21587J(this.f32583Y, this.f32584Z, c1837w0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return AbstractC16544l.m18089b(this.f32583Y, legacyAdaptingPlatformTextInputModifier.f32583Y) && AbstractC16544l.m18089b(this.f32584Z, legacyAdaptingPlatformTextInputModifier.f32584Z) && AbstractC16544l.m18089b(this.f32585o0, legacyAdaptingPlatformTextInputModifier.f32585o0);
    }

    public final int hashCode() {
        return this.f32585o0.hashCode() + ((this.f32584Z.hashCode() + (this.f32583Y.hashCode() * 31)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C21587J c21587j = (C21587J) abstractC10458p;
        if (c21587j.f30972y0) {
            c21587j.f68352z0.mo6617d();
            c21587j.f68352z0.m21950k(c21587j);
        }
        C21611e c21611e = this.f32583Y;
        c21587j.f68352z0 = c21611e;
        if (c21587j.f30972y0) {
            if (c21611e.f68452a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            c21611e.f68452a = c21587j;
        }
        c21587j.f68349A0 = this.f32584Z;
        c21587j.f68350B0 = this.f32585o0;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f32583Y + ", legacyTextFieldState=" + this.f32584Z + ", textFieldSelectionManager=" + this.f32585o0 + ')';
    }
}
