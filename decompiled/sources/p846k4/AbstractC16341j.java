package p846k4;

import io.sentry.C15358g1;
import p1073w3.C20811m;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;

/* JADX INFO: renamed from: k4.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16341j {

    /* JADX INFO: renamed from: b */
    public InterfaceC6316H f50698b;

    /* JADX INFO: renamed from: c */
    public InterfaceC6335q f50699c;

    /* JADX INFO: renamed from: d */
    public InterfaceC16338g f50700d;

    /* JADX INFO: renamed from: e */
    public long f50701e;

    /* JADX INFO: renamed from: f */
    public long f50702f;

    /* JADX INFO: renamed from: g */
    public long f50703g;

    /* JADX INFO: renamed from: h */
    public int f50704h;

    /* JADX INFO: renamed from: i */
    public int f50705i;

    /* JADX INFO: renamed from: k */
    public long f50707k;

    /* JADX INFO: renamed from: l */
    public boolean f50708l;

    /* JADX INFO: renamed from: m */
    public boolean f50709m;

    /* JADX INFO: renamed from: a */
    public final C16336e f50697a = new C16336e();

    /* JADX INFO: renamed from: j */
    public C15358g1 f50706j = new C15358g1();

    /* JADX INFO: renamed from: a */
    public void mo17944a(long j10) {
        this.f50703g = j10;
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo17923b(C20811m c20811m);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo17924c(C20811m c20811m, long j10, C15358g1 c15358g1);

    /* JADX INFO: renamed from: d */
    public void mo17925d(boolean z6) {
        if (z6) {
            this.f50706j = new C15358g1();
            this.f50702f = 0L;
            this.f50704h = 0;
        } else {
            this.f50704h = 1;
        }
        this.f50701e = -1L;
        this.f50703g = 0L;
    }
}
