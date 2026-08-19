package p185H6;

import java.util.regex.Pattern;
import mo.AbstractC17325B;
import mo.C17352s;
import p026Ao.AbstractC0668b;
import p026Ao.C0656E;
import p026Ao.C0687u;
import p026Ao.InterfaceC0676j;
import p571X9.AbstractC9282f0;
import p942p6.C18302f;
import p942p6.InterfaceC18298b;

/* JADX INFO: renamed from: H6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3256l extends AbstractC17325B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9913a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9914b;

    public /* synthetic */ C3256l(Object obj, int i10) {
        this.f9913a = i10;
        this.f9914b = obj;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: a */
    public final long mo4142a() {
        switch (this.f9913a) {
            case 0:
                return ((InterfaceC18298b) this.f9914b).getContentLength();
            default:
                return -1L;
        }
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: b */
    public final C17352s mo4143b() {
        Object obj = this.f9914b;
        switch (this.f9913a) {
            case 0:
                Pattern pattern = C17352s.f55296e;
                return AbstractC9282f0.m9857c(((InterfaceC18298b) obj).getContentType());
            default:
                return ((AbstractC17325B) obj).mo4143b();
        }
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: c */
    public boolean mo4144c() {
        switch (this.f9913a) {
            case 0:
                return ((InterfaceC18298b) this.f9914b) instanceof C18302f;
            default:
                return super.mo4144c();
        }
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: d */
    public final void mo4145d(InterfaceC0676j interfaceC0676j) throws Throwable {
        switch (this.f9913a) {
            case 0:
                ((InterfaceC18298b) this.f9914b).mo3050g(interfaceC0676j);
                break;
            default:
                C0656E c0656eM1402b = AbstractC0668b.m1402b(new C0687u(interfaceC0676j));
                ((AbstractC17325B) this.f9914b).mo4145d(c0656eM1402b);
                c0656eM1402b.close();
                break;
        }
    }
}
