package p1040ue;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: ue.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20206d {

    /* JADX INFO: renamed from: a */
    public final String f63973a;

    /* JADX INFO: renamed from: b */
    public final Integer f63974b;

    /* JADX INFO: renamed from: c */
    public final String f63975c;

    /* JADX INFO: renamed from: d */
    public final List f63976d;

    public C20206d(String id2, Integer num, String text, List list) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(text, "text");
        this.f63973a = id2;
        this.f63974b = num;
        this.f63975c = text;
        this.f63976d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20206d)) {
            return false;
        }
        C20206d c20206d = (C20206d) obj;
        return AbstractC16544l.m18089b(this.f63973a, c20206d.f63973a) && AbstractC16544l.m18089b(this.f63974b, c20206d.f63974b) && AbstractC16544l.m18089b(this.f63975c, c20206d.f63975c) && AbstractC16544l.m18089b(this.f63976d, c20206d.f63976d);
    }

    public final int hashCode() {
        int iHashCode = this.f63973a.hashCode() * 31;
        Integer num = this.f63974b;
        return this.f63976d.hashCode() + AbstractC0168G.m527p((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f63975c);
    }

    public final String toString() {
        return "█";
    }
}
