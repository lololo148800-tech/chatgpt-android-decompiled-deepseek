package p008A6;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0389i {

    /* JADX INFO: renamed from: a */
    public final String f1300a;

    /* JADX INFO: renamed from: b */
    public final String f1301b;

    public C0389i(String key, String record) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(record, "record");
        this.f1300a = key;
        this.f1301b = record;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0389i)) {
            return false;
        }
        C0389i c0389i = (C0389i) obj;
        return AbstractC16544l.m18089b(this.f1300a, c0389i.f1300a) && AbstractC16544l.m18089b(this.f1301b, c0389i.f1301b);
    }

    public final int hashCode() {
        return this.f1301b.hashCode() + (this.f1300a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecordForKey(key=");
        sb2.append(this.f1300a);
        sb2.append(", record=");
        return AbstractC9306j0.m9891j(this.f1301b, Separators.RPAREN, sb2);
    }
}
