package p1008s8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: s8.y */
/* JADX INFO: loaded from: classes.dex */
public final class C19496y {

    /* JADX INFO: renamed from: f */
    public static final String[] f61929f = {"device", "os", "type", "status", "message", "error"};

    /* JADX INFO: renamed from: a */
    public final C19492u f61930a;

    /* JADX INFO: renamed from: b */
    public final C19494w f61931b;

    /* JADX INFO: renamed from: c */
    public final String f61932c;

    /* JADX INFO: renamed from: d */
    public final C19493v f61933d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f61934e;

    public C19496y(C19492u c19492u, C19494w c19494w, String message, C19493v c19493v, LinkedHashMap linkedHashMap) {
        AbstractC16544l.m18094g(message, "message");
        this.f61930a = c19492u;
        this.f61931b = c19494w;
        this.f61932c = message;
        this.f61933d = c19493v;
        this.f61934e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19496y)) {
            return false;
        }
        C19496y c19496y = (C19496y) obj;
        return AbstractC16544l.m18089b(this.f61930a, c19496y.f61930a) && AbstractC16544l.m18089b(this.f61931b, c19496y.f61931b) && AbstractC16544l.m18089b(this.f61932c, c19496y.f61932c) && AbstractC16544l.m18089b(this.f61933d, c19496y.f61933d) && this.f61934e.equals(c19496y.f61934e);
    }

    public final int hashCode() {
        C19492u c19492u = this.f61930a;
        int iHashCode = (c19492u == null ? 0 : c19492u.hashCode()) * 31;
        C19494w c19494w = this.f61931b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (c19494w == null ? 0 : c19494w.hashCode())) * 31, 31, this.f61932c);
        C19493v c19493v = this.f61933d;
        return this.f61934e.hashCode() + ((iM527p + (c19493v != null ? c19493v.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Telemetry(device=" + this.f61930a + ", os=" + this.f61931b + ", message=" + this.f61932c + ", error=" + this.f61933d + ", additionalProperties=" + this.f61934e + Separators.RPAREN;
    }
}
