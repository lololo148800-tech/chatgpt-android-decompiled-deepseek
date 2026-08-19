package p1008s8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: s8.p */
/* JADX INFO: loaded from: classes.dex */
public final class C19487p {

    /* JADX INFO: renamed from: e */
    public static final String[] f61901e = {"device", "os", "type", "status", "message"};

    /* JADX INFO: renamed from: a */
    public final C19484m f61902a;

    /* JADX INFO: renamed from: b */
    public final C19485n f61903b;

    /* JADX INFO: renamed from: c */
    public final String f61904c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f61905d;

    public C19487p(C19484m c19484m, C19485n c19485n, String message, LinkedHashMap linkedHashMap) {
        AbstractC16544l.m18094g(message, "message");
        this.f61902a = c19484m;
        this.f61903b = c19485n;
        this.f61904c = message;
        this.f61905d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19487p)) {
            return false;
        }
        C19487p c19487p = (C19487p) obj;
        return AbstractC16544l.m18089b(this.f61902a, c19487p.f61902a) && AbstractC16544l.m18089b(this.f61903b, c19487p.f61903b) && AbstractC16544l.m18089b(this.f61904c, c19487p.f61904c) && this.f61905d.equals(c19487p.f61905d);
    }

    public final int hashCode() {
        C19484m c19484m = this.f61902a;
        int iHashCode = (c19484m == null ? 0 : c19484m.hashCode()) * 31;
        C19485n c19485n = this.f61903b;
        return this.f61905d.hashCode() + AbstractC0168G.m527p((iHashCode + (c19485n != null ? c19485n.hashCode() : 0)) * 31, 31, this.f61904c);
    }

    public final String toString() {
        return "Telemetry(device=" + this.f61902a + ", os=" + this.f61903b + ", message=" + this.f61904c + ", additionalProperties=" + this.f61905d + Separators.RPAREN;
    }
}
