package nf;

import java.util.ArrayList;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: nf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C17609h implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final ArrayList f56366a;

    public C17609h(ArrayList arrayList) {
        this.f56366a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17609h) && this.f56366a.equals(((C17609h) obj).f56366a);
    }

    public final int hashCode() {
        return this.f56366a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
