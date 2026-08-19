package p1027tp;

import com.google.protobuf.AbstractC12107L1;
import java.io.IOException;
import java.lang.reflect.Method;
import mo.AbstractC17325B;

/* JADX INFO: renamed from: tp.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C20080x extends AbstractC20056V {

    /* JADX INFO: renamed from: b */
    public final Method f63590b;

    /* JADX INFO: renamed from: c */
    public final int f63591c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC20067k f63592d;

    public C20080x(Method method, int i10, InterfaceC20067k interfaceC20067k) {
        this.f63590b = method;
        this.f63591c = i10;
        this.f63592d = interfaceC20067k;
    }

    @Override // p1027tp.AbstractC20056V
    /* JADX INFO: renamed from: a */
    public final void mo20858a(C20045J c20045j, Object obj) {
        int i10 = this.f63591c;
        Method method = this.f63590b;
        if (obj == null) {
            throw AbstractC20056V.m20885k(method, i10, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c20045j.f63488k = (AbstractC17325B) this.f63592d.mo15962a(obj);
        } catch (IOException e10) {
            throw AbstractC20056V.m20886l(method, e10, i10, AbstractC12107L1.m13824o(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
