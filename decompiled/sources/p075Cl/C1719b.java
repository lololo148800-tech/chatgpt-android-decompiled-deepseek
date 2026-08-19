package p075Cl;

import android.media.AudioAttributes;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Cl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1719b {

    /* JADX INFO: renamed from: a */
    public final int f4933a;

    /* JADX INFO: renamed from: b */
    public final AudioAttributes f4934b;

    /* JADX INFO: renamed from: c */
    public final int f4935c;

    public C1719b(int i10, AudioAttributes audioAttributes, int i11) {
        this.f4933a = i10;
        this.f4934b = audioAttributes;
        this.f4935c = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1719b() {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
        AbstractC16544l.m18093f(audioAttributesBuild, "build(...)");
        this(3, audioAttributesBuild, 0);
    }
}
