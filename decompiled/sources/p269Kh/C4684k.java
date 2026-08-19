package p269Kh;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: Kh.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4684k {
    public static final C4683j Companion = new C4683j();

    /* JADX INFO: renamed from: o */
    public static final KSerializer[] f15235o = {null, null, null, null, AbstractC11153a0.m12383f("com.openai.models.model.Models.SubscriptionLevel", EnumC4672A.values()), null, null, null, null, null, null, null, null, new C11158d(AbstractC11153a0.m12383f("com.openai.models.model.Models.Category.CategoryFeatures", EnumC4682i.values()), 0)};

    /* JADX INFO: renamed from: a */
    public final String f15236a;

    /* JADX INFO: renamed from: b */
    public final String f15237b;

    /* JADX INFO: renamed from: c */
    public final String f15238c;

    /* JADX INFO: renamed from: d */
    public final String f15239d;

    /* JADX INFO: renamed from: e */
    public final EnumC4672A f15240e;

    /* JADX INFO: renamed from: f */
    public final String f15241f;

    /* JADX INFO: renamed from: g */
    public final String f15242g;

    /* JADX INFO: renamed from: h */
    public final String f15243h;

    /* JADX INFO: renamed from: i */
    public final String f15244i;

    /* JADX INFO: renamed from: j */
    public final String f15245j;

    /* JADX INFO: renamed from: k */
    public final String f15246k;

    /* JADX INFO: renamed from: l */
    public final String f15247l;

    /* JADX INFO: renamed from: m */
    public final boolean f15248m;

    /* JADX INFO: renamed from: n */
    public final List f15249n;

    public C4684k(int i10, String str, String str2, String str3, String str4, EnumC4672A enumC4672A, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z6, List list) {
        if (55 != (i10 & 55)) {
            AbstractC11153a0.m12389l(i10, 55, C4681h.f15232a.getDescriptor());
            throw null;
        }
        this.f15236a = str;
        this.f15237b = str2;
        this.f15238c = str3;
        if ((i10 & 8) == 0) {
            this.f15239d = null;
        } else {
            this.f15239d = str4;
        }
        this.f15240e = enumC4672A;
        this.f15241f = str5;
        if ((i10 & 64) == 0) {
            this.f15242g = null;
        } else {
            this.f15242g = str6;
        }
        if ((i10 & 128) == 0) {
            this.f15243h = null;
        } else {
            this.f15243h = str7;
        }
        if ((i10 & 256) == 0) {
            this.f15244i = null;
        } else {
            this.f15244i = str8;
        }
        if ((i10 & 512) == 0) {
            this.f15245j = null;
        } else {
            this.f15245j = str9;
        }
        if ((i10 & 1024) == 0) {
            this.f15246k = null;
        } else {
            this.f15246k = str10;
        }
        if ((i10 & 2048) == 0) {
            this.f15247l = null;
        } else {
            this.f15247l = str11;
        }
        this.f15248m = (i10 & 4096) == 0 ? false : z6;
        this.f15249n = (i10 & 8192) == 0 ? C17689w.f56480Y : list;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:60:0x0096  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ac  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        boolean zM18089b4;
        boolean zM18089b5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4684k)) {
            return false;
        }
        C4684k c4684k = (C4684k) obj;
        if (!AbstractC16544l.m18089b(this.f15236a, c4684k.f15236a) || !AbstractC16544l.m18089b(this.f15237b, c4684k.f15237b) || !AbstractC16544l.m18089b(this.f15238c, c4684k.f15238c) || !AbstractC16544l.m18089b(this.f15239d, c4684k.f15239d) || this.f15240e != c4684k.f15240e || !AbstractC16544l.m18089b(this.f15241f, c4684k.f15241f)) {
            return false;
        }
        String str = this.f15242g;
        String str2 = c4684k.f15242g;
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
        String str3 = this.f15243h;
        String str4 = c4684k.f15243h;
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
        String str5 = this.f15244i;
        String str6 = c4684k.f15244i;
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
        String str7 = this.f15245j;
        String str8 = c4684k.f15245j;
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
        String str9 = this.f15246k;
        String str10 = c4684k.f15246k;
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
        return zM18089b5 && AbstractC16544l.m18089b(this.f15247l, c4684k.f15247l) && this.f15248m == c4684k.f15248m && AbstractC16544l.m18089b(this.f15249n, c4684k.f15249n);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(this.f15236a.hashCode() * 31, 31, this.f15237b), 31, this.f15238c);
        String str = this.f15239d;
        int iM527p2 = AbstractC0168G.m527p((this.f15240e.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f15241f);
        String str2 = this.f15242g;
        int iHashCode = (iM527p2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15243h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15244i;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15245j;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f15246k;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f15247l;
        return this.f15249n.hashCode() + ((((iHashCode5 + (str7 != null ? str7.hashCode() : 0)) * 31) + (this.f15248m ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C4684k(String name, String humanCategoryName, String humanCategoryShortName, String str, EnumC4672A enumC4672A, String defaultModel, String str2, String str3, String str4, String str5, String str6, String str7, boolean z6, List list, int i10) {
        String str8 = (i10 & 8) != 0 ? null : str;
        String str9 = (i10 & 64) != 0 ? null : str2;
        String str10 = (i10 & 128) != 0 ? null : str3;
        String str11 = (i10 & 256) != 0 ? null : str4;
        String str12 = (i10 & 512) != 0 ? null : str5;
        String str13 = (i10 & 1024) == 0 ? str6 : null;
        boolean z10 = (i10 & 4096) != 0 ? false : z6;
        List supportsFeatures = (i10 & 8192) != 0 ? C17689w.f56480Y : list;
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(humanCategoryName, "humanCategoryName");
        AbstractC16544l.m18094g(humanCategoryShortName, "humanCategoryShortName");
        AbstractC16544l.m18094g(defaultModel, "defaultModel");
        AbstractC16544l.m18094g(supportsFeatures, "supportsFeatures");
        this.f15236a = name;
        this.f15237b = humanCategoryName;
        this.f15238c = humanCategoryShortName;
        this.f15239d = str8;
        this.f15240e = enumC4672A;
        this.f15241f = defaultModel;
        this.f15242g = str9;
        this.f15243h = str10;
        this.f15244i = str11;
        this.f15245j = str12;
        this.f15246k = str13;
        this.f15247l = str7;
        this.f15248m = z10;
        this.f15249n = supportsFeatures;
    }
}
