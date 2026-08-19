package p823j3;

import kotlin.jvm.internal.AbstractC16544l;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;
import p561X.C8990d;

/* JADX INFO: renamed from: j3.L */
/* JADX INFO: loaded from: classes.dex */
public final class C16073L {

    /* JADX INFO: renamed from: a */
    public final long f49768a;

    /* JADX INFO: renamed from: b */
    public final long f49769b;

    /* JADX INFO: renamed from: c */
    public final long f49770c;

    /* JADX INFO: renamed from: d */
    public final C8990d f49771d;

    public C16073L() {
        C21554a c21554a = C21555b.f68260Z;
        EnumC21557d enumC21557d = EnumC21557d.SECONDS;
        long jM8644j = AbstractC8128k6.m8644j(45, enumC21557d);
        long jM8644j2 = AbstractC8128k6.m8644j(5, enumC21557d);
        long jM8644j3 = AbstractC8128k6.m8644j(5, enumC21557d);
        C8990d c8990d = C16071J.f49765a;
        this.f49768a = jM8644j;
        this.f49769b = jM8644j2;
        this.f49770c = jM8644j3;
        this.f49771d = c8990d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16073L)) {
            return false;
        }
        C16073L c16073l = (C16073L) obj;
        return C21555b.m21834d(this.f49768a, c16073l.f49768a) && C21555b.m21834d(this.f49769b, c16073l.f49769b) && C21555b.m21834d(this.f49770c, c16073l.f49770c) && AbstractC16544l.m18089b(this.f49771d, c16073l.f49771d);
    }

    public final int hashCode() {
        return this.f49771d.hashCode() + ((C21555b.m21837g(this.f49770c) + ((C21555b.m21837g(this.f49769b) + (C21555b.m21837g(this.f49768a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) C21555b.m21842l(this.f49768a)) + ", additionalTime=" + ((Object) C21555b.m21842l(this.f49769b)) + ", idleTimeout=" + ((Object) C21555b.m21842l(this.f49770c)) + ", timeSource=" + this.f49771d + ')';
    }
}
