package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p492U1.C7540e;
import p635a1.AbstractC10458p;
import p715e1.C13256b;
import p773h0.C14309t;
import p774h1.C14341T;
import p774h1.InterfaceC14339Q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lz1/S;", "Lh0/t;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class BorderModifierNodeElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final float f32381Y;

    /* JADX INFO: renamed from: Z */
    public final C14341T f32382Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC14339Q f32383o0;

    public BorderModifierNodeElement(float f10, C14341T c14341t, InterfaceC14339Q interfaceC14339Q) {
        this.f32381Y = f10;
        this.f32382Z = c14341t;
        this.f32383o0 = interfaceC14339Q;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C14309t(this.f32381Y, this.f32382Z, this.f32383o0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return C7540e.m7873a(this.f32381Y, borderModifierNodeElement.f32381Y) && this.f32382Z.equals(borderModifierNodeElement.f32382Z) && AbstractC16544l.m18089b(this.f32383o0, borderModifierNodeElement.f32383o0);
    }

    public final int hashCode() {
        return this.f32383o0.hashCode() + ((this.f32382Z.hashCode() + (Float.floatToIntBits(this.f32381Y) * 31)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14309t c14309t = (C14309t) abstractC10458p;
        float f10 = c14309t.f44924C0;
        float f11 = this.f32381Y;
        boolean zM7873a = C7540e.m7873a(f10, f11);
        C13256b c13256b = c14309t.f44927F0;
        if (!zM7873a) {
            c14309t.f44924C0 = f11;
            c13256b.m14855K0();
        }
        C14341T c14341t = c14309t.f44925D0;
        C14341T c14341t2 = this.f32382Z;
        if (!AbstractC16544l.m18089b(c14341t, c14341t2)) {
            c14309t.f44925D0 = c14341t2;
            c13256b.m14855K0();
        }
        InterfaceC14339Q interfaceC14339Q = c14309t.f44926E0;
        InterfaceC14339Q interfaceC14339Q2 = this.f32383o0;
        if (AbstractC16544l.m18089b(interfaceC14339Q, interfaceC14339Q2)) {
            return;
        }
        c14309t.f44926E0 = interfaceC14339Q2;
        c13256b.m14855K0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C7540e.m7874b(this.f32381Y)) + ", brush=" + this.f32382Z + ", shape=" + this.f32383o0 + ')';
    }
}
