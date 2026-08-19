package androidx.datastore.preferences.protobuf;

import p003A1.AbstractC0168G;
import p370P0.C6277D;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.S */
/* JADX INFO: loaded from: classes.dex */
public final class C10939S implements InterfaceC10948a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC10987u f32998a;

    /* JADX INFO: renamed from: b */
    public final C10966j0 f32999b;

    /* JADX INFO: renamed from: c */
    public final C10971m f33000c;

    public C10939S(C10966j0 c10966j0, C10971m c10971m, AbstractC10987u abstractC10987u) {
        this.f32999b = c10966j0;
        c10971m.getClass();
        this.f33000c = c10971m;
        this.f32998a = abstractC10987u;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: a */
    public final void mo11493a(Object obj) {
        this.f32999b.getClass();
        ((AbstractC10987u) obj).unknownFields.f33064e = false;
        this.f33000c.getClass();
        AbstractC0168G.m507B(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: b */
    public final boolean mo11494b(Object obj) {
        this.f33000c.getClass();
        AbstractC0168G.m507B(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: c */
    public final Object mo11495c() {
        return ((AbstractC10983s) this.f32998a.mo7129d(5)).m11712b();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: d */
    public final void mo11496d(Object obj, C10930I c10930i) {
        this.f33000c.getClass();
        AbstractC0168G.m507B(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: e */
    public final int mo11497e(AbstractC10947a abstractC10947a) {
        this.f32999b.getClass();
        C10964i0 c10964i0 = ((AbstractC10987u) abstractC10947a).unknownFields;
        int i10 = c10964i0.f33063d;
        if (i10 != -1) {
            return i10;
        }
        int iM11632t = 0;
        for (int i11 = 0; i11 < c10964i0.f33060a; i11++) {
            int i12 = c10964i0.f33061b[i11] >>> 3;
            iM11632t += C10963i.m11632t(3, (C10957f) c10964i0.f33062c[i11]) + C10963i.m11627L(2, i12) + (C10963i.m11626K(1) * 2);
        }
        c10964i0.f33063d = iM11632t;
        return iM11632t;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: f */
    public final void mo11498f(Object obj, C6277D c6277d, C10969l c10969l) {
        this.f32999b.getClass();
        AbstractC10987u abstractC10987u = (AbstractC10987u) obj;
        if (abstractC10987u.unknownFields == C10964i0.f33059f) {
            abstractC10987u.unknownFields = C10964i0.m11664b();
        }
        this.f33000c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: g */
    public final void mo11499g(AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2) {
        AbstractC10950b0.m11526B(this.f32999b, abstractC10987u, abstractC10987u2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: h */
    public final int mo11500h(AbstractC10987u abstractC10987u) {
        this.f32999b.getClass();
        return abstractC10987u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10948a0
    /* JADX INFO: renamed from: i */
    public final boolean mo11501i(AbstractC10987u abstractC10987u, Object obj) {
        this.f32999b.getClass();
        return abstractC10987u.unknownFields.equals(((AbstractC10987u) obj).unknownFields);
    }
}
