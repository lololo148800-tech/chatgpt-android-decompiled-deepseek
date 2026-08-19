package p944p8;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: p8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18309a {

    /* JADX INFO: renamed from: a */
    public final String f58438a;

    /* JADX INFO: renamed from: b */
    public final String f58439b;

    public C18309a(String key, String str) {
        AbstractC16544l.m18094g(key, "key");
        this.f58438a = key;
        this.f58439b = str;
    }

    public final boolean equals(Object obj) {
        C18309a c18309a;
        String str;
        if (!(obj instanceof C18309a)) {
            return false;
        }
        String str2 = this.f58438a;
        String str3 = this.f58439b;
        if (str3 == null || AbstractC21322p.m21681O(str3) || (str = (c18309a = (C18309a) obj).f58439b) == null || AbstractC21322p.m21681O(str)) {
            return AbstractC16544l.m18089b(str2, ((C18309a) obj).f58438a);
        }
        return AbstractC16544l.m18089b(str3, c18309a.f58439b) && AbstractC16544l.m18089b(str2, c18309a.f58438a);
    }

    public final int hashCode() {
        return this.f58438a.hashCode();
    }
}
