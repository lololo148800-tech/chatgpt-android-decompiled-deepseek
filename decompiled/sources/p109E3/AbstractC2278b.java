package p109E3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import bb.AbstractC11278C;
import bb.AbstractC11314g0;
import bb.C11297W;
import bb.C11298X;
import bb.C11299Y;
import bb.C11333z;
import p1016t3.C19778e;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2278b {
    /* JADX INFO: renamed from: a */
    public static AbstractC11278C m3367a(C19778e c19778e) {
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        C11299Y c11299y = C2281e.f7053e;
        C11297W c11297w = c11299y.f34199Z;
        if (c11297w == null) {
            C11297W c11297w2 = new C11297W(c11299y, new C11298X(c11299y.f34202q0, 0, c11299y.f34203r0));
            c11299y.f34199Z = c11297w2;
            c11297w = c11297w2;
        }
        AbstractC11314g0 it = c11297w.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (AbstractC20817s.f66106a >= AbstractC20817s.m21413n(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) c19778e.m20736a().f45413Y)) {
                c11333zM12690s.m12762a(num);
            }
        }
        c11333zM12690s.m12762a(2);
        return c11333zM12690s.m12768j();
    }

    /* JADX INFO: renamed from: b */
    public static int m3368b(int i10, int i11, C19778e c19778e) {
        for (int i12 = 10; i12 > 0; i12--) {
            int iM21415p = AbstractC20817s.m21415p(i12);
            if (iM21415p != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iM21415p).build(), (AudioAttributes) c19778e.m20736a().f45413Y)) {
                return i12;
            }
        }
        return 0;
    }
}
