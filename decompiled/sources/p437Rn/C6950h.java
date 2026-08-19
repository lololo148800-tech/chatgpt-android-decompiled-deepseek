package p437Rn;

import android.gov.nist.core.Separators;
import bb.AbstractC11330w;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import p049Bm.InterfaceC1426a;
import p887m7.C17184j;
import p887m7.C17185k;
import p887m7.C17186l;
import p887m7.C17187m;
import p887m7.C17188n;
import p887m7.C17189o;
import p887m7.C17190p;
import p887m7.C17191q;
import p887m7.C17192r;
import p887m7.C17193s;
import p887m7.C17194t;

/* JADX INFO: renamed from: Rn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6950h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22239Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f22240Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f22241o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f22242p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f22243q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6950h(Object obj, String str, int i10, Serializable serializable, int i11) {
        super(0);
        this.f22239Y = i11;
        this.f22242p0 = obj;
        this.f22240Z = str;
        this.f22241o0 = i10;
        this.f22243q0 = serializable;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f22239Y) {
            case 0:
                return "Can not interpret the string '" + this.f22240Z + "' as " + ((AbstractC6946d) ((C6951i) this.f22242p0).f22244a.get(this.f22241o0)).f22235b + ": " + ((InterfaceC6948f) this.f22243q0).mo2693b();
            case 1:
                return "Expected " + ((C6966x) this.f22242p0).f22274b + " but got " + this.f22240Z.subSequence(this.f22241o0, ((C16558z) this.f22243q0).f51287Y).toString();
            default:
                AbstractC11330w abstractC11330w = (AbstractC11330w) this.f22242p0;
                Throwable th2 = (Throwable) abstractC11330w.f34260a;
                StringBuilder sb2 = new StringBuilder();
                String str = this.f22240Z;
                int i10 = this.f22241o0;
                String str2 = (String) this.f22243q0;
                if (str == null) {
                    sb2.append("Batch [" + i10 + " bytes] (" + str2 + Separators.RPAREN);
                } else {
                    sb2.append("Batch " + str + " [" + i10 + " bytes] (" + str2 + Separators.RPAREN);
                }
                if (abstractC11330w instanceof C17191q) {
                    sb2.append(" sent successfully.");
                } else if (abstractC11330w instanceof C17194t) {
                    sb2.append(" status is unknown");
                } else {
                    sb2.append(" failed because ");
                    if (abstractC11330w instanceof C17184j) {
                        sb2.append("of a DNS error");
                    } else if (abstractC11330w instanceof C17185k) {
                        sb2.append("of a processing error or invalid data");
                    } else if (abstractC11330w instanceof C17186l) {
                        sb2.append("of an intake rate limitation");
                    } else if (abstractC11330w instanceof C17187m) {
                        sb2.append("of a server processing error");
                    } else if (abstractC11330w instanceof C17188n) {
                        sb2.append("your token is invalid");
                    } else if (abstractC11330w instanceof C17189o) {
                        sb2.append("of a network error");
                    } else if (abstractC11330w instanceof C17190p) {
                        sb2.append("of an error when creating the request");
                    } else if (abstractC11330w instanceof C17192r) {
                        sb2.append("of an unknown error");
                    } else if (abstractC11330w instanceof C17193s) {
                        sb2.append("of an unexpected HTTP error (status code = " + abstractC11330w.f34261b + Separators.RPAREN);
                    }
                    if (th2 != null) {
                        sb2.append(" (");
                        sb2.append(th2.getMessage());
                        sb2.append(Separators.RPAREN);
                    }
                    if (abstractC11330w.f34262c) {
                        sb2.append("; we will retry later.");
                    } else {
                        sb2.append("; the batch was dropped.");
                    }
                }
                if (abstractC11330w instanceof C17188n) {
                    sb2.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
                }
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "toString(...)");
                return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6950h(String str, C6951i c6951i, int i10, InterfaceC6948f interfaceC6948f) {
        super(0);
        this.f22239Y = 0;
        this.f22240Z = str;
        this.f22242p0 = c6951i;
        this.f22241o0 = i10;
        this.f22243q0 = interfaceC6948f;
    }
}
