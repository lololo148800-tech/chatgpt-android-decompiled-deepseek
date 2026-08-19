package p570X8;

import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: X8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9080h extends AbstractC9073a {

    /* JADX INFO: renamed from: a */
    public final Integer f27824a;

    /* JADX INFO: renamed from: b */
    public final String f27825b;

    /* JADX INFO: renamed from: c */
    public final String f27826c;

    /* JADX INFO: renamed from: d */
    public final String f27827d;

    /* JADX INFO: renamed from: e */
    public final String f27828e;

    /* JADX INFO: renamed from: f */
    public final String f27829f;

    /* JADX INFO: renamed from: g */
    public final String f27830g;

    /* JADX INFO: renamed from: h */
    public final String f27831h;

    /* JADX INFO: renamed from: i */
    public final String f27832i;

    /* JADX INFO: renamed from: j */
    public final String f27833j;

    /* JADX INFO: renamed from: k */
    public final String f27834k;

    /* JADX INFO: renamed from: l */
    public final String f27835l;

    public C9080h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f27824a = num;
        this.f27825b = str;
        this.f27826c = str2;
        this.f27827d = str3;
        this.f27828e = str4;
        this.f27829f = str5;
        this.f27830g = str6;
        this.f27831h = str7;
        this.f27832i = str8;
        this.f27833j = str9;
        this.f27834k = str10;
        this.f27835l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9073a)) {
            return false;
        }
        AbstractC9073a abstractC9073a = (AbstractC9073a) obj;
        Integer num = this.f27824a;
        if (num != null ? num.equals(((C9080h) abstractC9073a).f27824a) : ((C9080h) abstractC9073a).f27824a == null) {
            String str = this.f27825b;
            if (str != null ? str.equals(((C9080h) abstractC9073a).f27825b) : ((C9080h) abstractC9073a).f27825b == null) {
                String str2 = this.f27826c;
                if (str2 != null ? str2.equals(((C9080h) abstractC9073a).f27826c) : ((C9080h) abstractC9073a).f27826c == null) {
                    String str3 = this.f27827d;
                    if (str3 != null ? str3.equals(((C9080h) abstractC9073a).f27827d) : ((C9080h) abstractC9073a).f27827d == null) {
                        String str4 = this.f27828e;
                        if (str4 != null ? str4.equals(((C9080h) abstractC9073a).f27828e) : ((C9080h) abstractC9073a).f27828e == null) {
                            String str5 = this.f27829f;
                            if (str5 != null ? str5.equals(((C9080h) abstractC9073a).f27829f) : ((C9080h) abstractC9073a).f27829f == null) {
                                String str6 = this.f27830g;
                                if (str6 != null ? str6.equals(((C9080h) abstractC9073a).f27830g) : ((C9080h) abstractC9073a).f27830g == null) {
                                    String str7 = this.f27831h;
                                    if (str7 != null ? str7.equals(((C9080h) abstractC9073a).f27831h) : ((C9080h) abstractC9073a).f27831h == null) {
                                        String str8 = this.f27832i;
                                        if (str8 != null ? str8.equals(((C9080h) abstractC9073a).f27832i) : ((C9080h) abstractC9073a).f27832i == null) {
                                            String str9 = this.f27833j;
                                            if (str9 != null ? str9.equals(((C9080h) abstractC9073a).f27833j) : ((C9080h) abstractC9073a).f27833j == null) {
                                                String str10 = this.f27834k;
                                                if (str10 != null ? str10.equals(((C9080h) abstractC9073a).f27834k) : ((C9080h) abstractC9073a).f27834k == null) {
                                                    String str11 = this.f27835l;
                                                    if (str11 == null) {
                                                        if (((C9080h) abstractC9073a).f27835l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((C9080h) abstractC9073a).f27835l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        Integer num = this.f27824a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f27825b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f27826c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27827d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f27828e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f27829f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f27830g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f27831h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f27832i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f27833j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f27834k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f27835l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f27824a);
        sb2.append(", model=");
        sb2.append(this.f27825b);
        sb2.append(", hardware=");
        sb2.append(this.f27826c);
        sb2.append(", device=");
        sb2.append(this.f27827d);
        sb2.append(", product=");
        sb2.append(this.f27828e);
        sb2.append(", osBuild=");
        sb2.append(this.f27829f);
        sb2.append(", manufacturer=");
        sb2.append(this.f27830g);
        sb2.append(", fingerprint=");
        sb2.append(this.f27831h);
        sb2.append(", locale=");
        sb2.append(this.f27832i);
        sb2.append(", country=");
        sb2.append(this.f27833j);
        sb2.append(", mccMnc=");
        sb2.append(this.f27834k);
        sb2.append(", applicationBuild=");
        return AbstractC9306j0.m9891j(this.f27835l, "}", sb2);
    }
}
