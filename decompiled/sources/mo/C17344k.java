package mo;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import ro.AbstractC19258b;

/* JADX INFO: renamed from: mo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C17344k {

    /* JADX INFO: renamed from: j */
    public static final Pattern f55263j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f55264k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f55265l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f55266m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f55267a;

    /* JADX INFO: renamed from: b */
    public final String f55268b;

    /* JADX INFO: renamed from: c */
    public final long f55269c;

    /* JADX INFO: renamed from: d */
    public final String f55270d;

    /* JADX INFO: renamed from: e */
    public final String f55271e;

    /* JADX INFO: renamed from: f */
    public final boolean f55272f;

    /* JADX INFO: renamed from: g */
    public final boolean f55273g;

    /* JADX INFO: renamed from: h */
    public final boolean f55274h;

    /* JADX INFO: renamed from: i */
    public final boolean f55275i;

    public C17344k(String str, String str2, long j10, String str3, String str4, boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f55267a = str;
        this.f55268b = str2;
        this.f55269c = j10;
        this.f55270d = str3;
        this.f55271e = str4;
        this.f55272f = z6;
        this.f55273g = z10;
        this.f55274h = z11;
        this.f55275i = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17344k) {
            C17344k c17344k = (C17344k) obj;
            if (AbstractC16544l.m18089b(c17344k.f55267a, this.f55267a) && AbstractC16544l.m18089b(c17344k.f55268b, this.f55268b) && c17344k.f55269c == this.f55269c && AbstractC16544l.m18089b(c17344k.f55270d, this.f55270d) && AbstractC16544l.m18089b(c17344k.f55271e, this.f55271e) && c17344k.f55272f == this.f55272f && c17344k.f55273g == this.f55273g && c17344k.f55274h == this.f55274h && c17344k.f55275i == this.f55275i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(527, 31, this.f55267a), 31, this.f55268b);
        long j10 = this.f55269c;
        return ((((((AbstractC0168G.m527p(AbstractC0168G.m527p((iM527p + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f55270d), 31, this.f55271e) + (this.f55272f ? 1231 : 1237)) * 31) + (this.f55273g ? 1231 : 1237)) * 31) + (this.f55274h ? 1231 : 1237)) * 31) + (this.f55275i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f55267a);
        sb2.append('=');
        sb2.append(this.f55268b);
        if (this.f55274h) {
            long j10 = this.f55269c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = ((DateFormat) AbstractC19258b.f61050a.get()).format(new Date(j10));
                AbstractC16544l.m18093f(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f55275i) {
            sb2.append("; domain=");
            sb2.append(this.f55270d);
        }
        sb2.append("; path=");
        sb2.append(this.f55271e);
        if (this.f55272f) {
            sb2.append("; secure");
        }
        if (this.f55273g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString()");
        return string;
    }
}
