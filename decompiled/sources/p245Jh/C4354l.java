package p245Jh;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Jh.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4354l {
    public static final C4353k Companion = new C4353k();

    /* JADX INFO: renamed from: n */
    public static final KSerializer[] f14155n = {null, null, null, null, null, null, null, null, null, null, null, null, new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f14156a;

    /* JADX INFO: renamed from: b */
    public final String f14157b;

    /* JADX INFO: renamed from: c */
    public final String f14158c;

    /* JADX INFO: renamed from: d */
    public final String f14159d;

    /* JADX INFO: renamed from: e */
    public final String f14160e;

    /* JADX INFO: renamed from: f */
    public final String f14161f;

    /* JADX INFO: renamed from: g */
    public final String f14162g;

    /* JADX INFO: renamed from: h */
    public final String f14163h;

    /* JADX INFO: renamed from: i */
    public final String f14164i;

    /* JADX INFO: renamed from: j */
    public final String f14165j;

    /* JADX INFO: renamed from: k */
    public final String f14166k;

    /* JADX INFO: renamed from: l */
    public final String f14167l;

    /* JADX INFO: renamed from: m */
    public final List f14168m;

    public C4354l(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C4352j.f14154a.getDescriptor());
            throw null;
        }
        this.f14156a = str;
        this.f14157b = str2;
        this.f14158c = str3;
        this.f14159d = str4;
        this.f14160e = str5;
        if ((i10 & 32) == 0) {
            this.f14161f = null;
        } else {
            this.f14161f = str6;
        }
        if ((i10 & 64) == 0) {
            this.f14162g = null;
        } else {
            this.f14162g = str7;
        }
        if ((i10 & 128) == 0) {
            this.f14163h = null;
        } else {
            this.f14163h = str8;
        }
        if ((i10 & 256) == 0) {
            this.f14164i = null;
        } else {
            this.f14164i = str9;
        }
        if ((i10 & 512) == 0) {
            this.f14165j = null;
        } else {
            this.f14165j = str10;
        }
        if ((i10 & 1024) == 0) {
            this.f14166k = null;
        } else {
            this.f14166k = str11;
        }
        if ((i10 & 2048) == 0) {
            this.f14167l = null;
        } else {
            this.f14167l = str12;
        }
        if ((i10 & 4096) == 0) {
            this.f14168m = null;
        } else {
            this.f14168m = list;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:57:0x008f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a5  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        boolean zM18089b4;
        boolean zM18089b5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4354l)) {
            return false;
        }
        C4354l c4354l = (C4354l) obj;
        if (!AbstractC16544l.m18089b(this.f14156a, c4354l.f14156a) || !AbstractC16544l.m18089b(this.f14157b, c4354l.f14157b) || !AbstractC16544l.m18089b(this.f14158c, c4354l.f14158c) || !AbstractC16544l.m18089b(this.f14159d, c4354l.f14159d) || !AbstractC16544l.m18089b(this.f14160e, c4354l.f14160e)) {
            return false;
        }
        String str = this.f14161f;
        String str2 = c4354l.f14161f;
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
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f14162g;
        String str4 = c4354l.f14162g;
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
        String str5 = this.f14163h;
        String str6 = c4354l.f14163h;
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
        String str7 = this.f14164i;
        String str8 = c4354l.f14164i;
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
        if (!zM18089b4) {
            return false;
        }
        String str9 = this.f14165j;
        String str10 = c4354l.f14165j;
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
        return zM18089b5 && AbstractC16544l.m18089b(this.f14166k, c4354l.f14166k) && AbstractC16544l.m18089b(this.f14167l, c4354l.f14167l) && AbstractC16544l.m18089b(this.f14168m, c4354l.f14168m);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f14156a.hashCode() * 31, 31, this.f14157b), 31, this.f14158c), 31, this.f14159d), 31, this.f14160e);
        String str = this.f14161f;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14162g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14163h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14164i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14165j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14166k;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14167l;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.f14168m;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
