package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p911o0.C17726F0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lz1/S;", "Lo0/F0;", "foundation-layout_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class WrapContentElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final int f32505Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32506Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC16546n f32507o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f32508p0;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i10, boolean z6, InterfaceC1439n interfaceC1439n, Object obj) {
        this.f32505Y = i10;
        this.f32506Z = z6;
        this.f32507o0 = (AbstractC16546n) interfaceC1439n;
        this.f32508p0 = obj;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C17726F0 c17726f0 = new C17726F0();
        c17726f0.f56592z0 = this.f32505Y;
        c17726f0.f56590A0 = this.f32506Z;
        c17726f0.f56591B0 = this.f32507o0;
        return c17726f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f32505Y == wrapContentElement.f32505Y && this.f32506Z == wrapContentElement.f32506Z && AbstractC16544l.m18089b(this.f32508p0, wrapContentElement.f32508p0);
    }

    public final int hashCode() {
        return this.f32508p0.hashCode() + (((AbstractC0010F.m24h(this.f32505Y) * 31) + (this.f32506Z ? 1231 : 1237)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17726F0 c17726f0 = (C17726F0) abstractC10458p;
        c17726f0.f56592z0 = this.f32505Y;
        c17726f0.f56590A0 = this.f32506Z;
        c17726f0.f56591B0 = this.f32507o0;
    }
}
