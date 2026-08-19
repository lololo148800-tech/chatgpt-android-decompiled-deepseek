package androidx.glance.appwidget.protobuf;

import p003A1.AbstractC0168G;
import p370P0.C6277D;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.O */
/* JADX INFO: loaded from: classes.dex */
public final class C11019O implements InterfaceC11026W {

    /* JADX INFO: renamed from: a */
    public final AbstractC11059u f33261a;

    /* JADX INFO: renamed from: b */
    public final C11031a0 f33262b;

    /* JADX INFO: renamed from: c */
    public final C11052n f33263c;

    public C11019O(C11031a0 c11031a0, C11052n c11052n, AbstractC11059u abstractC11059u) {
        this.f33262b = c11031a0;
        c11052n.getClass();
        this.f33263c = c11052n;
        this.f33261a = abstractC11059u;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: a */
    public final void mo11897a(Object obj) {
        this.f33262b.getClass();
        C11031a0.m11978b(obj);
        this.f33263c.getClass();
        AbstractC0168G.m507B(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: b */
    public final boolean mo11898b(Object obj) {
        this.f33263c.getClass();
        AbstractC0168G.m507B(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: c */
    public final AbstractC11059u mo11899c() {
        AbstractC11059u abstractC11059u = this.f33261a;
        return abstractC11059u instanceof AbstractC11059u ? abstractC11059u.m12104j() : ((AbstractC11057s) abstractC11059u.mo12101d(5)).m12093b();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: d */
    public final void mo11900d(Object obj, Object obj2) {
        AbstractC11027X.m11926A(this.f33262b, obj, obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: e */
    public final int mo11901e(AbstractC11059u abstractC11059u) {
        this.f33262b.getClass();
        C11029Z c11029z = abstractC11059u.unknownFields;
        int i10 = c11029z.f33283d;
        if (i10 != -1) {
            return i10;
        }
        int iM12051k = 0;
        for (int i11 = 0; i11 < c11029z.f33280a; i11++) {
            int i12 = c11029z.f33281b[i11] >>> 3;
            iM12051k += C11048j.m12051k(3, (C11042g) c11029z.f33282c[i11]) + C11048j.m12046B(2, i12) + (C11048j.m12045A(1) * 2);
        }
        c11029z.f33283d = iM12051k;
        return iM12051k;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: f */
    public final int mo11902f(AbstractC11059u abstractC11059u) {
        this.f33262b.getClass();
        return abstractC11059u.unknownFields.hashCode();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: g */
    public final boolean mo11903g(AbstractC11059u abstractC11059u, Object obj) {
        this.f33262b.getClass();
        return abstractC11059u.unknownFields.equals(((AbstractC11059u) obj).unknownFields);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: h */
    public final void mo11904h(Object obj, C6277D c6277d, C11051m c11051m) {
        this.f33262b.getClass();
        C11031a0.m11977a(obj);
        this.f33263c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC11026W
    /* JADX INFO: renamed from: i */
    public final void mo11905i(Object obj, C11012H c11012h) {
        this.f33263c.getClass();
        AbstractC0168G.m507B(obj);
        throw null;
    }
}
