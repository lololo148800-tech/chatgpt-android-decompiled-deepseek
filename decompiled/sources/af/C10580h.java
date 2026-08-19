package af;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: af.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10580h implements InterfaceC10581i {

    /* JADX INFO: renamed from: a */
    public final String f31424a;

    public C10580h(String str) {
        this.f31424a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10580h) && AbstractC16544l.m18089b(this.f31424a, ((C10580h) obj).f31424a);
    }

    public final int hashCode() {
        String str = this.f31424a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
