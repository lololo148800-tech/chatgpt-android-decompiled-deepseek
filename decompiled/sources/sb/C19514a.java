package sb;

import java.util.Map;
import p1024tb.C19834e;
import p961qb.C18661b;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: sb.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C19514a implements InterfaceC18663d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61975a;

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        switch (this.f61975a) {
            case 0:
                throw new C18661b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
                interfaceC18664e.mo8316c(C19834e.f62894g, entry.getKey());
                interfaceC18664e.mo8316c(C19834e.f62895h, entry.getValue());
                return;
            default:
                throw new C18661b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
