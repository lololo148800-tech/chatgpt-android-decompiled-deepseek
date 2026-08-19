package p849k7;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p765g7.InterfaceC13823a;
import p918o7.C17878e;

/* JADX INFO: renamed from: k7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16353f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C16353f f50788Z = new C16353f(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C16353f f50789o0 = new C16353f(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50790Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16353f(int i10, int i11) {
        super(i10);
        this.f50790Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f50790Y) {
            case 0:
                InterfaceC13823a it = (InterfaceC13823a) obj;
                AbstractC16544l.m18094g(it, "it");
                return new C17878e(it);
            default:
                return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        }
    }
}
