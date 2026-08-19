package p616Z8;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import p658b5.C11234e;

/* JADX INFO: renamed from: Z8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10258f {

    /* JADX INFO: renamed from: a */
    public final C11234e f30471a;

    /* JADX INFO: renamed from: b */
    public final C10256d f30472b;

    /* JADX INFO: renamed from: c */
    public final HashMap f30473c;

    public C10258f(Context context, C10256d c10256d) {
        C11234e c11234e = new C11234e(context);
        this.f30473c = new HashMap();
        this.f30471a = c11234e;
        this.f30472b = c10256d;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC10260h m10859a(String str) {
        if (this.f30473c.containsKey(str)) {
            return (InterfaceC10260h) this.f30473c.get(str);
        }
        CctBackendFactory cctBackendFactoryM12521w = this.f30471a.m12521w(str);
        if (cctBackendFactoryM12521w == null) {
            return null;
        }
        C10256d c10256d = this.f30472b;
        InterfaceC10260h interfaceC10260hCreate = cctBackendFactoryM12521w.create(new C10254b(c10256d.f30466a, c10256d.f30467b, c10256d.f30468c, str));
        this.f30473c.put(str, interfaceC10260hCreate);
        return interfaceC10260hCreate;
    }
}
