package p505Uf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Uf.q */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7656q {
    public static final C7655p Companion = new C7655p();

    /* JADX INFO: renamed from: a */
    public final String f24178a;

    /* JADX INFO: renamed from: b */
    public final String f24179b;

    public C7656q(String token) {
        AbstractC16544l.m18094g(token, "token");
        this.f24178a = token;
        this.f24179b = "android";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7656q)) {
            return false;
        }
        C7656q c7656q = (C7656q) obj;
        return AbstractC16544l.m18089b(this.f24178a, c7656q.f24178a) && AbstractC16544l.m18089b(this.f24179b, c7656q.f24179b);
    }

    public final int hashCode() {
        return this.f24179b.hashCode() + (this.f24178a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C7656q(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C7654o.f24177a.getDescriptor());
            throw null;
        }
        this.f24178a = str;
        if ((i10 & 2) == 0) {
            this.f24179b = "android";
        } else {
            this.f24179b = str2;
        }
    }
}
