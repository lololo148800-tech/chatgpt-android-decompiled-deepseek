package p422R7;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: R7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6819d {

    /* JADX INFO: renamed from: a */
    public final String f21873a;

    /* JADX INFO: renamed from: b */
    public final String f21874b;

    /* JADX INFO: renamed from: c */
    public final String f21875c;

    /* JADX INFO: renamed from: d */
    public final String f21876d = null;

    /* JADX INFO: renamed from: e */
    public final String f21877e;

    /* JADX INFO: renamed from: f */
    public final List f21878f;

    public C6819d(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f21873a = str;
        this.f21874b = str2;
        this.f21875c = str3;
        this.f21877e = str4;
        this.f21878f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6819d)) {
            return false;
        }
        C6819d c6819d = (C6819d) obj;
        return AbstractC16544l.m18089b(this.f21873a, c6819d.f21873a) && AbstractC16544l.m18089b(this.f21874b, c6819d.f21874b) && AbstractC16544l.m18089b(this.f21875c, c6819d.f21875c) && AbstractC16544l.m18089b(this.f21876d, c6819d.f21876d) && AbstractC16544l.m18089b(this.f21877e, c6819d.f21877e) && AbstractC16544l.m18089b(this.f21878f, c6819d.f21878f);
    }

    public final int hashCode() {
        String str = this.f21873a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21874b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21875c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21876d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21877e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f21878f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Error(kind=" + this.f21873a + ", message=" + this.f21874b + ", stack=" + this.f21875c + ", sourceType=" + this.f21876d + ", fingerprint=" + this.f21877e + ", threads=" + this.f21878f + Separators.RPAREN;
    }
}
