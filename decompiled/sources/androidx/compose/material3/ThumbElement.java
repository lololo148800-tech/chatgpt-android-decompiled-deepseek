package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p228J.AbstractC3794B0;
import p229J0.C4148v4;
import p635a1.AbstractC10458p;
import p758g0.AbstractC13758e;
import p894n0.InterfaceC17406l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/material3/ThumbElement;", "Lz1/S;", "LJ0/v4;", "material3_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class ThumbElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17406l f32652Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f32653Z;

    public ThumbElement(InterfaceC17406l interfaceC17406l, boolean z6) {
        this.f32652Y = interfaceC17406l;
        this.f32653Z = z6;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        C4148v4 c4148v4 = new C4148v4();
        c4148v4.f13440z0 = this.f32652Y;
        c4148v4.f13434A0 = this.f32653Z;
        c4148v4.f13438E0 = Float.NaN;
        c4148v4.f13439F0 = Float.NaN;
        return c4148v4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return AbstractC16544l.m18089b(this.f32652Y, thumbElement.f32652Y) && this.f32653Z == thumbElement.f32653Z;
    }

    public final int hashCode() {
        return (this.f32652Y.hashCode() * 31) + (this.f32653Z ? 1231 : 1237);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C4148v4 c4148v4 = (C4148v4) abstractC10458p;
        c4148v4.f13440z0 = this.f32652Y;
        boolean z6 = c4148v4.f13434A0;
        boolean z10 = this.f32653Z;
        if (z6 != z10) {
            AbstractC21690f.m22210o(c4148v4);
        }
        c4148v4.f13434A0 = z10;
        if (c4148v4.f13437D0 == null && !Float.isNaN(c4148v4.f13439F0)) {
            c4148v4.f13437D0 = AbstractC13758e.m15236a(c4148v4.f13439F0);
        }
        if (c4148v4.f13436C0 != null || Float.isNaN(c4148v4.f13438E0)) {
            return;
        }
        c4148v4.f13436C0 = AbstractC13758e.m15236a(c4148v4.f13438E0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThumbElement(interactionSource=");
        sb2.append(this.f32652Y);
        sb2.append(", checked=");
        return AbstractC3794B0.m4499x(sb2, this.f32653Z, ')');
    }
}
