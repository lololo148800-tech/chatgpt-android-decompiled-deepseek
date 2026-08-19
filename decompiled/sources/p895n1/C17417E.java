package p895n1;

import com.google.protobuf.AbstractC12107L1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p466T0.C7181h;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: n1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C17417E extends AbstractC17419G implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final String f55626Y;

    /* JADX INFO: renamed from: Z */
    public final float f55627Z;

    /* JADX INFO: renamed from: o0 */
    public final float f55628o0;

    /* JADX INFO: renamed from: p0 */
    public final float f55629p0;

    /* JADX INFO: renamed from: q0 */
    public final float f55630q0;

    /* JADX INFO: renamed from: r0 */
    public final float f55631r0;

    /* JADX INFO: renamed from: s0 */
    public final float f55632s0;

    /* JADX INFO: renamed from: t0 */
    public final float f55633t0;

    /* JADX INFO: renamed from: u0 */
    public final List f55634u0;

    /* JADX INFO: renamed from: v0 */
    public final List f55635v0;

    public C17417E(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        this.f55626Y = str;
        this.f55627Z = f10;
        this.f55628o0 = f11;
        this.f55629p0 = f12;
        this.f55630q0 = f13;
        this.f55631r0 = f14;
        this.f55632s0 = f15;
        this.f55633t0 = f16;
        this.f55634u0 = list;
        this.f55635v0 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C17417E)) {
            C17417E c17417e = (C17417E) obj;
            return AbstractC16544l.m18089b(this.f55626Y, c17417e.f55626Y) && this.f55627Z == c17417e.f55627Z && this.f55628o0 == c17417e.f55628o0 && this.f55629p0 == c17417e.f55629p0 && this.f55630q0 == c17417e.f55630q0 && this.f55631r0 == c17417e.f55631r0 && this.f55632s0 == c17417e.f55632s0 && this.f55633t0 == c17417e.f55633t0 && AbstractC16544l.m18089b(this.f55634u0, c17417e.f55634u0) && AbstractC16544l.m18089b(this.f55635v0, c17417e.f55635v0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55635v0.hashCode() + AbstractC14376f.m15858x(this.f55634u0, AbstractC12107L1.m13819j(this.f55633t0, AbstractC12107L1.m13819j(this.f55632s0, AbstractC12107L1.m13819j(this.f55631r0, AbstractC12107L1.m13819j(this.f55630q0, AbstractC12107L1.m13819j(this.f55629p0, AbstractC12107L1.m13819j(this.f55628o0, AbstractC12107L1.m13819j(this.f55627Z, this.f55626Y.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7181h(this);
    }
}
