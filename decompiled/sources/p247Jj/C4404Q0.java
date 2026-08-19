package p247Jj;

import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1027tp.C20048M;
import p103Dn.InterfaceC2186j;
import p342Nj.AbstractC5807a;
import p342Nj.InterfaceC5816j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4404Q0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f14292Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f14293Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4405R0 f14294o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4404Q0(C4405R0 c4405r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14294o0 = c4405r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4404Q0 c4404q0 = new C4404Q0(this.f14294o0, interfaceC18770c);
        c4404q0.f14293Z = obj;
        return c4404q0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4404Q0) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Dn.j, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f14292Y;
        C4405R0 c4405r0 = this.f14294o0;
        try {
            if (r6 != 0) {
                if (r6 == 1) {
                    interfaceC2186j = (InterfaceC2186j) this.f14293Z;
                    AbstractC9233X.m9807c(obj);
                } else if (r6 == 2 || r6 == 3) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (r6 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            interfaceC2186j = (InterfaceC2186j) this.f14293Z;
            InterfaceC5816j interfaceC5816j = c4405r0.f14298e;
            String str = c4405r0.f14295b;
            String str2 = c4405r0.f14296c;
            TransitionBackRequest transitionBackRequest = new TransitionBackRequest(new TransitionBackRequest.Meta(c4405r0.f14297d));
            this.f14293Z = interfaceC2186j;
            this.f14292Y = 1;
            obj = interfaceC5816j.m6211d(str, str2, transitionBackRequest, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            C20048M c20048m = (C20048M) obj;
            if (c20048m.f63525a.m18985a()) {
                Object obj2 = c20048m.f63526b;
                AbstractC16544l.m18091d(obj2);
                C4400O0 c4400o0 = new C4400O0(AbstractC5807a.m6196g((CheckInquiryResponse) obj2, c4405r0.f14295b, c4405r0.f14299f));
                this.f14293Z = interfaceC2186j;
                this.f14292Y = 2;
                if (interfaceC2186j.mo395a(c4400o0, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C4398N0 c4398n0 = new C4398N0(NetworkUtilsKt.toErrorInfo(c20048m));
                this.f14293Z = interfaceC2186j;
                this.f14292Y = 3;
                if (interfaceC2186j.mo395a(c4398n0, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } catch (SocketTimeoutException e10) {
            C4398N0 c4398n1 = new C4398N0(NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
            this.f14293Z = null;
            this.f14292Y = 4;
            if (r6.mo395a(c4398n1, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
