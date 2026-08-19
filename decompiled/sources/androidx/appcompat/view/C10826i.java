package androidx.appcompat.view;

import p523V9.AbstractC8162p0;
import p999s.C19330Y0;

/* JADX INFO: renamed from: androidx.appcompat.view.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10826i extends AbstractC8162p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32134a;

    /* JADX INFO: renamed from: b */
    public boolean f32135b;

    /* JADX INFO: renamed from: c */
    public int f32136c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f32137d;

    public C10826i(C10827j c10827j) {
        this.f32134a = 0;
        this.f32137d = c10827j;
        this.f32135b = false;
        this.f32136c = 0;
    }

    @Override // p523V9.AbstractC8162p0, p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: a */
    public void mo1607a() {
        switch (this.f32134a) {
            case 1:
                this.f32135b = true;
                break;
        }
    }

    @Override // p523V9.AbstractC8162p0, p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: b */
    public final void mo1608b() {
        switch (this.f32134a) {
            case 0:
                if (!this.f32135b) {
                    this.f32135b = true;
                    AbstractC8162p0 abstractC8162p0 = ((C10827j) this.f32137d).f32141d;
                    if (abstractC8162p0 != null) {
                        abstractC8162p0.mo1608b();
                    }
                    break;
                }
                break;
            default:
                ((C19330Y0) this.f32137d).f61223a.setVisibility(0);
                break;
        }
    }

    @Override // p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: c */
    public final void mo1609c() {
        switch (this.f32134a) {
            case 0:
                int i10 = this.f32136c + 1;
                this.f32136c = i10;
                C10827j c10827j = (C10827j) this.f32137d;
                if (i10 == c10827j.f32138a.size()) {
                    AbstractC8162p0 abstractC8162p0 = c10827j.f32141d;
                    if (abstractC8162p0 != null) {
                        abstractC8162p0.mo1609c();
                    }
                    this.f32136c = 0;
                    this.f32135b = false;
                    c10827j.f32142e = false;
                }
                break;
            default:
                if (!this.f32135b) {
                    ((C19330Y0) this.f32137d).f61223a.setVisibility(this.f32136c);
                }
                break;
        }
    }

    public C10826i(C19330Y0 c19330y0, int i10) {
        this.f32134a = 1;
        this.f32137d = c19330y0;
        this.f32136c = i10;
        this.f32135b = false;
    }
}
