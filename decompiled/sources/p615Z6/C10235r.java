package p615Z6;

import android.gov.nist.core.Separators;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p523V9.AbstractC8080e6;

/* JADX INFO: renamed from: Z6.r */
/* JADX INFO: loaded from: classes.dex */
public final class C10235r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30389a = 1;

    /* JADX INFO: renamed from: b */
    public float f30390b;

    /* JADX INFO: renamed from: c */
    public float f30391c;

    /* JADX INFO: renamed from: d */
    public float f30392d;

    /* JADX INFO: renamed from: e */
    public float f30393e;

    public /* synthetic */ C10235r() {
    }

    /* JADX INFO: renamed from: a */
    public void m10794a(float f10, float f11, float f12, float f13) {
        this.f30390b = Math.max(f10, this.f30390b);
        this.f30391c = Math.max(f11, this.f30391c);
        this.f30392d = Math.min(f12, this.f30392d);
        this.f30393e = Math.min(f13, this.f30393e);
    }

    /* JADX INFO: renamed from: b */
    public boolean m10795b() {
        return this.f30390b >= this.f30392d || this.f30391c >= this.f30393e;
    }

    /* JADX INFO: renamed from: c */
    public float m10796c() {
        return this.f30390b + this.f30392d;
    }

    /* JADX INFO: renamed from: d */
    public float m10797d() {
        return this.f30391c + this.f30393e;
    }

    public C10235r(float f10, float f11, float f12, float f13) {
        this.f30390b = f10;
        this.f30391c = f11;
        this.f30392d = f12;
        this.f30393e = f13;
    }

    public final String toString() {
        switch (this.f30389a) {
            case 0:
                return "[" + this.f30390b + Separators.f31991SP + this.f30391c + Separators.f31991SP + this.f30392d + Separators.f31991SP + this.f30393e + "]";
            default:
                return QzvfuIgrngtl.AGJlkutSFVNd + AbstractC8080e6.m8508c(this.f30390b) + ", " + AbstractC8080e6.m8508c(this.f30391c) + ", " + AbstractC8080e6.m8508c(this.f30392d) + ", " + AbstractC8080e6.m8508c(this.f30393e) + ')';
        }
    }

    public C10235r(C10235r c10235r) {
        this.f30390b = c10235r.f30390b;
        this.f30391c = c10235r.f30391c;
        this.f30392d = c10235r.f30392d;
        this.f30393e = c10235r.f30393e;
    }
}
