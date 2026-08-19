package p080D0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.InterfaceC16538f;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1765B implements InterfaceC1818n, InterfaceC16538f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1426a f5040Y;

    public C1765B(InterfaceC1426a interfaceC1426a) {
        this.f5040Y = interfaceC1426a;
    }

    @Override // p080D0.InterfaceC1818n
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long mo2571a() {
        return ((C13800b) this.f5040Y.invoke()).f43584a;
    }

    @Override // kotlin.jvm.internal.InterfaceC16538f
    /* JADX INFO: renamed from: b */
    public final InterfaceC17302e mo2443b() {
        return this.f5040Y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1818n) || !(obj instanceof InterfaceC16538f)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f5040Y, ((InterfaceC16538f) obj).mo2443b());
    }

    public final int hashCode() {
        return this.f5040Y.hashCode();
    }
}
