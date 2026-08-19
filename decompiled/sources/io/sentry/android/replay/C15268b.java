package io.sentry.android.replay;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.C21317k;

/* JADX INFO: renamed from: io.sentry.android.replay.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15268b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C15268b f47682Z = new C15268b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C15268b f47683o0 = new C15268b(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47684Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15268b(int i10, int i11) {
        super(i10);
        this.f47684Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f47684Y) {
            case 0:
                C21317k it = (C21317k) obj;
                AbstractC16544l.m18094g(it, "it");
                String strValueOf = String.valueOf(AbstractC21322p.m21682P(it.m21659c()));
                AbstractC16544l.m18092e(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                AbstractC16544l.m18093f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC16544l.m18094g(entry, "<name for destructuring parameter 0>");
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}
