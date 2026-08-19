package p598Ye;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10037h {
    public static final C10036g Companion = new C10036g();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f29733g = {null, null, null, null, new C11158d(C11181o0.f33827a, 0), new C11158d(C10031b.f29727a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f29734a;

    /* JADX INFO: renamed from: b */
    public final String f29735b;

    /* JADX INFO: renamed from: c */
    public final String f29736c;

    /* JADX INFO: renamed from: d */
    public final String f29737d;

    /* JADX INFO: renamed from: e */
    public final List f29738e;

    /* JADX INFO: renamed from: f */
    public final List f29739f;

    public /* synthetic */ C10037h(int i10, String str, String str2, String str3, String str4, List list, List list2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C10035f.f29732a.getDescriptor());
            throw null;
        }
        this.f29734a = str;
        this.f29735b = str2;
        this.f29736c = str3;
        this.f29737d = str4;
        int i11 = i10 & 16;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            this.f29738e = c17689w;
        } else {
            this.f29738e = list;
        }
        if ((i10 & 32) == 0) {
            this.f29739f = c17689w;
        } else {
            this.f29739f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10037h)) {
            return false;
        }
        C10037h c10037h = (C10037h) obj;
        return AbstractC16544l.m18089b(this.f29734a, c10037h.f29734a) && AbstractC16544l.m18089b(this.f29735b, c10037h.f29735b) && AbstractC16544l.m18089b(this.f29736c, c10037h.f29736c) && AbstractC16544l.m18089b(this.f29737d, c10037h.f29737d) && AbstractC16544l.m18089b(this.f29738e, c10037h.f29738e) && AbstractC16544l.m18089b(this.f29739f, c10037h.f29739f);
    }

    public final int hashCode() {
        int iHashCode = this.f29734a.hashCode() * 31;
        String str = this.f29735b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29736c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29737d;
        return this.f29739f.hashCode() + AbstractC14376f.m15858x(this.f29738e, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }

    public C10037h(String name, String str, String str2) {
        C17689w c17689w = C17689w.f56480Y;
        AbstractC16544l.m18094g(name, "name");
        this.f29734a = name;
        this.f29735b = "";
        this.f29736c = str;
        this.f29737d = str2;
        this.f29738e = c17689w;
        this.f29739f = c17689w;
    }
}
