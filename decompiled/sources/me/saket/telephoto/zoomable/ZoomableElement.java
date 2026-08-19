package me.saket.telephoto.zoomable;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p482Tg.C7445b0;
import p635a1.AbstractC10458p;
import p658b5.C11238i;
import p858ko.C16484C;
import p858ko.C16495N;
import p858ko.C16500c;
import p878lo.C17087J;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Lme/saket/telephoto/zoomable/ZoomableElement;", "Lz1/S;", "Lko/N;", "zoomable_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class ZoomableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C16484C f54997Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f54998Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f54999o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC1436k f55000p0;

    /* JADX INFO: renamed from: q0 */
    public final C16500c f55001q0;

    public ZoomableElement(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C16500c c16500c, C16484C c16484c, boolean z6) {
        this.f54997Y = c16484c;
        this.f54998Z = z6;
        this.f54999o0 = interfaceC1436k;
        this.f55000p0 = interfaceC1436k2;
        this.f55001q0 = c16500c;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C16484C c16484c = this.f54997Y;
        return new C16495N(this.f54999o0, this.f55000p0, this.f55001q0, c16484c, this.f54998Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoomableElement)) {
            return false;
        }
        ZoomableElement zoomableElement = (ZoomableElement) obj;
        return AbstractC16544l.m18089b(this.f54997Y, zoomableElement.f54997Y) && this.f54998Z == zoomableElement.f54998Z && AbstractC16544l.m18089b(this.f54999o0, zoomableElement.f54999o0) && AbstractC16544l.m18089b(this.f55000p0, zoomableElement.f55000p0) && AbstractC16544l.m18089b(this.f55001q0, zoomableElement.f55001q0);
    }

    public final int hashCode() {
        int iHashCode = ((this.f54997Y.hashCode() * 31) + (this.f54998Z ? 1231 : 1237)) * 31;
        InterfaceC1436k interfaceC1436k = this.f54999o0;
        int iHashCode2 = (iHashCode + (interfaceC1436k == null ? 0 : interfaceC1436k.hashCode())) * 31;
        InterfaceC1436k interfaceC1436k2 = this.f55000p0;
        return this.f55001q0.hashCode() + ((iHashCode2 + (interfaceC1436k2 != null ? interfaceC1436k2.hashCode() : 0)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C16495N node = (C16495N) abstractC10458p;
        AbstractC16544l.m18094g(node, "node");
        C16484C c16484c = this.f54997Y;
        C16500c c16500c = this.f55001q0;
        if (!AbstractC16544l.m18089b(node.f51169B0, c16484c)) {
            node.f51169B0 = c16484c;
        }
        node.f51170C0 = c16500c;
        C7445b0 c7445b0 = new C7445b0(1, c16484c, C16484C.class, "canConsumePanChange", "canConsumePanChange-k-4lQ0M$zoomable_release(J)Z", 0, 27);
        C17087J c17087j = node.f51177J0;
        C11238i c11238i = c16484c.f51149p;
        boolean z6 = this.f54998Z;
        c17087j.m18892N0(c11238i, c7445b0, z6, node.f51175H0);
        node.f51176I0.m18894N0(node.f51172E0, this.f54999o0, this.f55000p0, node.f51173F0, node.f51174G0, c16484c.f51149p, z6);
    }

    public final String toString() {
        return "ZoomableElement(state=" + this.f54997Y + ", enabled=" + this.f54998Z + ", onClick=" + this.f54999o0 + ", onLongClick=" + this.f55000p0 + ", onDoubleClick=" + this.f55001q0 + Separators.RPAREN;
    }
}
