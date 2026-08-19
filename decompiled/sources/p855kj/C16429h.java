package p855kj;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.C0376k;

/* JADX INFO: renamed from: kj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16429h {

    /* JADX INFO: renamed from: a */
    public int f50957a;

    /* JADX INFO: renamed from: b */
    public boolean f50958b;

    /* JADX INFO: renamed from: c */
    public boolean f50959c;

    /* JADX INFO: renamed from: d */
    public AudioFocusRequest f50960d;

    /* JADX INFO: renamed from: e */
    public int f50961e;

    /* JADX INFO: renamed from: f */
    public int f50962f;

    /* JADX INFO: renamed from: g */
    public int f50963g;

    /* JADX INFO: renamed from: h */
    public int f50964h;

    /* JADX INFO: renamed from: i */
    public int f50965i;

    /* JADX INFO: renamed from: j */
    public final Context f50966j;

    /* JADX INFO: renamed from: k */
    public final C0376k f50967k;

    /* JADX INFO: renamed from: l */
    public final AudioManager f50968l;

    /* JADX INFO: renamed from: m */
    public final AudioManager.OnAudioFocusChangeListener f50969m;

    public C16429h(Context context, C0376k logger, AudioManager audioManager, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(logger, "logger");
        AbstractC16544l.m18094g(audioManager, "audioManager");
        AbstractC16544l.m18094g(audioFocusChangeListener, "audioFocusChangeListener");
        this.f50966j = context;
        this.f50967k = logger;
        this.f50968l = audioManager;
        this.f50969m = audioFocusChangeListener;
        this.f50961e = 3;
        this.f50962f = 2;
        this.f50964h = 2;
        this.f50965i = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m18010a(boolean z6) {
        AudioManager audioManager = this.f50968l;
        if (z6) {
            audioManager.startBluetoothSco();
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18011b(boolean z6) {
        this.f50968l.setSpeakerphoneOn(z6);
    }
}
