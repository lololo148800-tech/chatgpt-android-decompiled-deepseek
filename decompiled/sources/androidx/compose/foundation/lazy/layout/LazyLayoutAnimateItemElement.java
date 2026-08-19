package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p758g0.InterfaceC13726B;
import p953q0.C18592m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Lz1/S;", "Lq0/m;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class LazyLayoutAnimateItemElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13726B f32523Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC13726B f32524Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC13726B f32525o0;

    public LazyLayoutAnimateItemElement(InterfaceC13726B interfaceC13726B, InterfaceC13726B interfaceC13726B2, InterfaceC13726B interfaceC13726B3) {
        this.f32523Y = interfaceC13726B;
        this.f32524Z = interfaceC13726B2;
        this.f32525o0 = interfaceC13726B3;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C18592m c18592m = new C18592m();
        c18592m.f59232z0 = this.f32523Y;
        c18592m.f59230A0 = this.f32524Z;
        c18592m.f59231B0 = this.f32525o0;
        return c18592m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return AbstractC16544l.m18089b(this.f32523Y, lazyLayoutAnimateItemElement.f32523Y) && AbstractC16544l.m18089b(this.f32524Z, lazyLayoutAnimateItemElement.f32524Z) && AbstractC16544l.m18089b(this.f32525o0, lazyLayoutAnimateItemElement.f32525o0);
    }

    public final int hashCode() {
        InterfaceC13726B interfaceC13726B = this.f32523Y;
        int iHashCode = (interfaceC13726B == null ? 0 : interfaceC13726B.hashCode()) * 31;
        InterfaceC13726B interfaceC13726B2 = this.f32524Z;
        int iHashCode2 = (iHashCode + (interfaceC13726B2 == null ? 0 : interfaceC13726B2.hashCode())) * 31;
        InterfaceC13726B interfaceC13726B3 = this.f32525o0;
        return iHashCode2 + (interfaceC13726B3 != null ? interfaceC13726B3.hashCode() : 0);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C18592m c18592m = (C18592m) abstractC10458p;
        c18592m.f59232z0 = this.f32523Y;
        c18592m.f59230A0 = this.f32524Z;
        c18592m.f59231B0 = this.f32525o0;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f32523Y + ", placementSpec=" + this.f32524Z + ", fadeOutSpec=" + this.f32525o0 + ')';
    }
}
