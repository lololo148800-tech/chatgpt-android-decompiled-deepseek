package p776h3;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: h3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14389c {

    /* JADX INFO: renamed from: c */
    public static final C14389c f45116c = new C14389c(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f45117a;

    /* JADX INFO: renamed from: b */
    public final int f45118b;

    public C14389c(int i10, int i11) {
        this.f45117a = i10;
        this.f45118b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14389c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        C14389c c14389c = (C14389c) obj;
        return C14387a.m15890b(this.f45117a, c14389c.f45117a) && C14388b.m15893b(this.f45118b, c14389c.f45118b);
    }

    public final int hashCode() {
        return (this.f45117a * 31) + this.f45118b;
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C14387a.m15891c(this.f45117a)) + ", vertical=" + ((Object) C14388b.m15894c(this.f45118b)) + ')';
    }
}
