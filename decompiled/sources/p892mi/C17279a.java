package p892mi;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.InterfaceC0309z1;
import p553Wh.C8870f;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9209T;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: mi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17279a implements InterfaceC0309z1 {

    /* JADX INFO: renamed from: a */
    public final AbstractActivityC17375g f55086a;

    /* JADX INFO: renamed from: b */
    public final C8870f f55087b;

    public C17279a(AbstractActivityC17375g context, C8870f appState) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(appState, "appState");
        this.f55086a = context;
        this.f55087b = appState;
    }

    @Override // p003A1.InterfaceC0309z1
    /* JADX INFO: renamed from: a */
    public final void mo877a(String uri) {
        AbstractC16544l.m18094g(uri, "uri");
        Intent intent = new Intent();
        AbstractC9186P.m9748b(intent, uri);
        AbstractC9209T.m9776b(this.f55086a, this.f55087b, intent);
    }
}
