package p1096x2;

import android.gov.nist.core.Separators;
import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: x2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21109d {

    /* JADX INFO: renamed from: a */
    public final String f67047a;

    /* JADX INFO: renamed from: b */
    public final String f67048b;

    /* JADX INFO: renamed from: c */
    public final String f67049c;

    /* JADX INFO: renamed from: d */
    public final List f67050d;

    /* JADX INFO: renamed from: e */
    public final String f67051e;

    public C21109d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f67047a = str;
        str2.getClass();
        this.f67048b = str2;
        this.f67049c = str3;
        list.getClass();
        this.f67050d = list;
        this.f67051e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f67047a + ", mProviderPackage: " + this.f67048b + ", mQuery: " + this.f67049c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f67050d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb2.append(Separators.DOUBLE_QUOTE);
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
