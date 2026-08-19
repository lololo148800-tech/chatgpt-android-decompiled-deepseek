package p229J0;

import androidx.compose.material3.internal.AbstractC10860a;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p197Hj.C3457c;
import p349O0.C5994b0;
import p349O0.C6002f0;
import p492U1.InterfaceC7537b;
import p658b5.C11246q;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.A3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3880A3 {

    /* JADX INFO: renamed from: a */
    public final boolean f11735a;

    /* JADX INFO: renamed from: b */
    public final boolean f11736b;

    /* JADX INFO: renamed from: c */
    public final C11246q f11737c;

    public C3880A3(boolean z6, InterfaceC7537b interfaceC7537b, EnumC3886B3 enumC3886B3, InterfaceC1436k interfaceC1436k, boolean z10) {
        this.f11735a = z6;
        this.f11736b = z10;
        if (z6 && enumC3886B3 == EnumC3886B3.f11779o0) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z10 && enumC3886B3 == EnumC3886B3.f11777Y) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f11737c = new C11246q(enumC3886B3, new C4171z3(interfaceC7537b, 0), new C3457c(interfaceC7537b, 7), AbstractC4159x3.f13484b, interfaceC1436k);
    }

    /* JADX INFO: renamed from: a */
    public static Object m4601a(C3880A3 c3880a3, EnumC3886B3 enumC3886B3, AbstractC19694j abstractC19694j) {
        Object objM11287b = AbstractC10860a.m11287b(c3880a3.f11737c, enumC3886B3, ((C5994b0) c3880a3.f11737c.f34074k).m6409g(), abstractC19694j);
        return objM11287b == EnumC19250a.f61036Y ? objM11287b : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC3886B3 m4602b() {
        return (EnumC3886B3) ((C6002f0) this.f11737c.f34070g).getValue();
    }

    /* JADX INFO: renamed from: c */
    public final Object m4603c(AbstractC19694j abstractC19694j) {
        if (this.f11736b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objM4601a = m4601a(this, EnumC3886B3.f11777Y, abstractC19694j);
        return objM4601a == EnumC19250a.f61036Y ? objM4601a : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4604d() {
        return ((C6002f0) this.f11737c.f34070g).getValue() != EnumC3886B3.f11777Y;
    }

    /* JADX INFO: renamed from: e */
    public final Object m4605e(AbstractC19694j abstractC19694j) {
        if (this.f11735a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objM4601a = m4601a(this, EnumC3886B3.f11779o0, abstractC19694j);
        return objM4601a == EnumC19250a.f61036Y ? objM4601a : C17296C.f55119a;
    }
}
