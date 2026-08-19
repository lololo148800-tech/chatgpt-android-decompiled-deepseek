package p083D3;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import p1016t3.AbstractC19756F;
import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1016t3.C19788o;
import p1016t3.C19794u;
import p1073w3.AbstractC20817s;
import p232J3.C4253y;
import p658b5.C11248s;

/* JADX INFO: renamed from: D3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1873k {

    /* JADX INFO: renamed from: A */
    public boolean f5389A;

    /* JADX INFO: renamed from: a */
    public final Context f5390a;

    /* JADX INFO: renamed from: b */
    public final C1870h f5391b;

    /* JADX INFO: renamed from: c */
    public final PlaybackSession f5392c;

    /* JADX INFO: renamed from: i */
    public String f5398i;

    /* JADX INFO: renamed from: j */
    public PlaybackMetrics.Builder f5399j;

    /* JADX INFO: renamed from: k */
    public int f5400k;

    /* JADX INFO: renamed from: n */
    public AbstractC19756F f5403n;

    /* JADX INFO: renamed from: o */
    public C11248s f5404o;

    /* JADX INFO: renamed from: p */
    public C11248s f5405p;

    /* JADX INFO: renamed from: q */
    public C11248s f5406q;

    /* JADX INFO: renamed from: r */
    public C19788o f5407r;

    /* JADX INFO: renamed from: s */
    public C19788o f5408s;

    /* JADX INFO: renamed from: t */
    public C19788o f5409t;

    /* JADX INFO: renamed from: u */
    public boolean f5410u;

    /* JADX INFO: renamed from: v */
    public int f5411v;

    /* JADX INFO: renamed from: w */
    public boolean f5412w;

    /* JADX INFO: renamed from: x */
    public int f5413x;

    /* JADX INFO: renamed from: y */
    public int f5414y;

    /* JADX INFO: renamed from: z */
    public int f5415z;

    /* JADX INFO: renamed from: e */
    public final C19763M f5394e = new C19763M();

    /* JADX INFO: renamed from: f */
    public final C19762L f5395f = new C19762L();

    /* JADX INFO: renamed from: h */
    public final HashMap f5397h = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f5396g = new HashMap();

    /* JADX INFO: renamed from: d */
    public final long f5393d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public int f5401l = 0;

    /* JADX INFO: renamed from: m */
    public int f5402m = 0;

    public C1873k(Context context, PlaybackSession playbackSession) {
        this.f5390a = context.getApplicationContext();
        this.f5392c = playbackSession;
        C1870h c1870h = new C1870h();
        this.f5391b = c1870h;
        c1870h.f5385d = this;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2848a(C11248s c11248s) {
        String str;
        if (c11248s != null) {
            String str2 = (String) c11248s.f34082o0;
            C1870h c1870h = this.f5391b;
            synchronized (c1870h) {
                str = c1870h.f5387f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2849b() {
        PlaybackMetrics.Builder builder = this.f5399j;
        if (builder != null && this.f5389A) {
            builder.setAudioUnderrunCount(this.f5415z);
            this.f5399j.setVideoFramesDropped(this.f5413x);
            this.f5399j.setVideoFramesPlayed(this.f5414y);
            Long l4 = (Long) this.f5396g.get(this.f5398i);
            this.f5399j.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l10 = (Long) this.f5397h.get(this.f5398i);
            this.f5399j.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f5399j.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f5392c.reportPlaybackMetrics(this.f5399j.build());
        }
        this.f5399j = null;
        this.f5398i = null;
        this.f5415z = 0;
        this.f5413x = 0;
        this.f5414y = 0;
        this.f5407r = null;
        this.f5408s = null;
        this.f5409t = null;
        this.f5389A = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m2850c(AbstractC19764N abstractC19764N, C4253y c4253y) {
        int iMo2413b;
        PlaybackMetrics.Builder builder = this.f5399j;
        if (c4253y == null || (iMo2413b = abstractC19764N.mo2413b(c4253y.f13895a)) == -1) {
            return;
        }
        C19762L c19762l = this.f5395f;
        int i10 = 0;
        abstractC19764N.mo2410f(iMo2413b, c19762l, false);
        int i11 = c19762l.f62579c;
        C19763M c19763m = this.f5394e;
        abstractC19764N.m20727n(i11, c19763m);
        C19794u c19794u = c19763m.f62588c.f62786b;
        if (c19794u != null) {
            int iM21424y = AbstractC20817s.m21424y(c19794u.f62779a, c19794u.f62780b);
            if (iM21424y == 0) {
                i10 = 3;
            } else if (iM21424y != 1) {
                i10 = iM21424y != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        if (c19763m.f62597l != -9223372036854775807L && !c19763m.f62595j && !c19763m.f62593h && !c19763m.m20722a()) {
            builder.setMediaDurationMillis(AbstractC20817s.m21399M(c19763m.f62597l));
        }
        builder.setPlaybackType(c19763m.m20722a() ? 2 : 1);
        this.f5389A = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m2851d(C1863a c1863a, String str) {
        C4253y c4253y = c1863a.f5350d;
        if ((c4253y == null || !c4253y.m5017b()) && str.equals(this.f5398i)) {
            m2849b();
        }
        this.f5396g.remove(str);
        this.f5397h.remove(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m2852e(int i10, long j10, C19788o c19788o, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC1871i.m2808q(i10).setTimeSinceCreatedMillis(j10 - this.f5393d);
        if (c19788o != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = c19788o.f62751l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c19788o.f62752m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c19788o.f62749j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = c19788o.f62748i;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = c19788o.f62758s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = c19788o.f62759t;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = c19788o.f62729A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = c19788o.f62730B;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = c19788o.f62743d;
            if (str4 != null) {
                int i18 = AbstractC20817s.f66106a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = c19788o.f62760u;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f5389A = true;
        this.f5392c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
