package p087D7;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: D7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1975b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5846Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Map.Entry f5847Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1975b(Map.Entry entry, int i10) {
        super(0);
        this.f5846Y = i10;
        this.f5847Z = entry;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Map.Entry entry = this.f5847Z;
        switch (this.f5846Y) {
            case 0:
                return String.format(Locale.US, "Error serializing value for key %s, value was dropped.", Arrays.copyOf(new Object[]{entry.getKey()}, 1));
            case 1:
                return Separators.DOUBLE_QUOTE + entry + "\" is an invalid attribute, and was ignored.";
            case 2:
                return Separators.DOUBLE_QUOTE + entry + "\" key was in the reservedKeys set, and was dropped.";
            default:
                return AbstractC12107L1.m13824o(entry.getKey(), "Error converting value for key ", " to meta string, it will be dropped.");
        }
    }
}
