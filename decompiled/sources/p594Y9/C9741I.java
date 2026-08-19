package p594Y9;

import java.nio.charset.Charset;
import java.util.Map;
import p961qb.C18661b;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: Y9.I */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9741I implements InterfaceC18663d {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C9741I f29263b = new C9741I(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C9741I f29264c = new C9741I(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29265a;

    public /* synthetic */ C9741I(int i10) {
        this.f29265a = i10;
    }

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        switch (this.f29265a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
                Charset charset = C9747J.f29274f;
                interfaceC18664e.mo8316c(C9747J.f29275g, entry.getKey());
                interfaceC18664e.mo8316c(C9747J.f29276h, entry.getValue());
                return;
            default:
                throw new C18661b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
