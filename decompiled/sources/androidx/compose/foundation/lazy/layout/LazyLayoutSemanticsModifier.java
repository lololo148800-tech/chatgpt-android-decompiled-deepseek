package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p225Im.InterfaceC3771s;
import p635a1.AbstractC10458p;
import p860l0.EnumC16673F0;
import p953q0.C18577e0;
import p953q0.InterfaceC18569a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Lz1/S;", "Lq0/e0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class LazyLayoutSemanticsModifier extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3771s f32527Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18569a0 f32528Z;

    /* JADX INFO: renamed from: o0 */
    public final EnumC16673F0 f32529o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32530p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32531q0;

    public LazyLayoutSemanticsModifier(InterfaceC3771s interfaceC3771s, InterfaceC18569a0 interfaceC18569a0, EnumC16673F0 enumC16673F0, boolean z6, boolean z10) {
        this.f32527Y = interfaceC3771s;
        this.f32528Z = interfaceC18569a0;
        this.f32529o0 = enumC16673F0;
        this.f32530p0 = z6;
        this.f32531q0 = z10;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C18577e0(this.f32527Y, this.f32528Z, this.f32529o0, this.f32530p0, this.f32531q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f32527Y == lazyLayoutSemanticsModifier.f32527Y && AbstractC16544l.m18089b(this.f32528Z, lazyLayoutSemanticsModifier.f32528Z) && this.f32529o0 == lazyLayoutSemanticsModifier.f32529o0 && this.f32530p0 == lazyLayoutSemanticsModifier.f32530p0 && this.f32531q0 == lazyLayoutSemanticsModifier.f32531q0;
    }

    public final int hashCode() {
        return ((((this.f32529o0.hashCode() + ((this.f32528Z.hashCode() + (this.f32527Y.hashCode() * 31)) * 31)) * 31) + (this.f32530p0 ? 1231 : 1237)) * 31) + (this.f32531q0 ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C18577e0 c18577e0 = (C18577e0) abstractC10458p;
        c18577e0.f59178z0 = this.f32527Y;
        c18577e0.f59171A0 = this.f32528Z;
        EnumC16673F0 enumC16673F0 = c18577e0.f59172B0;
        EnumC16673F0 enumC16673F1 = this.f32529o0;
        if (enumC16673F0 != enumC16673F1) {
            c18577e0.f59172B0 = enumC16673F1;
            AbstractC21690f.m22211p(c18577e0);
        }
        boolean z6 = c18577e0.f59173C0;
        boolean z10 = this.f32530p0;
        boolean z11 = this.f32531q0;
        if (z6 == z10 && c18577e0.f59174D0 == z11) {
            return;
        }
        c18577e0.f59173C0 = z10;
        c18577e0.f59174D0 = z11;
        c18577e0.m19945K0();
        AbstractC21690f.m22211p(c18577e0);
    }
}
