package p729ej;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p035B7.C0846c;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: ej.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13411b extends AbstractC13431v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42481a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f42482b;

    /* JADX INFO: renamed from: c */
    public final Serializable f42483c;

    /* JADX INFO: renamed from: d */
    public final Object f42484d;

    public C13411b(InterfaceC1436k interfaceC1436k, C0846c c0846c, AbstractC13422m abstractC13422m) {
        this.f42482b = interfaceC1436k;
        this.f42483c = c0846c;
        this.f42484d = abstractC13422m;
    }

    @Override // p729ej.AbstractC13431v
    /* JADX INFO: renamed from: a */
    public final void mo14950a(C13430u c13430u) {
        switch (this.f42481a) {
            case 0:
                c13430u.m14964a(this.f42484d);
                break;
            default:
                ((InterfaceC1436k) this.f42482b).invoke(c13430u);
                break;
        }
    }

    public final String toString() {
        switch (this.f42481a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) AbstractC16526C.f51263a.mo5693b(C13411b.class).mo4447a());
                sb2.append("(worker=");
                sb2.append((InterfaceC13427r) this.f42482b);
                sb2.append(", key=\"");
                return AbstractC9306j0.m9891j((String) this.f42483c, "\")", sb2);
            default:
                return "action(" + ((C0846c) this.f42483c).f2358Z + ")-" + ((AbstractC13422m) this.f42484d);
        }
    }

    public C13411b(InterfaceC13427r worker, String renderKey, Object obj) {
        AbstractC16544l.m18094g(worker, "worker");
        AbstractC16544l.m18094g(renderKey, "renderKey");
        this.f42482b = worker;
        this.f42483c = renderKey;
        this.f42484d = obj;
    }
}
