package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11057s implements Cloneable {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11059u f33341Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC11059u f33342Z;

    public AbstractC11057s(AbstractC11059u abstractC11059u) {
        this.f33341Y = abstractC11059u;
        if (abstractC11059u.m12102h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f33342Z = abstractC11059u.m12104j();
    }

    /* JADX INFO: renamed from: d */
    public static void m12091d(Object obj, Object obj2) {
        C11023T c11023t = C11023T.f33266c;
        c11023t.getClass();
        c11023t.m11919a(obj.getClass()).mo11900d(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC11059u m12092a() {
        AbstractC11059u abstractC11059uM12093b = m12093b();
        abstractC11059uM12093b.getClass();
        if (AbstractC11059u.m12097g(abstractC11059uM12093b, true)) {
            return abstractC11059uM12093b;
        }
        throw new C11028Y();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC11059u m12093b() {
        if (!this.f33342Z.m12102h()) {
            return this.f33342Z;
        }
        AbstractC11059u abstractC11059u = this.f33342Z;
        abstractC11059u.getClass();
        C11023T c11023t = C11023T.f33266c;
        c11023t.getClass();
        c11023t.m11919a(abstractC11059u.getClass()).mo11897a(abstractC11059u);
        abstractC11059u.m12103i();
        return this.f33342Z;
    }

    /* JADX INFO: renamed from: c */
    public final void m12094c() {
        if (this.f33342Z.m12102h()) {
            return;
        }
        AbstractC11059u abstractC11059uM12104j = this.f33341Y.m12104j();
        m12091d(abstractC11059uM12104j, this.f33342Z);
        this.f33342Z = abstractC11059uM12104j;
    }

    public final Object clone() {
        AbstractC11057s abstractC11057s = (AbstractC11057s) this.f33341Y.mo12101d(5);
        abstractC11057s.f33342Z = m12093b();
        return abstractC11057s;
    }
}
