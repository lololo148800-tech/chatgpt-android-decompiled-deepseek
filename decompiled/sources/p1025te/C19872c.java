package p1025te;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C19872c {

    /* JADX INFO: renamed from: a */
    public final String f63005a;

    /* JADX INFO: renamed from: b */
    public final String f63006b;

    /* JADX INFO: renamed from: c */
    public final Uri f63007c;

    /* JADX INFO: renamed from: d */
    public final Uri f63008d;

    /* JADX INFO: renamed from: e */
    public final boolean f63009e;

    public C19872c(String str, String str2, Uri uri, Uri uri2) {
        this.f63005a = str;
        this.f63006b = str2;
        this.f63007c = uri;
        this.f63008d = uri2;
        this.f63009e = uri2 != null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19872c)) {
            return false;
        }
        C19872c c19872c = (C19872c) obj;
        if (!AbstractC16544l.m18089b(this.f63005a, c19872c.f63005a)) {
            return false;
        }
        String str = this.f63006b;
        String str2 = c19872c.f63006b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f63007c, c19872c.f63007c) && AbstractC16544l.m18089b(this.f63008d, c19872c.f63008d);
    }

    public final int hashCode() {
        String str = this.f63005a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63006b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri = this.f63007c;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f63008d;
        return iHashCode3 + (uri2 != null ? uri2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
