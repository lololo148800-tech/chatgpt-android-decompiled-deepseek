package kg;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5554x;

/* JADX INFO: renamed from: kg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16398d implements InterfaceC16403i {

    /* JADX INFO: renamed from: a */
    public final C5554x f50911a;

    public C16398d(C5554x value) {
        AbstractC16544l.m18094g(value, "value");
        this.f50911a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16398d) && AbstractC16544l.m18089b(this.f50911a, ((C16398d) obj).f50911a);
    }

    public final int hashCode() {
        return this.f50911a.f18006Y.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
