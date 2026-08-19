package p228J;

import java.util.Collections;
import java.util.List;
import p117Eb.C2392v;
import p178H.C3175v;

/* JADX INFO: renamed from: J.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3832e {

    /* JADX INFO: renamed from: a */
    public final AbstractC3810L f11597a;

    /* JADX INFO: renamed from: b */
    public final List f11598b;

    /* JADX INFO: renamed from: c */
    public final int f11599c;

    /* JADX INFO: renamed from: d */
    public final int f11600d;

    /* JADX INFO: renamed from: e */
    public final C3175v f11601e;

    public C3832e(AbstractC3810L abstractC3810L, List list, int i10, int i11, C3175v c3175v) {
        this.f11597a = abstractC3810L;
        this.f11598b = list;
        this.f11599c = i10;
        this.f11600d = i11;
        this.f11601e = c3175v;
    }

    /* JADX INFO: renamed from: a */
    public static C2392v m4567a(AbstractC3810L abstractC3810L) {
        C2392v c2392v = new C2392v(6, false);
        if (abstractC3810L == null) {
            throw new NullPointerException("Null surface");
        }
        c2392v.f7436Z = abstractC3810L;
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        c2392v.f7437o0 = listEmptyList;
        c2392v.f7438p0 = -1;
        c2392v.f7439q0 = -1;
        c2392v.f7440r0 = C3175v.f9575d;
        return c2392v;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3832e)) {
            return false;
        }
        C3832e c3832e = (C3832e) obj;
        return this.f11597a.equals(c3832e.f11597a) && this.f11598b.equals(c3832e.f11598b) && this.f11599c == c3832e.f11599c && this.f11600d == c3832e.f11600d && this.f11601e.equals(c3832e.f11601e);
    }

    public final int hashCode() {
        return ((((((((this.f11597a.hashCode() ^ 1000003) * 1000003) ^ this.f11598b.hashCode()) * (-721379959)) ^ this.f11599c) * 1000003) ^ this.f11600d) * 1000003) ^ this.f11601e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f11597a + ", sharedSurfaces=" + this.f11598b + ", physicalCameraId=null, mirrorMode=" + this.f11599c + ", surfaceGroupId=" + this.f11600d + ", dynamicRange=" + this.f11601e + "}";
    }
}
