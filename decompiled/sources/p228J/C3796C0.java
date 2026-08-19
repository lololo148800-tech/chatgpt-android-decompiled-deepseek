package p228J;

import java.util.List;

/* JADX INFO: renamed from: J.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3796C0 {

    /* JADX INFO: renamed from: a */
    public final C3865u0 f11472a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3800E0 f11473b;

    /* JADX INFO: renamed from: c */
    public final C3836g f11474c;

    /* JADX INFO: renamed from: d */
    public final List f11475d;

    /* JADX INFO: renamed from: e */
    public boolean f11476e = false;

    /* JADX INFO: renamed from: f */
    public boolean f11477f = false;

    public C3796C0(C3865u0 c3865u0, InterfaceC3800E0 interfaceC3800E0, C3836g c3836g, List list) {
        this.f11472a = c3865u0;
        this.f11473b = interfaceC3800E0;
        this.f11474c = c3836g;
        this.f11475d = list;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb2.append(this.f11472a);
        sb2.append(", mUseCaseConfig=");
        sb2.append(this.f11473b);
        sb2.append(", mStreamSpec=");
        sb2.append(this.f11474c);
        sb2.append(", mCaptureTypes=");
        sb2.append(this.f11475d);
        sb2.append(", mAttached=");
        sb2.append(this.f11476e);
        sb2.append(", mActive=");
        return AbstractC3794B0.m4499x(sb2, this.f11477f, '}');
    }
}
