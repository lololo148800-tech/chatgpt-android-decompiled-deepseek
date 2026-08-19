package p1014t1;

import android.os.Build;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p003A1.C0228a0;
import p003A1.C0304y;
import p080D0.C1786U;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21697i0;
import p1140z1.InterfaceC21702l;
import p1140z1.InterfaceC21707n0;
import p332N8.C5677a;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: t1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C19732i extends AbstractC10458p implements InterfaceC21707n0, InterfaceC21697i0, InterfaceC21702l {

    /* JADX INFO: renamed from: A0 */
    public boolean f62469A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f62470B0;

    /* JADX INFO: renamed from: z0 */
    public C19724a f62471z0;

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        if (enumC19730g == EnumC19730g.f62466Z) {
            if (AbstractC19736m.m20682d(c19729f.f62464e, 4)) {
                this.f62470B0 = true;
                m20677L0();
            } else if (AbstractC19736m.m20682d(c19729f.f62464e, 5)) {
                m20678M0();
            }
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
        m20678M0();
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        m20678M0();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m20676K0() {
        C16525B c16525b = new C16525B();
        AbstractC21690f.m22220y(this, new C5677a(c16525b, 7));
        C19732i c19732i = (C19732i) c16525b.f51262Y;
        C19724a c19724a = c19732i != null ? c19732i.f62471z0 : this.f62471z0;
        InterfaceC19735l interfaceC19735l = (InterfaceC19735l) AbstractC21690f.m22204i(this, AbstractC0187M0.f717s);
        if (interfaceC19735l != null) {
            C0304y c0304y = (C0304y) interfaceC19735l;
            if (Build.VERSION.SDK_INT >= 24) {
                C0228a0.f857a.m731a(c0304y.f1077a, c19724a);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m20677L0() {
        C16556x c16556x = new C16556x();
        c16556x.f51285Y = true;
        if (!this.f62469A0) {
            AbstractC21690f.m22221z(this, new C1786U(c16556x, 3));
        }
        if (c16556x.f51285Y) {
            m20676K0();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m20678M0() {
        C17296C c17296c;
        InterfaceC19735l interfaceC19735l;
        if (this.f62470B0) {
            this.f62470B0 = false;
            if (this.f30972y0) {
                C16525B c16525b = new C16525B();
                AbstractC21690f.m22220y(this, new C5677a(c16525b, 5));
                C19732i c19732i = (C19732i) c16525b.f51262Y;
                if (c19732i != null) {
                    c19732i.m20676K0();
                    c17296c = C17296C.f55119a;
                } else {
                    c17296c = null;
                }
                if (c17296c != null || (interfaceC19735l = (InterfaceC19735l) AbstractC21690f.m22204i(this, AbstractC0187M0.f717s)) == null) {
                    return;
                }
                C0304y c0304y = (C0304y) interfaceC19735l;
                InterfaceC19734k.f62473a.getClass();
                C19724a c19724a = AbstractC19736m.f62474a;
                if (Build.VERSION.SDK_INT >= 24) {
                    C0228a0.f857a.m731a(c0304y.f1077a, c19724a);
                }
            }
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void mo15563N() {
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
        mo15561D();
    }

    @Override // p1140z1.InterfaceC21707n0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ Object mo14727o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean mo15565q0() {
        return false;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: s0 */
    public final void mo15566s0() {
        mo15561D();
    }
}
