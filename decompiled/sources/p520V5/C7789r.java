package p520V5;

import p779h6.AbstractC14417f;
import p779h6.ChoreographerFrameCallbackC14415d;

/* JADX INFO: renamed from: V5.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7789r implements InterfaceC7793v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7794w f24622b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f24623c;

    public /* synthetic */ C7789r(C7794w c7794w, float f10, int i10) {
        this.f24621a = i10;
        this.f24622b = c7794w;
        this.f24623c = f10;
    }

    @Override // p520V5.InterfaceC7793v
    public final void run() {
        switch (this.f24621a) {
            case 0:
                C7794w c7794w = this.f24622b;
                C7781j c7781j = c7794w.f24658Y;
                float f10 = this.f24623c;
                if (c7781j != null) {
                    float fM15928e = AbstractC14417f.m15928e(c7781j.f24591l, c7781j.f24592m, f10);
                    ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = c7794w.f24660Z;
                    choreographerFrameCallbackC14415d.m15923i(choreographerFrameCallbackC14415d.f45301v0, fM15928e);
                } else {
                    c7794w.f24668r0.add(new C7789r(c7794w, f10, 0));
                }
                break;
            case 1:
                C7794w c7794w2 = this.f24622b;
                C7781j c7781j2 = c7794w2.f24658Y;
                float f11 = this.f24623c;
                if (c7781j2 != null) {
                    c7794w2.m8070r((int) AbstractC14417f.m15928e(c7781j2.f24591l, c7781j2.f24592m, f11));
                } else {
                    c7794w2.f24668r0.add(new C7789r(c7794w2, f11, 1));
                }
                break;
            default:
                this.f24622b.m8072t(this.f24623c);
                break;
        }
    }
}
