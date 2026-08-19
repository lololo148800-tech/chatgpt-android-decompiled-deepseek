package p571X9;

import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p615Z6.C10252z0;

/* JADX INFO: renamed from: X9.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C9297h3 {

    /* JADX INFO: renamed from: a */
    public final EnumC9285f3 f28082a;

    /* JADX INFO: renamed from: b */
    public final EnumC9267c3 f28083b;

    /* JADX INFO: renamed from: c */
    public final EnumC9291g3 f28084c;

    /* JADX INFO: renamed from: d */
    public final EnumC9273d3 f28085d;

    /* JADX INFO: renamed from: e */
    public final Boolean f28086e;

    /* JADX INFO: renamed from: f */
    public final Float f28087f;

    public /* synthetic */ C9297h3(C10252z0 c10252z0) {
        this.f28082a = (EnumC9285f3) c10252z0.f30454Y;
        this.f28083b = (EnumC9267c3) c10252z0.f30455Z;
        this.f28084c = (EnumC9291g3) c10252z0.f30456o0;
        this.f28085d = (EnumC9273d3) c10252z0.f30457p0;
        this.f28086e = (Boolean) c10252z0.f30458q0;
        this.f28087f = (Float) c10252z0.f30459r0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9297h3)) {
            return false;
        }
        C9297h3 c9297h3 = (C9297h3) obj;
        return AbstractC20502t.m21161l(this.f28082a, c9297h3.f28082a) && AbstractC20502t.m21161l(this.f28083b, c9297h3.f28083b) && AbstractC20502t.m21161l(this.f28084c, c9297h3.f28084c) && AbstractC20502t.m21161l(this.f28085d, c9297h3.f28085d) && AbstractC20502t.m21161l(this.f28086e, c9297h3.f28086e) && AbstractC20502t.m21161l(this.f28087f, c9297h3.f28087f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28082a, this.f28083b, this.f28084c, this.f28085d, this.f28086e, this.f28087f});
    }
}
