package p1008s8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s8.v */
/* JADX INFO: loaded from: classes.dex */
public final class C19493v {

    /* JADX INFO: renamed from: a */
    public final String f61923a;

    /* JADX INFO: renamed from: b */
    public final String f61924b;

    public C19493v(String str, String str2) {
        this.f61923a = str;
        this.f61924b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19493v)) {
            return false;
        }
        C19493v c19493v = (C19493v) obj;
        return AbstractC16544l.m18089b(this.f61923a, c19493v.f61923a) && AbstractC16544l.m18089b(this.f61924b, c19493v.f61924b);
    }

    public final int hashCode() {
        String str = this.f61923a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61924b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(stack=");
        sb2.append(this.f61923a);
        sb2.append(", kind=");
        return AbstractC9306j0.m9891j(this.f61924b, Separators.RPAREN, sb2);
    }
}
