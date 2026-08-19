package p374P5;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0829m;

/* JADX INFO: renamed from: P5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6350c implements InterfaceC6357j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0829m f20618a;

    /* JADX INFO: renamed from: b */
    public final C6354g f20619b;

    /* JADX INFO: renamed from: c */
    public final Throwable f20620c;

    public C6350c(InterfaceC0829m interfaceC0829m, C6354g c6354g, Throwable th2) {
        this.f20618a = interfaceC0829m;
        this.f20619b = c6354g;
        this.f20620c = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6350c)) {
            return false;
        }
        C6350c c6350c = (C6350c) obj;
        return AbstractC16544l.m18089b(this.f20618a, c6350c.f20618a) && AbstractC16544l.m18089b(this.f20619b, c6350c.f20619b) && AbstractC16544l.m18089b(this.f20620c, c6350c.f20620c);
    }

    @Override // p374P5.InterfaceC6357j
    public final C6354g getRequest() {
        return this.f20619b;
    }

    public final int hashCode() {
        InterfaceC0829m interfaceC0829m = this.f20618a;
        return this.f20620c.hashCode() + ((this.f20619b.hashCode() + ((interfaceC0829m == null ? 0 : interfaceC0829m.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f20618a + ", request=" + this.f20619b + ", throwable=" + this.f20620c + ')';
    }
}
