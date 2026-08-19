package p821j1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: j1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16043h extends AbstractC16040e {

    /* JADX INFO: renamed from: a */
    public final float f49484a;

    /* JADX INFO: renamed from: b */
    public final float f49485b;

    /* JADX INFO: renamed from: c */
    public final int f49486c;

    /* JADX INFO: renamed from: d */
    public final int f49487d;

    public C16043h(float f10, float f11, int i10, int i11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f49484a = f10;
        this.f49485b = f11;
        this.f49486c = i10;
        this.f49487d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16043h)) {
            return false;
        }
        C16043h c16043h = (C16043h) obj;
        return this.f49484a == c16043h.f49484a && this.f49485b == c16043h.f49485b && AbstractC14334L.m15642t(this.f49486c, c16043h.f49486c) && AbstractC14334L.m15643u(this.f49487d, c16043h.f49487d) && AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        return (((AbstractC12107L1.m13819j(this.f49485b, Float.floatToIntBits(this.f49484a) * 31, 31) + this.f49486c) * 31) + this.f49487d) * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f49484a);
        sb2.append(", miter=");
        sb2.append(this.f49485b);
        sb2.append(", cap=");
        int i10 = this.f49486c;
        String str2 = "Unknown";
        if (AbstractC14334L.m15642t(i10, 0)) {
            str = "Butt";
        } else if (AbstractC14334L.m15642t(i10, 1)) {
            str = "Round";
        } else {
            str = AbstractC14334L.m15642t(i10, 2) ? "Square" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i11 = this.f49487d;
        if (AbstractC14334L.m15643u(i11, 0)) {
            str2 = "Miter";
        } else if (AbstractC14334L.m15643u(i11, 1)) {
            str2 = "Round";
        } else if (AbstractC14334L.m15643u(i11, 2)) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
