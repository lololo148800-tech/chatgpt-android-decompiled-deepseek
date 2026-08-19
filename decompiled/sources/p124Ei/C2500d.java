package p124Ei;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p855kj.AbstractC16428g;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ei.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2500d {

    /* JADX INFO: renamed from: a */
    public final boolean f7788a;

    /* JADX INFO: renamed from: b */
    public final boolean f7789b;

    /* JADX INFO: renamed from: c */
    public final AbstractC16428g f7790c;

    /* JADX INFO: renamed from: d */
    public final List f7791d;

    public C2500d(boolean z6, boolean z10, AbstractC16428g abstractC16428g, List availableDevices) {
        AbstractC16544l.m18094g(availableDevices, "availableDevices");
        this.f7788a = z6;
        this.f7789b = z10;
        this.f7790c = abstractC16428g;
        this.f7791d = availableDevices;
    }

    /* JADX INFO: renamed from: a */
    public static C2500d m3585a(C2500d c2500d, boolean z6, AbstractC16428g abstractC16428g, List availableDevices, int i10) {
        boolean z10 = c2500d.f7788a;
        if ((i10 & 2) != 0) {
            z6 = c2500d.f7789b;
        }
        if ((i10 & 4) != 0) {
            abstractC16428g = c2500d.f7790c;
        }
        if ((i10 & 8) != 0) {
            availableDevices = c2500d.f7791d;
        }
        c2500d.getClass();
        AbstractC16544l.m18094g(availableDevices, "availableDevices");
        return new C2500d(z10, z6, abstractC16428g, availableDevices);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2500d)) {
            return false;
        }
        C2500d c2500d = (C2500d) obj;
        return this.f7788a == c2500d.f7788a && this.f7789b == c2500d.f7789b && AbstractC16544l.m18089b(this.f7790c, c2500d.f7790c) && AbstractC16544l.m18089b(this.f7791d, c2500d.f7791d);
    }

    public final int hashCode() {
        int i10 = (((this.f7788a ? 1231 : 1237) * 31) + (this.f7789b ? 1231 : 1237)) * 31;
        AbstractC16428g abstractC16428g = this.f7790c;
        return this.f7791d.hashCode() + ((i10 + (abstractC16428g == null ? 0 : abstractC16428g.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C2500d(boolean z6, int i10) {
        this((i10 & 1) != 0 ? false : z6, false, null, C17689w.f56480Y);
    }
}
