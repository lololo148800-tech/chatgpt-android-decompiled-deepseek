package p736f0;

import kotlin.jvm.internal.AbstractC16544l;
import p758g0.InterfaceC13726B;

/* JADX INFO: renamed from: f0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C13469G {

    /* JADX INFO: renamed from: a */
    public final float f42626a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13726B f42627b;

    public C13469G(float f10, InterfaceC13726B interfaceC13726B) {
        this.f42626a = f10;
        this.f42627b = interfaceC13726B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13469G)) {
            return false;
        }
        C13469G c13469g = (C13469G) obj;
        return Float.compare(this.f42626a, c13469g.f42626a) == 0 && AbstractC16544l.m18089b(this.f42627b, c13469g.f42627b);
    }

    public final int hashCode() {
        return this.f42627b.hashCode() + (Float.floatToIntBits(this.f42626a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f42626a + ", animationSpec=" + this.f42627b + ')';
    }
}
