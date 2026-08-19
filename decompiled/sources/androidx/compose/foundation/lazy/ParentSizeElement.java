package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p349O0.C5996c0;
import p349O0.InterfaceC5982V0;
import p635a1.AbstractC10458p;
import p936p0.C18284x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Lz1/S;", "Lp0/x;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ParentSizeElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC5982V0 f32519Y = null;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC5982V0 f32520Z;

    public ParentSizeElement(C5996c0 c5996c0) {
        this.f32520Z = c5996c0;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C18284x c18284x = new C18284x();
        c18284x.f58375z0 = 0.5f;
        c18284x.f58373A0 = this.f32519Y;
        c18284x.f58374B0 = this.f32520Z;
        return c18284x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        parentSizeElement.getClass();
        return AbstractC16544l.m18089b(this.f32519Y, parentSizeElement.f32519Y) && AbstractC16544l.m18089b(this.f32520Z, parentSizeElement.f32520Z);
    }

    public final int hashCode() {
        InterfaceC5982V0 interfaceC5982V0 = this.f32519Y;
        int iHashCode = (interfaceC5982V0 != null ? interfaceC5982V0.hashCode() : 0) * 31;
        InterfaceC5982V0 interfaceC5982V1 = this.f32520Z;
        return Float.floatToIntBits(0.5f) + ((iHashCode + (interfaceC5982V1 != null ? interfaceC5982V1.hashCode() : 0)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C18284x c18284x = (C18284x) abstractC10458p;
        c18284x.f58375z0 = 0.5f;
        c18284x.f58373A0 = this.f32519Y;
        c18284x.f58374B0 = this.f32520Z;
    }
}
