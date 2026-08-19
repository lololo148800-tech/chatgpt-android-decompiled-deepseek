package p1008s8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: s8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C19479h {

    /* JADX INFO: renamed from: f */
    public static final String[] f61876f = {"device", "os", "type", "configuration"};

    /* JADX INFO: renamed from: a */
    public final C19475d f61877a;

    /* JADX INFO: renamed from: b */
    public final C19476e f61878b;

    /* JADX INFO: renamed from: c */
    public final C19474c f61879c;

    /* JADX INFO: renamed from: d */
    public final Map f61880d;

    /* JADX INFO: renamed from: e */
    public final String f61881e;

    public C19479h(C19475d c19475d, C19476e c19476e, C19474c c19474c) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f61877a = c19475d;
        this.f61878b = c19476e;
        this.f61879c = c19474c;
        this.f61880d = linkedHashMap;
        this.f61881e = "configuration";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19479h)) {
            return false;
        }
        C19479h c19479h = (C19479h) obj;
        return AbstractC16544l.m18089b(this.f61877a, c19479h.f61877a) && AbstractC16544l.m18089b(this.f61878b, c19479h.f61878b) && AbstractC16544l.m18089b(this.f61879c, c19479h.f61879c) && AbstractC16544l.m18089b(this.f61880d, c19479h.f61880d);
    }

    public final int hashCode() {
        C19475d c19475d = this.f61877a;
        int iHashCode = (c19475d == null ? 0 : c19475d.hashCode()) * 31;
        C19476e c19476e = this.f61878b;
        return this.f61880d.hashCode() + ((this.f61879c.hashCode() + ((iHashCode + (c19476e != null ? c19476e.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Telemetry(device=" + this.f61877a + ", os=" + this.f61878b + ", configuration=" + this.f61879c + ", additionalProperties=" + this.f61880d + Separators.RPAREN;
    }
}
