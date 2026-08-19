package me.saket.telephoto.zoomable.internal;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p482Tg.C7445b0;
import p635a1.AbstractC10458p;
import p658b5.C11238i;
import p858ko.C16491J;
import p878lo.C17087J;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Lme/saket/telephoto/zoomable/internal/TransformableElement;", "Lz1/S;", "Llo/J;", "zoomable_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class TransformableElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final C11238i f55011Y;

    /* JADX INFO: renamed from: Z */
    public final C7445b0 f55012Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f55013o0;

    /* JADX INFO: renamed from: p0 */
    public final C16491J f55014p0;

    public TransformableElement(C11238i state, C7445b0 c7445b0, boolean z6, C16491J c16491j) {
        AbstractC16544l.m18094g(state, "state");
        this.f55011Y = state;
        this.f55012Z = c7445b0;
        this.f55013o0 = z6;
        this.f55014p0 = c16491j;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C16491J c16491j = this.f55014p0;
        return new C17087J(this.f55011Y, this.f55012Z, this.f55013o0, c16491j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformableElement)) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return AbstractC16544l.m18089b(this.f55011Y, transformableElement.f55011Y) && this.f55012Z.equals(transformableElement.f55012Z) && this.f55013o0 == transformableElement.f55013o0 && this.f55014p0.equals(transformableElement.f55014p0);
    }

    public final int hashCode() {
        return this.f55014p0.hashCode() + ((((((this.f55012Z.hashCode() + (this.f55011Y.hashCode() * 31)) * 31) + 1237) * 31) + (this.f55013o0 ? 1231 : 1237)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C17087J node = (C17087J) abstractC10458p;
        AbstractC16544l.m18094g(node, "node");
        node.m18892N0(this.f55011Y, this.f55012Z, this.f55013o0, this.f55014p0);
    }

    public final String toString() {
        return "TransformableElement(state=" + this.f55011Y + ", canPan=" + this.f55012Z + ", lockRotationOnZoomPan=false, enabled=" + this.f55013o0 + ", onTransformStopped=" + this.f55014p0 + Separators.RPAREN;
    }
}
