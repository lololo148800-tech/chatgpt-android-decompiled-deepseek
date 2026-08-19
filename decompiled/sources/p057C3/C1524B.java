package p057C3;

/* JADX INFO: renamed from: C3.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1524B implements InterfaceC1551b0 {

    /* JADX INFO: renamed from: Y */
    public C1524B f4047Y;

    /* JADX INFO: renamed from: Z */
    public C1524B f4048Z;

    @Override // p057C3.InterfaceC1551b0
    /* JADX INFO: renamed from: a */
    public final void mo2224a(int i10, Object obj) {
        if (i10 == 7) {
            this.f4047Y = (C1524B) obj;
        } else if (i10 == 8) {
            this.f4048Z = (C1524B) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2225b(long j10, float[] fArr) {
        C1524B c1524b = this.f4048Z;
        if (c1524b != null) {
            c1524b.m2225b(j10, fArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2226c() {
        C1524B c1524b = this.f4048Z;
        if (c1524b != null) {
            c1524b.m2226c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2227d(long j10, long j11) {
        C1524B c1524b = this.f4047Y;
        if (c1524b != null) {
            c1524b.m2227d(j10, j11);
        }
    }
}
