package p109E3;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2283g extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2286j f7056a;

    public C2283g(C2286j c2286j) {
        this.f7056a = c2286j;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C2286j c2286j = this.f7056a;
        c2286j.m3379a(C2281e.m3373c(c2286j.f7062a, c2286j.f7070i, c2286j.f7069h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C2286j c2286j = this.f7056a;
        C2287k c2287k = c2286j.f7069h;
        int i10 = AbstractC20817s.f66106a;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (AbstractC20817s.m21400a(audioDeviceInfo, c2287k)) {
                c2286j.f7069h = null;
                break;
            }
        }
        c2286j.m3379a(C2281e.m3373c(c2286j.f7062a, c2286j.f7070i, c2286j.f7069h));
    }
}
