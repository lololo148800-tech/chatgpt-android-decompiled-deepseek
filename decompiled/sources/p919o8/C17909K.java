package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.K */
/* JADX INFO: loaded from: classes.dex */
public final class C17909K {

    /* JADX INFO: renamed from: a */
    public final String f57100a;

    /* JADX INFO: renamed from: b */
    public final String f57101b;

    /* JADX INFO: renamed from: c */
    public final String f57102c;

    /* JADX INFO: renamed from: d */
    public final int f57103d;

    public C17909K(String str, String str2, String str3, int i10) {
        AbstractC14376f.m15825D(i10, "source");
        this.f57100a = str;
        this.f57101b = str2;
        this.f57102c = str3;
        this.f57103d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17909K)) {
            return false;
        }
        C17909K c17909k = (C17909K) obj;
        return this.f57100a.equals(c17909k.f57100a) && AbstractC16544l.m18089b(this.f57101b, c17909k.f57101b) && AbstractC16544l.m18089b(this.f57102c, c17909k.f57102c) && this.f57103d == c17909k.f57103d;
    }

    public final int hashCode() {
        int iHashCode = this.f57100a.hashCode() * 31;
        String str = this.f57101b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57102c;
        return AbstractC0010F.m24h(this.f57103d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Cause(message=" + this.f57100a + ", type=" + this.f57101b + ", stack=" + this.f57102c + ", source=" + AbstractC17962d.m19617H(this.f57103d) + Separators.RPAREN;
    }
}
