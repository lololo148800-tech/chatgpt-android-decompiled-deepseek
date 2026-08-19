package p228J;

import p158G3.C2988g;
import p178H.C3146g0;
import p178H.InterfaceC3148h0;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: J.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3874z implements InterfaceC3148h0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f11715b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3148h0 f11716c;

    public C3874z(long j10, int i10) {
        this.f11715b = i10;
        switch (i10) {
            case 1:
                this.f11716c = new C3792A0(j10, new C3872y(j10));
                break;
            default:
                this.f11716c = new C3874z(j10, 1);
                break;
        }
    }

    @Override // p178H.InterfaceC3148h0
    /* JADX INFO: renamed from: a */
    public final long mo3985a() {
        switch (this.f11715b) {
            case 0:
                return ((C3792A0) ((C3874z) this.f11716c).f11716c).f11463b;
            default:
                return ((C3792A0) this.f11716c).f11463b;
        }
    }

    @Override // p178H.InterfaceC3148h0
    /* JADX INFO: renamed from: b */
    public final C3146g0 mo3986b(C2988g c2988g) {
        switch (this.f11715b) {
            case 0:
                if (((C3792A0) ((C3874z) this.f11716c).f11716c).mo3986b(c2988g).f9469b) {
                    return C3146g0.f9466e;
                }
                Throwable th2 = (Throwable) c2988g.f8972c;
                if (th2 instanceof C3795C) {
                    AbstractC8072d6.m8487d("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((C3795C) th2).f11471Y > 0) {
                        return C3146g0.f9467f;
                    }
                }
                return C3146g0.f9465d;
            default:
                return ((C3792A0) this.f11716c).mo3986b(c2988g);
        }
    }
}
