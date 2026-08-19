package me.saket.telephoto.zoomable.internal;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p858ko.C16484C;
import p858ko.C16510m;
import p878lo.C17100i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Lme/saket/telephoto/zoomable/internal/HardwareShortcutsElement;", "Lz1/S;", "Llo/i;", "zoomable_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class HardwareShortcutsElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C16484C f55002Y;

    /* JADX INFO: renamed from: Z */
    public final C16510m f55003Z;

    public HardwareShortcutsElement(C16484C c16484c, C16510m spec) {
        AbstractC16544l.m18094g(spec, "spec");
        this.f55002Y = c16484c;
        this.f55003Z = spec;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C17100i(this.f55002Y, this.f55003Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HardwareShortcutsElement)) {
            return false;
        }
        HardwareShortcutsElement hardwareShortcutsElement = (HardwareShortcutsElement) obj;
        return this.f55002Y.equals(hardwareShortcutsElement.f55002Y) && AbstractC16544l.m18089b(this.f55003Z, hardwareShortcutsElement.f55003Z);
    }

    public final int hashCode() {
        return this.f55003Z.hashCode() + (this.f55002Y.hashCode() * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17100i node = (C17100i) abstractC10458p;
        AbstractC16544l.m18094g(node, "node");
        node.f54651z0 = this.f55002Y;
        C16510m c16510m = this.f55003Z;
        AbstractC16544l.m18094g(c16510m, "<set-?>");
        node.f54647A0 = c16510m;
    }

    public final String toString() {
        return "HardwareShortcutsElement(state=" + this.f55002Y + ", spec=" + this.f55003Z + Separators.RPAREN;
    }
}
