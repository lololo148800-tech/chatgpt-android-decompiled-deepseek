package p707dg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: dg.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13107c {
    public static final C13106b Companion = new C13106b();

    /* JADX INFO: renamed from: a */
    public final String f41621a;

    /* JADX INFO: renamed from: b */
    public final String f41622b;

    /* JADX INFO: renamed from: c */
    public final String f41623c;

    /* JADX INFO: renamed from: d */
    public final String f41624d;

    /* JADX INFO: renamed from: e */
    public final String f41625e;

    /* JADX INFO: renamed from: f */
    public final boolean f41626f;

    public C13107c(String firstName, String lastName, String birthdate, String str) {
        AbstractC16544l.m18094g(firstName, "firstName");
        AbstractC16544l.m18094g(lastName, "lastName");
        AbstractC16544l.m18094g(birthdate, "birthdate");
        this.f41621a = "androidchat";
        this.f41622b = firstName;
        this.f41623c = lastName;
        this.f41624d = birthdate;
        this.f41625e = str;
        this.f41626f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13107c)) {
            return false;
        }
        C13107c c13107c = (C13107c) obj;
        return AbstractC16544l.m18089b(this.f41621a, c13107c.f41621a) && AbstractC16544l.m18089b(this.f41622b, c13107c.f41622b) && AbstractC16544l.m18089b(this.f41623c, c13107c.f41623c) && AbstractC16544l.m18089b(this.f41624d, c13107c.f41624d) && AbstractC16544l.m18089b(this.f41625e, c13107c.f41625e) && this.f41626f == c13107c.f41626f;
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f41621a.hashCode() * 31, 31, this.f41622b), 31, this.f41623c), 31, this.f41624d);
        String str = this.f41625e;
        return ((iM527p + (str == null ? 0 : str.hashCode())) * 31) + (this.f41626f ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C13107c(int i10, String str, String str2, String str3, String str4, String str5, boolean z6) {
        if (30 != (i10 & 30)) {
            AbstractC11153a0.m12389l(i10, 30, C13105a.f41620a.getDescriptor());
            throw null;
        }
        this.f41621a = (i10 & 1) == 0 ? "androidchat" : str;
        this.f41622b = str2;
        this.f41623c = str3;
        this.f41624d = str4;
        this.f41625e = str5;
        if ((i10 & 32) == 0) {
            this.f41626f = true;
        } else {
            this.f41626f = z6;
        }
    }
}
