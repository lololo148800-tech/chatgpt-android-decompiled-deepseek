package p615Z6;

import java.util.ArrayList;
import p239Ja.C4312o;

/* JADX INFO: renamed from: Z6.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10236r0 implements InterfaceC10186K {

    /* JADX INFO: renamed from: a */
    public final ArrayList f30394a;

    /* JADX INFO: renamed from: b */
    public float f30395b;

    /* JADX INFO: renamed from: c */
    public float f30396c;

    /* JADX INFO: renamed from: d */
    public C10238s0 f30397d;

    /* JADX INFO: renamed from: e */
    public boolean f30398e;

    /* JADX INFO: renamed from: f */
    public boolean f30399f;

    /* JADX INFO: renamed from: g */
    public int f30400g;

    /* JADX INFO: renamed from: h */
    public boolean f30401h;

    public C10236r0(C10252z0 c10252z0, C4312o c4312o) {
        ArrayList arrayList = new ArrayList();
        this.f30394a = arrayList;
        this.f30397d = null;
        this.f30398e = false;
        this.f30399f = true;
        this.f30400g = -1;
        if (c4312o == null) {
            return;
        }
        c4312o.m5099r(this);
        if (this.f30401h) {
            this.f30397d.m10799b((C10238s0) arrayList.get(this.f30400g));
            arrayList.set(this.f30400g, this.f30397d);
            this.f30401h = false;
        }
        C10238s0 c10238s0 = this.f30397d;
        if (c10238s0 != null) {
            arrayList.add(c10238s0);
        }
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: a */
    public final void mo5082a(float f10, float f11, float f12, float f13) {
        this.f30397d.m10798a(f10, f11);
        this.f30394a.add(this.f30397d);
        this.f30397d = new C10238s0(f12, f13, f12 - f10, f13 - f11);
        this.f30401h = false;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: b */
    public final void mo5083b(float f10, float f11) {
        boolean z6 = this.f30401h;
        ArrayList arrayList = this.f30394a;
        if (z6) {
            this.f30397d.m10799b((C10238s0) arrayList.get(this.f30400g));
            arrayList.set(this.f30400g, this.f30397d);
            this.f30401h = false;
        }
        C10238s0 c10238s0 = this.f30397d;
        if (c10238s0 != null) {
            arrayList.add(c10238s0);
        }
        this.f30395b = f10;
        this.f30396c = f11;
        this.f30397d = new C10238s0(f10, f11, 0.0f, 0.0f);
        this.f30400g = arrayList.size();
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: c */
    public final void mo5084c(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f30399f || this.f30398e) {
            this.f30397d.m10798a(f10, f11);
            this.f30394a.add(this.f30397d);
            this.f30398e = false;
        }
        this.f30397d = new C10238s0(f14, f15, f14 - f12, f15 - f13);
        this.f30401h = false;
    }

    @Override // p615Z6.InterfaceC10186K
    public final void close() {
        this.f30394a.add(this.f30397d);
        mo5086e(this.f30395b, this.f30396c);
        this.f30401h = true;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: d */
    public final void mo5085d(float f10, float f11, float f12, boolean z6, boolean z10, float f13, float f14) {
        this.f30398e = true;
        this.f30399f = false;
        C10238s0 c10238s0 = this.f30397d;
        C10252z0.m10805a(c10238s0.f30405a, c10238s0.f30406b, f10, f11, f12, z6, z10, f13, f14, this);
        this.f30399f = true;
        this.f30401h = false;
    }

    @Override // p615Z6.InterfaceC10186K
    /* JADX INFO: renamed from: e */
    public final void mo5086e(float f10, float f11) {
        this.f30397d.m10798a(f10, f11);
        this.f30394a.add(this.f30397d);
        C10238s0 c10238s0 = this.f30397d;
        this.f30397d = new C10238s0(f10, f11, f10 - c10238s0.f30405a, f11 - c10238s0.f30406b);
        this.f30401h = false;
    }
}
