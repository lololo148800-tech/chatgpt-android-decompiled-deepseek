package vi;

import kotlin.jvm.internal.AbstractC16544l;
import ni.C17636j;
import ni.C17637k;
import p1043ui.C20291a;
import p948pi.AbstractC18425h;

/* JADX INFO: renamed from: vi.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20625g {

    /* JADX INFO: renamed from: a */
    public final C20291a f65461a;

    /* JADX INFO: renamed from: b */
    public final C17636j f65462b;

    /* JADX INFO: renamed from: c */
    public final AbstractC18425h f65463c;

    /* JADX INFO: renamed from: d */
    public final C17637k f65464d;

    public C20625g(C20291a fileProvider, C17636j userCoroutineScope, AbstractC18425h authSession, C17637k releaseCompletable) {
        AbstractC16544l.m18094g(fileProvider, "fileProvider");
        AbstractC16544l.m18094g(userCoroutineScope, "userCoroutineScope");
        AbstractC16544l.m18094g(authSession, "authSession");
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        this.f65461a = fileProvider;
        this.f65462b = userCoroutineScope;
        this.f65463c = authSession;
        this.f65464d = releaseCompletable;
    }
}
