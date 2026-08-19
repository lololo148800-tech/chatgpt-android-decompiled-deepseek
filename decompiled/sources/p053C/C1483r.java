package p053C;

import android.view.Surface;
import java.util.List;
import p817j$.util.Objects;

/* JADX INFO: renamed from: C.r */
/* JADX INFO: loaded from: classes.dex */
public class C1483r {

    /* JADX INFO: renamed from: a */
    public final Object f3900a;

    public C1483r(Surface surface) {
        this.f3900a = new C1482q(surface);
    }

    /* JADX INFO: renamed from: a */
    public void mo2120a(Surface surface) {
        if (mo2116e() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!mo2117f()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    /* JADX INFO: renamed from: b */
    public void mo2113b() {
        ((C1482q) this.f3900a).f3898f = true;
    }

    /* JADX INFO: renamed from: c */
    public Object mo2114c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String mo2115d() {
        return ((C1482q) this.f3900a).f3897e;
    }

    /* JADX INFO: renamed from: e */
    public Surface mo2116e() {
        List list = ((C1482q) this.f3900a).f3893a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1483r)) {
            return false;
        }
        return Objects.equals(this.f3900a, ((C1483r) obj).f3900a);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2117f() {
        return ((C1482q) this.f3900a).f3898f;
    }

    /* JADX INFO: renamed from: g */
    public void mo2118g(long j10) {
        ((C1482q) this.f3900a).f3899g = j10;
    }

    public final int hashCode() {
        return this.f3900a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void mo2119i(String str) {
        ((C1482q) this.f3900a).f3897e = str;
    }

    public C1483r(Object obj) {
        this.f3900a = obj;
    }

    /* JADX INFO: renamed from: h */
    public void mo2121h(int i10) {
    }

    /* JADX INFO: renamed from: j */
    public void mo2122j(long j10) {
    }
}
