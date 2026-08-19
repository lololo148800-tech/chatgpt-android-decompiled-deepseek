package p425Ra;

import p572Xa.C9417k;

/* JADX INFO: renamed from: Ra.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6842o {

    /* JADX INFO: renamed from: a */
    public final String f21938a;

    /* JADX INFO: renamed from: b */
    public final C9417k f21939b;

    public C6842o(String str, C9417k c9417k) {
        this.f21938a = str;
        this.f21939b = c9417k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6842o) {
            C6842o c6842o = (C6842o) obj;
            String str = this.f21938a;
            if (str != null ? str.equals(c6842o.f21938a) : c6842o.f21938a == null) {
                if (this.f21939b.equals(c6842o.f21939b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21938a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        this.f21939b.getClass();
        return iHashCode;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f21938a + ", verdictOptOut=" + this.f21939b.toString() + "}";
    }
}
