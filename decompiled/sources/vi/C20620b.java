package vi;

import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import ni.C17642p;
import p1043ui.C20291a;
import p948pi.C18418a;

/* JADX INFO: renamed from: vi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20620b {

    /* JADX INFO: renamed from: a */
    public final C20291a f65454a;

    /* JADX INFO: renamed from: b */
    public final C17627a f65455b;

    /* JADX INFO: renamed from: c */
    public final C18418a f65456c;

    /* JADX INFO: renamed from: d */
    public final C17642p f65457d;

    public C20620b(C20291a fileProvider, C17627a accountUserCoroutineScope, C18418a accountSession, C17642p deletionReleaseCompletable) {
        AbstractC16544l.m18094g(fileProvider, "fileProvider");
        AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(deletionReleaseCompletable, "deletionReleaseCompletable");
        this.f65454a = fileProvider;
        this.f65455b = accountUserCoroutineScope;
        this.f65456c = accountSession;
        this.f65457d = deletionReleaseCompletable;
    }
}
