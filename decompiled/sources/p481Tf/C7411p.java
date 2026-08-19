package p481Tf;

import com.openai.feature.notification.impl.NotificationService;
import gd.C13906X0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Tf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C7411p extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f23475Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ NotificationService f23476Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f23477o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7411p(NotificationService notificationService, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23476Z = notificationService;
        this.f23477o0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7411p(this.f23476Z, this.f23477o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7411p) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23475Y;
        C17296C c17296c = C17296C.f55119a;
        NotificationService notificationService = this.f23476Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        C18418a c18418a = notificationService.f38996v0;
        if (c18418a == null) {
            AbstractC16544l.m18103p("accountSession");
            throw null;
        }
        if (!c18418a.f58773a.f58783b) {
            InterfaceC13849E interfaceC13849E = notificationService.f38997w0;
            if (interfaceC13849E == null) {
                AbstractC16544l.m18103p("experimentManager");
                throw null;
            }
            C13906X0 c13906x0 = C13906X0.f43956c;
            this.f23475Y = 1;
            obj = ((C14005w2) interfaceC13849E).m15482b(c13906x0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
        if (((Boolean) obj).booleanValue()) {
            C7409n c7409n = notificationService.f38994t0;
            if (c7409n != null) {
                this.f23475Y = 2;
                return c7409n.m7797c(this.f23477o0, this) == enumC19250a ? enumC19250a : c17296c;
            }
            AbstractC16544l.m18103p("repository");
            throw null;
        }
        return c17296c;
    }
}
