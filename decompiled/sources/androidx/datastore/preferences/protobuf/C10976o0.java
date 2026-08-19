package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10976o0 extends AbstractC10980q0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10976o0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f33077b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: c */
    public final boolean mo11674c(long j10, Object obj) {
        switch (this.f33077b) {
            case 0:
                if (AbstractC10982r0.f33093h) {
                    if (AbstractC10982r0.m11698g(j10, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC10982r0.m11699h(j10, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC10982r0.f33093h) {
                    if (AbstractC10982r0.m11698g(j10, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC10982r0.m11699h(j10, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: d */
    public final byte mo11675d(long j10, Object obj) {
        switch (this.f33077b) {
            case 0:
                return AbstractC10982r0.f33093h ? AbstractC10982r0.m11698g(j10, obj) : AbstractC10982r0.m11699h(j10, obj);
            default:
                return AbstractC10982r0.f33093h ? AbstractC10982r0.m11698g(j10, obj) : AbstractC10982r0.m11699h(j10, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: e */
    public final double mo11676e(long j10, Object obj) {
        switch (this.f33077b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(m11686h(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: f */
    public final float mo11677f(long j10, Object obj) {
        switch (this.f33077b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(m11685g(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: k */
    public final void mo11678k(Object obj, long j10, boolean z6) {
        switch (this.f33077b) {
            case 0:
                if (!AbstractC10982r0.f33093h) {
                    AbstractC10982r0.m11706o(obj, j10, z6 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC10982r0.m11705n(obj, j10, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC10982r0.f33093h) {
                    AbstractC10982r0.m11706o(obj, j10, z6 ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC10982r0.m11705n(obj, j10, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: l */
    public final void mo11679l(Object obj, long j10, byte b) {
        switch (this.f33077b) {
            case 0:
                if (!AbstractC10982r0.f33093h) {
                    AbstractC10982r0.m11706o(obj, j10, b);
                } else {
                    AbstractC10982r0.m11705n(obj, j10, b);
                }
                break;
            default:
                if (!AbstractC10982r0.f33093h) {
                    AbstractC10982r0.m11706o(obj, j10, b);
                } else {
                    AbstractC10982r0.m11705n(obj, j10, b);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: m */
    public final void mo11680m(Object obj, long j10, double d10) {
        switch (this.f33077b) {
            case 0:
                m11690p(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                m11690p(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: n */
    public final void mo11681n(Object obj, long j10, float f10) {
        switch (this.f33077b) {
            case 0:
                m11689o(j10, obj, Float.floatToIntBits(f10));
                break;
            default:
                m11689o(j10, obj, Float.floatToIntBits(f10));
                break;
        }
    }
}
