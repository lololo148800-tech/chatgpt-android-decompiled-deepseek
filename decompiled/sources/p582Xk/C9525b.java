package p582Xk;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p059C5.C1601s;
import p409Qk.C6752c;
import sl.C19666a;

/* JADX INFO: renamed from: Xk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9525b {

    /* JADX INFO: renamed from: a */
    public final C6752c f28663a;

    /* JADX INFO: renamed from: b */
    public final Object f28664b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f28665c;

    /* JADX INFO: renamed from: d */
    public final C1601s f28666d;

    public C9525b(C19666a key, C6752c client, Object pluginConfig) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(pluginConfig, "pluginConfig");
        this.f28663a = client;
        this.f28664b = pluginConfig;
        this.f28665c = new ArrayList();
        this.f28666d = new C1601s(11);
    }

    /* JADX INFO: renamed from: a */
    public final void m10029a(InterfaceC9524a hook, InterfaceC17302e interfaceC17302e) {
        AbstractC16544l.m18094g(hook, "hook");
        this.f28665c.add(new C9528e(hook, interfaceC17302e));
    }
}
