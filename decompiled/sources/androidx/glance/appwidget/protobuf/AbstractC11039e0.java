package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import p861l1.xapn.suYVq;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11039e0 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f33290a;

    public AbstractC11039e0(Unsafe unsafe) {
        this.f33290a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m11992a(Class cls) {
        return this.f33290a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m11993b(Class cls) {
        return this.f33290a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo11983c(long j10, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract double mo11984d(long j10, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract float mo11985e(long j10, Object obj);

    /* JADX INFO: renamed from: f */
    public final int m11994f(long j10, Object obj) {
        return this.f33290a.getInt(obj, j10);
    }

    /* JADX INFO: renamed from: g */
    public final long m11995g(long j10, Object obj) {
        return this.f33290a.getLong(obj, j10);
    }

    /* JADX INFO: renamed from: h */
    public final Object m11996h(long j10, Object obj) {
        return this.f33290a.getObject(obj, j10);
    }

    /* JADX INFO: renamed from: i */
    public final long m11997i(Field field) {
        return this.f33290a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo11986j(Object obj, long j10, boolean z6);

    /* JADX INFO: renamed from: k */
    public abstract void mo11987k(Object obj, long j10, byte b);

    /* JADX INFO: renamed from: l */
    public abstract void mo11988l(Object obj, long j10, double d10);

    /* JADX INFO: renamed from: m */
    public abstract void mo11989m(Object obj, long j10, float f10);

    /* JADX INFO: renamed from: n */
    public final void m11998n(long j10, Object obj, int i10) {
        this.f33290a.putInt(obj, j10, i10);
    }

    /* JADX INFO: renamed from: o */
    public final void m11999o(Object obj, long j10, long j11) {
        this.f33290a.putLong(obj, j10, j11);
    }

    /* JADX INFO: renamed from: p */
    public final void m12000p(long j10, Object obj, Object obj2) {
        this.f33290a.putObject(obj, j10, obj2);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo11991q() {
        Unsafe unsafe = this.f33290a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod(suYVq.qJrabVsPi, Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            AbstractC11041f0.m12004a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo11990r();
}
