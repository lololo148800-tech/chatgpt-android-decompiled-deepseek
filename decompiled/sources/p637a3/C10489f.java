package p637a3;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: a3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10489f implements InterfaceC10497n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10497n f31078a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10497n f31079b;

    public C10489f(InterfaceC10497n interfaceC10497n, InterfaceC10497n interfaceC10497n2) {
        this.f31078a = interfaceC10497n;
        this.f31079b = interfaceC10497n2;
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: a */
    public final boolean mo10951a(InterfaceC1436k interfaceC1436k) {
        return this.f31078a.mo10951a(interfaceC1436k) || this.f31079b.mo10951a(interfaceC1436k);
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC10497n mo10952b(InterfaceC10497n interfaceC10497n) {
        return AbstractC9306j0.m9883b(this, interfaceC10497n);
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: c */
    public final boolean mo10953c() {
        return this.f31078a.mo10953c() && this.f31079b.mo10953c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10489f) {
            C10489f c10489f = (C10489f) obj;
            if (AbstractC16544l.m18089b(this.f31078a, c10489f.f31078a) && AbstractC16544l.m18089b(this.f31079b, c10489f.f31079b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f31079b.hashCode() * 31) + this.f31078a.hashCode();
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: j */
    public final Object mo10954j(Object obj, InterfaceC1439n interfaceC1439n) {
        return this.f31079b.mo10954j(this.f31078a.mo10954j(obj, interfaceC1439n), interfaceC1439n);
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("["), (String) mo10954j("", C10488e.f31071Z), ']');
    }
}
