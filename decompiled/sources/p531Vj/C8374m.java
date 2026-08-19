package p531Vj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.WorkSource;
import ba.AbstractC11270b;
import ba.C11271c;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17311n;
import mm.C17312o;
import p025An.C0624m;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p086D6.C1971o;
import p1022t9.C19820e;
import p1022t9.C19826k;
import p1022t9.InterfaceC19817b;
import p103Dn.InterfaceC2186j;
import p166Ga.C3029c;
import p167Gb.C3032c;
import p385Pj.C6448w;
import p475T9.C7278a;
import p476Ta.C7293c;
import p477Tb.C7296c;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p720e6.C13287b;
import p746fa.AbstractC13600i;
import p746fa.C13606o;
import p841k.C16290j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C8374m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f26072Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f26073Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8375n f26074o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8374m(C8375n c8375n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26074o0 = c8375n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C8374m c8374m = new C8374m(this.f26074o0, interfaceC18770c);
        c8374m.f26073Z = obj;
        return c8374m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8374m) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0169 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2186j interfaceC2186j;
        Object objM1261q;
        InterfaceC2186j interfaceC2186j2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f26072Y;
        C8371j c8371j = C8371j.f26070a;
        C17296C c17296c = C17296C.f55119a;
        C8375n c8375n = this.f26074o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC2186j = (InterfaceC2186j) this.f26073Z;
            LocationRequest locationRequest = new LocationRequest(100, 10000L, Math.min(5000L, 10000L), Math.max(0L, 10000L), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 10000L, 0, 0, false, new WorkSource(null), null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(locationRequest);
            C11271c c11271c = new C11271c(arrayList, true, false);
            Context context = c8375n.f26076c;
            int i11 = AbstractC11270b.f34143a;
            C7278a c7278a = new C7278a(context, null, C7278a.f23070k, InterfaceC19817b.f62869l0, C19820e.f62871c);
            this.f26073Z = interfaceC2186j;
            this.f26072Y = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            C3029c c3029cM3900d = C3029c.m3900d();
            c3029cM3900d.f9119d = new C13287b(c11271c, 25);
            c3029cM3900d.f9117b = 2426;
            C13606o c13606oM20770b = c7278a.m20770b(0, c3029cM3900d.m3904c());
            AbstractC16544l.m18093f(c13606oM20770b, "checkLocationSettings(...)");
            c13606oM20770b.m15126e(AbstractC13600i.f42962a, new C7296c(new C7293c(c0624m, 1), 28));
            c13606oM20770b.m15124c(new C3032c(c0624m, 24));
            objM1261q = c0624m.m1261q();
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    AbstractC9233X.m9807c(obj);
                }
                if (i10 == 3) {
                    AbstractC9233X.m9807c(obj);
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    return c17296c;
                }
                interfaceC2186j2 = (InterfaceC2186j) this.f26073Z;
                try {
                    AbstractC9233X.m9807c(obj);
                    throw new C0644w();
                } catch (IntentSender.SendIntentException unused) {
                    this.f26073Z = null;
                    this.f26072Y = 5;
                    if (interfaceC2186j2.mo395a(c8371j, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return c17296c;
                }
            }
            InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f26073Z;
            AbstractC9233X.m9807c(obj);
            interfaceC2186j = interfaceC2186j3;
            objM1261q = obj;
        }
        Object obj2 = ((C17312o) objM1261q).f55139Y;
        if (!(obj2 instanceof C17311n)) {
            C8372k c8372k = C8372k.f26071a;
            this.f26073Z = null;
            this.f26072Y = 2;
            return interfaceC2186j.mo395a(c8372k, this) == enumC19250a ? enumC19250a : c17296c;
        }
        Throwable thM18979a = C17312o.m18979a(obj2);
        if (!(thM18979a instanceof C19826k)) {
            this.f26073Z = null;
            this.f26072Y = 3;
            return interfaceC2186j.mo395a(c8371j, this) == enumC19250a ? enumC19250a : c17296c;
        }
        try {
            PendingIntent pendingIntent = ((C19826k) thM18979a).f62870Y.f36054o0;
            AbstractC16544l.m18093f(pendingIntent, "getResolution(...)");
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC16544l.m18093f(intentSender, "pendingIntent.intentSender");
            c8375n.f26075b.mo10188b(new C16290j(intentSender, null, 0, 0));
            C6448w c6448w = new C6448w();
            C1971o c1971o = new C1971o(interfaceC2186j, 19);
            this.f26073Z = interfaceC2186j;
            this.f26072Y = 4;
            c6448w.mo3141d(c1971o, this);
            return enumC19250a;
        } catch (IntentSender.SendIntentException unused2) {
            interfaceC2186j2 = interfaceC2186j;
            this.f26073Z = null;
            this.f26072Y = 5;
            if (interfaceC2186j2.mo395a(c8371j, this) == enumC19250a) {
                return enumC19250a;
            }
            return c17296c;
        }
    }
}
