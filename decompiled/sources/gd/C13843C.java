package gd;

import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;

/* JADX INFO: renamed from: gd.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C13843C extends AbstractC13962m {

    /* JADX INFO: renamed from: d */
    public static final C13843C f43879d;

    static {
        C21554a c21554a = C21555b.f68260Z;
        EnumC21557d enumC21557d = EnumC21557d.SECONDS;
        f43879d = new C13843C("voice_quality_sample_interval_seconds", (int) C21555b.m21841k(AbstractC8128k6.m8644j(30, enumC21557d), enumC21557d));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C13843C);
    }

    public final int hashCode() {
        return 2134535887;
    }

    public final String toString() {
        return "█";
    }
}
