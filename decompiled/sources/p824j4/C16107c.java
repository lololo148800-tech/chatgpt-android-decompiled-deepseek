package p824j4;

import p1016t3.C19755E;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;

/* JADX INFO: renamed from: j4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16107c {

    /* JADX INFO: renamed from: a */
    public final int f49887a;

    /* JADX INFO: renamed from: b */
    public int f49888b;

    /* JADX INFO: renamed from: c */
    public int f49889c;

    /* JADX INFO: renamed from: d */
    public long f49890d;

    /* JADX INFO: renamed from: e */
    public final boolean f49891e;

    /* JADX INFO: renamed from: f */
    public final C20811m f49892f;

    /* JADX INFO: renamed from: g */
    public final C20811m f49893g;

    /* JADX INFO: renamed from: h */
    public int f49894h;

    /* JADX INFO: renamed from: i */
    public int f49895i;

    public C16107c(C20811m c20811m, C20811m c20811m2, boolean z6) throws C19755E {
        this.f49893g = c20811m;
        this.f49892f = c20811m2;
        this.f49891e = z6;
        c20811m2.m21344F(12);
        this.f49887a = c20811m2.m21369x();
        c20811m.m21344F(12);
        this.f49895i = c20811m.m21369x();
        AbstractC6320b.m6887c("first_chunk must be 1", c20811m.m21352g() == 1);
        this.f49888b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17655a() {
        int i10 = this.f49888b + 1;
        this.f49888b = i10;
        if (i10 == this.f49887a) {
            return false;
        }
        boolean z6 = this.f49891e;
        C20811m c20811m = this.f49892f;
        this.f49890d = z6 ? c20811m.m21370y() : c20811m.m21367v();
        if (this.f49888b == this.f49894h) {
            C20811m c20811m2 = this.f49893g;
            this.f49889c = c20811m2.m21369x();
            c20811m2.m21345G(4);
            int i11 = this.f49895i - 1;
            this.f49895i = i11;
            this.f49894h = i11 > 0 ? c20811m2.m21369x() - 1 : -1;
        }
        return true;
    }
}
