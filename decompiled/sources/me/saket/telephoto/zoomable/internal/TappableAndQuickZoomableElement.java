package me.saket.telephoto.zoomable.internal;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p658b5.C11238i;
import p722e8.C13298H;
import p775h2.AbstractC14376f;
import p858ko.C16491J;
import p878lo.C17116y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Lme/saket/telephoto/zoomable/internal/TappableAndQuickZoomableElement;", "Lz1/S;", "Llo/y;", "zoomable_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class TappableAndQuickZoomableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C16491J f55004Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1436k f55005Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f55006o0;

    /* JADX INFO: renamed from: p0 */
    public final C16491J f55007p0;

    /* JADX INFO: renamed from: q0 */
    public final C13298H f55008q0;

    /* JADX INFO: renamed from: r0 */
    public final C11238i f55009r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f55010s0;

    public TappableAndQuickZoomableElement(C16491J c16491j, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C16491J c16491j2, C13298H c13298h, C11238i transformableState, boolean z6) {
        AbstractC16544l.m18094g(transformableState, "transformableState");
        this.f55004Y = c16491j;
        this.f55005Z = interfaceC1436k;
        this.f55006o0 = interfaceC1436k2;
        this.f55007p0 = c16491j2;
        this.f55008q0 = c13298h;
        this.f55009r0 = transformableState;
        this.f55010s0 = z6;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C17116y(this.f55004Y, this.f55005Z, this.f55006o0, this.f55007p0, this.f55008q0, this.f55009r0, this.f55010s0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TappableAndQuickZoomableElement)) {
            return false;
        }
        TappableAndQuickZoomableElement tappableAndQuickZoomableElement = (TappableAndQuickZoomableElement) obj;
        return this.f55004Y.equals(tappableAndQuickZoomableElement.f55004Y) && AbstractC16544l.m18089b(this.f55005Z, tappableAndQuickZoomableElement.f55005Z) && AbstractC16544l.m18089b(this.f55006o0, tappableAndQuickZoomableElement.f55006o0) && this.f55007p0.equals(tappableAndQuickZoomableElement.f55007p0) && this.f55008q0.equals(tappableAndQuickZoomableElement.f55008q0) && AbstractC16544l.m18089b(this.f55009r0, tappableAndQuickZoomableElement.f55009r0) && this.f55010s0 == tappableAndQuickZoomableElement.f55010s0;
    }

    public final int hashCode() {
        int iHashCode = this.f55004Y.hashCode() * 31;
        InterfaceC1436k interfaceC1436k = this.f55005Z;
        int iHashCode2 = (iHashCode + (interfaceC1436k == null ? 0 : interfaceC1436k.hashCode())) * 31;
        InterfaceC1436k interfaceC1436k2 = this.f55006o0;
        return ((this.f55009r0.hashCode() + ((this.f55008q0.hashCode() + ((this.f55007p0.hashCode() + ((iHashCode2 + (interfaceC1436k2 != null ? interfaceC1436k2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31) + (this.f55010s0 ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17116y node = (C17116y) abstractC10458p;
        AbstractC16544l.m18094g(node, "node");
        C16491J c16491j = this.f55007p0;
        C13298H c13298h = this.f55008q0;
        node.m18894N0(this.f55004Y, this.f55005Z, this.f55006o0, c16491j, c13298h, this.f55009r0, this.f55010s0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TappableAndQuickZoomableElement(onPress=");
        sb2.append(this.f55004Y);
        sb2.append(", onTap=");
        sb2.append(this.f55005Z);
        sb2.append(", onLongPress=");
        sb2.append(this.f55006o0);
        sb2.append(", onDoubleTap=");
        sb2.append(this.f55007p0);
        sb2.append(", onQuickZoomStopped=");
        sb2.append(this.f55008q0);
        sb2.append(", transformableState=");
        sb2.append(this.f55009r0);
        sb2.append(", gesturesEnabled=");
        return AbstractC14376f.m15823B(sb2, this.f55010s0, Separators.RPAREN);
    }
}
