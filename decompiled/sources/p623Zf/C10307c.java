package p623Zf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p872lg.C16946f;

/* JADX INFO: renamed from: Zf.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10307c {
    public static final C10306b Companion = new C10306b();

    /* JADX INFO: renamed from: a */
    public final String f30599a;

    /* JADX INFO: renamed from: b */
    public final String f30600b;

    /* JADX INFO: renamed from: c */
    public final String f30601c;

    /* JADX INFO: renamed from: d */
    public final C16946f f30602d;

    /* JADX INFO: renamed from: e */
    public final String f30603e;

    public /* synthetic */ C10307c(int i10, String str, String str2, String str3, C16946f c16946f, String str4) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C10305a.f30598a.getDescriptor());
            throw null;
        }
        this.f30599a = str;
        this.f30600b = str2;
        this.f30601c = str3;
        this.f30602d = c16946f;
        this.f30603e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10307c)) {
            return false;
        }
        C10307c c10307c = (C10307c) obj;
        return AbstractC16544l.m18089b(this.f30599a, c10307c.f30599a) && AbstractC16544l.m18089b(this.f30600b, c10307c.f30600b) && AbstractC16544l.m18089b(this.f30601c, c10307c.f30601c) && AbstractC16544l.m18089b(this.f30602d, c10307c.f30602d) && AbstractC16544l.m18089b(this.f30603e, c10307c.f30603e);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f30599a.hashCode() * 31, 31, this.f30600b);
        String str = this.f30601c;
        return this.f30603e.hashCode() + ((this.f30602d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C10307c(String firstName, String lastName, String str, C16946f country, String str2) {
        AbstractC16544l.m18094g(firstName, "firstName");
        AbstractC16544l.m18094g(lastName, "lastName");
        AbstractC16544l.m18094g(country, "country");
        this.f30599a = firstName;
        this.f30600b = lastName;
        this.f30601c = str;
        this.f30602d = country;
        this.f30603e = str2;
    }
}
