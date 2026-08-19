package p949pj;

import android.media.Image;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p103Dn.InterfaceC2121A0;
import p103Dn.InterfaceC2186j;
import p103Dn.InterfaceC2211v0;
import p1048uo.AbstractC20405l;
import p153Fn.C2925c;
import p178H.C3152j0;
import p178H.InterfaceC3108A;
import p468T2.C7224p;
import p544W9.AbstractC8706s;
import p571X9.AbstractC9233X;
import p902n8.C17514a;
import p972qm.InterfaceC18770c;
import p993rj.InterfaceC19044f;

/* JADX INFO: renamed from: pj.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C18470i0 implements InterfaceC3108A, InterfaceC2121A0, InterfaceC19044f {

    /* JADX INFO: renamed from: Y */
    public final C17514a f58913Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC2211v0 f58914Z;

    /* JADX INFO: renamed from: o0 */
    public final C2925c f58915o0;

    public C18470i0(C17514a selfieProcessor, InterfaceC2211v0 resultFlow) {
        AbstractC16544l.m18094g(selfieProcessor, "selfieProcessor");
        AbstractC16544l.m18094g(resultFlow, "resultFlow");
        this.f58913Y = selfieProcessor;
        this.f58914Z = resultFlow;
        this.f58915o0 = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));
    }

    @Override // p178H.InterfaceC3108A
    /* JADX INFO: renamed from: c */
    public final void mo255c(C3152j0 c3152j0) {
        try {
            C17514a c17514a = this.f58913Y;
            c17514a.getClass();
            C7224p c7224pM21073d = AbstractC20405l.m21073d(c3152j0);
            Object objM9806b = c7224pM21073d == null ? AbstractC9233X.m9806b(new RuntimeException("Null input image")) : c17514a.m19203e(c7224pM21073d);
            AbstractC8706s.m9414b(c3152j0, null);
            AbstractC0575H.m1156D(this.f58915o0, null, null, new C18466g0(this, objM9806b, null), 3);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC8706s.m9414b(c3152j0, th2);
                throw th3;
            }
        }
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        return this.f58914Z.mo3141d(interfaceC2186j, interfaceC18770c);
    }

    @Override // p993rj.InterfaceC19044f
    /* JADX INFO: renamed from: g */
    public final void mo19876g(Image image, int i10) {
        AbstractC16544l.m18094g(image, "image");
        try {
            C17514a c17514a = this.f58913Y;
            c17514a.getClass();
            Object objM19203e = c17514a.m19203e(new C7224p(image, i10));
            AbstractC8706s.m9414b(image, null);
            AbstractC0575H.m1156D(this.f58915o0, null, null, new C18468h0(this, objM19203e, null), 3);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC8706s.m9414b(image, th2);
                throw th3;
            }
        }
    }
}
