package p857kl;

import com.google.protobuf.AbstractC12107L1;
import java.util.LinkedHashMap;
import java.util.List;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: kl.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C16450Q {

    /* JADX INFO: renamed from: c */
    public static final C16450Q f51029c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f51030d;

    /* JADX INFO: renamed from: a */
    public final String f51031a;

    /* JADX INFO: renamed from: b */
    public final int f51032b;

    static {
        C16450Q c16450q = new C16450Q("http", 80);
        f51029c = c16450q;
        List listM19382k = AbstractC17681o.m19382k(c16450q, new C16450Q("https", 443), new C16450Q("ws", 80), new C16450Q("wss", 443), new C16450Q("socks", 1080));
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(listM19382k, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj : listM19382k) {
            linkedHashMap.put(((C16450Q) obj).f51031a, obj);
        }
        f51030d = linkedHashMap;
    }

    public C16450Q(String str, int i10) {
        this.f51031a = str;
        this.f51032b = i10;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16450Q)) {
            return false;
        }
        C16450Q c16450q = (C16450Q) obj;
        return this.f51031a.equals(c16450q.f51031a) && this.f51032b == c16450q.f51032b;
    }

    public final int hashCode() {
        return (this.f51031a.hashCode() * 31) + this.f51032b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.f51031a);
        sb2.append(", defaultPort=");
        return AbstractC12107L1.m13826q(sb2, this.f51032b, ')');
    }
}
