package si;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: si.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19655g implements InterfaceC19656h {

    /* JADX INFO: renamed from: a */
    public final String f62308a;

    /* JADX INFO: renamed from: b */
    public final String f62309b;

    /* JADX INFO: renamed from: c */
    public final String f62310c;

    public C19655g(String str, String str2, String str3) {
        this.f62308a = str;
        this.f62309b = str2;
        this.f62310c = str3;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: a */
    public final String mo20627a() {
        return this.f62308a;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: b */
    public final String mo20628b() {
        return this.f62310c;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: c */
    public final String mo20629c() {
        return this.f62309b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19655g)) {
            return false;
        }
        C19655g c19655g = (C19655g) obj;
        return AbstractC16544l.m18089b(this.f62308a, c19655g.f62308a) && AbstractC16544l.m18089b(this.f62309b, c19655g.f62309b) && AbstractC16544l.m18089b(this.f62310c, c19655g.f62310c);
    }

    public final int hashCode() {
        String str = this.f62308a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62309b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62310c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
