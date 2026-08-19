package p429Re;

import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;
import p478Tc.EnumC7310n;

/* JADX INFO: renamed from: Re.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C6876j {

    /* JADX INFO: renamed from: a */
    public final String f22048a;

    /* JADX INFO: renamed from: b */
    public final C3590f f22049b;

    /* JADX INFO: renamed from: c */
    public final int f22050c;

    /* JADX INFO: renamed from: d */
    public final EnumC7310n f22051d;

    public C6876j(String title, C3590f subtitle, int i10, EnumC7310n enumC7310n) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(subtitle, "subtitle");
        this.f22048a = title;
        this.f22049b = subtitle;
        this.f22050c = i10;
        this.f22051d = enumC7310n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6876j)) {
            return false;
        }
        C6876j c6876j = (C6876j) obj;
        return AbstractC16544l.m18089b(this.f22048a, c6876j.f22048a) && AbstractC16544l.m18089b(this.f22049b, c6876j.f22049b) && this.f22050c == c6876j.f22050c && this.f22051d.equals(c6876j.f22051d);
    }

    public final int hashCode() {
        return this.f22051d.hashCode() + ((((this.f22049b.hashCode() + (this.f22048a.hashCode() * 31)) * 31) + this.f22050c) * 31);
    }

    public final String toString() {
        return "█";
    }
}
