package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p167Gb.C3032c;
import p329N3.RunnableC5611a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18067d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/u;", "<init>", "()V", "androidx/lifecycle/H", "lifecycle-process_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ProcessLifecycleOwner implements InterfaceC11112u {

    /* JADX INFO: renamed from: u0 */
    public static final ProcessLifecycleOwner f33399u0 = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: Y */
    public int f33400Y;

    /* JADX INFO: renamed from: Z */
    public int f33401Z;

    /* JADX INFO: renamed from: q0 */
    public Handler f33404q0;

    /* JADX INFO: renamed from: o0 */
    public boolean f33402o0 = true;

    /* JADX INFO: renamed from: p0 */
    public boolean f33403p0 = true;

    /* JADX INFO: renamed from: r0 */
    public final C11114w f33405r0 = new C11114w(this, true);

    /* JADX INFO: renamed from: s0 */
    public final RunnableC5611a f33406s0 = new RunnableC5611a(this, 22);

    /* JADX INFO: renamed from: t0 */
    public final C3032c f33407t0 = new C3032c(this, 26);

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: renamed from: b */
    public final void m12128b() {
        int i10 = this.f33401Z + 1;
        this.f33401Z = i10;
        if (i10 == 1) {
            if (this.f33402o0) {
                this.f33405r0.m12170f(EnumC11103l.ON_RESUME);
                this.f33402o0 = false;
            } else {
                Handler handler = this.f33404q0;
                AbstractC16544l.m18091d(handler);
                handler.removeCallbacks(this.f33406s0);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return this.f33405r0;
    }
}
