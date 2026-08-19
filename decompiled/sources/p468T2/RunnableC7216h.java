package p468T2;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.C12048m;
import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15148O;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.backpressure.InterfaceC15322a;
import java.util.ArrayList;
import java.util.List;
import p084D4.AbstractC1900Y;
import p1036u9.C20171q;
import p283L5.AbstractC4941g;
import p784hb.C14438g;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: T2.h */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7216h implements Runnable, InterfaceC15322a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22891Y;

    /* JADX INFO: renamed from: Z */
    public int f22892Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f22893o0;

    public /* synthetic */ RunnableC7216h(Object obj, int i10, int i11) {
        this.f22891Y = i11;
        this.f22893o0 = obj;
        this.f22892Z = i10;
    }

    @Override // io.sentry.backpressure.InterfaceC15322a
    /* JADX INFO: renamed from: a */
    public int mo7607a() {
        return this.f22892Z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        Object obj = this.f22893o0;
        switch (this.f22891Y) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                if (this.f22892Z == 1) {
                    while (i10 < size) {
                        ((AbstractC7215g) arrayList.get(i10)).mo7123b();
                        i10++;
                    }
                } else {
                    while (i10 < size) {
                        ((AbstractC7215g) arrayList.get(i10)).mo7122a();
                        i10++;
                    }
                }
                break;
            case 1:
                ((SystemForegroundService) obj).f33735q0.cancel(this.f22892Z);
                break;
            case 2:
                RecyclerView recyclerView = ((C12048m) obj).f36583o1;
                if (!recyclerView.f33611L0) {
                    AbstractC1900Y abstractC1900Y = recyclerView.f33592B0;
                    if (abstractC1900Y != null) {
                        abstractC1900Y.mo2987w0(recyclerView, this.f22892Z);
                    } else {
                        AbstractC15256t.m16465c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
            case 3:
                C15524y1 c15524y1 = (C15524y1) obj;
                if (C15109B.f47017a.mo16245i()) {
                    if (this.f22892Z > 0) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
                    }
                    this.f22892Z = 0;
                } else {
                    int i11 = this.f22892Z;
                    if (i11 < 10) {
                        this.f22892Z = i11 + 1;
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f22892Z));
                    }
                }
                InterfaceC15148O executorService = c15524y1.getExecutorService();
                if (!executorService.mo15969m()) {
                    executorService.mo15970r(this, ErrorBoundaryKt.SAMPLING_RATE);
                }
                break;
            case 4:
                ((C20171q) obj).m20998g(this.f22892Z);
                break;
            default:
                AbstractC18610b abstractC18610b = (AbstractC18610b) ((C14438g) obj).f45414Y;
                if (abstractC18610b != null) {
                    abstractC18610b.mo2477i(this.f22892Z);
                }
                break;
        }
    }

    @Override // io.sentry.backpressure.InterfaceC15322a
    public void start() {
        InterfaceC15148O executorService = ((C15524y1) this.f22893o0).getExecutorService();
        if (executorService.mo15969m()) {
            return;
        }
        executorService.mo15970r(this, 500);
    }

    public RunnableC7216h(C15524y1 c15524y1) {
        this.f22891Y = 3;
        this.f22892Z = 0;
        this.f22893o0 = c15524y1;
    }

    public RunnableC7216h(List list, int i10, Throwable th2) {
        this.f22891Y = 0;
        AbstractC4941g.m5558Q(list, "initCallbacks cannot be null");
        this.f22893o0 = new ArrayList(list);
        this.f22892Z = i10;
    }
}
