package vi;

import kotlin.jvm.internal.AbstractC16544l;
import ni.C17641o;
import ni.C17642p;
import p1043ui.C20291a;
import p948pi.C18422e;

/* JADX INFO: renamed from: vi.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20627i {

    /* JADX INFO: renamed from: a */
    public final C20291a f65466a;

    /* JADX INFO: renamed from: b */
    public final C17641o f65467b;

    /* JADX INFO: renamed from: c */
    public final C18422e f65468c;

    /* JADX INFO: renamed from: d */
    public final C17642p f65469d;

    public C20627i(C20291a fileProvider, C17641o userCoroutineScope, C18422e authSession, C17642p releaseCompletable) {
        AbstractC16544l.m18094g(fileProvider, "fileProvider");
        AbstractC16544l.m18094g(userCoroutineScope, "userCoroutineScope");
        AbstractC16544l.m18094g(authSession, "authSession");
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        this.f65466a = fileProvider;
        this.f65467b = userCoroutineScope;
        this.f65468c = authSession;
        this.f65469d = releaseCompletable;
    }
}
