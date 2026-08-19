package p001A;

import android.util.Size;
import java.util.ArrayList;
import p228J.C3836g;
import p228J.C3865u0;
import p228J.InterfaceC3800E0;

/* JADX INFO: renamed from: A.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0054c {

    /* JADX INFO: renamed from: a */
    public final String f251a;

    /* JADX INFO: renamed from: b */
    public final Class f252b;

    /* JADX INFO: renamed from: c */
    public final C3865u0 f253c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3800E0 f254d;

    /* JADX INFO: renamed from: e */
    public final Size f255e;

    /* JADX INFO: renamed from: f */
    public final C3836g f256f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f257g;

    public C0054c(String str, Class cls, C3865u0 c3865u0, InterfaceC3800E0 interfaceC3800E0, Size size, C3836g c3836g, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f251a = str;
        this.f252b = cls;
        if (c3865u0 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f253c = c3865u0;
        if (interfaceC3800E0 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f254d = interfaceC3800E0;
        this.f255e = size;
        this.f256f = c3836g;
        this.f257g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0054c)) {
            return false;
        }
        C0054c c0054c = (C0054c) obj;
        if (this.f251a.equals(c0054c.f251a) && this.f252b.equals(c0054c.f252b) && this.f253c.equals(c0054c.f253c) && this.f254d.equals(c0054c.f254d)) {
            Size size = c0054c.f255e;
            Size size2 = this.f255e;
            if (size2 != null ? size2.equals(size) : size == null) {
                C3836g c3836g = c0054c.f256f;
                C3836g c3836g2 = this.f256f;
                if (c3836g2 != null ? c3836g2.equals(c3836g) : c3836g == null) {
                    ArrayList arrayList = c0054c.f257g;
                    ArrayList arrayList2 = this.f257g;
                    if (arrayList2 == null) {
                        if (arrayList == null) {
                            return true;
                        }
                    } else if (arrayList2.equals(arrayList)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f251a.hashCode() ^ 1000003) * 1000003) ^ this.f252b.hashCode()) * 1000003) ^ this.f253c.hashCode()) * 1000003) ^ this.f254d.hashCode()) * 1000003;
        Size size = this.f255e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        C3836g c3836g = this.f256f;
        int iHashCode3 = (iHashCode2 ^ (c3836g == null ? 0 : c3836g.hashCode())) * 1000003;
        ArrayList arrayList = this.f257g;
        return iHashCode3 ^ (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f251a + ", useCaseType=" + this.f252b + ", sessionConfig=" + this.f253c + ", useCaseConfig=" + this.f254d + ", surfaceResolution=" + this.f255e + ", streamSpec=" + this.f256f + ", captureTypes=" + this.f257g + "}";
    }
}
