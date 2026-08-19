package p219Ig;

import kotlin.jvm.internal.AbstractC16544l;
import p020Ai.C0515d;
import p544W9.AbstractC8730w;
import p544W9.AbstractC8736x;

/* JADX INFO: renamed from: Ig.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3715d implements InterfaceC3717f {

    /* JADX INFO: renamed from: a */
    public final C0515d f11266a;

    public C3715d(C0515d accountUserState) {
        AbstractC16544l.m18094g(accountUserState, "accountUserState");
        this.f11266a = accountUserState;
    }

    @Override // p219Ig.InterfaceC3717f
    /* JADX INFO: renamed from: a */
    public final C0515d mo4415a() {
        return this.f11266a;
    }

    @Override // p219Ig.InterfaceC3717f
    /* JADX INFO: renamed from: b */
    public final boolean mo4416b() {
        return AbstractC8736x.m9469b(this);
    }

    @Override // p219Ig.InterfaceC3718g
    /* JADX INFO: renamed from: c */
    public final int mo4417c() {
        return AbstractC8730w.m9463c(this);
    }

    @Override // p219Ig.InterfaceC3718g
    /* JADX INFO: renamed from: d */
    public final String mo4418d() {
        return AbstractC8730w.m9462b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3715d) && AbstractC16544l.m18089b(this.f11266a, ((C3715d) obj).f11266a);
    }

    public final int hashCode() {
        return this.f11266a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
