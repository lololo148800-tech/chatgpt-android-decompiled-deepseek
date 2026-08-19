package p109E3;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import bb.AbstractC11281F;
import bb.AbstractC11320m;
import bb.C11280E;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2277a {
    /* JADX INFO: renamed from: a */
    private static AbstractC11281F m3365a() {
        C11280E c11280e = new C11280E(4);
        Integer[] numArr = {8, 7};
        AbstractC11320m.m12723b(2, numArr);
        c11280e.m12765f(c11280e.f34261b + 2);
        System.arraycopy(numArr, 0, (Object[]) c11280e.f34260a, c11280e.f34261b, 2);
        c11280e.f34261b += 2;
        int i10 = AbstractC20817s.f66106a;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            AbstractC11320m.m12723b(2, numArr2);
            c11280e.m12765f(c11280e.f34261b + 2);
            System.arraycopy(numArr2, 0, (Object[]) c11280e.f34260a, c11280e.f34261b, 2);
            c11280e.f34261b += 2;
        }
        if (i10 >= 33) {
            c11280e.m12762a(30);
        }
        return c11280e.m12702j();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3366b(AudioManager audioManager, C2287k c2287k) {
        AudioDeviceInfo[] devices;
        if (c2287k == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c2287k.f7072a};
        }
        AbstractC11281F abstractC11281FM3365a = m3365a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC11281FM3365a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
