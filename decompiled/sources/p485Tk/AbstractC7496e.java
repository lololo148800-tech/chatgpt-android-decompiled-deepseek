package p485Tk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import mm.C17314q;
import p025An.AbstractC0563B;
import p025An.AbstractC0593T;
import p025An.C0565C;
import p025An.C0566C0;
import p025An.C0569E;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0638t;
import p033B5.C0841y;
import p049Bm.InterfaceC1426a;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p334Na.AbstractC5695b;
import p509Uk.C7713f;
import p571X9.AbstractC9227W;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Tk.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7496e implements InterfaceC7494c {

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23796o0 = AtomicIntegerFieldUpdater.newUpdater(AbstractC7496e.class, "closed");

    /* JADX INFO: renamed from: Y */
    public final C17314q f23797Y;

    /* JADX INFO: renamed from: Z */
    public final C17314q f23798Z;
    private volatile /* synthetic */ int closed = 0;

    public AbstractC7496e() {
        final int i10 = 0;
        this.f23797Y = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: Tk.d

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractC7496e f23795Z;

            {
                this.f23795Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                AbstractC7496e abstractC7496e = this.f23795Z;
                switch (i10) {
                    case 0:
                        ((C7713f) abstractC7496e).f24303p0.getClass();
                        C3516e c3516e = AbstractC0593T.f1824a;
                        return ExecutorC3515d.f10633Z;
                    default:
                        return AbstractC5695b.m6138e(new C0566C0(null), new C0841y(C0565C.f1783Y, 5)).plus((AbstractC0563B) abstractC7496e.f23797Y.getValue()).plus(new C0569E("ktor-okhttp-context"));
                }
            }
        });
        final int i11 = 1;
        this.f23798Z = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: Tk.d

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractC7496e f23795Z;

            {
                this.f23795Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                AbstractC7496e abstractC7496e = this.f23795Z;
                switch (i11) {
                    case 0:
                        ((C7713f) abstractC7496e).f24303p0.getClass();
                        C3516e c3516e = AbstractC0593T.f1824a;
                        return ExecutorC3515d.f10633Z;
                    default:
                        return AbstractC5695b.m6138e(new C0566C0(null), new C0841y(C0565C.f1783Y, 5)).plus((AbstractC0563B) abstractC7496e.f23797Y.getValue()).plus(new C0569E("ktor-okhttp-context"));
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f23796o0.compareAndSet(this, 0, 1)) {
            InterfaceC18774g interfaceC18774g = getCoroutineContext().get(C0625m0.f1875Y);
            InterfaceC0638t interfaceC0638t = interfaceC18774g instanceof InterfaceC0638t ? (InterfaceC0638t) interfaceC18774g : null;
            if (interfaceC0638t == null) {
                return;
            }
            ((C0631p0) interfaceC0638t).m1279g0();
        }
    }

    @Override // p025An.InterfaceC0571F
    public InterfaceC18776i getCoroutineContext() {
        return (InterfaceC18776i) this.f23798Z.getValue();
    }
}
