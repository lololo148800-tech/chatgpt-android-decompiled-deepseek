package p523V9;

import p1104xb.InterfaceC21170a;
import p522V8.C7836c;
import p544W9.C8544Q4;
import p571X9.C9191P4;
import p593Y8.C9689p;
import p594Y9.C9805S4;

/* JADX INFO: renamed from: V9.z6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8248z6 implements InterfaceC21170a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9689p f25732b;

    public /* synthetic */ C8248z6(C9689p c9689p, int i10) {
        this.f25731a = i10;
        this.f25732b = c9689p;
    }

    @Override // p1104xb.InterfaceC21170a
    public final Object get() {
        switch (this.f25731a) {
            case 0:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("json"), C7863C6.f24768q0);
            case 1:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("proto"), C7863C6.f24767p0);
            case 2:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("json"), C8544Q4.f26371q0);
            case 3:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("proto"), C8544Q4.f26370p0);
            case 4:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("json"), C9191P4.f27976q0);
            case 5:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("proto"), C9191P4.f27975p0);
            case 6:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("json"), C9805S4.f29323q0);
            default:
                return this.f25732b.m10280a("FIREBASE_ML_SDK", new C7836c("proto"), C9805S4.f29322p0);
        }
    }
}
