package p570X8;

import java.util.ArrayList;

/* JADX INFO: renamed from: X8.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9084l extends AbstractC9091s {

    /* JADX INFO: renamed from: a */
    public final long f27845a;

    /* JADX INFO: renamed from: b */
    public final long f27846b;

    /* JADX INFO: renamed from: c */
    public final C9082j f27847c;

    /* JADX INFO: renamed from: d */
    public final Integer f27848d;

    /* JADX INFO: renamed from: e */
    public final String f27849e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f27850f;

    public C9084l(long j10, long j11, C9082j c9082j, Integer num, String str, ArrayList arrayList) {
        EnumC9095w enumC9095w = EnumC9095w.f27860Y;
        this.f27845a = j10;
        this.f27846b = j11;
        this.f27847c = c9082j;
        this.f27848d = num;
        this.f27849e = str;
        this.f27850f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9091s)) {
            return false;
        }
        C9084l c9084l = (C9084l) ((AbstractC9091s) obj);
        if (this.f27845a == c9084l.f27845a) {
            if (this.f27846b == c9084l.f27846b) {
                if (this.f27847c.equals(c9084l.f27847c)) {
                    Integer num = c9084l.f27848d;
                    Integer num2 = this.f27848d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c9084l.f27849e;
                        String str2 = this.f27849e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f27850f.equals(c9084l.f27850f)) {
                                Object obj2 = EnumC9095w.f27860Y;
                                if (obj2.equals(obj2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f27845a;
        long j11 = this.f27846b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f27847c.hashCode()) * 1000003;
        Integer num = this.f27848d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f27849e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f27850f.hashCode()) * 1000003) ^ EnumC9095w.f27860Y.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f27845a + ", requestUptimeMs=" + this.f27846b + ", clientInfo=" + this.f27847c + ", logSource=" + this.f27848d + ", logSourceName=" + this.f27849e + ", logEvents=" + this.f27850f + ", qosTier=" + EnumC9095w.f27860Y + "}";
    }
}
