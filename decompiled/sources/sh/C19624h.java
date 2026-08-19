package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C19624h implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19632l f62250a;

    public C19624h(C19632l c19632l) {
        this.f62250a = c19632l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19624h) && AbstractC16544l.m18089b(this.f62250a, ((C19624h) obj).f62250a);
    }

    public final int hashCode() {
        C19632l c19632l = this.f62250a;
        if (c19632l == null) {
            return 0;
        }
        return c19632l.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
