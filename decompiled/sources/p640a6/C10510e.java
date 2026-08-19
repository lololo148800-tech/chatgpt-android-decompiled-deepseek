package p640a6;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: a6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10510e {

    /* JADX INFO: renamed from: c */
    public static final C10510e f31150c = new C10510e("COMPOSITION");

    /* JADX INFO: renamed from: a */
    public final List f31151a;

    /* JADX INFO: renamed from: b */
    public InterfaceC10511f f31152b;

    public C10510e(String... strArr) {
        this.f31151a = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10966a(int i10, String str) {
        List list = this.f31151a;
        if (i10 >= list.size()) {
            return false;
        }
        boolean z6 = i10 == list.size() - 1;
        String str2 = (String) list.get(i10);
        if (!str2.equals("**")) {
            return (z6 || (i10 == list.size() + (-2) && ((String) list.get(list.size() - 1)).equals("**"))) && (str2.equals(str) || str2.equals(Separators.STAR));
        }
        if (!z6 && ((String) list.get(i10 + 1)).equals(str)) {
            return i10 == list.size() + (-2) || (i10 == list.size() + (-3) && ((String) list.get(list.size() - 1)).equals("**"));
        }
        if (z6) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i11)).equals(str);
    }

    /* JADX INFO: renamed from: b */
    public final int m10967b(int i10, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f31151a;
        if (((String) list.get(i10)).equals("**")) {
            return (i10 != list.size() - 1 && ((String) list.get(i10 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10968c(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f31151a;
        if (i10 >= list.size()) {
            return false;
        }
        return ((String) list.get(i10)).equals(str) || ((String) list.get(i10)).equals("**") || ((String) list.get(i10)).equals(Separators.STAR);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10969d(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f31151a;
        return i10 < list.size() - 1 || ((String) list.get(i10)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10510e.class != obj.getClass()) {
            return false;
        }
        C10510e c10510e = (C10510e) obj;
        if (!this.f31151a.equals(c10510e.f31151a)) {
            return false;
        }
        InterfaceC10511f interfaceC10511f = this.f31152b;
        InterfaceC10511f interfaceC10511f2 = c10510e.f31152b;
        if (interfaceC10511f != null) {
            return interfaceC10511f.equals(interfaceC10511f2);
        }
        return interfaceC10511f2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f31151a.hashCode() * 31;
        InterfaceC10511f interfaceC10511f = this.f31152b;
        return iHashCode + (interfaceC10511f != null ? interfaceC10511f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f31151a);
        sb2.append(",resolved=");
        return AbstractC3794B0.m4499x(sb2, this.f31152b != null, '}');
    }

    public C10510e(C10510e c10510e) {
        this.f31151a = new ArrayList(c10510e.f31151a);
        this.f31152b = c10510e.f31152b;
    }
}
