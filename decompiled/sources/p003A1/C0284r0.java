package p003A1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import io.sentry.util.C15501f;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import no.AbstractC17708b;
import p277L.ScheduledExecutorServiceC4831d;
import p523V9.AbstractC8143m5;
import p544W9.AbstractC8577W2;
import p817j$.util.DesugarTimeZone;

/* JADX INFO: renamed from: A1.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284r0 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1034a;

    public /* synthetic */ C0284r0(int i10) {
        this.f1034a = i10;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1034a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                C0290t0 c0290t0 = new C0290t0(choreographer, AbstractC8143m5.m8678a(looperMyLooper));
                return c0290t0.plus(c0290t0.f1053w0);
            case 1:
                return new Random();
            case 2:
                return 0L;
            case 3:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 4:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 5:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return AbstractC8577W2.m9243e();
                }
                if (Looper.myLooper() != null) {
                    return new ScheduledExecutorServiceC4831d(new Handler(Looper.myLooper()));
                }
                return null;
            case 7:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSzzz", Locale.ROOT);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            case 8:
                return new PathMeasure();
            case 9:
                return new Path();
            case 10:
                return new Path();
            case 11:
                return new float[4];
            case 12:
                return new C15501f();
            case 13:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat2.setLenient(false);
                simpleDateFormat2.setTimeZone(AbstractC17708b.f56540e);
                return simpleDateFormat2;
            default:
                return Boolean.FALSE;
        }
    }
}
