package p571X9;

import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p117Eb.C2392v;

/* JADX INFO: renamed from: X9.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C9192Q {

    /* JADX INFO: renamed from: a */
    public final EnumC9363s3 f27978a;

    /* JADX INFO: renamed from: b */
    public final Boolean f27979b;

    /* JADX INFO: renamed from: c */
    public final C9297h3 f27980c;

    /* JADX INFO: renamed from: d */
    public final Integer f27981d;

    /* JADX INFO: renamed from: e */
    public final Integer f27982e;

    public /* synthetic */ C9192Q(C2392v c2392v) {
        this.f27978a = (EnumC9363s3) c2392v.f7436Z;
        this.f27979b = (Boolean) c2392v.f7437o0;
        this.f27980c = (C9297h3) c2392v.f7438p0;
        this.f27981d = (Integer) c2392v.f7439q0;
        this.f27982e = (Integer) c2392v.f7440r0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9192Q)) {
            return false;
        }
        C9192Q c9192q = (C9192Q) obj;
        return AbstractC20502t.m21161l(this.f27978a, c9192q.f27978a) && AbstractC20502t.m21161l(this.f27979b, c9192q.f27979b) && AbstractC20502t.m21161l(null, null) && AbstractC20502t.m21161l(this.f27980c, c9192q.f27980c) && AbstractC20502t.m21161l(this.f27981d, c9192q.f27981d) && AbstractC20502t.m21161l(this.f27982e, c9192q.f27982e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27978a, this.f27979b, null, this.f27980c, this.f27981d, this.f27982e});
    }
}
