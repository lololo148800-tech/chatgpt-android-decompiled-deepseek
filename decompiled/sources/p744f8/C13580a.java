package p744f8;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Looper;
import android.util.Printer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p592Y7.AbstractC9667b;
import p592Y7.InterfaceC9670e;
import p765g7.InterfaceC13823a;
import p804i8.InterfaceC14942a;
import p959q8.InterfaceC18645g;

/* JADX INFO: renamed from: f8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13580a implements Printer, InterfaceC18645g {

    /* JADX INFO: renamed from: Y */
    public final long f42931Y;

    /* JADX INFO: renamed from: Z */
    public final long f42932Z;

    /* JADX INFO: renamed from: o0 */
    public long f42933o0;

    /* JADX INFO: renamed from: p0 */
    public String f42934p0 = "";

    /* JADX INFO: renamed from: q0 */
    public InterfaceC13823a f42935q0;

    public C13580a(long j10) {
        this.f42931Y = j10;
        this.f42932Z = TimeUnit.MILLISECONDS.toNanos(j10);
    }

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: a */
    public final void mo15102a(Context context) {
        Looper.getMainLooper().setMessageLogging(null);
    }

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: e */
    public final void mo15103e(InterfaceC13823a interfaceC13823a, Context context) {
        AbstractC16544l.m18094g(context, "context");
        this.f42935q0 = interfaceC13823a;
        Looper.getMainLooper().setMessageLogging(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13580a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy");
        return this.f42931Y == ((C13580a) obj).f42931Y;
    }

    public final int hashCode() {
        long j10 = this.f42931Y;
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Override // android.util.Printer
    public final void println(String str) {
        InterfaceC13823a interfaceC13823a;
        if (str != null) {
            long jNanoTime = System.nanoTime();
            if (AbstractC21329w.m21734u(str, ">>>>> Dispatching to ", false)) {
                String strSubstring = str.substring(21);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                this.f42934p0 = strSubstring;
                this.f42933o0 = jNanoTime;
                return;
            }
            if (AbstractC21329w.m21734u(str, "<<<<< Finished to ", false)) {
                long j10 = jNanoTime - this.f42933o0;
                if (j10 <= this.f42932Z || (interfaceC13823a = this.f42935q0) == null) {
                    return;
                }
                InterfaceC9670e interfaceC9670eM10254a = AbstractC9667b.m10254a(interfaceC13823a);
                InterfaceC14942a interfaceC14942a = interfaceC9670eM10254a instanceof InterfaceC14942a ? (InterfaceC14942a) interfaceC9670eM10254a : null;
                if (interfaceC14942a != null) {
                    interfaceC14942a.mo16099a(j10, this.f42934p0);
                }
            }
        }
    }

    public final String toString() {
        return AbstractC10763a.m11050h(this.f42931Y, Separators.RPAREN, new StringBuilder("MainLooperLongTaskStrategy("));
    }
}
