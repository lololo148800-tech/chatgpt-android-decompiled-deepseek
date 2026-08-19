package p109E3;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import p001A.AbstractC0010F;
import p001A.C0072l;
import p1016t3.C19778e;
import p1073w3.AbstractC20817s;
import p281L3.C4928o;
import p720e6.C13288c;

/* JADX INFO: renamed from: E3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2286j {

    /* JADX INFO: renamed from: a */
    public final Context f7062a;

    /* JADX INFO: renamed from: b */
    public final C0072l f7063b;

    /* JADX INFO: renamed from: c */
    public final Handler f7064c;

    /* JADX INFO: renamed from: d */
    public final C2283g f7065d;

    /* JADX INFO: renamed from: e */
    public final C2285i f7066e;

    /* JADX INFO: renamed from: f */
    public final C2284h f7067f;

    /* JADX INFO: renamed from: g */
    public C2281e f7068g;

    /* JADX INFO: renamed from: h */
    public C2287k f7069h;

    /* JADX INFO: renamed from: i */
    public C19778e f7070i;

    /* JADX INFO: renamed from: j */
    public boolean f7071j;

    public C2286j(Context context, C0072l c0072l, C19778e c19778e, C2287k c2287k) {
        Context applicationContext = context.getApplicationContext();
        this.f7062a = applicationContext;
        this.f7063b = c0072l;
        this.f7070i = c19778e;
        this.f7069h = c2287k;
        int i10 = AbstractC20817s.f66106a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f7064c = handler;
        int i11 = AbstractC20817s.f66106a;
        this.f7065d = i11 >= 23 ? new C2283g(this) : null;
        this.f7066e = i11 >= 21 ? new C2285i(this, 0) : null;
        C2281e c2281e = C2281e.f7051c;
        String str = AbstractC20817s.f66108c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f7067f = uriFor != null ? new C2284h(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3379a(C2281e c2281e) {
        C4928o c4928o;
        if (!this.f7071j || c2281e.equals(this.f7068g)) {
            return;
        }
        this.f7068g = c2281e;
        C2268I c2268i = (C2268I) this.f7063b.f310Z;
        c2268i.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = c2268i.f6984i0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(AbstractC0010F.m20d("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), Separators.RPAREN));
        }
        if (c2281e.equals(c2268i.f7002x)) {
            return;
        }
        c2268i.f7002x = c2281e;
        C13288c c13288c = c2268i.f6997s;
        if (c13288c != null) {
            C2271L c2271l = (C2271L) c13288c.f42001Y;
            synchronized (c2271l.f4295Y) {
                c4928o = c2271l.f4294C0;
            }
            if (c4928o != null) {
                c4928o.m5540f();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3380b(AudioDeviceInfo audioDeviceInfo) {
        C2287k c2287k = this.f7069h;
        if (AbstractC20817s.m21400a(audioDeviceInfo, c2287k == null ? null : c2287k.f7072a)) {
            return;
        }
        C2287k c2287k2 = audioDeviceInfo != null ? new C2287k(audioDeviceInfo) : null;
        this.f7069h = c2287k2;
        m3379a(C2281e.m3373c(this.f7062a, this.f7070i, c2287k2));
    }
}
