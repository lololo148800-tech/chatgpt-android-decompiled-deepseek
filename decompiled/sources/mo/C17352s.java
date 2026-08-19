package mo;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7965P4;

/* JADX INFO: renamed from: mo.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C17352s {

    /* JADX INFO: renamed from: e */
    public static final Pattern f55296e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    public static final Pattern f55297f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f55298a;

    /* JADX INFO: renamed from: b */
    public final String f55299b;

    /* JADX INFO: renamed from: c */
    public final String f55300c;

    /* JADX INFO: renamed from: d */
    public final String[] f55301d;

    public C17352s(String str, String str2, String str3, String[] strArr) {
        this.f55298a = str;
        this.f55299b = str2;
        this.f55300c = str3;
        this.f55301d = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final Charset m19029a(Charset charset) {
        String str;
        String[] strArr = this.f55301d;
        int i10 = 0;
        int iM8252c = AbstractC7965P4.m8252c(0, strArr.length - 1, 2);
        if (iM8252c < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!AbstractC21329w.m21726m(strArr[i10], "charset")) {
                if (i10 == iM8252c) {
                    str = null;
                    break;
                }
                i10 += 2;
            } else {
                str = strArr[i10 + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17352s) && AbstractC16544l.m18089b(((C17352s) obj).f55298a, this.f55298a);
    }

    public final int hashCode() {
        return this.f55298a.hashCode();
    }

    public final String toString() {
        return this.f55298a;
    }
}
