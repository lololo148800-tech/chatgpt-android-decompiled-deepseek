package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11093b {

    /* JADX INFO: renamed from: a */
    public final int f33464a;

    /* JADX INFO: renamed from: b */
    public final Method f33465b;

    public C11093b(int i10, Method method) {
        this.f33464a = i10;
        this.f33465b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11093b)) {
            return false;
        }
        C11093b c11093b = (C11093b) obj;
        return this.f33464a == c11093b.f33464a && this.f33465b.getName().equals(c11093b.f33465b.getName());
    }

    public final int hashCode() {
        return this.f33465b.getName().hashCode() + (this.f33464a * 31);
    }
}
