package p616Z8;

import android.content.Context;
import p1061vb.C20513d;
import p140Fa.C2685e;
import p643a9.InterfaceC10527b;
import p745f9.C13583a;
import p745f9.C13589g;
import p745f9.C13591i;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Z8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10259g implements InterfaceC10527b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30474a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10527b f30475b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f30476c;

    public /* synthetic */ C10259g(InterfaceC10527b interfaceC10527b, InterfaceC17068a interfaceC17068a, int i10) {
        this.f30474a = i10;
        this.f30475b = interfaceC10527b;
        this.f30476c = interfaceC17068a;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f30474a) {
            case 0:
                return new C10258f((Context) ((C10257e) this.f30475b).f30470b, (C10256d) ((C10257e) this.f30476c).get());
            default:
                return new C13589g(new C2685e(), new C20513d(), C13583a.f42938f, (C13591i) ((C10257e) this.f30475b).get(), this.f30476c);
        }
    }
}
