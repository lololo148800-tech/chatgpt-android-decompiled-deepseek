package p801i5;

import sm.AbstractC19694j;

/* JADX INFO: renamed from: i5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14930b implements InterfaceC14933e {

    /* JADX INFO: renamed from: b */
    public final AbstractC19694j f46520b;

    public final boolean equals(Object obj) {
        if (obj instanceof C14930b) {
            return this.f46520b.equals(((C14930b) obj).f46520b);
        }
        return false;
    }

    @Override // p801i5.InterfaceC14933e
    public final Object getValue() {
        throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
    }

    public final int hashCode() {
        return this.f46520b.hashCode();
    }

    public final String toString() {
        return "AsyncValue(getter=" + this.f46520b + ')';
    }
}
