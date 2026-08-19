package p943p7;

import p633a.AbstractC10441a;

/* JADX INFO: renamed from: p7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18307e extends AbstractC10441a {

    /* JADX INFO: renamed from: a */
    public final int f58433a;

    public C18307e(int i10) {
        this.f58433a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18307e) && this.f58433a == ((C18307e) obj).f58433a;
    }

    public final int hashCode() {
        return this.f58433a;
    }

    public final String toString() {
        return "intake-code-" + this.f58433a;
    }
}
