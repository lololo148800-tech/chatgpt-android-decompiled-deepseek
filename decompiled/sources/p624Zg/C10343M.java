package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C10343M extends AbstractC10345O {

    /* JADX INFO: renamed from: o0 */
    public final Integer f30680o0;

    /* JADX INFO: renamed from: p0 */
    public final String f30681p0;

    /* JADX INFO: renamed from: q0 */
    public final Exception f30682q0;

    public C10343M(Integer num, String str, Exception exc) {
        super(str, exc);
        this.f30680o0 = num;
        this.f30681p0 = str;
        this.f30682q0 = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10343M)) {
            return false;
        }
        C10343M c10343m = (C10343M) obj;
        return AbstractC16544l.m18089b(this.f30680o0, c10343m.f30680o0) && AbstractC16544l.m18089b(this.f30681p0, c10343m.f30681p0) && AbstractC16544l.m18089b(this.f30682q0, c10343m.f30682q0);
    }

    @Override // p624Zg.AbstractC10345O, java.lang.Throwable
    public final Throwable getCause() {
        return this.f30682q0;
    }

    @Override // p624Zg.AbstractC10345O, java.lang.Throwable
    public final String getMessage() {
        return this.f30681p0;
    }

    public final int hashCode() {
        Integer num = this.f30680o0;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f30681p0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.f30682q0;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "█";
    }
}
