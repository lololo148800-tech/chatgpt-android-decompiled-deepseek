package p1081wc;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8215v5;

/* JADX INFO: renamed from: wc.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C20865K implements InterfaceC20904w {

    /* JADX INFO: renamed from: a */
    public final C20881a0 f66427a;

    /* JADX INFO: renamed from: b */
    public final C20879Z f66428b;

    public C20865K(C20881a0 c20881a0, C20879Z c20879z) {
        this.f66427a = c20881a0;
        this.f66428b = c20879z;
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: a */
    public final void mo21447a(AbstractC20892k event, Map properties) {
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(properties, "properties");
        this.f66427a.mo21447a(event, properties);
        this.f66428b.mo21447a(event, properties);
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: b */
    public final void mo21448b(AbstractC20892k abstractC20892k, Object obj, Map map) {
        AbstractC8215v5.m8845g(this, abstractC20892k, obj, map);
    }
}
