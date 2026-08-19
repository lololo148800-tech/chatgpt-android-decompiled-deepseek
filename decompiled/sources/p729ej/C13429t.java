package p729ej;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p225Im.InterfaceC3777y;

/* JADX INFO: renamed from: ej.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C13429t extends AbstractC13422m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3777y f42517a;

    /* JADX INFO: renamed from: b */
    public final String f42518b;

    /* JADX INFO: renamed from: c */
    public final C13433x f42519c;

    public C13429t(InterfaceC3777y workerType, String key) {
        AbstractC16544l.m18094g(workerType, "workerType");
        AbstractC16544l.m18094g(key, "key");
        this.f42517a = workerType;
        this.f42518b = key;
        this.f42519c = new C13433x(workerType, (C13433x) null, 6);
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        InterfaceC13427r props = (InterfaceC13427r) obj;
        AbstractC16544l.m18094g(props, "props");
        return 0;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: b */
    public final Object mo8937b(Object obj, Object obj2, Object obj3) {
        InterfaceC13427r old = (InterfaceC13427r) obj;
        InterfaceC13427r interfaceC13427r = (InterfaceC13427r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(old, "old");
        AbstractC16544l.m18094g(interfaceC13427r, "new");
        if (!old.mo2026a(interfaceC13427r)) {
            iIntValue++;
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        InterfaceC13427r renderProps = (InterfaceC13427r) obj;
        int iIntValue = ((Number) obj2).intValue();
        AbstractC16544l.m18094g(renderProps, "renderProps");
        c13421l.mo3410z(String.valueOf(iIntValue), new C13428s(renderProps, this, c13421l, null));
        return C17296C.f55119a;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C13420k mo2035d(Object obj) {
        ((Number) obj).intValue();
        return null;
    }
}
