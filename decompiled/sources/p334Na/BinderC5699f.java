package p334Na;

import p333N9.AbstractBinderC5687h;
import p477Tb.C7296c;
import p746fa.C13599h;

/* JADX INFO: renamed from: Na.f */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5699f extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public final C7296c f18474b;

    /* JADX INFO: renamed from: c */
    public final C13599h f18475c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C5700g f18476d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5700g f18477e;

    public BinderC5699f(C5700g c5700g, C13599h c13599h, String str) {
        this.f18477e = c5700g;
        C7296c c7296c = new C7296c("OnRequestInstallCallback");
        this.f18476d = c5700g;
        super(1);
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f18474b = c7296c;
        this.f18475c = c13599h;
    }
}
