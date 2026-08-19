package p209I6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3628f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11059Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3630h f11060Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3628f(C3630h c3630h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11060Z = c3630h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3628f(this.f11060Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3628f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11059Y;
        C3630h c3630h = this.f11060Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f11059Y = 1;
            obj = c3630h.m4332c(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        Object obj2 = ((Map) obj).get("type");
        boolean zM18089b = AbstractC16544l.m18089b(obj2, "connection_ack");
        C17296C c17296c = C17296C.f55119a;
        if (zM18089b) {
            return c17296c;
        }
        if (AbstractC16544l.m18089b(obj2, "ping")) {
            c3630h.m4343i();
        } else {
            System.out.println((Object) AbstractC10763a.m11051i(obj2, "unknown graphql-ws message while waiting for connection_ack: '"));
        }
        return c17296c;
    }
}
