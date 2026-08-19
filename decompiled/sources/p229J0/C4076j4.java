package p229J0;

import kotlin.jvm.internal.AbstractC16552t;
import kotlin.jvm.internal.InterfaceC16538f;
import mm.InterfaceC17302e;
import p774h1.C14365u;
import p774h1.InterfaceC14366v;

/* JADX INFO: renamed from: J0.j4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4076j4 implements InterfaceC14366v, InterfaceC16538f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC16552t f12986Y;

    public C4076j4(AbstractC16552t abstractC16552t) {
        this.f12986Y = abstractC16552t;
    }

    @Override // p774h1.InterfaceC14366v
    /* JADX INFO: renamed from: a */
    public final long mo4719a() {
        return ((C14365u) this.f12986Y.get()).f45062a;
    }

    @Override // kotlin.jvm.internal.InterfaceC16538f
    /* JADX INFO: renamed from: b */
    public final InterfaceC17302e mo2443b() {
        return this.f12986Y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC14366v) || !(obj instanceof InterfaceC16538f)) {
            return false;
        }
        return this.f12986Y.equals(((InterfaceC16538f) obj).mo2443b());
    }

    public final int hashCode() {
        return this.f12986Y.hashCode();
    }
}
