package p801i5;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: i5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14932d implements InterfaceC14933e {

    /* JADX INFO: renamed from: b */
    public final Object f46522b;

    public final boolean equals(Object obj) {
        if (obj instanceof C14932d) {
            return AbstractC16544l.m18089b(this.f46522b, ((C14932d) obj).f46522b);
        }
        return false;
    }

    @Override // p801i5.InterfaceC14933e
    public final Object getValue() {
        return this.f46522b;
    }

    public final int hashCode() {
        Object obj = this.f46522b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.f46522b + ')';
    }
}
