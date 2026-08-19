package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0563B;
import p025An.AbstractC0593T;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p444S4.AbstractC7009o;
import p444S4.C7001g;
import p444S4.C7008n;
import p544W9.AbstractC8519M3;
import p561X.C8990d;
import p571X9.AbstractC9233X;
import p823j3.AbstractC16097s;
import p823j3.C16073L;
import p823j3.C16098t;
import p823j3.C16104z;
import p823j3.InterfaceC16091m;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lj3/m;", "sessionManager", "Lj3/L;", "timeouts", "LAn/B;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lj3/m;Lj3/L;LAn/B;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SessionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: t0 */
    public final WorkerParameters f33345t0;

    /* JADX INFO: renamed from: u0 */
    public final InterfaceC16091m f33346u0;

    /* JADX INFO: renamed from: v0 */
    public final C16073L f33347v0;

    /* JADX INFO: renamed from: w0 */
    public final AbstractC0563B f33348w0;

    /* JADX INFO: renamed from: x0 */
    public final String f33349x0;

    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC16091m interfaceC16091m, C16073L c16073l, AbstractC0563B abstractC0563B) {
        super(context, workerParameters);
        this.f33345t0 = workerParameters;
        this.f33346u0 = interfaceC16091m;
        this.f33347v0 = c16073l;
        this.f33348w0 = abstractC0563B;
        C7001g c7001g = this.f22417Z.f33697b;
        interfaceC16091m.getClass();
        Object obj = c7001g.f22408a.get("KEY");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.f33349x0 = str;
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC0563B getF33348w0() {
        return this.f33348w0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo12108f(AbstractC19687c abstractC19687c) throws Throwable {
        C16098t c16098t;
        if (abstractC19687c instanceof C16098t) {
            c16098t = (C16098t) abstractC19687c;
            int i10 = c16098t.f49865o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16098t.f49865o0 = i10 - Integer.MIN_VALUE;
            } else {
                c16098t = new C16098t(this, abstractC19687c);
            }
        } else {
            c16098t = new C16098t(this, abstractC19687c);
        }
        Object objM9188b = c16098t.f49863Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16098t.f49865o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9188b);
            C8990d c8990d = this.f33347v0.f49771d;
            C16104z c16104z = new C16104z(this, null);
            c16098t.f49865o0 = 1;
            objM9188b = AbstractC8519M3.m9188b(c8990d, c16104z, c16098t);
            if (objM9188b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException(HJrCuD.CgFMhLlUBySnbow);
            }
            AbstractC9233X.m9807c(objM9188b);
        }
        AbstractC7009o abstractC7009o = (AbstractC7009o) objM9188b;
        if (abstractC7009o != null) {
            return abstractC7009o;
        }
        HashMap map = new HashMap();
        map.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
        C7001g c7001g = new C7001g(map);
        C7001g.m7402b(c7001g);
        return new C7008n(c7001g);
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, AbstractC16097s.f49862a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC16091m interfaceC16091m, C16073L c16073l, AbstractC0563B abstractC0563B, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC16091m interfaceC16091m2 = (i10 & 4) != 0 ? AbstractC16097s.f49862a : interfaceC16091m;
        C16073L c16073l2 = (i10 & 8) != 0 ? new C16073L() : c16073l;
        if ((i10 & 16) != 0) {
            C3516e c3516e = AbstractC0593T.f1824a;
            abstractC0563B = AbstractC2935m.f8797a;
        }
        this(context, workerParameters, interfaceC16091m2, c16073l2, abstractC0563B);
    }
}
