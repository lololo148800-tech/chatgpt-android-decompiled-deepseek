package p1061vb;

import java.util.ArrayList;

/* JADX INFO: renamed from: vb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20510a {

    /* JADX INFO: renamed from: a */
    public final String f65120a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f65121b;

    public C20510a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f65120a = str;
        this.f65121b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20510a)) {
            return false;
        }
        C20510a c20510a = (C20510a) obj;
        return this.f65120a.equals(c20510a.f65120a) && this.f65121b.equals(c20510a.f65121b);
    }

    public final int hashCode() {
        return ((this.f65120a.hashCode() ^ 1000003) * 1000003) ^ this.f65121b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f65120a + ", usedDates=" + this.f65121b + "}";
    }
}
