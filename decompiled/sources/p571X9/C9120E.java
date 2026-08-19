package p571X9;

import java.nio.charset.Charset;
import java.util.Map;
import p961qb.C18661b;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: X9.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9120E implements InterfaceC18663d {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C9120E f27877b = new C9120E(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C9120E f27878c = new C9120E(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27879a;

    public /* synthetic */ C9120E(int i10) {
        this.f27879a = i10;
    }

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        switch (this.f27879a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
                Charset charset = C9126F.f27882f;
                interfaceC18664e.mo8316c(C9126F.f27883g, entry.getKey());
                interfaceC18664e.mo8316c(C9126F.f27884h, entry.getValue());
                return;
            default:
                throw new C18661b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
