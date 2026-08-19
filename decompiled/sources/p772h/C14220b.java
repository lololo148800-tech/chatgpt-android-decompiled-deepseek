package p772h;

import android.window.BackEvent;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14220b {

    /* JADX INFO: renamed from: a */
    public final float f44656a;

    /* JADX INFO: renamed from: b */
    public final float f44657b;

    /* JADX INFO: renamed from: c */
    public final float f44658c;

    /* JADX INFO: renamed from: d */
    public final int f44659d;

    public C14220b(BackEvent backEvent) {
        AbstractC16544l.m18094g(backEvent, "backEvent");
        C14219a c14219a = C14219a.f44655a;
        float fM15524d = c14219a.m15524d(backEvent);
        float fM15525e = c14219a.m15525e(backEvent);
        float fM15522b = c14219a.m15522b(backEvent);
        int iM15523c = c14219a.m15523c(backEvent);
        this.f44656a = fM15524d;
        this.f44657b = fM15525e;
        this.f44658c = fM15522b;
        this.f44659d = iM15523c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f44656a);
        sb2.append(", touchY=");
        sb2.append(this.f44657b);
        sb2.append(", progress=");
        sb2.append(this.f44658c);
        sb2.append(", swipeEdge=");
        return AbstractC12107L1.m13826q(sb2, this.f44659d, '}');
    }
}
