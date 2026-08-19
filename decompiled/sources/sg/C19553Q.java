package sg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sg.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19553Q implements InterfaceC19558W {

    /* JADX INFO: renamed from: a */
    public final C19575q f62105a;

    public C19553Q(C19575q c19575q) {
        this.f62105a = c19575q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19553Q) && AbstractC16544l.m18089b(this.f62105a, ((C19553Q) obj).f62105a);
    }

    public final int hashCode() {
        return this.f62105a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
