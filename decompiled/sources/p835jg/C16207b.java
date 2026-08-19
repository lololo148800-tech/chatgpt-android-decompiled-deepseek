package p835jg;

import android.content.Context;
import android.content.IntentFilter;
import io.sentry.android.replay.capture.C15272c;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p195Hh.C3430e;
import p523V9.AbstractC8031Y3;
import p571X9.AbstractC9233X;
import p913o2.AbstractC17803d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: jg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16207b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f50287Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f50288Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f50289o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3430e f50290p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16207b(Context context, C3430e c3430e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50289o0 = context;
        this.f50290p0 = c3430e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16207b c16207b = new C16207b(this.f50289o0, this.f50290p0, interfaceC18770c);
        c16207b.f50288Z = obj;
        return c16207b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16207b) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f50287Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC1758z interfaceC1758z = (InterfaceC1758z) this.f50288Z;
            C3430e c3430e = this.f50290p0;
            C16206a c16206a = new C16206a(c3430e, interfaceC1758z);
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            Context context = this.f50289o0;
            AbstractC17803d.m19558e(context, c16206a, intentFilter);
            C15272c c15272c = new C15272c(c3430e, context, c16206a, 5);
            this.f50287Y = 1;
            if (AbstractC8031Y3.m8377a(interfaceC1758z, c15272c, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
