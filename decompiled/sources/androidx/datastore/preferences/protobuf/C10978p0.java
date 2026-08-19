package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10978p0 extends AbstractC10980q0 {
    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: c */
    public final boolean mo11674c(long j10, Object obj) {
        return this.f33083a.getBoolean(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: d */
    public final byte mo11675d(long j10, Object obj) {
        return this.f33083a.getByte(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: e */
    public final double mo11676e(long j10, Object obj) {
        return this.f33083a.getDouble(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: f */
    public final float mo11677f(long j10, Object obj) {
        return this.f33083a.getFloat(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: k */
    public final void mo11678k(Object obj, long j10, boolean z6) {
        this.f33083a.putBoolean(obj, j10, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: l */
    public final void mo11679l(Object obj, long j10, byte b) {
        this.f33083a.putByte(obj, j10, b);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: m */
    public final void mo11680m(Object obj, long j10, double d10) {
        this.f33083a.putDouble(obj, j10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10980q0
    /* JADX INFO: renamed from: n */
    public final void mo11681n(Object obj, long j10, float f10) {
        this.f33083a.putFloat(obj, j10, f10);
    }
}
