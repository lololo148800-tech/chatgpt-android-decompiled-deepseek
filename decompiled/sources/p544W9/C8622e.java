package p544W9;

import java.nio.charset.Charset;
import java.util.Map;
import p961qb.C18661b;
import p961qb.InterfaceC18663d;
import p961qb.InterfaceC18664e;

/* JADX INFO: renamed from: W9.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8622e implements InterfaceC18663d {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C8622e f26456b = new C8622e(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C8622e f26457c = new C8622e(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26458a;

    public /* synthetic */ C8622e(int i10) {
        this.f26458a = i10;
    }

    @Override // p961qb.InterfaceC18660a
    /* JADX INFO: renamed from: a */
    public final void mo3472a(Object obj, Object obj2) {
        switch (this.f26458a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC18664e interfaceC18664e = (InterfaceC18664e) obj2;
                Charset charset = C8628f.f26465f;
                interfaceC18664e.mo8316c(C8628f.f26466g, entry.getKey());
                interfaceC18664e.mo8316c(C8628f.f26467h, entry.getValue());
                return;
            default:
                throw new C18661b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
