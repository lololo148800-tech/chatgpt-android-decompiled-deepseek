package p409Qk;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0383c;
import p008A6.C0386f;
import p049Bm.InterfaceC1436k;
import p556Wk.InterfaceC8888B;
import sl.AbstractC19681p;

/* JADX INFO: renamed from: Qk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6754e {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f21681a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f21682b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f21683c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public InterfaceC1436k f21684d = new C0383c(8);

    /* JADX INFO: renamed from: e */
    public boolean f21685e = true;

    /* JADX INFO: renamed from: f */
    public boolean f21686f = true;

    /* JADX INFO: renamed from: g */
    public boolean f21687g;

    public C6754e() {
        int i10 = AbstractC19681p.f62375a;
    }

    /* JADX INFO: renamed from: a */
    public final void m7190a(InterfaceC8888B plugin, InterfaceC1436k configure) {
        AbstractC16544l.m18094g(plugin, "plugin");
        AbstractC16544l.m18094g(configure, "configure");
        LinkedHashMap linkedHashMap = this.f21682b;
        linkedHashMap.put(plugin.getKey(), new C6753d((InterfaceC1436k) linkedHashMap.get(plugin.getKey()), configure, 0));
        LinkedHashMap linkedHashMap2 = this.f21681a;
        if (linkedHashMap2.containsKey(plugin.getKey())) {
            return;
        }
        linkedHashMap2.put(plugin.getKey(), new C0386f(plugin, 6));
    }

    /* JADX INFO: renamed from: b */
    public final void m7191b(C6754e c6754e) {
        this.f21685e = c6754e.f21685e;
        this.f21686f = c6754e.f21686f;
        this.f21687g = c6754e.f21687g;
        this.f21681a.putAll(c6754e.f21681a);
        this.f21682b.putAll(c6754e.f21682b);
        this.f21683c.putAll(c6754e.f21683c);
    }
}
