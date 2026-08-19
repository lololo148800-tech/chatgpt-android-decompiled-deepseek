package androidx.compose.foundation.layout;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p492U1.C7540e;
import p635a1.AbstractC10458p;
import p911o0.C17793x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Lz1/S;", "Lo0/x0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class UnspecifiedConstraintsElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32502Y;

    /* JADX INFO: renamed from: Z */
    public final float f32503Z;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f32502Y = f10;
        this.f32503Z = f11;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17793x0 c17793x0 = new C17793x0();
        c17793x0.f56776z0 = this.f32502Y;
        c17793x0.f56775A0 = this.f32503Z;
        return c17793x0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return C7540e.m7873a(this.f32502Y, unspecifiedConstraintsElement.f32502Y) && C7540e.m7873a(this.f32503Z, unspecifiedConstraintsElement.f32503Z);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32503Z) + (Float.floatToIntBits(this.f32502Y) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17793x0 c17793x0 = (C17793x0) abstractC10458p;
        c17793x0.f56776z0 = this.f32502Y;
        c17793x0.f56775A0 = this.f32503Z;
    }
}
