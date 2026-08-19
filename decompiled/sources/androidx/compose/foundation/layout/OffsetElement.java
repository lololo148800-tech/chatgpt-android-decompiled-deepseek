package androidx.compose.foundation.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p492U1.C7540e;
import p635a1.AbstractC10458p;
import p911o0.C17757f0;
import p911o0.C17776p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Lz1/S;", "Lo0/f0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class OffsetElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32489Y;

    /* JADX INFO: renamed from: Z */
    public final float f32490Z;

    public OffsetElement(float f10, float f11, C17776p c17776p) {
        this.f32489Y = f10;
        this.f32490Z = f11;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17757f0 c17757f0 = new C17757f0();
        c17757f0.f56697z0 = this.f32489Y;
        c17757f0.f56695A0 = this.f32490Z;
        c17757f0.f56696B0 = true;
        return c17757f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return C7540e.m7873a(this.f32489Y, offsetElement.f32489Y) && C7540e.m7873a(this.f32490Z, offsetElement.f32490Z);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f32490Z) + (Float.floatToIntBits(this.f32489Y) * 31)) * 31) + 1231;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17757f0 c17757f0 = (C17757f0) abstractC10458p;
        c17757f0.f56697z0 = this.f32489Y;
        c17757f0.f56695A0 = this.f32490Z;
        c17757f0.f56696B0 = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) C7540e.m7874b(this.f32489Y)) + ", y=" + ((Object) C7540e.m7874b(this.f32490Z)) + ", rtlAware=true)";
    }
}
