package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19610a implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19612b f62230a;

    public C19610a(C19612b c19612b) {
        this.f62230a = c19612b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19610a) && AbstractC16544l.m18089b(this.f62230a, ((C19610a) obj).f62230a);
    }

    public final int hashCode() {
        C19612b c19612b = this.f62230a;
        if (c19612b == null) {
            return 0;
        }
        return c19612b.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
