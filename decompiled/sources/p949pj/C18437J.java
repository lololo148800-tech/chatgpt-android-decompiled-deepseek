package p949pj;

import android.media.Image;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17312o;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p211I8.lPE.sRXLFOsOgS;
import p468T2.C7224p;
import p544W9.AbstractC8706s;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pj.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C18437J extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Image f58819Y;

    /* JADX INFO: renamed from: Z */
    public int f58820Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Image f58821o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18438K f58822p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f58823q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18437J(Image image, C18438K c18438k, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58821o0 = image;
        this.f58822p0 = c18438k;
        this.f58823q0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18437J(this.f58821o0, this.f58822p0, this.f58823q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18437J) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Dn.v0] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Image image;
        Object objM19874h;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f58820Z;
        C18438K c18438k = this.f58822p0;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    image = this.f58819Y;
                    AbstractC9233X.m9807c(obj);
                    objM19874h = ((C17312o) obj).f55139Y;
                } else {
                    if (r6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            image = this.f58821o0;
            int i10 = this.f58823q0;
            AbstractC16544l.m18094g(image, sRXLFOsOgS.TAxQVHGaCY);
            C7224p c7224p = new C7224p(image, i10);
            this.f58819Y = image;
            this.f58820Z = 1;
            objM19874h = C18438K.m19874h(c18438k, c7224p, this);
            if (objM19874h == enumC19250a) {
                return enumC19250a;
            }
            AbstractC8706s.m9414b(image, null);
            r6 = c18438k.f58824Y;
            C17312o c17312o = new C17312o(objM19874h);
            this.f58819Y = null;
            this.f58820Z = 2;
            if (r6.mo395a(c17312o, this) == enumC19250a) {
                return enumC19250a;
            }
            return C17296C.f55119a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC8706s.m9414b(r6, th2);
                throw th3;
            }
        }
    }
}
