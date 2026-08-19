package p159G4;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC7934L5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: G4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2990a {

    /* JADX INFO: renamed from: a */
    public final String f8992a;

    /* JADX INFO: renamed from: b */
    public final String f8993b;

    /* JADX INFO: renamed from: c */
    public final boolean f8994c;

    /* JADX INFO: renamed from: d */
    public final int f8995d;

    /* JADX INFO: renamed from: e */
    public final String f8996e;

    /* JADX INFO: renamed from: f */
    public final int f8997f;

    /* JADX INFO: renamed from: g */
    public final int f8998g;

    public C2990a(int i10, int i11, String str, String str2, String str3, boolean z6) {
        this.f8992a = str;
        this.f8993b = str2;
        this.f8994c = z6;
        this.f8995d = i10;
        this.f8996e = str3;
        this.f8997f = i11;
        Locale US = Locale.US;
        AbstractC16544l.m18093f(US, "US");
        String upperCase = str2.toUpperCase(US);
        AbstractC16544l.m18093f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f8998g = AbstractC21322p.m21667A(upperCase, "INT", false) ? 3 : (AbstractC21322p.m21667A(upperCase, "CHAR", false) || AbstractC21322p.m21667A(upperCase, "CLOB", false) || AbstractC21322p.m21667A(upperCase, "TEXT", false)) ? 2 : AbstractC21322p.m21667A(upperCase, "BLOB", false) ? 5 : (AbstractC21322p.m21667A(upperCase, "REAL", false) || AbstractC21322p.m21667A(upperCase, "FLOA", false) || AbstractC21322p.m21667A(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2990a)) {
            return false;
        }
        C2990a c2990a = (C2990a) obj;
        if (this.f8995d != c2990a.f8995d) {
            return false;
        }
        if (!this.f8992a.equals(c2990a.f8992a) || this.f8994c != c2990a.f8994c) {
            return false;
        }
        int i10 = c2990a.f8997f;
        String str = c2990a.f8996e;
        String str2 = this.f8996e;
        int i11 = this.f8997f;
        if (i11 == 1 && i10 == 2 && str2 != null && !AbstractC7934L5.m8228b(str2, str)) {
            return false;
        }
        if (i11 != 2 || i10 != 1 || str == null || AbstractC7934L5.m8228b(str, str2)) {
            return (i11 == 0 || i11 != i10 || (str2 == null ? str == null : AbstractC7934L5.m8228b(str2, str))) && this.f8998g == c2990a.f8998g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f8992a.hashCode() * 31) + this.f8998g) * 31) + (this.f8994c ? 1231 : 1237)) * 31) + this.f8995d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f8992a);
        sb2.append("', type='");
        sb2.append(this.f8993b);
        sb2.append("', affinity='");
        sb2.append(this.f8998g);
        sb2.append("', notNull=");
        sb2.append(this.f8994c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f8995d);
        sb2.append(", defaultValue='");
        String str = this.f8996e;
        if (str == null) {
            str = "undefined";
        }
        return AbstractC9306j0.m9891j(str, "'}", sb2);
    }
}
