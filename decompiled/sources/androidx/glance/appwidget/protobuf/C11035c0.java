package androidx.glance.appwidget.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11035c0 extends AbstractC11039e0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11035c0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f33288b = i10;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: c */
    public final boolean mo11983c(long j10, Object obj) {
        switch (this.f33288b) {
            case 0:
                return AbstractC11041f0.f33299g ? AbstractC11041f0.m12005b(j10, obj) : AbstractC11041f0.m12006c(j10, obj);
            default:
                return AbstractC11041f0.f33299g ? AbstractC11041f0.m12005b(j10, obj) : AbstractC11041f0.m12006c(j10, obj);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: d */
    public final double mo11984d(long j10, Object obj) {
        switch (this.f33288b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m11995g(j10, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: e */
    public final float mo11985e(long j10, Object obj) {
        switch (this.f33288b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m11994f(j10, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: j */
    public final void mo11986j(Object obj, long j10, boolean z6) {
        switch (this.f33288b) {
            case 0:
                if (!AbstractC11041f0.f33299g) {
                    AbstractC11041f0.m12015l(obj, j10, z6 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC11041f0.m12014k(obj, j10, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC11041f0.f33299g) {
                    AbstractC11041f0.m12015l(obj, j10, z6 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC11041f0.m12014k(obj, j10, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: k */
    public final void mo11987k(Object obj, long j10, byte b) {
        switch (this.f33288b) {
            case 0:
                if (!AbstractC11041f0.f33299g) {
                    AbstractC11041f0.m12015l(obj, j10, b);
                } else {
                    AbstractC11041f0.m12014k(obj, j10, b);
                }
                break;
            default:
                if (!AbstractC11041f0.f33299g) {
                    AbstractC11041f0.m12015l(obj, j10, b);
                } else {
                    AbstractC11041f0.m12014k(obj, j10, b);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: l */
    public final void mo11988l(Object obj, long j10, double d10) {
        switch (this.f33288b) {
            case 0:
                m11999o(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                m11999o(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: m */
    public final void mo11989m(Object obj, long j10, float f10) {
        switch (this.f33288b) {
            case 0:
                m11998n(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                m11998n(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: r */
    public final boolean mo11990r() {
        switch (this.f33288b) {
        }
        return false;
    }
}
