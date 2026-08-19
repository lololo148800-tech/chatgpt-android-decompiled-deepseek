package p896n2;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p846k4.C16340i;

/* JADX INFO: renamed from: n2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17456i extends C16340i {

    /* JADX INFO: renamed from: q0 */
    public static HandlerThread f55804q0;

    /* JADX INFO: renamed from: r0 */
    public static Handler f55805r0;

    /* JADX INFO: renamed from: Y */
    public final int f55806Y;

    /* JADX INFO: renamed from: Z */
    public SparseIntArray[] f55807Z = new SparseIntArray[9];

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f55808o0 = new ArrayList();

    /* JADX INFO: renamed from: p0 */
    public final WindowOnFrameMetricsAvailableListenerC17455h f55809p0 = new WindowOnFrameMetricsAvailableListenerC17455h(this, 0);

    public C17456i(int i10) {
        this.f55806Y = i10;
    }

    /* JADX INFO: renamed from: o */
    public static void m19138o(SparseIntArray sparseIntArray, long j10) {
        if (sparseIntArray != null) {
            int i10 = (int) ((500000 + j10) / 1000000);
            if (j10 >= 0) {
                sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
            }
        }
    }

    @Override // p846k4.C16340i
    /* JADX INFO: renamed from: f */
    public final void mo17938f(Activity activity) {
        if (f55804q0 == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            f55804q0 = handlerThread;
            handlerThread.start();
            f55805r0 = new Handler(f55804q0.getLooper());
        }
        for (int i10 = 0; i10 <= 8; i10++) {
            SparseIntArray[] sparseIntArrayArr = this.f55807Z;
            if (sparseIntArrayArr[i10] == null && (this.f55806Y & (1 << i10)) != 0) {
                sparseIntArrayArr[i10] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.f55809p0, f55805r0);
        this.f55808o0.add(new WeakReference(activity));
    }

    @Override // p846k4.C16340i
    /* JADX INFO: renamed from: j */
    public final SparseIntArray[] mo17939j() {
        return this.f55807Z;
    }

    @Override // p846k4.C16340i
    /* JADX INFO: renamed from: k */
    public final SparseIntArray[] mo17940k(Activity activity) {
        ArrayList<WeakReference> arrayList = this.f55808o0;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.f55809p0);
        return this.f55807Z;
    }

    @Override // p846k4.C16340i
    /* JADX INFO: renamed from: m */
    public final SparseIntArray[] mo17942m() {
        SparseIntArray[] sparseIntArrayArr = this.f55807Z;
        this.f55807Z = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    @Override // p846k4.C16340i
    /* JADX INFO: renamed from: n */
    public final SparseIntArray[] mo17943n() {
        ArrayList arrayList = this.f55808o0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.f55809p0);
                arrayList.remove(size);
            }
        }
        return this.f55807Z;
    }
}
