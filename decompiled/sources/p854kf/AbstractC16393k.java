package p854kf;

import android.hardware.camera2.params.OutputConfiguration;
import android.icu.text.MessageFormat;
import android.media.AudioRecordingConfiguration;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: kf.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC16393k {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ OutputConfiguration m17982e(Surface surface) {
        return new OutputConfiguration(surface);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ MessageFormat m17983f(String str, Locale locale) {
        return new MessageFormat(str, locale);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration m17986i(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ Class m17991n() {
        return CompletableFuture.class;
    }
}
