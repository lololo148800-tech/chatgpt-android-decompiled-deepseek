package p109E3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import bb.AbstractC11278C;
import bb.AbstractC11281F;
import bb.AbstractC11320m;
import bb.C11280E;
import bb.C11294T;
import bb.C11299Y;
import bb.C11333z;
import java.util.List;
import livekit.org.webrtc.MediaStreamTrack;
import p013Ab.C0420b;
import p1016t3.AbstractC19754D;
import p1016t3.C19778e;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p523V9.AbstractC8135l5;
import p817j$.util.Objects;

/* JADX INFO: renamed from: E3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2281e {

    /* JADX INFO: renamed from: c */
    public static final C2281e f7051c = new C2281e(AbstractC11278C.m12695y(C2280d.f7047d));

    /* JADX INFO: renamed from: d */
    public static final C11294T f7052d;

    /* JADX INFO: renamed from: e */
    public static final C11299Y f7053e;

    /* JADX INFO: renamed from: a */
    public final SparseArray f7054a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final int f7055b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC11320m.m12723b(3, objArr);
        f7052d = AbstractC11278C.m12689r(3, objArr);
        C0420b c0420b = new C0420b(4);
        c0420b.m1038A(5, 6);
        c0420b.m1038A(17, 6);
        c0420b.m1038A(7, 6);
        c0420b.m1038A(30, 10);
        c0420b.m1038A(18, 6);
        c0420b.m1038A(6, 8);
        c0420b.m1038A(8, 8);
        c0420b.m1038A(14, 8);
        f7053e = c0420b.m1052g();
    }

    public C2281e(C11294T c11294t) {
        for (int i10 = 0; i10 < c11294t.f34187p0; i10++) {
            C2280d c2280d = (C2280d) c11294t.get(i10);
            this.f7054a.put(c2280d.f7048a, c2280d);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f7054a.size(); i11++) {
            iMax = Math.max(iMax, ((C2280d) this.f7054a.valueAt(i11)).f7049b);
        }
        this.f7055b = iMax;
    }

    /* JADX INFO: renamed from: a */
    public static C11294T m3371a(int[] iArr, int i10) {
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            c11333zM12690s.m12762a(new C2280d(i11, i10));
        }
        return c11333zM12690s.m12768j();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX INFO: renamed from: b */
    public static C2281e m3372b(Context context, Intent intent, C19778e c19778e, C2287k c2287k) {
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (c2287k == null) {
            c2287k = AbstractC20817s.f66106a >= 33 ? AbstractC2279c.m3370b(audioManager, c19778e) : null;
        }
        int i10 = AbstractC20817s.f66106a;
        if (i10 >= 33 && (AbstractC20817s.m21389C(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return AbstractC2279c.m3369a(audioManager, c19778e);
        }
        if (i10 >= 23 && AbstractC2277a.m3366b(audioManager, c2287k)) {
            return f7051c;
        }
        C11280E c11280e = new C11280E(4);
        c11280e.m12762a(2);
        if (i10 >= 29 && (AbstractC20817s.m21389C(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            AbstractC11278C abstractC11278CM3367a = AbstractC2278b.m3367a(c19778e);
            abstractC11278CM3367a.getClass();
            c11280e.m12764d(abstractC11278CM3367a);
            return new C2281e(m3371a(AbstractC8135l5.m8659k(c11280e.m12702j()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z6 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z6) {
            String str = AbstractC20817s.f66108c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    C11294T c11294t = f7052d;
                    c11294t.getClass();
                    c11280e.m12764d(c11294t);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            C11294T c11294t2 = f7052d;
            c11294t2.getClass();
            c11280e.m12764d(c11294t2);
        }
        if (intent == null || z6 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C2281e(m3371a(AbstractC8135l5.m8659k(c11280e.m12702j()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listM8654b = AbstractC8135l5.m8654b(intArrayExtra);
            listM8654b.getClass();
            c11280e.m12764d(listM8654b);
        }
        return new C2281e(m3371a(AbstractC8135l5.m8659k(c11280e.m12702j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX INFO: renamed from: c */
    public static C2281e m3373c(Context context, C19778e c19778e, C2287k c2287k) {
        return m3372b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c19778e, c2287k);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX INFO: renamed from: d */
    public final Pair m3374d(C19778e c19778e, C19788o c19788o) {
        String str = c19788o.f62752m;
        str.getClass();
        int iM20703a = AbstractC19754D.m20703a(str, c19788o.f62749j);
        Integer numValueOf = Integer.valueOf(iM20703a);
        C11299Y c11299y = f7053e;
        if (!c11299y.containsKey(numValueOf)) {
            return null;
        }
        int i10 = 6;
        if (iM20703a == 18 && !m3375e(18)) {
            iM20703a = 6;
        } else if ((iM20703a == 8 && !m3375e(8)) || (iM20703a == 30 && !m3375e(30))) {
            iM20703a = 7;
        }
        if (!m3375e(iM20703a)) {
            return null;
        }
        C2280d c2280d = (C2280d) this.f7054a.get(iM20703a);
        c2280d.getClass();
        boolean zContains = false;
        int iIntValue = c2280d.f7049b;
        AbstractC11281F abstractC11281F = c2280d.f7050c;
        int i11 = c19788o.f62729A;
        if (i11 == -1 || iM20703a == 18) {
            int i12 = c19788o.f62730B;
            if (i12 == -1) {
                i12 = 48000;
            }
            if (abstractC11281F == null) {
                int i13 = AbstractC20817s.f66106a;
                int i14 = c2280d.f7048a;
                if (i13 >= 29) {
                    iIntValue = AbstractC2278b.m3368b(i14, i12, c19778e);
                } else {
                    Object obj = c11299y.get(Integer.valueOf(i14));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i11 = iIntValue;
        } else if (!c19788o.f62752m.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC20817s.f66106a >= 33) {
            if (abstractC11281F != null) {
                int iM21415p = AbstractC20817s.m21415p(i11);
                if (iM21415p != 0) {
                    zContains = abstractC11281F.contains(Integer.valueOf(iM21415p));
                }
            } else if (i11 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i11 > 10) {
            return null;
        }
        int i15 = AbstractC20817s.f66106a;
        if (i15 > 28) {
            i10 = i11;
        } else if (i11 == 7) {
            i10 = 8;
        } else if (i11 != 3 && i11 != 4 && i11 != 5) {
            i10 = i11;
        }
        if (i15 <= 26 && "fugu".equals(AbstractC20817s.f66107b) && i10 == 1) {
            i10 = 2;
        }
        int iM21415p2 = AbstractC20817s.m21415p(i10);
        if (iM21415p2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM20703a), Integer.valueOf(iM21415p2));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3375e(int i10) {
        SparseArray sparseArray = this.f7054a;
        int i11 = AbstractC20817s.f66106a;
        return sparseArray.indexOfKey(i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2281e)) {
            return false;
        }
        C2281e c2281e = (C2281e) obj;
        SparseArray sparseArray = this.f7054a;
        SparseArray sparseArray2 = c2281e.f7054a;
        int i10 = AbstractC20817s.f66106a;
        if (sparseArray == null) {
            if (sparseArray2 == null) {
                zContentEquals = true;
            } else {
                zContentEquals = false;
            }
        } else if (sparseArray2 == null) {
            zContentEquals = false;
        } else if (AbstractC20817s.f66106a >= 31) {
            zContentEquals = sparseArray.contentEquals(sparseArray2);
        } else {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (Objects.equals(sparseArray.valueAt(i11), sparseArray2.get(sparseArray.keyAt(i11)))) {
                            i11++;
                        }
                    } else {
                        zContentEquals = true;
                    }
                }
            }
            zContentEquals = false;
        }
        return zContentEquals && this.f7055b == c2281e.f7055b;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f7054a;
        if (AbstractC20817s.f66106a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f7055b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7055b + ", audioProfiles=" + this.f7054a + "]";
    }
}
