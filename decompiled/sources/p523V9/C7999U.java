package p523V9;

import java.nio.charset.Charset;
import java.util.Map;
import p961qb.C18661b;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: V9.U */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7999U implements InterfaceC18663d {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C7999U f25278b = new C7999U(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C7999U f25279c = new C7999U(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25280a;

    public /* synthetic */ C7999U(int i10) {
        this.f25280a = i10;
    }

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        switch (this.f25280a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
                Charset charset = C8006V.f25286f;
                interfaceC18664e.mo8316c(C8006V.f25287g, entry.getKey());
                interfaceC18664e.mo8316c(C8006V.f25288h, entry.getValue());
                return;
            default:
                throw new C18661b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
