package p326N;

import p178H.InterfaceC3180x0;

/* JADX INFO: renamed from: N.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5560b implements InterfaceC3180x0 {

    /* JADX INFO: renamed from: a */
    public final float f18025a;

    /* JADX INFO: renamed from: b */
    public final float f18026b;

    /* JADX INFO: renamed from: c */
    public final float f18027c;

    /* JADX INFO: renamed from: d */
    public final float f18028d;

    public C5560b(float f10, float f11, float f12, float f13) {
        this.f18025a = f10;
        this.f18026b = f11;
        this.f18027c = f12;
        this.f18028d = f13;
    }

    /* JADX INFO: renamed from: e */
    public static C5560b m5950e(InterfaceC3180x0 interfaceC3180x0) {
        return new C5560b(interfaceC3180x0.mo229c(), interfaceC3180x0.mo227a(), interfaceC3180x0.mo228b(), interfaceC3180x0.mo230d());
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: a */
    public final float mo227a() {
        return this.f18026b;
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: b */
    public final float mo228b() {
        return this.f18027c;
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: c */
    public final float mo229c() {
        return this.f18025a;
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: d */
    public final float mo230d() {
        return this.f18028d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5560b)) {
            return false;
        }
        C5560b c5560b = (C5560b) obj;
        return Float.floatToIntBits(this.f18025a) == Float.floatToIntBits(c5560b.f18025a) && Float.floatToIntBits(this.f18026b) == Float.floatToIntBits(c5560b.f18026b) && Float.floatToIntBits(this.f18027c) == Float.floatToIntBits(c5560b.f18027c) && Float.floatToIntBits(this.f18028d) == Float.floatToIntBits(c5560b.f18028d);
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f18025a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f18026b)) * 1000003) ^ Float.floatToIntBits(this.f18027c)) * 1000003) ^ Float.floatToIntBits(this.f18028d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f18025a + ", maxZoomRatio=" + this.f18026b + ", minZoomRatio=" + this.f18027c + ", linearZoom=" + this.f18028d + "}";
    }
}
