package p209I6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p060C6.C1606c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: I6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3634l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f11078Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3635m f11079Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3634l(C3635m c3635m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11079Z = c3635m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3634l(this.f11079Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3634l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f11078Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f11078Y = 1;
            obj = this.f11079Z.m4332c(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        boolean zM18089b = AbstractC16544l.m18089b(obj2, "connection_ack");
        C17296C c17296c = C17296C.f55119a;
        if (zM18089b) {
            return c17296c;
        }
        if (AbstractC16544l.m18089b(obj2, "connection_error")) {
            throw new C1606c("Connection error:\n" + map, null);
        }
        System.out.println((Object) AbstractC10763a.m11051i(obj2, "unknown message while waiting for connection_ack: '"));
        return c17296c;
    }
}
