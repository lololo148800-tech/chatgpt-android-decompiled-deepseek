package sh;

import java.util.ArrayList;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C19644v implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62295a;

    public C19644v(ArrayList arrayList) {
        this.f62295a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19644v) && this.f62295a.equals(((C19644v) obj).f62295a);
    }

    public final int hashCode() {
        return this.f62295a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
