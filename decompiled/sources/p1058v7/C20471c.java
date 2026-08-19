package p1058v7;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: v7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20471c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64980Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20472d f64981Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20471c(C20472d c20472d, int i10) {
        super(0);
        this.f64980Y = i10;
        this.f64981Z = c20472d;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C20472d c20472d = this.f64981Z;
        switch (this.f64980Y) {
            case 0:
                return String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{c20472d.f64982Y.getPath()}, 1));
            case 1:
                return String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{c20472d.f64982Y.getPath()}, 1));
            default:
                return String.format(Locale.US, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{c20472d.f64982Y.getPath()}, 1));
        }
    }
}
