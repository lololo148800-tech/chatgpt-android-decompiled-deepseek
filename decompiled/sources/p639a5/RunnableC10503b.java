package p639a5;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import jp.C16279d;

/* JADX INFO: renamed from: a5.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC10503b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31120Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f31121Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f31122o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f31123p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f31124q0;

    public RunnableC10503b(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f31124q0 = systemForegroundService;
        this.f31121Z = i10;
        this.f31123p0 = notification;
        this.f31122o0 = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31120Y) {
            case 0:
                int i10 = Build.VERSION.SDK_INT;
                int i11 = this.f31122o0;
                Notification notification = (Notification) this.f31123p0;
                int i12 = this.f31121Z;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f31124q0;
                if (i10 >= 31) {
                    AbstractC10505d.m10964a(systemForegroundService, i12, notification, i11);
                } else if (i10 >= 29) {
                    AbstractC10504c.m10963a(systemForegroundService, i12, notification, i11);
                } else {
                    systemForegroundService.startForeground(i12, notification);
                }
                break;
            default:
                for (int i13 = this.f31121Z; i13 < this.f31122o0; i13++) {
                    int i14 = i13 * 2;
                    int i15 = i14 + 1;
                    float[] fArr = (float[]) this.f31123p0;
                    float f10 = fArr[i14];
                    float[] fArr2 = ((C16279d) this.f31124q0).f50441s;
                    float f11 = fArr2[i15];
                    float f12 = fArr[i15];
                    float f13 = fArr2[i14];
                    fArr[i14] = (f10 * f13) - (f12 * f11);
                    fArr[i15] = (f12 * f13) + (f10 * f11);
                }
                break;
        }
    }

    public RunnableC10503b(C16279d c16279d, int i10, int i11, float[] fArr) {
        this.f31124q0 = c16279d;
        this.f31121Z = i10;
        this.f31122o0 = i11;
        this.f31123p0 = fArr;
    }
}
