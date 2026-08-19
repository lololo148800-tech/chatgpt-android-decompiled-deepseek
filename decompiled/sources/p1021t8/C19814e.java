package p1021t8;

import kotlin.jvm.internal.AbstractC16544l;
import p846k4.C16340i;

/* JADX INFO: renamed from: t8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C19814e {

    /* JADX INFO: renamed from: a */
    public final C16340i f62863a;

    public C19814e(C16340i c16340i) {
        this.f62863a = c16340i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19814e)) {
            return false;
        }
        C19814e c19814e = (C19814e) obj;
        c19814e.getClass();
        return AbstractC16544l.m18089b(null, null) && this.f62863a.equals(c19814e.f62863a);
    }

    public final int hashCode() {
        return (this.f62863a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "TraceConfiguration(customEndpointUrl=null, eventMapper=" + this.f62863a + ", networkInfoEnabled=true)";
    }
}
