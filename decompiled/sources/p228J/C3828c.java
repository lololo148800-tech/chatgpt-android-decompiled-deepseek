package p228J;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: J.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3828c {

    /* JADX INFO: renamed from: a */
    public final String f11593a;

    /* JADX INFO: renamed from: b */
    public final Class f11594b;

    /* JADX INFO: renamed from: c */
    public final CaptureRequest.Key f11595c;

    public C3828c(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f11593a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f11594b = cls;
        this.f11595c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3828c)) {
            return false;
        }
        C3828c c3828c = (C3828c) obj;
        if (this.f11593a.equals(c3828c.f11593a) && this.f11594b.equals(c3828c.f11594b)) {
            CaptureRequest.Key key = c3828c.f11595c;
            CaptureRequest.Key key2 = this.f11595c;
            if (key2 == null) {
                if (key == null) {
                    return true;
                }
            } else if (key2.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f11593a.hashCode() ^ 1000003) * 1000003) ^ this.f11594b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f11595c;
        return iHashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f11593a + ", valueClass=" + this.f11594b + ", token=" + this.f11595c + "}";
    }
}
