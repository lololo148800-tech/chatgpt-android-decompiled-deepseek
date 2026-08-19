package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10341K extends AbstractC10345O {

    /* JADX INFO: renamed from: o0 */
    public final Integer f30676o0;

    /* JADX INFO: renamed from: p0 */
    public final String f30677p0;

    /* JADX INFO: renamed from: q0 */
    public final Exception f30678q0;

    public C10341K(Integer num, String str, Exception exc) {
        super(str, exc);
        this.f30676o0 = num;
        this.f30677p0 = str;
        this.f30678q0 = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10341K)) {
            return false;
        }
        C10341K c10341k = (C10341K) obj;
        return AbstractC16544l.m18089b(this.f30676o0, c10341k.f30676o0) && AbstractC16544l.m18089b(this.f30677p0, c10341k.f30677p0) && AbstractC16544l.m18089b(this.f30678q0, c10341k.f30678q0);
    }

    @Override // p624Zg.AbstractC10345O, java.lang.Throwable
    public final Throwable getCause() {
        return this.f30678q0;
    }

    @Override // p624Zg.AbstractC10345O, java.lang.Throwable
    public final String getMessage() {
        return this.f30677p0;
    }

    public final int hashCode() {
        Integer num = this.f30676o0;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f30677p0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.f30678q0;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "█";
    }
}
