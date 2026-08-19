package p216Id;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p197Hj.C3457c;
import p403Qd.AbstractC6659u;
import p479Td.C7351f0;
import p571X9.AbstractC9227W;
import p575Xd.C9436E;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Id.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3694b {

    /* JADX INFO: renamed from: a */
    public final String f11216a;

    /* JADX INFO: renamed from: b */
    public final String f11217b;

    /* JADX INFO: renamed from: c */
    public final String f11218c;

    /* JADX INFO: renamed from: d */
    public final String f11219d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3702j f11220e;

    /* JADX INFO: renamed from: f */
    public final boolean f11221f;

    /* JADX INFO: renamed from: g */
    public final boolean f11222g;

    /* JADX INFO: renamed from: h */
    public final String f11223h;

    /* JADX INFO: renamed from: i */
    public final List f11224i;

    /* JADX INFO: renamed from: j */
    public final String f11225j;

    /* JADX INFO: renamed from: k */
    public final C9436E f11226k;

    /* JADX INFO: renamed from: l */
    public final String f11227l;

    /* JADX INFO: renamed from: m */
    public final C17314q f11228m;

    public C3694b(String str, String str2, String str3, String str4, InterfaceC3702j state, boolean z6, String str5, List list, String str6, C9436E c9436e, String str7) {
        AbstractC16544l.m18094g(state, "state");
        this.f11216a = str;
        this.f11217b = str2;
        this.f11218c = str3;
        this.f11219d = str4;
        this.f11220e = state;
        this.f11221f = z6;
        this.f11222g = false;
        this.f11223h = str5;
        this.f11224i = list;
        this.f11225j = str6;
        this.f11226k = c9436e;
        this.f11227l = str7;
        this.f11228m = AbstractC9227W.m9800c(new C3457c(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final C7351f0 m4408a(String messageId) {
        AbstractC16544l.m18094g(messageId, "messageId");
        List list = this.f11224i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC6659u) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7351f0 c7351f0M7176h = ((AbstractC6659u) it.next()).m7176h(messageId);
            if (c7351f0M7176h != null) {
                return c7351f0M7176h;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0042  */
    /* JADX WARN: Code duplicated, block: B:42:0x0058  */
    /* JADX WARN: Code duplicated, block: B:67:0x009d  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        boolean zM18089b4;
        boolean zM18089b5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3694b)) {
            return false;
        }
        C3694b c3694b = (C3694b) obj;
        String str = c3694b.f11216a;
        String str2 = this.f11216a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f11217b;
        String str4 = c3694b.f11217b;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        if (!zM18089b2) {
            return false;
        }
        String str5 = this.f11218c;
        String str6 = c3694b.f11218c;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        if (!zM18089b3) {
            return false;
        }
        String str7 = this.f11219d;
        String str8 = c3694b.f11219d;
        if (str7 == null) {
            if (str8 == null) {
                zM18089b4 = true;
            } else {
                zM18089b4 = false;
            }
        } else if (str8 == null) {
            zM18089b4 = false;
        } else {
            zM18089b4 = AbstractC16544l.m18089b(str7, str8);
        }
        if (!zM18089b4 || !AbstractC16544l.m18089b(this.f11220e, c3694b.f11220e) || this.f11221f != c3694b.f11221f || this.f11222g != c3694b.f11222g || !AbstractC16544l.m18089b(this.f11223h, c3694b.f11223h) || !AbstractC16544l.m18089b(this.f11224i, c3694b.f11224i)) {
            return false;
        }
        String str9 = this.f11225j;
        String str10 = c3694b.f11225j;
        if (str9 == null) {
            if (str10 == null) {
                zM18089b5 = true;
            } else {
                zM18089b5 = false;
            }
        } else if (str10 == null) {
            zM18089b5 = false;
        } else {
            zM18089b5 = AbstractC16544l.m18089b(str9, str10);
        }
        return zM18089b5 && AbstractC16544l.m18089b(this.f11226k, c3694b.f11226k) && AbstractC16544l.m18089b(this.f11227l, c3694b.f11227l);
    }

    public final int hashCode() {
        String str = this.f11216a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11217b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11218c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11219d;
        int iHashCode4 = (((((this.f11220e.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31) + (this.f11221f ? 1231 : 1237)) * 31) + (this.f11222g ? 1231 : 1237)) * 31;
        String str5 = this.f11223h;
        int iM15858x = AbstractC14376f.m15858x(this.f11224i, (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.f11225j;
        int iHashCode5 = (this.f11226k.hashCode() + ((iM15858x + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31;
        String str7 = this.f11227l;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
