package p1055v4;

import android.util.SparseArray;
import p372P3.C6318J;
import p372P3.InterfaceC6316H;

/* JADX INFO: renamed from: v4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C20442m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6316H f64766a;

    /* JADX INFO: renamed from: b */
    public final boolean f64767b;

    /* JADX INFO: renamed from: c */
    public final boolean f64768c;

    /* JADX INFO: renamed from: f */
    public final C6318J f64771f;

    /* JADX INFO: renamed from: g */
    public byte[] f64772g;

    /* JADX INFO: renamed from: h */
    public int f64773h;

    /* JADX INFO: renamed from: i */
    public int f64774i;

    /* JADX INFO: renamed from: j */
    public long f64775j;

    /* JADX INFO: renamed from: l */
    public long f64777l;

    /* JADX INFO: renamed from: p */
    public long f64781p;

    /* JADX INFO: renamed from: q */
    public long f64782q;

    /* JADX INFO: renamed from: r */
    public boolean f64783r;

    /* JADX INFO: renamed from: s */
    public boolean f64784s;

    /* JADX INFO: renamed from: d */
    public final SparseArray f64769d = new SparseArray();

    /* JADX INFO: renamed from: e */
    public final SparseArray f64770e = new SparseArray();

    /* JADX INFO: renamed from: m */
    public C20441l f64778m = new C20441l();

    /* JADX INFO: renamed from: n */
    public C20441l f64779n = new C20441l();

    /* JADX INFO: renamed from: k */
    public boolean f64776k = false;

    /* JADX INFO: renamed from: o */
    public boolean f64780o = false;

    public C20442m(InterfaceC6316H interfaceC6316H, boolean z6, boolean z10) {
        this.f64766a = interfaceC6316H;
        this.f64767b = z6;
        this.f64768c = z10;
        byte[] bArr = new byte[128];
        this.f64772g = bArr;
        this.f64771f = new C6318J(bArr, 0, 0);
        C20441l c20441l = this.f64779n;
        c20441l.f64751b = false;
        c20441l.f64750a = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m21100a() {
        boolean z6;
        int i10;
        boolean z10 = false;
        if (this.f64767b) {
            C20441l c20441l = this.f64779n;
            z6 = c20441l.f64751b && ((i10 = c20441l.f64754e) == 7 || i10 == 2);
        } else {
            z6 = this.f64784s;
        }
        boolean z11 = this.f64783r;
        int i11 = this.f64774i;
        if (i11 == 5 || (z6 && i11 == 1)) {
            z10 = true;
        }
        this.f64783r = z11 | z10;
    }
}
