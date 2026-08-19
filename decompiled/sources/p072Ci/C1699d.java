package p072Ci;

import ao.C11158d;
import ao.C11181o0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;

/* JADX INFO: renamed from: Ci.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1699d {
    public static final C1698c Companion = new C1698c();

    /* JADX INFO: renamed from: l */
    public static final KSerializer[] f4826l;

    /* JADX INFO: renamed from: a */
    public final Boolean f4827a;

    /* JADX INFO: renamed from: b */
    public final Boolean f4828b;

    /* JADX INFO: renamed from: c */
    public final Boolean f4829c;

    /* JADX INFO: renamed from: d */
    public final Boolean f4830d;

    /* JADX INFO: renamed from: e */
    public final Boolean f4831e;

    /* JADX INFO: renamed from: f */
    public final String f4832f;

    /* JADX INFO: renamed from: g */
    public final String f4833g;

    /* JADX INFO: renamed from: h */
    public final Boolean f4834h;

    /* JADX INFO: renamed from: i */
    public final Set f4835i;

    /* JADX INFO: renamed from: j */
    public final Set f4836j;

    /* JADX INFO: renamed from: k */
    public final EnumC1711p f4837k;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        f4826l = new KSerializer[]{null, null, null, null, null, null, null, null, new C11158d(c11181o0, 2), new C11158d(c11181o0, 2), EnumC1711p.Companion.serializer()};
    }

    public C1699d(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, Boolean bool6, Set announcements, Set eligibleAnnouncements, EnumC1711p enumC1711p) {
        AbstractC16544l.m18094g(announcements, "announcements");
        AbstractC16544l.m18094g(eligibleAnnouncements, "eligibleAnnouncements");
        this.f4827a = bool;
        this.f4828b = bool2;
        this.f4829c = bool3;
        this.f4830d = bool4;
        this.f4831e = bool5;
        this.f4832f = str;
        this.f4833g = str2;
        this.f4834h = bool6;
        this.f4835i = announcements;
        this.f4836j = eligibleAnnouncements;
        this.f4837k = enumC1711p;
    }

    /* JADX INFO: renamed from: a */
    public static C1699d m2511a(C1699d c1699d, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, Boolean bool6, EnumC1711p enumC1711p, int i10) {
        Boolean bool7 = (i10 & 1) != 0 ? c1699d.f4827a : bool;
        Boolean bool8 = (i10 & 2) != 0 ? c1699d.f4828b : bool2;
        Boolean bool9 = (i10 & 4) != 0 ? c1699d.f4829c : bool3;
        Boolean bool10 = (i10 & 8) != 0 ? c1699d.f4830d : bool4;
        Boolean bool11 = (i10 & 16) != 0 ? c1699d.f4831e : bool5;
        String str3 = (i10 & 32) != 0 ? c1699d.f4832f : str;
        String str4 = (i10 & 64) != 0 ? c1699d.f4833g : str2;
        Boolean bool12 = (i10 & 128) != 0 ? c1699d.f4834h : bool6;
        Set announcements = c1699d.f4835i;
        Set eligibleAnnouncements = c1699d.f4836j;
        EnumC1711p enumC1711p2 = (i10 & 1024) != 0 ? c1699d.f4837k : enumC1711p;
        c1699d.getClass();
        AbstractC16544l.m18094g(announcements, "announcements");
        AbstractC16544l.m18094g(eligibleAnnouncements, "eligibleAnnouncements");
        return new C1699d(bool7, bool8, bool9, bool10, bool11, str3, str4, bool12, announcements, eligibleAnnouncements, enumC1711p2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1699d)) {
            return false;
        }
        C1699d c1699d = (C1699d) obj;
        if (!AbstractC16544l.m18089b(this.f4827a, c1699d.f4827a) || !AbstractC16544l.m18089b(this.f4828b, c1699d.f4828b) || !AbstractC16544l.m18089b(this.f4829c, c1699d.f4829c) || !AbstractC16544l.m18089b(this.f4830d, c1699d.f4830d) || !AbstractC16544l.m18089b(this.f4831e, c1699d.f4831e)) {
            return false;
        }
        String str = this.f4832f;
        String str2 = c1699d.f4832f;
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
        return zM18089b && AbstractC16544l.m18089b(this.f4833g, c1699d.f4833g) && AbstractC16544l.m18089b(this.f4834h, c1699d.f4834h) && AbstractC16544l.m18089b(this.f4835i, c1699d.f4835i) && AbstractC16544l.m18089b(this.f4836j, c1699d.f4836j) && this.f4837k == c1699d.f4837k;
    }

    public final int hashCode() {
        Boolean bool = this.f4827a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f4828b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f4829c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f4830d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f4831e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.f4832f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4833g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool6 = this.f4834h;
        int iHashCode8 = (this.f4836j.hashCode() + ((this.f4835i.hashCode() + ((iHashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31)) * 31)) * 31;
        EnumC1711p enumC1711p = this.f4837k;
        return iHashCode8 + (enumC1711p != null ? enumC1711p.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1699d(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, Boolean bool6, Set set, Set set2, EnumC1711p enumC1711p) {
        if ((i10 & 1) == 0) {
            this.f4827a = null;
        } else {
            this.f4827a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f4828b = null;
        } else {
            this.f4828b = bool2;
        }
        if ((i10 & 4) == 0) {
            this.f4829c = null;
        } else {
            this.f4829c = bool3;
        }
        if ((i10 & 8) == 0) {
            this.f4830d = null;
        } else {
            this.f4830d = bool4;
        }
        if ((i10 & 16) == 0) {
            this.f4831e = null;
        } else {
            this.f4831e = bool5;
        }
        if ((i10 & 32) == 0) {
            this.f4832f = null;
        } else {
            this.f4832f = str;
        }
        if ((i10 & 64) == 0) {
            this.f4833g = null;
        } else {
            this.f4833g = str2;
        }
        if ((i10 & 128) == 0) {
            this.f4834h = null;
        } else {
            this.f4834h = bool6;
        }
        int i11 = i10 & 256;
        C17691y c17691y = C17691y.f56482Y;
        if (i11 == 0) {
            this.f4835i = c17691y;
        } else {
            this.f4835i = set;
        }
        if ((i10 & 512) == 0) {
            this.f4836j = c17691y;
        } else {
            this.f4836j = set2;
        }
        if ((i10 & 1024) == 0) {
            this.f4837k = null;
        } else {
            this.f4837k = enumC1711p;
        }
    }
}
