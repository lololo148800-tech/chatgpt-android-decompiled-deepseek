package p523V9;

import android.content.Context;
import p013Ab.C0420b;
import p522V8.C7834a;
import p522V8.C7836c;
import p522V8.EnumC7837d;
import p543W8.C8440a;
import p593Y8.C9689p;
import p593Y8.C9690q;
import p593Y8.C9691r;
import p890mb.C17216m;

/* JADX INFO: renamed from: V9.A6 */
/* JADX INFO: loaded from: classes.dex */
public final class C7847A6 implements InterfaceC8208u6 {

    /* JADX INFO: renamed from: a */
    public final C17216m f24739a;

    /* JADX INFO: renamed from: b */
    public final C8200t6 f24740b;

    public C7847A6(Context context, C8200t6 c8200t6) {
        this.f24740b = c8200t6;
        C8440a c8440a = C8440a.f26277e;
        C9691r.m10283b(context);
        C9689p c9689pM10284c = C9691r.m10282a().m10284c(c8440a);
        if (C8440a.f26276d.contains(new C7836c("json"))) {
            new C17216m(new C8248z6(c9689pM10284c, 0));
        }
        this.f24739a = new C17216m(new C8248z6(c9689pM10284c, 1));
    }

    @Override // p523V9.InterfaceC8208u6
    /* JADX INFO: renamed from: a */
    public final void mo8104a(C0420b c0420b) {
        this.f24740b.getClass();
        ((C9690q) this.f24739a.get()).m10281a(c0420b.f1381Z != 0 ? new C7834a(c0420b.m1045H(), EnumC7837d.f24731Y, null) : new C7834a(c0420b.m1045H(), EnumC7837d.f24732Z, null));
    }
}
