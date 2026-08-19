package p109E3;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import bb.AbstractC11278C;
import bb.C11333z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p083D3.AbstractC1872j;
import p1016t3.C19778e;
import p1073w3.AbstractC20817s;
import p523V9.AbstractC8135l5;

/* JADX INFO: renamed from: E3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2279c {
    /* JADX INFO: renamed from: a */
    public static C2281e m3369a(AudioManager audioManager, C19778e c19778e) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c19778e.m20736a().f45413Y);
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC8135l5.m8654b(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile audioProfileM2824c = AbstractC1872j.m2824c(directProfilesForAttributes.get(i10));
            if (audioProfileM2824c.getEncapsulationType() != 1) {
                int format = audioProfileM2824c.getFormat();
                if (AbstractC20817s.m21387A(format) || C2281e.f7053e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC8135l5.m8654b(audioProfileM2824c.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC8135l5.m8654b(audioProfileM2824c.getChannelMasks())));
                    }
                }
            }
        }
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        for (Map.Entry entry : map.entrySet()) {
            c11333zM12690s.m12762a(new C2280d(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C2281e(c11333zM12690s.m12768j());
    }

    /* JADX INFO: renamed from: b */
    public static C2287k m3370b(AudioManager audioManager, C19778e c19778e) {
        try {
            audioManager.getClass();
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c19778e.m20736a().f45413Y);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C2287k((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
