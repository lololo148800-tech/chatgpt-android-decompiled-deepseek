package p1058v7;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: v7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20470b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f64977Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f64978Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f64979o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20470b(long j10, long j11, long j12) {
        super(0);
        this.f64977Y = j10;
        this.f64978Z = j11;
        this.f64979o0 = j12;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return String.format(Locale.US, "Too much disk space used (%d/%d): cleaning up to free %d bytes…", Arrays.copyOf(new Object[]{Long.valueOf(this.f64977Y), Long.valueOf(this.f64978Z), Long.valueOf(this.f64979o0)}, 3));
    }
}
