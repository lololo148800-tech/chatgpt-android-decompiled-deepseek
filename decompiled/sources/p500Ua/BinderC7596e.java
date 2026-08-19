package p500Ua;

import p265Kb.C4613f;
import p333N9.AbstractBinderC5687h;
import p746fa.C13599h;

/* JADX INFO: renamed from: Ua.e */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7596e extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public final C4613f f24022b;

    /* JADX INFO: renamed from: c */
    public final C13599h f24023c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C7597f f24024d;

    public BinderC7596e(C7597f c7597f, C13599h c13599h) {
        C4613f c4613f = new C4613f("OnRequestInstallCallback", 1);
        this.f24024d = c7597f;
        super(6);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f24022b = c4613f;
        this.f24023c = c13599h;
    }
}
