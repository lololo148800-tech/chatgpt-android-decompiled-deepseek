package p693d1;

import af.C10564U;
import android.view.DragEvent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21690f;
import p1140z1.EnumC21705m0;
import p1140z1.InterfaceC21704m;
import p1140z1.InterfaceC21707n0;
import p482Tg.C7448e;
import p523V9.AbstractC7885F4;
import p523V9.AbstractC8088f6;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: d1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C12992e extends AbstractC10458p implements InterfaceC21707n0, InterfaceC21704m, InterfaceC12993f {

    /* JADX INFO: renamed from: A0 */
    public C12992e f41243A0;

    /* JADX INFO: renamed from: B0 */
    public InterfaceC12993f f41244B0;

    /* JADX INFO: renamed from: z0 */
    public final AbstractC16546n f41245z0;

    /* JADX WARN: Multi-variable type inference failed */
    public C12992e(InterfaceC1436k interfaceC1436k) {
        this.f41245z0 = (AbstractC16546n) interfaceC1436k;
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: A */
    public final void mo14722A(C12989b c12989b) {
        InterfaceC12993f interfaceC12993f = this.f41244B0;
        if (interfaceC12993f != null) {
            interfaceC12993f.mo14722A(c12989b);
        }
        C12992e c12992e = this.f41243A0;
        if (c12992e != null) {
            c12992e.mo14722A(c12989b);
        }
        this.f41243A0 = null;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        this.f41244B0 = null;
        this.f41243A0 = null;
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: Q */
    public final boolean mo14723Q(C12989b c12989b) {
        C12992e c12992e = this.f41243A0;
        if (c12992e != null) {
            return c12992e.mo14723Q(c12989b);
        }
        InterfaceC12993f interfaceC12993f = this.f41244B0;
        if (interfaceC12993f != null) {
            return interfaceC12993f.mo14723Q(c12989b);
        }
        return false;
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: e0 */
    public final void mo14724e0(C12989b c12989b) {
        InterfaceC12993f interfaceC12993f = this.f41244B0;
        if (interfaceC12993f != null) {
            interfaceC12993f.mo14724e0(c12989b);
            return;
        }
        C12992e c12992e = this.f41243A0;
        if (c12992e != null) {
            c12992e.mo14724e0(c12989b);
        }
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: n */
    public final void mo14725n(C12989b c12989b) {
        InterfaceC12993f interfaceC12993f = this.f41244B0;
        if (interfaceC12993f != null) {
            interfaceC12993f.mo14725n(c12989b);
            return;
        }
        C12992e c12992e = this.f41243A0;
        if (c12992e != null) {
            c12992e.mo14725n(c12989b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: n0 */
    public final void mo14726n0(C12989b c12989b) {
        InterfaceC21707n0 interfaceC21707n0;
        C12992e c12992e;
        C12992e c12992e2 = this.f41243A0;
        if (c12992e2 != null) {
            DragEvent dragEvent = c12989b.f41241a;
            if (AbstractC7885F4.m8174b(c12992e2, AbstractC8088f6.m8536b(dragEvent.getX(), dragEvent.getY()))) {
                c12992e = c12992e2;
            } else {
                if (this.f30960Y.f30972y0) {
                    C16525B c16525b = new C16525B();
                    AbstractC21690f.m22221z(this, new C7448e(c16525b, this, c12989b, 15));
                    interfaceC21707n0 = (InterfaceC21707n0) c16525b.f51262Y;
                } else {
                    interfaceC21707n0 = null;
                }
                c12992e = (C12992e) interfaceC21707n0;
            }
        } else {
            if (this.f30960Y.f30972y0) {
                interfaceC21707n0 = null;
            } else {
                C16525B c16525b2 = new C16525B();
                AbstractC21690f.m22221z(this, new C7448e(c16525b2, this, c12989b, 15));
                interfaceC21707n0 = (InterfaceC21707n0) c16525b2.f51262Y;
            }
            c12992e = (C12992e) interfaceC21707n0;
        }
        if (c12992e != null && c12992e2 == null) {
            c12992e.mo14725n(c12989b);
            c12992e.mo14726n0(c12989b);
            InterfaceC12993f interfaceC12993f = this.f41244B0;
            if (interfaceC12993f != null) {
                interfaceC12993f.mo14722A(c12989b);
            }
        } else if (c12992e == null && c12992e2 != null) {
            InterfaceC12993f interfaceC12993f2 = this.f41244B0;
            if (interfaceC12993f2 != null) {
                interfaceC12993f2.mo14725n(c12989b);
                interfaceC12993f2.mo14726n0(c12989b);
            }
            c12992e2.mo14722A(c12989b);
        } else if (!AbstractC16544l.m18089b(c12992e, c12992e2)) {
            if (c12992e != null) {
                c12992e.mo14725n(c12989b);
                c12992e.mo14726n0(c12989b);
            }
            if (c12992e2 != null) {
                c12992e2.mo14722A(c12989b);
            }
        } else if (c12992e != null) {
            c12992e.mo14726n0(c12989b);
        } else {
            InterfaceC12993f interfaceC12993f3 = this.f41244B0;
            if (interfaceC12993f3 != null) {
                interfaceC12993f3.mo14726n0(c12989b);
            }
        }
        this.f41243A0 = c12992e;
    }

    @Override // p1140z1.InterfaceC21707n0
    /* JADX INFO: renamed from: o */
    public final Object mo14727o() {
        return C12991d.f41242a;
    }

    @Override // p693d1.InterfaceC12993f
    /* JADX INFO: renamed from: w0 */
    public final void mo14728w0(C12989b c12989b) {
        C10564U c10564u = new C10564U(c12989b, 15);
        if (c10564u.invoke(this) != EnumC21705m0.f68877Y) {
            return;
        }
        AbstractC21690f.m22221z(this, c10564u);
    }
}
