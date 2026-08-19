package p994rk;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: rk.x1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19234x1 {

    /* JADX INFO: renamed from: a */
    public final String f60982a;

    /* JADX INFO: renamed from: b */
    public final String f60983b;

    /* JADX INFO: renamed from: c */
    public final Boolean f60984c;

    /* JADX INFO: renamed from: d */
    public final String f60985d;

    /* JADX INFO: renamed from: e */
    public final String f60986e;

    public C19234x1(Boolean bool, String str, String str2, String str3, String str4) {
        this.f60982a = str;
        this.f60983b = str2;
        this.f60984c = bool;
        this.f60985d = str3;
        this.f60986e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19234x1)) {
            return false;
        }
        C19234x1 c19234x1 = (C19234x1) obj;
        return AbstractC16544l.m18089b(this.f60982a, c19234x1.f60982a) && AbstractC16544l.m18089b(this.f60983b, c19234x1.f60983b) && AbstractC16544l.m18089b(this.f60984c, c19234x1.f60984c) && AbstractC16544l.m18089b(this.f60985d, c19234x1.f60985d) && AbstractC16544l.m18089b(this.f60986e, c19234x1.f60986e);
    }

    public final int hashCode() {
        String str = this.f60982a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60983b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f60984c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f60985d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f60986e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MaskTextInputState(prefill=");
        sb2.append(this.f60982a);
        sb2.append(", mask=");
        sb2.append(this.f60983b);
        sb2.append(", secure=");
        sb2.append(this.f60984c);
        sb2.append(", label=");
        sb2.append(this.f60985d);
        sb2.append(", placeholder=");
        return AbstractC9306j0.m9891j(this.f60986e, Separators.RPAREN, sb2);
    }
}
