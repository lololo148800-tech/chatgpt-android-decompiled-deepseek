package p1101x8;

import java.math.BigInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: x8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21156a {

    /* JADX INFO: renamed from: a */
    public static final C21156a f67231a = new C21156a();

    /* JADX INFO: renamed from: b */
    public static final BigInteger f67232b = new BigInteger("ffffffffffffffff", 16);

    /* JADX INFO: renamed from: a */
    public static String m21592a(BigInteger traceId) {
        AbstractC16544l.m18094g(traceId, "traceId");
        try {
            String string = traceId.shiftRight(64).toString(16);
            AbstractC16544l.m18093f(string, "traceId.shiftRight(LONG_…SIZE).toString(HEX_RADIX)");
            return AbstractC21322p.m21686T(16, string);
        } catch (ArithmeticException | NumberFormatException | IllegalArgumentException unused) {
            return "";
        }
    }
}
