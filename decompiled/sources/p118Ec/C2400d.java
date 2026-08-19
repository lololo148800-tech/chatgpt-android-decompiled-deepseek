package p118Ec;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17634h;
import ni.C17636j;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p267Ke.C4641c;

/* JADX INFO: renamed from: Ec.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2400d implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7465a;

    /* JADX INFO: renamed from: b */
    public final C4479j f7466b;

    /* JADX INFO: renamed from: c */
    public final C4474e f7467c;

    public C2400d(C4479j c4479j, C4474e scope, int i10) {
        this.f7465a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(scope, "scope");
                this.f7466b = c4479j;
                this.f7467c = scope;
                break;
            default:
                this.f7466b = c4479j;
                this.f7467c = scope;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f7465a) {
            case 0:
                return new C2399c((Set) this.f7466b.get(), (C17636j) this.f7467c.f14617a);
            default:
                Object obj = this.f7466b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f7467c.f14617a;
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C4641c((Set) obj, (C17634h) obj2);
        }
    }
}
