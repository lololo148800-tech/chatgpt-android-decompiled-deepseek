package androidx.compose.p650ui.graphics.painter;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p174Gk.uSfJ.HpucjswO;
import p492U1.C7543h;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14351g;
import p774h1.C14356l;
import p775h2.AbstractC14376f;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Lm1/a;", "ui-graphics_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BitmapPainter extends AbstractC17140a {

    /* JADX INFO: renamed from: r0 */
    public final C14351g f32720r0;

    /* JADX INFO: renamed from: s0 */
    public final long f32721s0;

    /* JADX INFO: renamed from: t0 */
    public final long f32722t0;

    /* JADX INFO: renamed from: u0 */
    public int f32723u0 = 1;

    /* JADX INFO: renamed from: v0 */
    public final long f32724v0;

    /* JADX INFO: renamed from: w0 */
    public float f32725w0;

    /* JADX INFO: renamed from: x0 */
    public C14356l f32726x0;

    public BitmapPainter(C14351g c14351g, long j10, long j11) {
        int i10;
        int i11;
        this.f32720r0 = c14351g;
        this.f32721s0 = j10;
        this.f32722t0 = j11;
        if (((int) (j10 >> 32)) < 0 || ((int) (j10 & 4294967295L)) < 0 || (i10 = (int) (j11 >> 32)) < 0 || (i11 = (int) (j11 & 4294967295L)) < 0 || i10 > c14351g.f45036a.getWidth() || i11 > c14351g.f45036a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f32724v0 = j11;
        this.f32725w0 = 1.0f;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: b */
    public final boolean mo11307b(float f10) {
        this.f32725w0 = f10;
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: e */
    public final boolean mo11308e(C14356l c14356l) {
        this.f32726x0 = c14356l;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return AbstractC16544l.m18089b(this.f32720r0, bitmapPainter.f32720r0) && C7543h.m7880b(this.f32721s0, bitmapPainter.f32721s0) && C7545j.m7886a(this.f32722t0, bitmapPainter.f32722t0) && AbstractC14334L.m15641s(this.f32723u0, bitmapPainter.f32723u0);
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        return AbstractC9113C4.m9645c(this.f32724v0);
    }

    public final int hashCode() {
        int iHashCode = this.f32720r0.hashCode() * 31;
        long j10 = this.f32721s0;
        return ((C7545j.m7889d(this.f32722t0) + ((((int) (j10 ^ (j10 >>> 32))) + iHashCode) * 31)) * 31) + this.f32723u0;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        long jM9643a = AbstractC9113C4.m9643a(Math.round(C13803e.m15333e(interfaceC16039d.mo17602i())), Math.round(C13803e.m15331c(interfaceC16039d.mo17602i())));
        float f10 = this.f32725w0;
        C14356l c14356l = this.f32726x0;
        int i10 = this.f32723u0;
        AbstractC14376f.m15843i(interfaceC16039d, this.f32720r0, this.f32721s0, this.f32722t0, jM9643a, f10, c14356l, i10, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f32720r0);
        sb2.append(", srcOffset=");
        sb2.append((Object) C7543h.m7883e(this.f32721s0));
        sb2.append(", srcSize=");
        sb2.append((Object) C7545j.m7890e(this.f32722t0));
        sb2.append(", filterQuality=");
        int i10 = this.f32723u0;
        if (AbstractC14334L.m15641s(i10, 0)) {
            str = "None";
        } else if (AbstractC14334L.m15641s(i10, 1)) {
            str = "Low";
        } else if (AbstractC14334L.m15641s(i10, 2)) {
            str = "Medium";
        } else {
            str = AbstractC14334L.m15641s(i10, 3) ? "High" : HpucjswO.EAy;
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
