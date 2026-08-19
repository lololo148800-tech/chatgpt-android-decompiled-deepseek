package sg;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: sg.t */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19578t {
    public static final C19577s Companion = new C19577s();

    /* JADX INFO: renamed from: k */
    public static final KSerializer[] f62166k = {null, null, null, null, null, null, null, null, null, new C11158d(C19563e.f62146a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f62167a;

    /* JADX INFO: renamed from: b */
    public final String f62168b;

    /* JADX INFO: renamed from: c */
    public final String f62169c;

    /* JADX INFO: renamed from: d */
    public final List f62170d;

    /* JADX INFO: renamed from: e */
    public final boolean f62171e;

    /* JADX INFO: renamed from: f */
    public final String f62172f;

    /* JADX INFO: renamed from: g */
    public final String f62173g;

    /* JADX INFO: renamed from: h */
    public final String f62174h;

    /* JADX INFO: renamed from: i */
    public final String f62175i;

    /* JADX INFO: renamed from: j */
    public final List f62176j;

    public C19578t(String str, String cta, String str2, String str3, String str4, String str5, String str6, List additionalFields, int i10) {
        C17689w c17689w = C17689w.f56480Y;
        str4 = (i10 & 64) != 0 ? null : str4;
        str5 = (i10 & 128) != 0 ? null : str5;
        str6 = (i10 & 256) != 0 ? null : str6;
        additionalFields = (i10 & 512) != 0 ? c17689w : additionalFields;
        AbstractC16544l.m18094g(cta, "cta");
        AbstractC16544l.m18094g(additionalFields, "additionalFields");
        this.f62167a = str;
        this.f62168b = cta;
        this.f62169c = str2;
        this.f62170d = c17689w;
        this.f62171e = true;
        this.f62172f = str3;
        this.f62173g = str4;
        this.f62174h = str5;
        this.f62175i = str6;
        this.f62176j = additionalFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19578t)) {
            return false;
        }
        C19578t c19578t = (C19578t) obj;
        return AbstractC16544l.m18089b(this.f62167a, c19578t.f62167a) && AbstractC16544l.m18089b(this.f62168b, c19578t.f62168b) && AbstractC16544l.m18089b(this.f62169c, c19578t.f62169c) && AbstractC16544l.m18089b(this.f62170d, c19578t.f62170d) && this.f62171e == c19578t.f62171e && AbstractC16544l.m18089b(this.f62172f, c19578t.f62172f) && AbstractC16544l.m18089b(this.f62173g, c19578t.f62173g) && AbstractC16544l.m18089b(this.f62174h, c19578t.f62174h) && AbstractC16544l.m18089b(this.f62175i, c19578t.f62175i) && AbstractC16544l.m18089b(this.f62176j, c19578t.f62176j);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f62167a.hashCode() * 31, 31, this.f62168b);
        String str = this.f62169c;
        int iM15858x = (AbstractC14376f.m15858x(this.f62170d, (iM527p + (str == null ? 0 : str.hashCode())) * 31, 31) + (this.f62171e ? 1231 : 1237)) * 31;
        String str2 = this.f62172f;
        int iHashCode = (iM15858x + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62173g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f62174h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f62175i;
        return this.f62176j.hashCode() + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C19578t(int i10, String str, String str2, String str3, List list, boolean z6, String str4, String str5, String str6, String str7, List list2) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C19576r.f62165a.getDescriptor());
            throw null;
        }
        this.f62167a = str;
        this.f62168b = str2;
        this.f62169c = str3;
        this.f62170d = list;
        this.f62171e = z6;
        if ((i10 & 32) == 0) {
            this.f62172f = null;
        } else {
            this.f62172f = str4;
        }
        if ((i10 & 64) == 0) {
            this.f62173g = null;
        } else {
            this.f62173g = str5;
        }
        if ((i10 & 128) == 0) {
            this.f62174h = null;
        } else {
            this.f62174h = str6;
        }
        if ((i10 & 256) == 0) {
            this.f62175i = null;
        } else {
            this.f62175i = str7;
        }
        if ((i10 & 512) == 0) {
            this.f62176j = C17689w.f56480Y;
        } else {
            this.f62176j = list2;
        }
    }
}
