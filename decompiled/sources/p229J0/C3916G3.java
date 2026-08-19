package p229J0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import mm.C17296C;
import p003A1.C0154B0;
import p003A1.C0253h;
import p003A1.InterfaceC0250g;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.G3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3916G3 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f12033Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3934J3 f12034Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC0250g f12035o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3916G3(C3934J3 c3934j3, InterfaceC0250g interfaceC0250g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f12034Z = c3934j3;
        this.f12035o0 = interfaceC0250g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3916G3(this.f12034Z, this.f12035o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3916G3) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        long j10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f12033Y;
        C3934J3 c3934j3 = this.f12034Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (c3934j3 != null) {
                InterfaceC4006X3 interfaceC4006X3 = c3934j3.f12112a;
                EnumC3898D3 enumC3898D3Mo4641c = interfaceC4006X3.mo4641c();
                boolean z6 = interfaceC4006X3.mo4640b() != null;
                int iOrdinal = enumC3898D3Mo4641c.ordinal();
                long j11 = Long.MAX_VALUE;
                if (iOrdinal == 0) {
                    j10 = 4000;
                } else if (iOrdinal == 1) {
                    j10 = 10000;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                    j10 = Long.MAX_VALUE;
                }
                InterfaceC0250g interfaceC0250g = this.f12035o0;
                if (interfaceC0250g != null) {
                    C0253h c0253h = (C0253h) interfaceC0250g;
                    if (j10 < 2147483647L) {
                        int i11 = z6 ? 7 : 3;
                        int i12 = Build.VERSION.SDK_INT;
                        AccessibilityManager accessibilityManager = c0253h.f957a;
                        if (i12 >= 29) {
                            int iM495a = C0154B0.f631a.m495a(accessibilityManager, (int) j10, i11);
                            if (iM495a != Integer.MAX_VALUE) {
                                j11 = iM495a;
                            }
                        } else if (!z6 || !accessibilityManager.isTouchExplorationEnabled()) {
                            j11 = j10;
                        }
                        j10 = j11;
                    }
                }
                this.f12033Y = 1;
                if (AbstractC0575H.m1184m(j10, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        c3934j3.m4634a();
        return C17296C.f55119a;
    }
}
