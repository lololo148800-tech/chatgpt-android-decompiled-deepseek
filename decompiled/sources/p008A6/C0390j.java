package p008A6;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0390j {

    /* JADX INFO: renamed from: a */
    public final String f1302a;

    /* JADX INFO: renamed from: b */
    public final String f1303b;

    public C0390j(String key, String record) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(record, "record");
        this.f1302a = key;
        this.f1303b = record;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0390j)) {
            return false;
        }
        C0390j c0390j = (C0390j) obj;
        return AbstractC16544l.m18089b(this.f1302a, c0390j.f1302a) && AbstractC16544l.m18089b(this.f1303b, c0390j.f1303b);
    }

    public final int hashCode() {
        return this.f1303b.hashCode() + (this.f1302a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecordsForKeys(key=");
        sb2.append(this.f1302a);
        sb2.append(", record=");
        return AbstractC9306j0.m9891j(this.f1303b, Separators.RPAREN, sb2);
    }
}
