package p467T1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p228J.AbstractC3794B0;
import p774h1.AbstractC14337O;
import p774h1.AbstractC14360p;
import p774h1.C14365u;

/* JADX INFO: renamed from: T1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7192b implements InterfaceC7204n {

    /* JADX INFO: renamed from: a */
    public final AbstractC14337O f22847a;

    /* JADX INFO: renamed from: b */
    public final float f22848b;

    public C7192b(AbstractC14337O abstractC14337O, float f10) {
        this.f22847a = abstractC14337O;
        this.f22848b = f10;
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: a */
    public final float mo7587a() {
        return this.f22848b;
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: b */
    public final long mo7588b() {
        int i10 = C14365u.f45061k;
        return C14365u.f45060j;
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: c */
    public final InterfaceC7204n mo7589c(InterfaceC1426a interfaceC1426a) {
        return !equals(C7202l.f22868a) ? this : (InterfaceC7204n) interfaceC1426a.invoke();
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC7204n mo7590d(InterfaceC7204n interfaceC7204n) {
        return AbstractC3794B0.m4484i(this, interfaceC7204n);
    }

    @Override // p467T1.InterfaceC7204n
    /* JADX INFO: renamed from: e */
    public final AbstractC14360p mo7591e() {
        return this.f22847a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7192b)) {
            return false;
        }
        C7192b c7192b = (C7192b) obj;
        return AbstractC16544l.m18089b(this.f22847a, c7192b.f22847a) && Float.compare(this.f22848b, c7192b.f22848b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22848b) + (this.f22847a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f22847a);
        sb2.append(", alpha=");
        return AbstractC12107L1.m13825p(sb2, this.f22848b, ')');
    }
}
