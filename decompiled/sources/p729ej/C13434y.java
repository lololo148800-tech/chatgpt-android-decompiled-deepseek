package p729ej;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ej.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C13434y {

    /* JADX INFO: renamed from: a */
    public final Object f42531a;

    public C13434y(Object obj) {
        this.f42531a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13434y)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f42531a, ((C13434y) obj).f42531a);
    }

    public final int hashCode() {
        Object obj = this.f42531a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "WorkflowOutput(" + this.f42531a + ')';
    }
}
