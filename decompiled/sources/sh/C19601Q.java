package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19601Q implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19603T f62215a;

    public C19601Q(C19603T c19603t) {
        this.f62215a = c19603t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19601Q) && AbstractC16544l.m18089b(this.f62215a, ((C19601Q) obj).f62215a);
    }

    public final int hashCode() {
        C19603T c19603t = this.f62215a;
        if (c19603t == null) {
            return 0;
        }
        return c19603t.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
