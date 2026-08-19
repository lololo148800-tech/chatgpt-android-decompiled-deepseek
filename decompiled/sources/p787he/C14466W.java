package p787he;

import android.os.SystemClock;
import gd.C13976p1;
import gd.C14005w2;
import gd.C14011y1;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p042Bf.C1278t;
import p049Bm.InterfaceC1440o;
import p1105xc.C21173c;
import p1105xc.C21176f;
import p1105xc.C21177g;
import p1105xc.C21179i;
import p1105xc.C21186p;
import p1105xc.C21189s;
import p1105xc.EnumC21180j;
import p571X9.AbstractC9233X;
import p817j$.util.Map;
import p909nm.C17689w;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import tl.C20002b;

/* JADX INFO: renamed from: he.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C14466W extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Throwable f45561Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14467X f45562Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f45563o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f45564p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14466W(C14467X c14467x, long j10, C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f45562Z = c14467x;
        this.f45563o0 = j10;
        this.f45564p0 = c16525b;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C16525B c16525b = this.f45564p0;
        C14466W c14466w = new C14466W(this.f45562Z, this.f45563o0, c16525b, (InterfaceC18770c) obj3);
        c14466w.f45561Y = (Throwable) obj2;
        C17296C c17296c = C17296C.f55119a;
        c14466w.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean z6 = this.f45561Y instanceof CancellationException;
        C14467X c14467x = this.f45562Z;
        if (z6) {
            if (((C14005w2) c14467x.f45569e).m15481a(C14011y1.f44093c)) {
                AbstractC0575H.m1156D(c14467x.f45565a, null, null, new C14465V(c14467x, this.f45564p0, null), 3);
            }
        }
        C21189s c21189s = c14467x.f45571g;
        C21179i c21179i = EnumC21180j.Companion;
        C17689w c17689w = C17689w.f56480Y;
        C13976p1 c13976p1 = C13976p1.f44034c;
        if (((C14005w2) c21189s.f67344c).m15481a(c13976p1)) {
            C21177g c21177g = new C21177g("completion_request", c17689w);
            ReentrantLock reentrantLock = c21189s.f67351j;
            reentrantLock.lock();
            try {
                Object objComputeIfAbsent = Map.EL.computeIfAbsent((LinkedHashMap) c21189s.f67352k.f62329Z, c21177g, new C20002b(1, new C1278t(c17689w)));
                AbstractC16544l.m18093f(objComputeIfAbsent, "computeIfAbsent(...)");
                ((C21173c) objComputeIfAbsent).f67312d++;
                reentrantLock.unlock();
                c21189s.m21615c();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        double dElapsedRealtime = SystemClock.elapsedRealtime() - this.f45563o0;
        if (((C14005w2) c21189s.f67344c).m15481a(c13976p1)) {
            C21177g c21177g2 = new C21177g("completion_request_time", c17689w);
            ReentrantLock reentrantLock2 = c21189s.f67351j;
            reentrantLock2.lock();
            try {
                Object objComputeIfAbsent2 = Map.EL.computeIfAbsent((LinkedHashMap) c21189s.f67352k.f62330o0, c21177g2, new C20002b(2, new C21186p(1)));
                AbstractC16544l.m18093f(objComputeIfAbsent2, "computeIfAbsent(...)");
                ((C21176f) objComputeIfAbsent2).f67318d.add(Double.valueOf(dElapsedRealtime));
                reentrantLock2.unlock();
                c21189s.m21615c();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        }
        return C17296C.f55119a;
    }
}
