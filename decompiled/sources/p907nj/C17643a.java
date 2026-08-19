package p907nj;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p855kj.AbstractC16428g;
import p855kj.C16423b;
import p855kj.C16424c;
import p855kj.C16425d;
import p855kj.C16426e;
import p855kj.C16427f;
import p855kj.C16429h;
import p855kj.C16432k;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: nj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17643a extends AudioDeviceCallback implements InterfaceC17644b {

    /* JADX INFO: renamed from: a */
    public C16432k f56429a;

    /* JADX INFO: renamed from: b */
    public final AudioManager f56430b;

    /* JADX INFO: renamed from: c */
    public final Handler f56431c;

    public C17643a(AudioManager audioManager, Handler handler) {
        AbstractC16544l.m18094g(audioManager, "audioManager");
        AbstractC16544l.m18094g(handler, "handler");
        this.f56430b = audioManager;
        this.f56431c = handler;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC16428g m19238c(AudioDeviceInfo audioDevice) {
        AbstractC16544l.m18094g(audioDevice, "$this$audioDevice");
        if (audioDevice.getType() == 7 || audioDevice.getType() == 8) {
            return new C16424c(audioDevice.getProductName().toString());
        }
        if (Build.VERSION.SDK_INT >= 31 && (audioDevice.getType() == 26 || audioDevice.getType() == 27)) {
            return new C16424c(audioDevice.getProductName().toString());
        }
        if (audioDevice.getType() == 3 || audioDevice.getType() == 4 || audioDevice.getType() == 22) {
            return new C16427f();
        }
        if (audioDevice.getType() == 1) {
            return new C16425d();
        }
        return audioDevice.getType() == 2 ? new C16426e() : null;
    }

    @Override // p907nj.InterfaceC17644b
    /* JADX INFO: renamed from: a */
    public final void mo19239a(C16432k c16432k) {
        this.f56429a = c16432k;
        this.f56430b.registerAudioDeviceCallback(this, this.f56431c);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    @Override // p907nj.InterfaceC17644b
    /* JADX INFO: renamed from: b */
    public final boolean mo19240b(AbstractC16428g audioDevice) {
        boolean z6;
        AbstractC16544l.m18094g(audioDevice, "audioDevice");
        AudioDeviceInfo[] devices = this.f56430b.getDevices(2);
        AbstractC16544l.m18093f(devices, "this.audioManager\n      …ager.GET_DEVICES_OUTPUTS)");
        for (AudioDeviceInfo it : devices) {
            AbstractC16544l.m18093f(it, "it");
            if (audioDevice instanceof C16424c) {
                if (it.getType() == 7 || it.getType() == 8 || (Build.VERSION.SDK_INT >= 31 && (it.getType() == 26 || it.getType() == 27))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else if (audioDevice instanceof C16425d) {
                if (it.getType() == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else if (!(audioDevice instanceof C16426e)) {
                if (!(audioDevice instanceof C16427f)) {
                    throw new C0644w();
                }
                if (it.getType() == 3 || it.getType() == 4 || (Build.VERSION.SDK_INT >= 26 && it.getType() == 22)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else if (it.getType() == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        if (audioDeviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                AbstractC16428g abstractC16428gM19238c = m19238c(audioDeviceInfo);
                if (abstractC16428gM19238c != null) {
                    arrayList.add(abstractC16428gM19238c);
                }
            }
            for (AbstractC16428g audioDevice : AbstractC17680n.m19328G0(arrayList)) {
                C16432k c16432k = this.f56429a;
                if (c16432k != null) {
                    c16432k.getClass();
                    AbstractC16544l.m18094g(audioDevice, "audioDevice");
                    c16432k.f50981j.m1013f("AudioSwitch", "onDeviceConnected(" + audioDevice + ')');
                    boolean z6 = audioDevice instanceof C16425d;
                    ConcurrentSkipListSet concurrentSkipListSet = c16432k.f50978g;
                    if (!z6 || !AbstractC17680n.m19322C0(concurrentSkipListSet).contains(new C16427f())) {
                        boolean zAdd = concurrentSkipListSet.add(audioDevice);
                        if (audioDevice instanceof C16427f) {
                            AbstractC17686t.m19394B(concurrentSkipListSet, C16423b.f50952Y);
                        }
                        C16432k.m18012d(c16432k, zAdd);
                    }
                }
            }
        }
    }

    @Override // p907nj.InterfaceC17644b
    public final void stop() {
        this.f56430b.unregisterAudioDeviceCallback(this);
        this.f56429a = null;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        boolean z6;
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        if (audioDeviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                AbstractC16428g abstractC16428gM19238c = m19238c(audioDeviceInfo);
                if (abstractC16428gM19238c != null) {
                    arrayList.add(abstractC16428gM19238c);
                }
            }
            for (AbstractC16428g audioDevice : AbstractC17680n.m19328G0(arrayList)) {
                C16432k c16432k = this.f56429a;
                if (c16432k != null) {
                    c16432k.getClass();
                    AbstractC16544l.m18094g(audioDevice, "audioDevice");
                    c16432k.f50981j.m1013f("AudioSwitch", "onDeviceDisconnected(" + audioDevice + ')');
                    ConcurrentSkipListSet concurrentSkipListSet = c16432k.f50978g;
                    boolean zRemove = concurrentSkipListSet.remove(audioDevice);
                    if (AbstractC16544l.m18089b(c16432k.f50976e, audioDevice)) {
                        c16432k.f50976e = null;
                    }
                    if (audioDevice instanceof C16427f) {
                        C16429h c16429h = c16432k.f50982k;
                        boolean zHasSystemFeature = c16429h.f50966j.getPackageManager().hasSystemFeature(FpwNpGDhomXHZ.lXQaVxkpiCn);
                        if (zHasSystemFeature) {
                            c16429h.f50967k.m1013f("AudioDeviceManager", "Earpiece available");
                        }
                        if (zHasSystemFeature) {
                            if (!concurrentSkipListSet.add(new C16425d()) && !zRemove) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            zRemove = z6;
                        }
                    }
                    C16432k.m18012d(c16432k, zRemove);
                }
            }
        }
    }
}
