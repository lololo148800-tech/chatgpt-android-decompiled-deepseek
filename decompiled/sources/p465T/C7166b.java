package p465T;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: T.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7166b {

    /* JADX INFO: renamed from: a */
    public final UUID f22774a;

    /* JADX INFO: renamed from: b */
    public final int f22775b;

    /* JADX INFO: renamed from: c */
    public final int f22776c;

    /* JADX INFO: renamed from: d */
    public final Rect f22777d;

    /* JADX INFO: renamed from: e */
    public final Size f22778e;

    /* JADX INFO: renamed from: f */
    public final int f22779f;

    /* JADX INFO: renamed from: g */
    public final boolean f22780g;

    public C7166b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z6) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f22774a = uuid;
        this.f22775b = i10;
        this.f22776c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f22777d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f22778e = size;
        this.f22779f = i12;
        this.f22780g = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7166b)) {
            return false;
        }
        C7166b c7166b = (C7166b) obj;
        return this.f22774a.equals(c7166b.f22774a) && this.f22775b == c7166b.f22775b && this.f22776c == c7166b.f22776c && this.f22777d.equals(c7166b.f22777d) && this.f22778e.equals(c7166b.f22778e) && this.f22779f == c7166b.f22779f && this.f22780g == c7166b.f22780g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f22774a.hashCode() ^ 1000003) * 1000003) ^ this.f22775b) * 1000003) ^ this.f22776c) * 1000003) ^ this.f22777d.hashCode()) * 1000003) ^ this.f22778e.hashCode()) * 1000003) ^ this.f22779f) * 1000003) ^ (this.f22780g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutConfig{getUuid=");
        sb2.append(this.f22774a);
        sb2.append(", getTargets=");
        sb2.append(this.f22775b);
        sb2.append(", getFormat=");
        sb2.append(this.f22776c);
        sb2.append(", getCropRect=");
        sb2.append(this.f22777d);
        sb2.append(", getSize=");
        sb2.append(this.f22778e);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f22779f);
        sb2.append(", isMirroring=");
        return AbstractC14376f.m15823B(sb2, this.f22780g, ", shouldRespectInputCropRect=false}");
    }
}
