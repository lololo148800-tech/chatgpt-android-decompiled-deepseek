package p858ko;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21073a0;
import p492U1.EnumC7546k;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10446d;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;

/* JADX INFO: renamed from: ko.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C16503f {

    /* JADX INFO: renamed from: a */
    public final long f51187a;

    /* JADX INFO: renamed from: b */
    public final long f51188b;

    /* JADX INFO: renamed from: c */
    public final long f51189c;

    /* JADX INFO: renamed from: d */
    public final C13801c f51190d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC10446d f51191e;

    /* JADX INFO: renamed from: f */
    public final EnumC7546k f51192f;

    public C16503f(long j10, long j11, long j12, C13801c c13801c, InterfaceC10446d contentAlignment, EnumC7546k layoutDirection) {
        AbstractC16544l.m18094g(contentAlignment, "contentAlignment");
        AbstractC16544l.m18094g(layoutDirection, "layoutDirection");
        this.f51187a = j10;
        this.f51188b = j11;
        this.f51189c = j12;
        this.f51190d = c13801c;
        this.f51191e = contentAlignment;
        this.f51192f = layoutDirection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16503f)) {
            return false;
        }
        C16503f c16503f = (C16503f) obj;
        return C13803e.m15330b(this.f51187a, c16503f.f51187a) && AbstractC21073a0.m21555a(this.f51188b, c16503f.f51188b) && C13800b.m15303d(this.f51189c, c16503f.f51189c) && this.f51190d.equals(c16503f.f51190d) && AbstractC16544l.m18089b(this.f51191e, c16503f.f51191e) && this.f51192f == c16503f.f51192f;
    }

    public final int hashCode() {
        long j10 = this.f51187a;
        int i10 = AbstractC21073a0.f66991b;
        long j11 = this.f51188b;
        return this.f51192f.hashCode() + ((this.f51191e.hashCode() + ((this.f51190d.hashCode() + ((C13800b.m15308i(this.f51189c) + ((((int) ((j11 >>> 32) ^ j11)) + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strM15335g = C13803e.m15335g(this.f51187a);
        String strM11054l = AbstractC10763a.m11054l("BaseZoomFactor(value=", AbstractC21073a0.m21559e(this.f51188b), Separators.RPAREN);
        String strM15313n = C13800b.m15313n(this.f51189c);
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("GestureStateInputs(viewportSize=", strM15335g, ", baseZoom=", strM11054l, ", baseOffset=");
        sbM9896o.append(strM15313n);
        sbM9896o.append(", unscaledContentBounds=");
        sbM9896o.append(this.f51190d);
        sbM9896o.append(", contentAlignment=");
        sbM9896o.append(this.f51191e);
        sbM9896o.append(", layoutDirection=");
        sbM9896o.append(this.f51192f);
        sbM9896o.append(Separators.RPAREN);
        return sbM9896o.toString();
    }
}
