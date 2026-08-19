package p780h7;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: h7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C14424f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f45338Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f45339Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f45340o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14424f(int i10, String str, String str2) {
        super(0);
        this.f45338Y = i10;
        this.f45339Z = str;
        this.f45340o0 = str2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String str = this.f45340o0;
        String str2 = this.f45339Z;
        switch (this.f45338Y) {
            case 0:
                return String.format(Locale.US, "You are using a malformed url \"%s\" to setup %s tracking. It will be dropped. Please try using a host name instead, e.g.: \"example.com\"", Arrays.copyOf(new Object[]{str2, str}, 2));
            case 1:
                return String.format(Locale.US, "You are using a malformed host or ip address \"%s\" to setup %s tracking. It will be dropped.", Arrays.copyOf(new Object[]{str2, str}, 2));
            default:
                StringBuilder sb2 = new StringBuilder("tag \"");
                sb2.append(str2);
                sb2.append("\" was modified to \"");
                return AbstractC9306j0.m9891j(str, "\" to match our constraints.", sb2);
        }
    }
}
