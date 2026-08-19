package p896n2;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: n2.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17464q {
    /* JADX INFO: renamed from: a */
    public static AudioAttributes m19159a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static AudioAttributes.Builder m19160b() {
        return new AudioAttributes.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static AudioAttributes.Builder m19161c(AudioAttributes.Builder builder, int i10) {
        return builder.setContentType(i10);
    }

    /* JADX INFO: renamed from: d */
    public static AudioAttributes.Builder m19162d(AudioAttributes.Builder builder, int i10) {
        return builder.setUsage(i10);
    }
}
