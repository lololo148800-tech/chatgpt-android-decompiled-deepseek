package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10980q0 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f33083a;

    public AbstractC10980q0(Unsafe unsafe) {
        this.f33083a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m11683a(Class cls) {
        return this.f33083a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m11684b(Class cls) {
        return this.f33083a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo11674c(long j10, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract byte mo11675d(long j10, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract double mo11676e(long j10, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract float mo11677f(long j10, Object obj);

    /* JADX INFO: renamed from: g */
    public final int m11685g(long j10, Object obj) {
        return this.f33083a.getInt(obj, j10);
    }

    /* JADX INFO: renamed from: h */
    public final long m11686h(long j10, Object obj) {
        return this.f33083a.getLong(obj, j10);
    }

    /* JADX INFO: renamed from: i */
    public final Object m11687i(long j10, Object obj) {
        return this.f33083a.getObject(obj, j10);
    }

    /* JADX INFO: renamed from: j */
    public final long m11688j(Field field) {
        return this.f33083a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo11678k(Object obj, long j10, boolean z6);

    /* JADX INFO: renamed from: l */
    public abstract void mo11679l(Object obj, long j10, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo11680m(Object obj, long j10, double d10);

    /* JADX INFO: renamed from: n */
    public abstract void mo11681n(Object obj, long j10, float f10);

    /* JADX INFO: renamed from: o */
    public final void m11689o(long j10, Object obj, int i10) {
        this.f33083a.putInt(obj, j10, i10);
    }

    /* JADX INFO: renamed from: p */
    public final void m11690p(Object obj, long j10, long j11) {
        this.f33083a.putLong(obj, j10, j11);
    }

    /* JADX INFO: renamed from: q */
    public final void m11691q(long j10, Object obj, Object obj2) {
        this.f33083a.putObject(obj, j10, obj2);
    }
}
