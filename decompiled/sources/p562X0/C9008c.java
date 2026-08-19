package p562X0;

import p349O0.C5975S;
import p349O0.InterfaceC6034v0;
import p437Rn.C6949g;
import p586Y0.InterfaceC9564p;
import p594Y9.AbstractC9834X3;
import p658b5.C11242m;

/* JADX INFO: renamed from: X0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9008c implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: Y */
    public InterfaceC9019n f27491Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC9016k f27492Z;

    /* JADX INFO: renamed from: o0 */
    public String f27493o0;

    /* JADX INFO: renamed from: p0 */
    public Object f27494p0;

    /* JADX INFO: renamed from: q0 */
    public Object[] f27495q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC9015j f27496r0;

    /* JADX INFO: renamed from: s0 */
    public final C6949g f27497s0 = new C6949g(this, 12);

    public C9008c(InterfaceC9019n interfaceC9019n, InterfaceC9016k interfaceC9016k, String str, Object obj, Object[] objArr) {
        this.f27491Y = interfaceC9019n;
        this.f27492Z = interfaceC9016k;
        this.f27493o0 = str;
        this.f27494p0 = obj;
        this.f27495q0 = objArr;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
        InterfaceC9015j interfaceC9015j = this.f27496r0;
        if (interfaceC9015j != null) {
            ((C11242m) interfaceC9015j).m12609K();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9593b() throws Throwable {
        String strM10479b;
        InterfaceC9016k interfaceC9016k = this.f27492Z;
        if (this.f27496r0 != null) {
            throw new IllegalArgumentException(("entry(" + this.f27496r0 + ") is not null").toString());
        }
        if (interfaceC9016k != null) {
            C6949g c6949g = this.f27497s0;
            Object objInvoke = c6949g.invoke();
            if (objInvoke == null || interfaceC9016k.mo609a(objInvoke)) {
                this.f27496r0 = interfaceC9016k.mo611d(this.f27493o0, c6949g);
                return;
            }
            if (objInvoke instanceof InterfaceC9564p) {
                InterfaceC9564p interfaceC9564p = (InterfaceC9564p) objInvoke;
                if (interfaceC9564p.mo6406b() == C5975S.f19445o0 || interfaceC9564p.mo6406b() == C5975S.f19448r0 || interfaceC9564p.mo6406b() == C5975S.f19446p0) {
                    strM10479b = "MutableState containing " + interfaceC9564p.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM10479b = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM10479b = AbstractC9834X3.m10479b(objInvoke);
            }
            throw new IllegalArgumentException(strM10479b);
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        InterfaceC9015j interfaceC9015j = this.f27496r0;
        if (interfaceC9015j != null) {
            ((C11242m) interfaceC9015j).m12609K();
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() throws Throwable {
        m9593b();
    }
}
