package si;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: si.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C19653e implements InterfaceC19656h {

    /* JADX INFO: renamed from: a */
    public final String f62302a;

    /* JADX INFO: renamed from: b */
    public final String f62303b;

    /* JADX INFO: renamed from: c */
    public final String f62304c;

    public C19653e(String str, String str2, String str3) {
        this.f62302a = str;
        this.f62303b = str2;
        this.f62304c = str3;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: a */
    public final String mo20627a() {
        return this.f62302a;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: b */
    public final String mo20628b() {
        return this.f62304c;
    }

    @Override // si.InterfaceC19656h
    /* JADX INFO: renamed from: c */
    public final String mo20629c() {
        return this.f62303b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19653e)) {
            return false;
        }
        C19653e c19653e = (C19653e) obj;
        return AbstractC16544l.m18089b(this.f62302a, c19653e.f62302a) && AbstractC16544l.m18089b(this.f62303b, c19653e.f62303b) && AbstractC16544l.m18089b(this.f62304c, c19653e.f62304c);
    }

    public final int hashCode() {
        String str = this.f62302a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62303b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62304c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
