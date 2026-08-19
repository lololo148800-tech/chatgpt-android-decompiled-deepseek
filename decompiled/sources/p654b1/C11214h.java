package p654b1;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p451Sb.C7102a;
import p759g1.C13801c;

/* JADX INFO: renamed from: b1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C11214h {

    /* JADX INFO: renamed from: e */
    public static final C7102a f33887e = new C7102a(23);

    /* JADX INFO: renamed from: f */
    public static int f33888f;

    /* JADX INFO: renamed from: a */
    public final List f33889a;

    /* JADX INFO: renamed from: b */
    public C13801c f33890b = null;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f33891c;

    /* JADX INFO: renamed from: d */
    public final int f33892d;

    public C11214h(List list, InterfaceC1436k interfaceC1436k) {
        int i10;
        this.f33889a = list;
        this.f33891c = interfaceC1436k;
        synchronized (f33887e) {
            i10 = f33888f + 1;
            f33888f = i10;
        }
        this.f33892d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11214h)) {
            return false;
        }
        C11214h c11214h = (C11214h) obj;
        return AbstractC16544l.m18089b(this.f33889a, c11214h.f33889a) && AbstractC16544l.m18089b(this.f33890b, c11214h.f33890b) && this.f33891c == c11214h.f33891c;
    }

    public final int hashCode() {
        int iHashCode = this.f33889a.hashCode() * 31;
        C13801c c13801c = this.f33890b;
        int iHashCode2 = (iHashCode + (c13801c != null ? c13801c.hashCode() : 0)) * 31;
        InterfaceC1436k interfaceC1436k = this.f33891c;
        return iHashCode2 + (interfaceC1436k != null ? interfaceC1436k.hashCode() : 0);
    }
}
