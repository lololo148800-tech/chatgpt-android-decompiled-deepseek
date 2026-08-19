package p505Uf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Uf.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7653n {
    public static final C7652m Companion = new C7652m();

    /* JADX INFO: renamed from: a */
    public final String f24175a;

    /* JADX INFO: renamed from: b */
    public final String f24176b;

    public C7653n(String token) {
        AbstractC16544l.m18094g(token, "token");
        this.f24175a = token;
        this.f24176b = "android";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7653n)) {
            return false;
        }
        C7653n c7653n = (C7653n) obj;
        return AbstractC16544l.m18089b(this.f24175a, c7653n.f24175a) && AbstractC16544l.m18089b(this.f24176b, c7653n.f24176b);
    }

    public final int hashCode() {
        return this.f24176b.hashCode() + (this.f24175a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C7653n(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C7651l.f24174a.getDescriptor());
            throw null;
        }
        this.f24175a = str;
        if ((i10 & 2) == 0) {
            this.f24176b = "android";
        } else {
            this.f24176b = str2;
        }
    }
}
