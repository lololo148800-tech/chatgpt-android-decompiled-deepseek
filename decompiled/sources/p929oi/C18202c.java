package p929oi;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: oi.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18202c {

    /* JADX INFO: renamed from: a */
    public final Object f58035a;

    /* JADX INFO: renamed from: b */
    public final List f58036b;

    public C18202c(Object obj, List list) {
        this.f58035a = obj;
        this.f58036b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18202c)) {
            return false;
        }
        C18202c c18202c = (C18202c) obj;
        return AbstractC16544l.m18089b(this.f58035a, c18202c.f58035a) && AbstractC16544l.m18089b(this.f58036b, c18202c.f58036b);
    }

    public final int hashCode() {
        Object obj = this.f58035a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        List list = this.f58036b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
