package p594Y9;

import android.content.Context;
import p013Ab.C0420b;
import p522V8.C7834a;
import p522V8.C7836c;
import p522V8.EnumC7837d;
import p523V9.C8248z6;
import p543W8.C8440a;
import p593Y8.C9689p;
import p593Y8.C9690q;
import p593Y8.C9691r;
import p890mb.C17216m;

/* JADX INFO: renamed from: Y9.Q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9794Q4 implements InterfaceC9782O4 {

    /* JADX INFO: renamed from: a */
    public final C17216m f29313a;

    /* JADX INFO: renamed from: b */
    public final C9764L4 f29314b;

    public C9794Q4(Context context, C9764L4 c9764l4) {
        this.f29314b = c9764l4;
        C8440a c8440a = C8440a.f26277e;
        C9691r.m10283b(context);
        C9689p c9689pM10284c = C9691r.m10282a().m10284c(c8440a);
        if (C8440a.f26276d.contains(new C7836c("json"))) {
            new C17216m(new C8248z6(c9689pM10284c, 6));
        }
        this.f29313a = new C17216m(new C8248z6(c9689pM10284c, 7));
    }

    @Override // p594Y9.InterfaceC9782O4
    /* JADX INFO: renamed from: a */
    public final void mo10376a(C0420b c0420b) {
        this.f29314b.getClass();
        ((C9690q) this.f29313a.get()).m10281a(c0420b.f1381Z != 0 ? new C7834a(c0420b.m1045H(), EnumC7837d.f24731Y, null) : new C7834a(c0420b.m1045H(), EnumC7837d.f24732Z, null));
    }
}
