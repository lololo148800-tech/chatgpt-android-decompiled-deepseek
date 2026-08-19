package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17979i1 {

    /* JADX INFO: renamed from: a */
    public final String f57390a;

    /* JADX INFO: renamed from: b */
    public final String f57391b;

    /* JADX INFO: renamed from: c */
    public final String f57392c;

    /* JADX INFO: renamed from: d */
    public final String f57393d;

    public C17979i1(String str, String str2, String str3, String str4) {
        this.f57390a = str;
        this.f57391b = str2;
        this.f57392c = str3;
        this.f57393d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17979i1)) {
            return false;
        }
        C17979i1 c17979i1 = (C17979i1) obj;
        return AbstractC16544l.m18089b(this.f57390a, c17979i1.f57390a) && AbstractC16544l.m18089b(this.f57391b, c17979i1.f57391b) && AbstractC16544l.m18089b(this.f57392c, c17979i1.f57392c) && AbstractC16544l.m18089b(this.f57393d, c17979i1.f57393d);
    }

    public final int hashCode() {
        int iHashCode = this.f57390a.hashCode() * 31;
        String str = this.f57391b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57392c);
        String str2 = this.f57393d;
        return iM527p + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceEventView(id=");
        sb2.append(this.f57390a);
        sb2.append(", referrer=");
        sb2.append(this.f57391b);
        sb2.append(", url=");
        sb2.append(this.f57392c);
        sb2.append(", name=");
        return AbstractC9306j0.m9891j(this.f57393d, Separators.RPAREN, sb2);
    }
}
