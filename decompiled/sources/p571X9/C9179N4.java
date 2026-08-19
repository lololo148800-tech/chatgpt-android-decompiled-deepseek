package p571X9;

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

/* JADX INFO: renamed from: X9.N4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9179N4 implements InterfaceC9167L4 {

    /* JADX INFO: renamed from: a */
    public final C17216m f27966a;

    /* JADX INFO: renamed from: b */
    public final C9149I4 f27967b;

    public C9179N4(Context context, C9149I4 c9149i4) {
        this.f27967b = c9149i4;
        C8440a c8440a = C8440a.f26277e;
        C9691r.m10283b(context);
        C9689p c9689pM10284c = C9691r.m10282a().m10284c(c8440a);
        if (C8440a.f26276d.contains(new C7836c("json"))) {
            new C17216m(new C8248z6(c9689pM10284c, 4));
        }
        this.f27966a = new C17216m(new C8248z6(c9689pM10284c, 5));
    }

    @Override // p571X9.InterfaceC9167L4
    /* JADX INFO: renamed from: a */
    public final void mo9704a(C0420b c0420b) {
        this.f27967b.getClass();
        ((C9690q) this.f27966a.get()).m10281a(c0420b.f1381Z != 0 ? new C7834a(c0420b.m1045H(), EnumC7837d.f24731Y, null) : new C7834a(c0420b.m1045H(), EnumC7837d.f24732Z, null));
    }
}
