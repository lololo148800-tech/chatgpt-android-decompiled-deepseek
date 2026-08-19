package p984r8;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p349O0.C5975S;
import p349O0.C5997d;
import p350O1.C6045C;
import p523V9.AbstractC7966P5;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: r8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18887a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60211Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f60212Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18887a(String str, int i10) {
        super(0);
        this.f60211Y = i10;
        this.f60212Z = str;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String strValueOf;
        String str = this.f60212Z;
        switch (this.f60211Y) {
            case 0:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 1:
                return C5997d.m6430Q(new C6045C(AbstractC8676n.m9365b(0, str.length()), str, 4), C5975S.f19448r0);
            case 2:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 3:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 4:
                return "Unexpected EOF at the operation=" + str;
            case 5:
                return AbstractC9306j0.m9891j(str, "]", new StringBuilder("Received unknown broadcast intent: ["));
            default:
                if (str.length() <= 0) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = str.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale US = Locale.US;
                    AbstractC16544l.m18093f(US, "US");
                    strValueOf = AbstractC7966P5.m8259g(cCharAt, US);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb2.append((Object) strValueOf);
                String strSubstring = str.substring(1);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
        }
    }
}
