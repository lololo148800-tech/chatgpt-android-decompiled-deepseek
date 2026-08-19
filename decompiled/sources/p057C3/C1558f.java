package p057C3;

import android.text.TextUtils;
import p003A1.AbstractC0168G;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;

/* JADX INFO: renamed from: C3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1558f {

    /* JADX INFO: renamed from: a */
    public final String f4333a;

    /* JADX INFO: renamed from: b */
    public final C19788o f4334b;

    /* JADX INFO: renamed from: c */
    public final C19788o f4335c;

    /* JADX INFO: renamed from: d */
    public final int f4336d;

    /* JADX INFO: renamed from: e */
    public final int f4337e;

    public C1558f(String str, C19788o c19788o, C19788o c19788o2, int i10, int i11) {
        AbstractC20800b.m21316d(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f4333a = str;
        c19788o.getClass();
        this.f4334b = c19788o;
        c19788o2.getClass();
        this.f4335c = c19788o2;
        this.f4336d = i10;
        this.f4337e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1558f.class != obj.getClass()) {
            return false;
        }
        C1558f c1558f = (C1558f) obj;
        return this.f4336d == c1558f.f4336d && this.f4337e == c1558f.f4337e && this.f4333a.equals(c1558f.f4333a) && this.f4334b.equals(c1558f.f4334b) && this.f4335c.equals(c1558f.f4335c);
    }

    public final int hashCode() {
        return this.f4335c.hashCode() + ((this.f4334b.hashCode() + AbstractC0168G.m527p((((527 + this.f4336d) * 31) + this.f4337e) * 31, 31, this.f4333a)) * 31);
    }
}
