package p700d8;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p214Ib.C3676s;

/* JADX INFO: renamed from: d8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13041b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41441Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3676s f41442Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13041b(C3676s c3676s, int i10) {
        super(0);
        this.f41441Y = i10;
        this.f41442Z = c3676s;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C3676s c3676s = this.f41442Z;
        switch (this.f41441Y) {
            case 0:
                break;
        }
        return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{c3676s}, 1));
    }
}
