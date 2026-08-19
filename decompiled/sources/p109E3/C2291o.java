package p109E3;

import p001A.AbstractC0010F;
import p1016t3.C19788o;

/* JADX INFO: renamed from: E3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2291o extends Exception {

    /* JADX INFO: renamed from: Y */
    public final int f7080Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f7081Z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2291o(int i10, int i11, int i12, int i13, C19788o c19788o, boolean z6, RuntimeException runtimeException) {
        StringBuilder sbM21e = AbstractC0010F.m21e("AudioTrack init failed ", i10, " Config(", i11, ", ");
        sbM21e.append(i12);
        sbM21e.append(", ");
        sbM21e.append(i13);
        sbM21e.append(") ");
        sbM21e.append(c19788o);
        sbM21e.append(z6 ? " (recoverable)" : "");
        super(sbM21e.toString(), runtimeException);
        this.f7080Y = i10;
        this.f7081Z = z6;
    }
}
