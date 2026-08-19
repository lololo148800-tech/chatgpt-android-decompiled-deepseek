package si;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: si.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C19654f implements InterfaceC19656h {

    /* JADX INFO: renamed from: a */
    public final String f62305a;

    /* JADX INFO: renamed from: b */
    public final String f62306b;

    /* JADX INFO: renamed from: c */
    public final String f62307c;

    public C19654f(String str, String str2, String str3) {
        this.f62305a = str;
        this.f62306b = str2;
        this.f62307c = str3;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: a */
    public final String mo20627a() {
        return this.f62305a;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: b */
    public final String mo20628b() {
        return this.f62307c;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: c */
    public final String mo20629c() {
        return this.f62306b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19654f)) {
            return false;
        }
        C19654f c19654f = (C19654f) obj;
        return AbstractC16544l.m18089b(this.f62305a, c19654f.f62305a) && AbstractC16544l.m18089b(this.f62306b, c19654f.f62306b) && AbstractC16544l.m18089b(this.f62307c, c19654f.f62307c);
    }

    public final int hashCode() {
        String str = this.f62305a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62306b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62307c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
