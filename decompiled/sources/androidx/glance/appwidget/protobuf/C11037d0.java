package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11037d0 extends AbstractC11039e0 {
    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: c */
    public final boolean mo11983c(long j10, Object obj) {
        return this.f33290a.getBoolean(obj, j10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: d */
    public final double mo11984d(long j10, Object obj) {
        return this.f33290a.getDouble(obj, j10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: e */
    public final float mo11985e(long j10, Object obj) {
        return this.f33290a.getFloat(obj, j10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: j */
    public final void mo11986j(Object obj, long j10, boolean z6) {
        this.f33290a.putBoolean(obj, j10, z6);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: k */
    public final void mo11987k(Object obj, long j10, byte b) {
        this.f33290a.putByte(obj, j10, b);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: l */
    public final void mo11988l(Object obj, long j10, double d10) {
        this.f33290a.putDouble(obj, j10, d10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: m */
    public final void mo11989m(Object obj, long j10, float f10) {
        this.f33290a.putFloat(obj, j10, f10);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: q */
    public final boolean mo11991q() {
        if (!super.mo11991q()) {
            return false;
        }
        try {
            Class<?> cls = this.f33290a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            AbstractC11041f0.m12004a(th2);
            return false;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11039e0
    /* JADX INFO: renamed from: r */
    public final boolean mo11990r() {
        Unsafe unsafe = this.f33290a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC11041f0.m12010g() != null) {
                    try {
                        Class<?> cls3 = this.f33290a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        AbstractC11041f0.m12004a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                AbstractC11041f0.m12004a(th3);
            }
        }
        return false;
    }
}
