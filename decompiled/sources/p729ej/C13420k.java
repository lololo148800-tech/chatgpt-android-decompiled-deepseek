package p729ej;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17314q;
import p026Ao.C0678l;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: ej.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C13420k {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f42501a;

    /* JADX INFO: renamed from: b */
    public final C17314q f42502b = AbstractC9227W.m9800c(new C13419j(this, 0));

    /* JADX WARN: Multi-variable type inference failed */
    public C13420k(InterfaceC1426a interfaceC1426a) {
        this.f42501a = (AbstractC16546n) interfaceC1426a;
    }

    /* JADX INFO: renamed from: a */
    public final C0678l m14962a() {
        return (C0678l) this.f42502b.getValue();
    }

    public final boolean equals(Object obj) {
        C13420k c13420k = obj instanceof C13420k ? (C13420k) obj : null;
        if (c13420k == null) {
            return false;
        }
        return AbstractC16544l.m18089b(m14962a(), c13420k.m14962a());
    }

    public final int hashCode() {
        return m14962a().hashCode();
    }

    public final String toString() {
        return "Snapshot(" + m14962a() + ')';
    }
}
