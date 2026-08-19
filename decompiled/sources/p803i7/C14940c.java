package p803i7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: i7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14940c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46548Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Map.Entry f46549Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f46550o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14940c(Map.Entry entry, String str, int i10) {
        super(0);
        this.f46548Y = i10;
        this.f46549Z = entry;
        this.f46550o0 = str;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String str = this.f46550o0;
        Map.Entry entry = this.f46549Z;
        switch (this.f46548Y) {
            case 0:
                Object key = entry.getKey();
                StringBuilder sb2 = new StringBuilder("Key \"");
                sb2.append(key);
                sb2.append("\" was modified to \"");
                return AbstractC9306j0.m9891j(str, "\" to match our constraints.", sb2);
            default:
                return String.format(Locale.US, "Invalid timing name: %s, sanitized to: %s", Arrays.copyOf(new Object[]{entry.getKey(), str}, 2));
        }
    }
}
