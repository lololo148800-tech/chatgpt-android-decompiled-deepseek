package p313Mc;

import hm.InterfaceC14537b;
import hm.InterfaceC14539d;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Mc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5317a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC14539d f17501a;

    /* JADX INFO: renamed from: b */
    public final C5317a f17502b;

    /* JADX INFO: renamed from: c */
    public InterfaceC14537b f17503c;

    public C5317a(InterfaceC14539d interfaceC14539d, C5317a c5317a) {
        this.f17501a = interfaceC14539d;
        this.f17502b = c5317a;
    }

    /* JADX INFO: renamed from: a */
    public final void m5875a() {
        InterfaceC14537b interfaceC14537b = this.f17503c;
        if (interfaceC14537b != null) {
            interfaceC14537b.mo3832b();
        } else {
            AbstractC16544l.m18103p("datadogSpan");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C5317a m5876b() {
        InterfaceC14537b interfaceC14537b = null;
        C5317a c5317a = this.f17502b;
        if (c5317a != null) {
            InterfaceC14537b interfaceC14537b2 = c5317a.f17503c;
            if (interfaceC14537b2 == null) {
                AbstractC16544l.m18103p("datadogSpan");
                throw null;
            }
            interfaceC14537b = interfaceC14537b2;
        }
        this.f17503c = this.f17501a.mo3846a(interfaceC14537b).start();
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5317a)) {
            return false;
        }
        C5317a c5317a = (C5317a) obj;
        return AbstractC16544l.m18089b(this.f17501a, c5317a.f17501a) && AbstractC16544l.m18089b(this.f17502b, c5317a.f17502b);
    }

    public final int hashCode() {
        int iHashCode = this.f17501a.hashCode() * 31;
        C5317a c5317a = this.f17502b;
        return iHashCode + (c5317a == null ? 0 : c5317a.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
