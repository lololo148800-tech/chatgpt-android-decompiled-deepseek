package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10344N extends AbstractC10345O {

    /* JADX INFO: renamed from: o0 */
    public final Integer f30683o0;

    /* JADX INFO: renamed from: p0 */
    public final String f30684p0;

    /* JADX INFO: renamed from: q0 */
    public final Exception f30685q0;

    public C10344N(Integer num, String str, Exception exc) {
        super(str, exc);
        this.f30683o0 = num;
        this.f30684p0 = str;
        this.f30685q0 = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10344N)) {
            return false;
        }
        C10344N c10344n = (C10344N) obj;
        return AbstractC16544l.m18089b(this.f30683o0, c10344n.f30683o0) && AbstractC16544l.m18089b(this.f30684p0, c10344n.f30684p0) && AbstractC16544l.m18089b(this.f30685q0, c10344n.f30685q0);
    }

    @Override // p624Zg.AbstractC10345O, java.lang.Throwable
    public final Throwable getCause() {
        return this.f30685q0;
    }

    @Override // p624Zg.AbstractC10345O, java.lang.Throwable
    public final String getMessage() {
        return this.f30684p0;
    }

    public final int hashCode() {
        Integer num = this.f30683o0;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f30684p0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.f30685q0;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "█";
    }
}
